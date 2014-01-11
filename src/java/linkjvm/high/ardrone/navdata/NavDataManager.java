/*
* This file is part of LinkJVM.
*
* Java Framework for the KIPR Link
* Copyright (C) 2013 Markus Klein<m@mklein.co.at>
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

/*
 *
  Copyright (c) <2011>, <Shigeo Yoshida>
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
The names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package linkjvm.high.ardrone.navdata;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.ByteBuffer;

import linkjvm.high.ardrone.command.CommandManager;
import linkjvm.high.ardrone.listeners.AttitudeListener;
import linkjvm.high.ardrone.listeners.BatteryListener;
import linkjvm.high.ardrone.listeners.NavDataListener;
import linkjvm.high.ardrone.listeners.StateListener;
import linkjvm.high.ardrone.listeners.VelocityListener;
import linkjvm.high.ardrone.manager.AbstractManager;
import linkjvm.high.ardrone.navdata.javadrone.JavadroneNavDataParser;
import linkjvm.high.ardrone.utils.ARDroneUtils;



public class NavDataManager extends AbstractManager{

	private CommandManager manager=null;
	
	//listeners
	private AttitudeListener attitudeListener=null;
	private StateListener stateListener=null;
	private VelocityListener velocityListener=null;
	private BatteryListener batteryListener=null;
	private NavDataListener navDataListener=null;
	
	public NavDataManager(InetAddress inetaddr, CommandManager manager){
		this.inetaddr=inetaddr;
		this.manager=manager;
	}
	
	public void setAttitudeListener(AttitudeListener attitudeListener){
		this.attitudeListener=attitudeListener;
	}
	public void setBatteryListener(BatteryListener batteryListener){
		this.batteryListener=batteryListener;
	}
	public void setStateListener(StateListener stateListener){
		this.stateListener=stateListener;
	}
	public void setVelocityListener(VelocityListener velocityListener){
		this.velocityListener=velocityListener;
	}
	public void setNavDataListener(NavDataListener navDataListener){
		this.navDataListener=navDataListener;
	}

	
	@Override
	public void run(){
		ticklePort(ARDroneUtils.NAV_PORT);
		manager.enableDemoData();
		ticklePort(ARDroneUtils.NAV_PORT);
		manager.sendControlAck();
		
		// Use the original ARDroneForP5 parser as well as the Javadrone parser. The latter parses the complete navdata record sent by the drone
		NavDataParser parser=new NavDataParser();
		parser.setAttitudeListener(attitudeListener);
		parser.setBatteryListener(batteryListener);
		parser.setStateListener(stateListener);
		parser.setVelocityListener(velocityListener);
		
		JavadroneNavDataParser javadroneParser=new JavadroneNavDataParser();
		javadroneParser.setNavDataListener(navDataListener);
		
		while(!doStop){
			try {
				ticklePort(ARDroneUtils.NAV_PORT);
				DatagramPacket packet=new DatagramPacket(new byte[1024], 1024, inetaddr, 5554);

				socket.receive(packet);
				
				ByteBuffer buffer=ByteBuffer.wrap(packet.getData(), 0, packet.getLength());

				// use the original parser as well as the javadrone parser
				parser.parseNavData(buffer.duplicate());
				javadroneParser.parseNavData(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NavDataException e) {
				e.printStackTrace();
			}
		}
	}
}
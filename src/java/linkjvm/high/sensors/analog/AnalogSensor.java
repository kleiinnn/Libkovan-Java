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

package linkjvm.high.sensors.analog;

import linkjvm.high.sensors.InvalidPortException;
import linkjvm.low.analog.Analog;
import linkjvm.low.analog.Analog8;
import linkjvm.low.factory.JNIController;

/**
 * @author Markus Klein
 */
public class AnalogSensor implements IAnalogSensor{
	private volatile Analog8 jniSensor8;
	private volatile Analog jniSensor;

	private int port;

	/**
	 *
	 * @param port
	 */
	public AnalogSensor(int port) throws InvalidPortException{
		if(port < 0 || port > 7){
			throw new InvalidPortException();
		}
		this.port = port;
		jniSensor = JNIController.getInstance().getAnalogFactory().getInstance(port);
		jniSensor8 = JNIController.getInstance().getAnalog8Factory().getInstance(port);
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int getValue(){
		return jniSensor.value();
	}

	/**
	 *
	 * @return
	 */
	public int getValue8(){
		return jniSensor8.value();
	}

	/**
	 *
	 * @param pullup
	 */
	public void setPullup(boolean pullup){
		jniSensor.setPullup(pullup);
		jniSensor8.setPullup(pullup);
	}

	public boolean getDigitalPullup(){
		return jniSensor.pullup();
	}

	Analog getJniSensor(){
		return jniSensor;
	}

	Analog8 getJni8Sensor(){
		return jniSensor8;
	}

	/**
	 *
	 * @return
	 */
	public int getPort(){
		return port;
	}
}

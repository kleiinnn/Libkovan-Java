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

package linkjvm.sensors.buttons;

import linkjvm.sensors.digital.IDigitalSensor;

/**
 * This class contains all methods for an button.
 * @author Markus Klein
 * @version 2.1.0
 * @since 2.0.0
 */
public abstract class AbstractButton implements IDigitalSensor{	
	
	/**
	 * Returns if the button is pressed.
	 * @return <code>true</code> if the button is pressed, <code>false</code if not
	 */
	public boolean isPressed(){
		return getValue();
	}
}

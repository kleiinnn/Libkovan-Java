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

package linkjvm.high.sensors.buttons;

import linkjvm.low.buttons.IdButton;
import linkjvm.low.factory.JNIController;

/**
 * This class reprsents the KIPR Link's side button
 * @author Markus Klein
 * @version 2.0.0
 * @since 2.0.0
 */
public class SideButton extends AbstractButton {

	private volatile IdButton jniButton;
	
	/**
	 * Constructs a new side button.
	 */
	public SideButton(){
		jniButton = JNIController.getInstance().getButtonFactory().getInstance(linkjvm.low.buttons.Id.Side);
	}
	
	@Override
	public boolean getValue() {
		return jniButton.isPressed();
	}

}

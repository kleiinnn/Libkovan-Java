/*
 * This file is part of LinkJVM.
 *
 * Java Framework for the KIPR Link
 * Copyright (C) 2014 LinkJVM
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

package linkjvm.vision;

/**
 * This enum contains all possible camera resolution.
 * @author Klaus Ableitinger
 * @version 2.1.0
 * @since 2.0.0
 */
public enum Resolution {

	LOW_RES(160, 120),
	MED_RES(320, 240),
	HIGH_RES(640, 480);
		
	/**
	 * The width of the resolution.
	 */
	public int width;
	
	/**
	 * The height of the resolution.
	 */
	public int height;
	
	private Resolution(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

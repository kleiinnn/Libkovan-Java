/*
 * This file is part of LinkJVM.
 *
 * Java Framework for the KIPR Link
 * Copyright (C) 2014 Markus Klein<m@mklein.co.at>
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

package linkjvm.low.factory;

import linkjvm.low.buttons.Id;
import linkjvm.low.buttons.IdButton;

/**
 * 
 * @author Markus Klein
 *
 */
public class ButtonFactory extends AbstractMultiton<Id, IdButton>{

	@Override
	protected IdButton getNewConcreteInstance(Id uniqueIdentifier) {
		return new IdButton(uniqueIdentifier, uniqueIdentifier.toString());
	}
	
}

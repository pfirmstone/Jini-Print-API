/*
 * Copyright 2017 peter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.jini.print.attribute.standard;

import javax.print.attribute.Attribute;
import javax.print.attribute.PrintJobAttribute;
import net.jini.print.attribute.Dimension;

/**
 *
 * @author peter
 */
public class Yside2ImageShift extends Dimension implements PrintJobAttribute {

    public Yside2ImageShift(int i, UNIT unit) {
	super(i, unit);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Yside2ImageShift.class;
    }

    @Override
    public String getName() {
	return "y-side2-image-shift";
    }
    
}

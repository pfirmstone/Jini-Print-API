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
import net.jini.print.attribute.CollectionSyntax;

/**
 * This member attribute specifies the offset to apply to the object. The
 * "x-offset (integer(0:MAX))", "y-offset (integer(0:MAX))", and "z-offset
 * (integer(0:MAX))" member attributes specify the offsets from the left, front,
 * and Build Platform respectively in hundredths of millimeters (1/2540th of an
 * inch).
 *
 * @author peter
 */
public class ObjectOffset extends CollectionSyntax implements Attribute {

    private final Xoffset xoff;
    private final Yoffset yoff;
    private final Zoffset zoff;

    public ObjectOffset(
	    Xoffset xoff,
	    Yoffset yoff,
	    Zoffset zoff
    ) {
	this.xoff = xoff;
	this.yoff = yoff;
	this.zoff = zoff;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{xoff, yoff, zoff};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return ObjectOffset.class;
    }

    @Override
    public String getName() {
	return "object-offset";
    }

}

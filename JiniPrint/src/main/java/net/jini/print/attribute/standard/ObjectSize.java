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
 * This member attribute specifies the dimensions of the object. The
 * "x-dimension (integer(1:MAX))", "y-dimension (integer(1:MAX))", and
 * "z-dimension (integer(1:MAX))" member attributes specify the dimensions in
 * hundredths of millimeters (1/2540th of an inch).
 *
 * @author peter
 */
public class ObjectSize extends CollectionSyntax implements Attribute {

    private final Xdimension xdim;
    private final Ydimension ydim;
    private final Zdimension zdim;

    public ObjectSize(
	    Xdimension xdim,
	    Ydimension ydim,
	    Zdimension zdim
    ) {
	this.xdim = xdim;
	this.ydim = ydim;
	this.zdim = zdim;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{xdim, ydim, zdim};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return ObjectSize.class;
    }

    @Override
    public String getName() {
	return "object-size";
    }

}

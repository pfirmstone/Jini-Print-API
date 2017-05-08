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
import javax.print.attribute.EnumSyntax;

/**
 *
 * @author peter
 */
public class CoverType extends EnumSyntax implements Attribute {

    public final static CoverType 
	    NO_COVER = new CoverType(0),
	    PRINT_NONE = new CoverType(1),
	    PRINT_FRONT = new CoverType(2),
	    PRINT_BACK = new CoverType(3),
	    PRINT_BOTH = new CoverType(4);

    public CoverType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return CoverType.class;
    }

    @Override
    public String getName() {
	return "cover-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"no-cover",
	    "print-none", "print-front", "print-back", "print-both",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NO_COVER,
	    PRINT_NONE,
	    PRINT_FRONT,
	    PRINT_BACK,
	    PRINT_BOTH,};
    }

}

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
import javax.print.attribute.PrintJobAttribute;

/**
 *
 * @author peter
 */
public class YimagePosition extends EnumSyntax implements PrintJobAttribute {
    
    public static final YimagePosition NONE = new YimagePosition(0);
    public static final YimagePosition CENTRE = new YimagePosition(1);
    public static final YimagePosition TOP = new YimagePosition(2);
    public static final YimagePosition BOTTOM = new YimagePosition(3);

    YimagePosition(int i){
	super(i);
    }
    
    @Override
    public Class<? extends Attribute> getCategory() {
	return YimagePosition.class;
    }

    @Override
    public String getName() {
	return "y-image-position";
    }
    
     @Override
    protected String[] getStringTable() {
	return new String []{"none", "centre", "top", "bottom"};
    }

    /**
     * Returns the enumeration value table for class MediaBackCoating.
     *
     * @return the enumeration value table for class MediaBackCoating.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{NONE, CENTRE, TOP, BOTTOM};
    }
}

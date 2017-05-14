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
 * The "coating-sides" member attribute specifies which sides of the sheets are
 * coated: 'front', 'back', or 'both', If not specified, an implementation or
 * site defined default value is used.
 *
 * @see Coating
 * @see FinishingsCollection
 *
 * @author peter
 */
public class CoatingSides extends EnumSyntax implements Attribute {

    public static final CoatingSides 
	    BACK = new CoatingSides(0),//[PWG5100.1]
	    BOTH = new CoatingSides(1),//[PWG5100.1]
	    FRONT = new CoatingSides(2);//[PWG5100.1]

    protected CoatingSides(int i) {
	super(i);
    }

    /**
     * 
     * @return CoatingSides.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return CoatingSides.class;
    }

    @Override
    public String getName() {
	return "coating-sides";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "back",
	    "both",
	    "front",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BACK,
	    BOTH,
	    FRONT,};
    }

}

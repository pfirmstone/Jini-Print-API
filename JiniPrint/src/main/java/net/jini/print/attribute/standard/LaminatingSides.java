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
public class LaminatingSides extends EnumSyntax implements PrintJobAttribute {

    public static final LaminatingSides 
	    BACK = new LaminatingSides(0),//[PWG5100.1]
	    BOTH = new LaminatingSides(1),//[PWG5100.1]
	    FRONT = new LaminatingSides(2);//[PWG5100.1]

    protected LaminatingSides(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return LaminatingSides.class;
    }

    @Override
    public String getName() {
	return "laminating-sides";
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

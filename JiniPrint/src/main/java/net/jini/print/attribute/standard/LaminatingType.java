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
public class LaminatingType extends EnumSyntax implements PrintJobAttribute {

    public static final LaminatingType 
	    ARCHIVAL = new LaminatingType(0),//[PWG5100.1]
	    GLOSSY = new LaminatingType(1),//[PWG5100.1]
	    HIGH_GLOSS = new LaminatingType(2),//[PWG5100.1]
	    MATTE = new LaminatingType(3),//[PWG5100.1]
	    SEMI_GLOSS = new LaminatingType(4),//[PWG5100.1]
	    TRANSLUCENT = new LaminatingType(5);//[PWG5100.1]

    protected LaminatingType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return LaminatingType.class;
    }

    @Override
    public String getName() {
	return "laminating-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "archival",
	    "glossy",
	    "high-gloss",
	    "matte",
	    "semi-gloss",
	    "translucent",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ARCHIVAL,
	    GLOSSY,
	    HIGH_GLOSS,
	    MATTE,
	    SEMI_GLOSS,
	    TRANSLUCENT,};
    }

}

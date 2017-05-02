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
public class CoveringName extends EnumSyntax implements PrintJobAttribute {

    public static final CoveringName 
	    PLAIN = new CoveringName(0),//[PWG5100.1]
	    PRE_CUT = new CoveringName(1),//[PWG5100.1]
	    PRE_PRINTED = new CoveringName(2);//[PWG5100.1]

    protected CoveringName(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return CoveringName.class;
    }

    @Override
    public String getName() {
	return "covering-name";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "plain",
	    "pre-cut",
	    "pre-printed",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    PLAIN,
	    PRE_CUT,
	    PRE_PRINTED,};
    }

}

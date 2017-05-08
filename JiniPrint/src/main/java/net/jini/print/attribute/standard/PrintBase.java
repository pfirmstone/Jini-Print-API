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
 * This REQUIRED Job Template attribute specifies whether to print brims, rafts,
 * or skirts under the object.
 *
 * @author peter
 */
public class PrintBase extends EnumSyntax implements Attribute {

    private static final PrintBase 
	    BRIM = new PrintBase(0),//[PWG5100.21]
	    NONE = new PrintBase(1),//[PWG5100.21]
	    RAFT = new PrintBase(2),//[PWG5100.21]
	    SKIRT = new PrintBase(3),//[PWG5100.21]
	    STANDARD = new PrintBase(4);//[PWG5100.21]

    protected PrintBase(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PrintBase.class;
    }

    @Override
    public String getName() {
	return "print-base";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "brim",
	    "none",
	    "raft",
	    "skirt",
	    "standard",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BRIM,
	    NONE,
	    RAFT,
	    SKIRT,
	    STANDARD,};
    }

}

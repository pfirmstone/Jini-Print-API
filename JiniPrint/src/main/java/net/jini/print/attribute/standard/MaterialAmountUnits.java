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
 * This RECOMMENDED member attribute provides the units for the
 * "material-amount" value.
 *
 * @author peter
 */
public class MaterialAmountUnits extends EnumSyntax implements Attribute {

    public static final MaterialAmountUnits G = new MaterialAmountUnits(0),//[PWG5100.21]
	    KG = new MaterialAmountUnits(1),//[PWG5100.21]
	    L = new MaterialAmountUnits(2),//[PWG5100.21]
	    M = new MaterialAmountUnits(3),//[PWG5100.21]
	    ML = new MaterialAmountUnits(4),//[PWG5100.21]
	    MM = new MaterialAmountUnits(5);//[PWG5100.21]

    protected MaterialAmountUnits(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialAmountUnits.class;
    }

    @Override
    public String getName() {
	return "material-amount-units";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "g",
	    "kg",
	    "l",
	    "m",
	    "ml",
	    "mm",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    G,
	    KG,
	    L,
	    M,
	    ML,
	    MM,};
    }

}

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
public class MaterialRateUnits extends EnumSyntax implements Attribute {

    public static final MaterialRateUnits 
	    MG_SECOND = new MaterialRateUnits(1),//[PWG5100.21]
	    ML_SECOND = new MaterialRateUnits(2),//[PWG5100.21]
	    MM_SECOND = new MaterialRateUnits(3);//[PWG5100.21]

    protected MaterialRateUnits(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialRateUnits.class;
    }

    @Override
    public String getName() {
	return "material-rate-units";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "mg_second",
	    "ml_second",
	    "mm_second",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    MG_SECOND,
	    ML_SECOND,
	    MM_SECOND,};
    }

}

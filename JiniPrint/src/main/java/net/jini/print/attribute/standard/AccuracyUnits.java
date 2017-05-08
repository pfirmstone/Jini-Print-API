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
 * This member attribute specifies the units for the "x-accuracy", "y-accuracy",
 * and "zaccuracy" member attribute values.
 * <ul>
 * <li>'mm': Accuracy numbers are in millimeters.</li>
 * <li>'um': Accuracy numbers are in micrometers.</li>
 * <li>'nm': Accuracy numbers are in nanometers.</li>
 * </ul>
 *
 * @see Xaccuracy
 * @see Yaccuracy
 * @see Zaccuracy
 *
 * @author peter
 */
public class AccuracyUnits extends EnumSyntax implements Attribute {

    public static final AccuracyUnits MM = new AccuracyUnits(0),//[PWG5100.21]
	    NM = new AccuracyUnits(1),//[PWG5100.21]
	    UM = new AccuracyUnits(2);//[PWG5100.21]

    protected AccuracyUnits(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return AccuracyUnits.class;
    }

    @Override
    public String getName() {
	return "accuracy-units";

    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "mm",
	    "nm",
	    "um",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    MM,
	    NM,
	    UM,};
    }

}

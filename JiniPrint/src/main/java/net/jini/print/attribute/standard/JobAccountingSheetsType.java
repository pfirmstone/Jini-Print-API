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
 * The "job-accounting-sheets-type" m ember attribute specifies which job
 * accounting sheets form at the Printer MUST use to print on the specified
 * media.
 *
 * @author peter
 */
public class JobAccountingSheetsType extends EnumSyntax implements PrintJobAttribute {

    public static final JobAccountingSheetsType 
	    NONE = new JobAccountingSheetsType(0),//[PWG5100.3]
	    STANDARD = new JobAccountingSheetsType(1);//[PWG5100.3]

    protected JobAccountingSheetsType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobAccountingSheetsType.class;
    }

    @Override
    public String getName() {
	return "job-accounting-sheet-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "none",
	    "standard",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NONE,
	    STANDARD,};
    }

}

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
public class SeparatorSheetsType extends EnumSyntax implements PrintJobAttribute {

    public static final SeparatorSheetsType NONE = new SeparatorSheetsType(0);
    public static final SeparatorSheetsType SLIP_SHEETS = new SeparatorSheetsType(1);
    public static final SeparatorSheetsType START_SHEET = new SeparatorSheetsType(2);
    public static final SeparatorSheetsType END_SHEET = new SeparatorSheetsType(3);
    public static final SeparatorSheetsType BOTH_SHEETS = new SeparatorSheetsType(4);

    SeparatorSheetsType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return SeparatorSheetsType.class;
    }

    @Override
    public String getName() {
	return "separator-sheets-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "none",
	    "slip-sheets",
	    "start-sheet",
	    "end-sheet",
	    "both-sheets",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NONE,
	    SLIP_SHEETS,
	    START_SHEET,
	    END_SHEET,
	    BOTH_SHEETS,};
    }

}

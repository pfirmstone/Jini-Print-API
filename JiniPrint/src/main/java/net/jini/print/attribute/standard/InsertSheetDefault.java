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

import java.util.List;
import javax.print.attribute.Attribute;
import javax.print.attribute.PrintServiceAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * The "insert-sheet-default" Printer attributes specify the insert sheet(s)
 * that the Printer MUST provide, if any, if the client omits the "insert-sheet"
 * Job Template attribute. The member attributes are defined in Table 6. A
 * Printer MUST support the same member attributes for this default collection
 * attribute as it supports for the corresponding "insert-sheet" Job Template
 * attribute.
 *
 * @see InsertSheets
 *
 * @author peter
 */
public class InsertSheetDefault extends OneSetOfSyntax implements PrintServiceAttribute {

    public InsertSheetDefault(List<InsertSheet> sheets) {
	super(sheets);
    }

    /**
     *
     * @return InsertSheets.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertSheetDefault.class;
    }

    /**
     *
     * @return "insert-sheet"
     */
    @Override
    public String getName() {
	return "insert-sheet-default";
    }
}

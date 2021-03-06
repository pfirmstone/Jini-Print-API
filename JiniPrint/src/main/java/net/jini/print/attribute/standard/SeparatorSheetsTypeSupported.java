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

import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * SeparatorSheetsTypeSupported identifies the values of "separator-sheets-type"
 * member attribute that the Printer supports.
 * 
 * @author peter
 */
public class SeparatorSheetsTypeSupported extends OneSetOfSyntax implements SupportedValuesAttribute {
    
    public SeparatorSheetsTypeSupported(Set<SeparatorSheetsType> supported){
	super(supported);
    }

    /**
     * 
     * @return SeparatorSheetsTypeSupported.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return SeparatorSheetsTypeSupported.class;
    }

    /**
     * 
     * @return "separator-sheets-type-supported"
     */
    @Override
    public String getName() {
	return "separator-sheets-type-supported";
    }
    
}

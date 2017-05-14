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
 * The "separator-sheets-supported" attribute identifies the keyword names of
 * the member attributes supported in the "separator-sheets" collection Job
 * Template attribute.
 *
 * @see SeparatorSheets
 */
public class SeparatorSheetsSupported extends OneSetOfSyntax implements SupportedValuesAttribute {

    public static enum Keyword {

	SEPARATOR_SHEETS_TYPE("separator-sheets-type"),
	MEDIA("media"),
	MEDIA_COLLECTION("media-col");

	public String toSting() {
	    return keyword;
	}

	private final String keyword;

	private Keyword(String keyword) {
	    this.keyword = keyword;
	}
    }

    /**
     * Constructs a new instance.
     * @param supported Set of {@link SeparatorSheets} keywords.
     */
    public SeparatorSheetsSupported(Set<Keyword> supported) {
	super(supported);
    }

    /**
     * 
     * @return SeparatorSheetsSupported.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return SeparatorSheetsSupported.class;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getName() {
	return "separator-sheets-supported";
	
    }

}

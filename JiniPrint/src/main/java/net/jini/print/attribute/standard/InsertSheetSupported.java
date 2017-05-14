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
 * The "insert-sheet-supported" attribute identifies the keyword names of the
 * member attributes supported in the "insert-sheet" collection
 * 
 * @see InsertSheet
 *
 * @author peter
 */
public class InsertSheetSupported extends OneSetOfSyntax
	implements SupportedValuesAttribute {

    public static enum Keyword implements Attribute{

	INSERT_AFTER_PAGE_NUMBER("insert-after-page-number"),
	INSERT_COUNT("insert-count"),
	MEDIA("media"),
	MEDIA_COLLECTION("media-col");

	@Override
	public String toString() {
	    return keyword;
	}

	private final String keyword;

	private Keyword(String keyword) {
	    this.keyword = keyword;
	}

	/**
	 * 
	 * @return Keyword.class
	 */
	@Override
	public Class<? extends Attribute> getCategory() {
	    return Keyword.class;
	}

	/**
	 * 
	 * @return "insert-sheet-supported"
	 */
	@Override
	public String getName() {
	    return "insert-sheet-supported";
	}
    }

    public InsertSheetSupported(Set<Keyword> keywords) {
	super(keywords);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertSheetSupported.class;
    }

    @Override
    public String getName() {
	return "insert-sheet-supported";
    }

}

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
import javax.print.attribute.IntegerSyntax;

/**
 * The "insert-count" member attribute indicates how many sheets to insert. If
 * the "insert-count" attribute is omitted, then the printer assumes a value
 * of 1. The value 0 indicates that no inserts sheets are to be inserted. The
 * "insert-count-supported" (rangeOfInteger(0:MAX)) Printer attribute specifies
 * the range of values that the Printer supports, i.e., the minimum number
 * and the maximum number of pages.
 *
 * @author peter
 */
public class InsertCount extends IntegerSyntax implements Attribute {

    public InsertCount(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertCount.class;
    }

    @Override
    public String getName() {
	return "insert-count";
    }

}

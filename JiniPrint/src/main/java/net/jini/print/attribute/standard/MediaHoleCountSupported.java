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
import javax.print.attribute.SetOfIntegerSyntax;
import javax.print.attribute.SupportedValuesAttribute;

/**
 * The "media-hole-count-supported" (1setOf rangeOfInteger(0:MAX)) Printer
 * attribute identifies the ranges of values of the "media-hole-count" member
 * attribute that the Printer supports.
 * 
 * @see MediaHoleCount
 */
public class MediaHoleCountSupported extends SetOfIntegerSyntax implements SupportedValuesAttribute {

    public MediaHoleCountSupported(int[][] supportedRanges) {
	super(supportedRanges);
    }

    public MediaHoleCountSupported(String ranges) {
	super(ranges);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaHoleCountSupported.class;
    }

    @Override
    public String getName() {
	return "media-hole-count-supported";
    }
}

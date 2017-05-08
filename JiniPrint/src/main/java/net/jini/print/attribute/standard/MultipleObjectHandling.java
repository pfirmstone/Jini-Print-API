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
 * This CONDITIONALLY REQUIRED Job Template attribute specifies how multiple
 * objects are printed, including those within a single Document, across
 * multiple Documents, and/or copies that are produced. Printers that support
 * the 'application/pdf' Document format MUST support this attribute.
 *
 * @author peter
 */
public class MultipleObjectHandling extends EnumSyntax implements Attribute {

    public static final MultipleObjectHandling 
	    AUTO = new MultipleObjectHandling(0),//[PWG5100.21]
	    BEST_FIT = new MultipleObjectHandling(1),//[PWG5100.21]
	    BEST_QUALITY = new MultipleObjectHandling(2),//[PWG5100.21]
	    BEST_SPEED = new MultipleObjectHandling(3),//[PWG5100.21]
	    ONE_AT_A_TIME = new MultipleObjectHandling(4);//[PWG5100.21]

    private MultipleObjectHandling(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MultipleObjectHandling.class;
    }

    @Override
    public String getName() {
	return "multiple-object-handling";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "auto",
	    "best-fit",
	    "best-quality",
	    "best-speed",
	    "one-at-a-time",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    AUTO,
	    BEST_FIT,
	    BEST_QUALITY,
	    BEST_SPEED,
	    ONE_AT_A_TIME,};
    }

}

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
 * The "trimming-when" member attribute specified when trimming is performed.
 * The default value may be derived from the "finishing-template" value or, if a
 * default value cannot be determined from that value, using an implementation
 * or site defined value.
 *
 * @see Trimming
 */
public class TrimmingWhen extends EnumSyntax implements Attribute {

    public static final TrimmingWhen AFTER_DOCUMENTS = new TrimmingWhen(0),//[PWG5100.1]
	    AFTER_JOB = new TrimmingWhen(1),//[PWG5100.1]
	    AFTER_SETS = new TrimmingWhen(2),//[PWG5100.1]
	    AFTER_SHEETS = new TrimmingWhen(3);//[PWG5100.1]

    private TrimmingWhen(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return TrimmingWhen.class;
    }

    @Override
    public String getName() {
	return "trimming-when";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "after-documents",
	    "after-job",
	    "after-sets",
	    "after-sheets",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    AFTER_DOCUMENTS,
	    AFTER_JOB,
	    AFTER_SETS,
	    AFTER_SHEETS,};
    }

}

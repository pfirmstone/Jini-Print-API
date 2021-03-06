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
 * The "job-error-sheet-when" member attribute specifies the conditions under
 * which the error sheet information is to be produced.
 *
 * @author peter
 */
public class JobErrorSheetWhen extends EnumSyntax implements Attribute {

    public final static EnumSyntax ON_ERROR = new JobErrorSheetWhen(0);
    public final static EnumSyntax ALWAYS = new JobErrorSheetWhen(1);

    JobErrorSheetWhen(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobErrorSheetWhen.class;
    }

    @Override
    public String getName() {
	return "job-error-sheet-when";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"on-error", "always"};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{ON_ERROR, ALWAYS};
    }

}

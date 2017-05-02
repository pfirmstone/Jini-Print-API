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

import javax.print.attribute.EnumSyntax;

/**
 *
 * @author peter
 */
public class JobStateReason extends javax.print.attribute.standard.JobStateReason {

    public static final JobStateReason RESOURCES_ARE_NOT_SUPPORTED
	    = new JobStateReason(29);

    JobStateReason(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"resources-are-not-supported"};
    }

    /**
     * Returns the enumeration value table for class JobStateReason.
     *
     * @return
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{RESOURCES_ARE_NOT_SUPPORTED};
    }

    @Override
    protected int getOffset() {
	return 29;
    }
}

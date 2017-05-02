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
public class JobSheets extends javax.print.attribute.standard.JobSheets {

    /**
     * A job sheet MUST be printed to indicate the start of the job.
     */
    public static final JobSheets JOB_START_SHEET = new JobSheets(2);
    /**
     * A job sheet MUST be printed to indicate the end of the job.
     */
    public static final JobSheets JOB_END_SHEET = new JobSheets(3);
    /**
     * Job sheets MUST be printed to indicate the start and end of all the
     * output associated with the job.
     */
    public static final JobSheets JOB_BOTH_SHEETS = new JobSheets(4);
    /**
     * Some users have customized the banner sheets in their environment
     * (Microsoft, Novell, etc.) and prefer them instead of the printer's
     * standard ones. The custom banner sheet is the first page of the PDL. When
     * the client supplies the 'first-print-stream-page' value, the first page
     * in the document data is printed as the job sheet and the printer's
     * standard job sheet is suppressed.
     */
    public static final JobSheets FIRST_PRINT_STREAM_PAGE = new JobSheets(5);

    protected JobSheets(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "job-start-sheet",
	    "job-end-sheet",
	    "job-both-sheets",
	    "first-print-stream-page",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    JOB_START_SHEET,
	    JOB_END_SHEET,
	    JOB_BOTH_SHEETS,
	    FIRST_PRINT_STREAM_PAGE,};
    }

    @Override
    protected int getOffset() {
	return 2;
    }

}

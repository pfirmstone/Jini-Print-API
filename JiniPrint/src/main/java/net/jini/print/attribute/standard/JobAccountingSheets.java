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

import java.io.Serializable;
import javax.print.attribute.Attribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 * This attribute specifies which job accounting sheets MUST be printed with the
 * job. Job accounting sheets typically contain information such as the value of
 * the "job-account-id" attribute and the
 * "job-accounting-user-id" attribute, and the number and type
 * of media sheets used while printing the job. The exact information contained
 * on a job accounting sheet is implementation dependent, but should always be a
 * reflection of the account information associated with the job. Typically, job
 * accounting sheets are printed after the job and are not finished (e.g., not
 * stapled) with the document(s).
 *
 * @see JobAccountID
 * @see JobAccountingUserID
 * 
 * @author peter
 */
public class JobAccountingSheets extends CollectionSyntax
	implements PrintRequestAttribute, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @serial The "job-accounting-sheets-type" member attribute specifies which
     * job accounting sheets format the Printer MUST use to print on the
     * specified media.
     */
    private final JobAccountingSheetsType type;
    /**
     * @serial Either {@link Media} or the {@link MediaCollection} attribute is
     * used to indicate the media that the Printer SHOULD use for the job
     * accounting sheet.
     */
    private final Attribute media;
    /**
     * @serial The "job-accounting-output-bin" member attribute specifies the
     * output bin in which the accounting sheets are to be placed.
     */
    private final JobAccountingOutputBin outputBin;

    public JobAccountingSheets(
	    JobAccountingSheetsType type,
	    Media media,
	    JobAccountingOutputBin outputBin
    ) {
	this.type = type;
	this.media = media;
	this.outputBin = outputBin;
    }

    public JobAccountingSheets(
	    JobAccountingSheetsType type,
	    MediaCollection media,
	    JobAccountingOutputBin outputBin
    ) {
	this.type = type;
	this.media = media;
	this.outputBin = outputBin;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{type, media, outputBin};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobAccountingSheets.class;
    }

    @Override
    public String getName() {
	return "job-accounting-sheets";
    }

}

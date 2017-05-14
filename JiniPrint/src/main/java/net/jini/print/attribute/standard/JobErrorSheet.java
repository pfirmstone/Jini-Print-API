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
 * This attribute specifies which job error sheet MUST be printed with the job.
 * This is a printer specific sheet enumerating any known errors or warnings
 * that occurred during processing. For example: a printer could put the text
 * 'warning: image off page 2," on the error sheet to indicate a possible image
 * processing defect. The printer vendor defines the content of the error sheet.
 * If necessary the error sheet can consist of more than one page of output. If
 * the Printer is producing a job sheet for this job (see section 3.11 and
 * [RFC2911] section 4.2.3), then the Printer object MAY print any error and
 * warning information on that same job sheet, i.e., merge the error sheet with
 * the job sheet. This use of the job sheet for errors only applies if the
 * "job-error-sheet" attribute is supplied without either a "media" or
 * "media-col" member attribute. If the "media" or "media-col" member attribute
 * is supplied, a separate error sheet MUST always be used to print errors and
 * warnings. The 'collection' syntax allows a client to specify media for job
 * error sheets that is different than the current media being used for the
 * print-stream page impressions.
 *
 * @author peter
 */
public class JobErrorSheet extends CollectionSyntax
	implements PrintRequestAttribute, Serializable {

    private static final long serialVersionUID = 1L;
    private final JobErrorSheetType type;
    private final JobErrorSheetWhen when;
    private final Attribute media;

    /**
     * Construct a new instance.
     *
     * @param type the job error sheet type
     * @param when when to print the job error sheet or null
     * @param media the media to use for the job error sheet or null.
     * @throws NullPointerException if type is null.
     */
    public JobErrorSheet(
	    JobErrorSheetType type,
	    JobErrorSheetWhen when,
	    Media media
    ) {
	this(type, when, (Attribute) media);
    }

    /**
     * Construct a new instance.
     *
     * @param type the job error sheet type
     * @param when when to print the job error sheet or null
     * @param media the media to use for the job error sheet or null
     * @throws NullPointerException if type is null.
     */
    public JobErrorSheet(
	    JobErrorSheetType type,
	    JobErrorSheetWhen when,
	    MediaCollection media
    ) {
	this(type, when, (Attribute) media);
    }

    private static JobErrorSheetType notNull(JobErrorSheetType type) {
	if (type != null) {
	    return type;
	}
	throw new NullPointerException("type cannot be null");
    }

    private JobErrorSheet(
	    JobErrorSheetType type,
	    JobErrorSheetWhen when,
	    Attribute media
    ) {
	this.type = type;
	this.when = when;
	this.media = media;
    }

    /**
     *
     * @return JobErrorSheet.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return JobErrorSheet.class;
    }

    /**
     *
     * @return "job-error-sheet"
     */
    @Override
    public String getName() {
	return "job-error-sheet";
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{type, when, media};
    }

    /**
     * @return the type
     */
    public JobErrorSheetType getType() {
	return type;
    }

    /**
     * @return the when
     */
    public JobErrorSheetWhen getWhen() {
	return when;
    }

    /**
     * @return the media, may be an instance of {@link Media} or
     * {@link MediaCollection}
     */
    public Attribute getMedia() {
	return media;
    }

}

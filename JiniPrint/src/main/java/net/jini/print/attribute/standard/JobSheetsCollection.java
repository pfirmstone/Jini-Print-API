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
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.JobSheets;
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 * This attribute augments the {@link JobSheets}
 * attribute. The 'collection' attribute syntax allows a client to specify media
 * for job sheets that is different than the current media being used for the
 * print stream images. An example of where this is useful is for separator
 * sheets, which may allow easier distinction of document copies.
 *
 * @author peter
 */
public class JobSheetsCollection extends CollectionSyntax
	implements PrintJobAttribute, PrintRequestAttribute, Serializable {
    
    private static final long serialVersionUID = 1L;

    private final JobSheets sheet;
    private final Attribute media;

    public JobSheetsCollection(
	    JobSheets sheet,
	    Media media
    ) {
	this(notNull(sheet), (Attribute) media);
    }

    public JobSheetsCollection(
	    JobSheets sheet,
	    MediaCollection media
    ) {
	this(notNull(sheet), (Attribute) media);
    }
    
    private static JobSheets notNull(JobSheets sheet){
	if (sheet != null) return sheet;
	throw new NullPointerException("job sheets cannot be null");
    }
    
    private JobSheetsCollection(
	    JobSheets sheet,
	    Attribute media
    ) {
	this.sheet = sheet;
	this.media = media;
    }
    
    @Override
    public Class<? extends Attribute> getCategory() {
	return JobSheetsCollection.class;
    }

    @Override
    public String getName() {
	return "job-sheets-col";
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{sheet, media};
    }

}

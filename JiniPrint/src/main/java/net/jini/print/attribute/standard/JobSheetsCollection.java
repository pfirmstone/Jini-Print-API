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
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.standard.JobSheets;
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 *
 * @author peter
 */
public class JobSheetsCollection extends CollectionSyntax implements PrintJobAttribute {

    private final JobSheets sheet;
    private final Attribute media;
    
    JobSheetsCollection(
	    JobSheets sheet,
	    Media media
	)
    {
	this.sheet = sheet;
	this.media = media;
    }
    
    JobSheetsCollection(
	    JobSheets sheet,
	    MediaCollection media
	)
    {
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
    
    public Attribute[] getAttributes(){
	return new Attribute[]{sheet, media};
    }

}

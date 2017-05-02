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
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 *
 * @author peter
 */
public class JobErrorSheet extends CollectionSyntax implements PrintJobAttribute, Serializable {

    
    private final JobErrorSheetType type;
    private final JobErrorSheetWhen when;
    private final Attribute media;
    
    public JobErrorSheet(
		JobErrorSheetType type,
		JobErrorSheetWhen when,
		Media media
	    )
    {
	this.type = type;
	this.when = when;
	this.media = media;
    }
    
     public JobErrorSheet(
		JobErrorSheetType type,
		JobErrorSheetWhen when,
		MediaCollection media
	    )
    {
	this.type = type;
	this.when = when;
	this.media = media;
    }
    
    @Override
    public Class<? extends Attribute> getCategory() {
	return JobErrorSheet.class;
    }

    @Override
    public String getName() {
	return "job-error-sheet";
    }
    
    protected Attribute[] getAttributes(){
	return new Attribute[]{type, when, media};
    }
    
}

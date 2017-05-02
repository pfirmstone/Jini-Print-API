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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * Reference: PWG 5100.1 – IPP Finishings 2.0 (FIN) December 19, 2014
 * 
 * @author peter
 */
public class FinishingsCollection extends CollectionSyntax implements DocAttribute, PrintRequestAttribute,  PrintJobAttribute {

    public FinishingsCollection(
	    FinishingTemplate template,
	    Bailing bailing,
	    Binding binding,
	    Coating coating,
	    Covering covering,
	    Folding folding,
	    ImpositionTemplate impositionTemplate,
	    Laminating laminating,
	    MediaSize mediaSize,
	    MediaSizeName mediaSizeName,
	    Punching punching,
	    Stitching stitching,
	    Trimming trimming
    )
    {
	
    }
    
    @Override
    protected Attribute[] getAttributes() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
	return "finishings-col";
    }
    
}

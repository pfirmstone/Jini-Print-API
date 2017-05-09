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

import java.util.List;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * <p>
 * This attribute specifies how Insert-Sheets are to be inserted into the
 * sequence of media sheets that are produced for each copy of each printed
 * document in the job. 
 * Insert-Sheets are sheets on which no Input-Pages from
 * the Input-Document are imaged. However, the media specified for Insert-Sheets
 * can be pre-printed media. How the sheet is inserted is implementation
 * dependent, and could be as sophisticated as insertion hardware, or as simple
 * as using media from an existing input-tray. 
 * </p><p>
 * The order of the values of the
 * "insert-sheet" attribute is important. In the case where more than one value
 * refers to the same page (i.e., multiple values contain the same value for the
 * "insert-after-page-number" member attribute), the values of "insert-sheet"
 * are to be applied in the order that they occur. 
 * </p><p>
 * This attribute is affected by
 * the "multiple-document-handling" attribute. For values of 'single-document'
 * and 'single-document-new-sheet', the sheet is inserted in the composite
 * (single) document created by the concatenation of all the print-stream pages
 * in all of the documents. In the case of 'separate-documents-collated-copies'
 * and 'separate-documents-uncollated-copies', the inserted sheets are applied
 * to the print-stream in each document separately.
 * </p>
 * 
 * @see javax.print.attribute.standard.MultipleDocumentHandling
 *
 * @author peter
 */
public class InsertSheets extends OneSetOfSyntax implements DocAttribute, PrintRequestAttribute {

    public InsertSheets(List<InsertSheet> sheets) {
	super(sheets);
    }

    /**
     * 
     * @return InsertSheets.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertSheets.class;
    }

    /**
     * 
     * @return "insert-sheet"
     */
    @Override
    public String getName() {
	return "insert-sheet";
    }
}

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
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 * <p>
 * Insert-Sheets are sheets on which no Input-Pages from the Input-Document are
 * imaged. However, the media specified for Insert-Sheets can be pre-printed
 * media. How the sheet is inserted is implementation dependent, and could be as
 * sophisticated as insertion hardware, or as simple as using media from an
 * existing input-tray.
 * </p><p>
 * This attribute is affected by the "multiple-document-handling" attribute. For
 * values of 'single-document' and ' single-document-new-sheet' , the sheet is
 * inserted in the composite (single) document created by the concatenation of
 * all the print-stream pages in all of the documents. In the case of
 * 'separate-documents-collated-copies' and
 * 'separate-documents-uncollated-copies', the inserted sheets are applied to
 * the print-stream in each document separately.
 *</p>
 * @see InsertSheets
 * @see javax.print.attribute.standard.MultipleDocumentHandling
 *
 * @author peter
 */
public class InsertSheet extends CollectionSyntax {

    private final InsertAfterPageNumber afterPageNumber;
    private final InsertCount count;
    private final Attribute media;

    public InsertSheet(
	    InsertAfterPageNumber afterPageNumber,
	    InsertCount count,
	    Media media
    ) {
	this.afterPageNumber = afterPageNumber;
	this.count = count;
	this.media = media;
    }

    public InsertSheet(
	    InsertAfterPageNumber afterPageNumber,
	    InsertCount count,
	    MediaCollection media
    ) {
	this.afterPageNumber = afterPageNumber;
	this.count = count;
	this.media = media;
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{afterPageNumber, count, media};
    }

}

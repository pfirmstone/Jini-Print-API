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
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.Media;
import net.jini.print.attribute.CollectionSyntax;

/**
 * <h1>cover-front (collection) and cover-back (collection)</h1>
 * <p>
 * These two attributes specify how covers are to be applied to each copy of
 * each printed document within a job. Presence of the "cover-front" attribute
 * indicates that a front cover is requested, and similarly, the presence of the
 * "cover-back" attribute indicates that a back cover is requested. Each of the
 * "cover-front" and "cover-back" attributes includes where printing should be
 * applied on the cover (if any), and what media should be used for the
 * cover.</p><p>
 * Both the "cover-front" and "cover-back" attributes are affected by the
 * "multiple-document-handling" attribute. In the case of the 'single-document'
 * and 'single-document-new-sheet' values, the covers MUST be applied to each
 * copy of the composite (single) document. When the value is either
 * 'separate-documents-collated-copies' or
 * 'separate-documents-uncollated-copies', then the covers MUST be applied to
 * each document copy individually.</p><p>
 * The sheets in the rendered output that represent the covers are treated like
 * any other sheet in the document copy. For example, if the "finishings"
 * attribute (see [RFC2911] section 4.2.6) has a value of 'staple,' then the
 * staple would bind the covers, along with all of the other sheets in the
 * output.</p><p>
 * A client SHOULD use this attribute rather than the “page-overrides” attribute
 * with the “media” attribute overridden for the first and last page of each
 * Output-Document. A Printer MAY perform some special function with covers that
 * it wouldn’t perform for “page-overrides”.</p>
 * 
 * @see CoverFront
 * @see CoverBack
 * @see DocAttribute
 * @see PrintRequestAttribute
 *
 * @author peter
 */
abstract class Cover extends CollectionSyntax implements DocAttribute, PrintRequestAttribute {

    private final Attribute media;
    private final CoverType type;

    Cover(Media media, CoverType type) {
	this.media = media;
	this.type = type;
    }

    Cover(MediaCollection mediaCol, CoverType type) {
	media = mediaCol;
	this.type = type;
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{media, type};
    }

    /**
     * @return the media
     */
    public Attribute getMedia() {
	return media;
    }

    /**
     * @return the type
     */
    public CoverType getType() {
	return type;
    }

}

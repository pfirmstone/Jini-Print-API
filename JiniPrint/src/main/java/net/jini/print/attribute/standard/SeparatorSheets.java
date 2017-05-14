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
 * <p>
 * This attribute specifies which separator sheets MUST be printed with the job.
 * Separator sheets are used to separate individual copies of a multiple copy
 * job (i.e., when the "copies" attribute is greater than 1). The
 * "separator-sheets" attribute is dependent both on the value of
 * "multiple-document-handling" and on the value of "sheet-collate" (see
 * [ipp-prog]). See sections 2.2 and 3.18.1 for a detailed description and
 * examples of what constitutes a "set."
 * </p><p>
 * {@link javax.print.attribute.standard.SheetCollate} "sheet-collate" is
 * obsolete as it doesn't interact well with  
 * {@link javax.print.attribute.standard.Finishings},
 * {@link FinishingsSet}, or {@link FinishingsCol}, please refer to
 * <a HREF="https://tools.ietf.org/html/rfc8011">RFC8011</a>
 * </p><p>
 * Separator sheets may either be non-imaged sheets, or may contain Printer
 * generated information.
 * </p><p>
 * The 'collection' attribute syntax allows a client to specify media for job
 * separator sheets that is different than the current media being used for the
 * print-stream page impressions.
 * </p>
 *
 * @see javax.print.attribute.standard.MultipleDocumentHandling
 * @see javax.print.attribute.standard.SheetCollate
 * @see javax.print.attribute.standard.Copies
 */
public class SeparatorSheets extends CollectionSyntax
	implements DocAttribute, PrintRequestAttribute {

    private final SeparatorSheetsType type;
    private final Attribute media;

    /**
     *
     * @param type "separator-sheets-type" attribute
     * @param media "media" attribute or null
     * @throws NullPointerException if type is null.
     */
    public SeparatorSheets(
	    SeparatorSheetsType type,
	    Media media
    ) {
	this(notNull(type), (Attribute) media);
    }

    /**
     *
     * @param type "separator-sheets-type" attribute
     * @param media "media-col" attribute or null.
     *
     * @throws NullPointerException if type is null.
     */
    public SeparatorSheets(
	    SeparatorSheetsType type,
	    MediaCollection media
    ) {
	this(notNull(type), (Attribute) media);
    }

    public static SeparatorSheetsType notNull(SeparatorSheetsType type) {
	if (type != null) {
	    return type;
	}
	throw new NullPointerException("type cannot be null");
    }

    private SeparatorSheets(
	    SeparatorSheetsType type,
	    Attribute media
    ) {
	this.type = type;
	this.media = media;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{type, media};
    }

    /**
     *
     * @return SeparatorSheets.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return SeparatorSheets.class;
    }

    /**
     *
     * @return "separator-sheets"
     */
    @Override
    public String getName() {
	return "separator-sheets";
    }

    /**
     * @return the type
     */
    public SeparatorSheetsType getType() {
	return type;
    }

    /**
     * @return the media
     */
    public Attribute getMedia() {
	return media;
    }

}

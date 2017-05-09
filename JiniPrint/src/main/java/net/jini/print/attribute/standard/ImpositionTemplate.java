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
import javax.print.attribute.EnumSyntax;

/**
 * <p>
 * The "imposition-template" member attribute specifies the default imposition
 * template used for the specified finishing process and is only provided in
 * "finishings-col-database" (section 6.9) and "finishings-col-ready" (section
 * 6.11) Printer attribute values. For example, when applying a 'booklet-maker'
 * finishing process a Printer could automatically apply a 'signature'
 * imposition template when processing input pages.
 * </p><p>
 * Whether or not the “sides” attribute (see [RFC2911] section 4.2.8) is
 * overriden by this attribute DEPENDS ON IMPLEMENTATION, including the value
 * supplied.
 * </p>
 * <h1>
 * Interaction between the Image Shifting and “number-up” and Imposition
 * attributes</h1>
 * <p>
 * Usually a print job will not combine the “number-up”, image shifting, and
 * Imposition attributes (such as the “imposition-template” attributes) , in a
 * single document. However, this section defines the interaction in case a
 * client does supply more than one of these attributes. The Printer MUST apply
 * “number-up”, image shifting, and Imposition attributes in the following
 * order:
 * <ol>
 * <li> Create a Finished-Page Image by laying out the number of page images
 * specified by the "number-up" attribute. If "number-up" is unsupported or not
 * applied, the Finished-Page Image is the same as the single page image. </li>
 * <li> shift the Finished-Page Image as specified by the image shifting
 * attributes. If the image-shifting attributes are unsupported or not applied,
 * the Finished-Page Image is not shifted. </li>
 * <li> layout the Finished-Pages Images onto the surfaces (i.e. sides) of a
 * number of (larger) sheets according to the Imposition attributes, such as the
 * “imposition-template” attribute. If Imposition attributes are unsupported or
 * not applied, an Impression is a single Finished-Page
 * <li>
 * </ol>
 *
 * <h1>Interaction between the Image Shifting and “force-front-side”
 * attributes</h1>
 * <p>
 * If the “force-front-side” attribute is used, “side1” and “side2” apply to the
 * Finished-Page images AFTER the “force-front-side” values are applied. For
 * example, a typical document without "number-up" starts with page 1 as a
 * “side1” page and page 2 as a “side2” page. If “force-front-side” attribute is
 * applied to Input Page 2, then Input Page 2 (and subsequent even pages) will
 * become “side1” pages. Input Page 3 (and subsequent odd pages) will become
 * “side2” pages.
 * </p>
 *
 * @see FinishingsCollection
 * @see javax.print.attribute.standard.NumberUp
 * @see javax.print.attribute.standard.Sides
 * @see ForceFrontSide
 *
 * @author peter
 */
public class ImpositionTemplate extends EnumSyntax implements DocAttribute {

    public static final ImpositionTemplate NONE = new ImpositionTemplate(0),//[PWG5100.3]
	    SIGNATURE = new ImpositionTemplate(1);//[PWG5100.3]

    protected ImpositionTemplate(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return ImpositionTemplate.class;
    }

    @Override
    public String getName() {
	return "imposition-template";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "none",
	    "signature",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NONE,
	    SIGNATURE,};
    }

}

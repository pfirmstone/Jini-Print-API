/*
 * Copyright (C) the original author or authors.
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
import javax.print.attribute.EnumSyntax;

/**
 * <P>
 * Class MediaBackCoating is a printing attribute class, an enumeration, that
 * indicates what pre-process coating has been applied to the back of the
 * desired medium. An instance of class MediaBackCoating is not placed directly
 * into an attribute set; rather, it is always stored in a field of a {@link
 * Media Media} attribute, and the {@link Media Media} attribute is placed into
 * the attribute set.
 * </P><P>
 * Class MediaBackCoating declares keywords for standard media back coating
 * values. Implementation- or site-defined names for a media back coating
 * attribute may also be created by defining a subclass of class
 * MediaBackCoating.
 * </P><P>
 * <B>Support Requirements:</B> Support for media back coatings is indicated
 * along with support for media as a whole. See class {@link Media Media} for
 * further information. For the MediaBackCoating category, the the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaBackCoating objects which represents the union of the media
 * back coatings of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * back coating of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * back coating.
 * </P><P>
 * <B>IPP Compatibility:</B> For the base class MediaBackCoating, the string
 * value gives the IPP keyword value. For a subclass, the attribute value must
 * be localized to give the IPP name and natural language values. The category
 * name returned by <CODE>getName()</CODE> gives the IPP attribute name.
 * </P>
 */
public class MediaBackCoating extends EnumSyntax implements Attribute {

    /**
     * The medium must have a back coating, but the specific coating type is not
     * important.
     */
    public static final MediaBackCoating NONE = new MediaBackCoating(0);

    /**
     * The medium has a glossy back coating.
     */
    public static final MediaBackCoating GLOSSY = new MediaBackCoating(1);

    /**
     * The medium has a high-gloss back coating.
     */
    public static final MediaBackCoating HIGH_GLOSS = new MediaBackCoating(2);

    /**
     * The medium has a semi-gloss back coating.
     */
    public static final MediaBackCoating SEMI_GLOSS = new MediaBackCoating(3);

    /**
     * The medium has a satin back coating.
     */
    public static final MediaBackCoating SATIN = new MediaBackCoating(4);

    /**
     * The medium has a matte back coating.
     */
    public static final MediaBackCoating MATTE = new MediaBackCoating(5);

    /**
     * Construct a new media back coating enumeration value with the given
     * integer value.
     *
     * @param theValue Integer value.
     */
    protected MediaBackCoating(int theValue) {
	super(theValue);
    }

    /**
     * Returns the string table for class MediaBackCoating.
     *
     * @return the string table for class MediaBackCoating.
     */
    @Override
    protected String[] getStringTable() {
	return new String[] {
	    "none",
	    "glossy",
	    "high-gloss",
	    "semi-gloss",
	    "satin",
	    "matte"};
    }

    /**
     * Returns the enumeration value table for class MediaBackCoating.
     *
     * @return the enumeration value table for class MediaBackCoating.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NONE,
	    GLOSSY,
	    HIGH_GLOSS,
	    SEMI_GLOSS,
	    SATIN,MATTE};
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * <P>
     * For class MediaBackCoating and any vendor-defined subclasses, the
     * category is class MediaBackCoating itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaBackCoating.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class MediaBackCoating and any vendor-defined subclasses, the
     * category name is <CODE>"media-back-coating"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-back-coating";
    }

}

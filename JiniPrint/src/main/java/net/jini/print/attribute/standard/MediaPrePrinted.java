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

import javax.print.attribute.EnumSyntax;
import javax.print.attribute.Attribute;

/**
 * Class MediaPrePrinted is a printing attribute class, an enumeration, that
 * indicates whether the desired media is already imaged. Examples of
 * pre-printed media include forms and company letterhead. If the value is
 * UNPRINTED, the printer may use an electronic representation of a form, if the
 * medium has some imaged information already associated with it.
 * <P>
 * An instance of class MediaPrePrinted is not placed directly into an attribute
 * set; rather, it is always stored in a field of a {@link Media Media}
 * attribute, and the {@link Media Media} attribute is placed into the attribute
 * set.
 * <P>
 * <B>Support Requirements:</B> Support for media pre-printed is indicated along
 * with support for media as a whole. See class {@link Media Media} for further
 * information. For the MediaPrePrinted category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaPrePrinted objects which represents the union of the media
 * pre-printed values of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * pre-printed value of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * pre-printed value.
 * <P>
 * <B>IPP Compatibility:</B> For the base class MediaPrePrinted, the string
 * value gives the IPP keyword value. For a subclass, the attribute value must
 * be localized to give the IPP name and natural language values. The category
 * name returned by <CODE>getName()</CODE> gives the IPP attribute name.
 * <P>
 *
 */
public class MediaPrePrinted
	extends EnumSyntax
	implements Attribute {

    /**
     * The desired medium is not pre-printed.
     */
    public static final MediaPrePrinted BLANK = new MediaPrePrinted(0);

    /**
     * The desired medium is pre-printed; the other media characteristics
     * identify the medium instance and so identify what is actually
     * pre-printed.
     */
    public static final MediaPrePrinted PRE_PRINTED = new MediaPrePrinted(1);

    /**
     * The site-defined letter head pre-printed medium is desired.
     */
    public static final MediaPrePrinted LETTER_HEAD = new MediaPrePrinted(2);

    /**
     * Construct a new media pre-printed enumeration value with the given
     * integer value.
     *
     * @param theValue Integer value.
     */
    protected MediaPrePrinted(int theValue) {
	super(theValue);
    }

    /**
     * Returns the string table for class MediaPrePrinted.
     *
     * @return the string table for class MediaPrePrinted.
     */
    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "blank",
	    "pre-printed",
	    "letter-head",};
    }

    /**
     * Returns the enumeration value table for class MediaPrePrinted.
     *
     * @return the enumeration value table for class MediaPrePrinted.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BLANK,
	    PRE_PRINTED,
	    LETTER_HEAD,};
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     *
     * For class MediaPrePrinted and any vendor-defined subclasses, the category
     * is class MediaPrePrinted itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaPrePrinted.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     *
     * For class MediaPrePrinted and any vendor-defined subclasses, the category
     * name is <CODE>"media-pre-printed"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-pre-printed";
    }

}

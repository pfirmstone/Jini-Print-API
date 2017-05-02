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
 * <P>
 * Class MediaRecycled is a printing attribute class, an enumeration, that
 * indicates the recycled characteristics of the medium. An instance of class
 * MediaRecycled is not placed directly into an attribute set; rather, it is
 * always stored in a field of a {@link Media Media} attribute, and the {@link
 * Media Media} attribute is placed into the attribute set.
 * </P><P>
 * Implementation- or site-defined names for a media recycled attribute may also
 * be created by defining a subclass of class MediaRecycled.
 * </P><P>
 * <B>Support Requirements:</B> Support for media recycled values is indicated
 * along with support for media as a whole. See class {@link Media Media} for
 * further information. For the MediaRecycled category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaRecycled objects which represents the union of the media
 * weight types of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * recycled value of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * recycled value.
 * </P><P>
 * <B>IPP Compatibility:</B> For the base class MediaRecycled, the string value
 * gives the IPP keyword value. For a subclass, the attribute value must be
 * localized to give the IPP name and natural language values. The category name
 * returned by <CODE>getName()</CODE> gives the IPP attribute name.
 * </P>
 * 
 */
public class MediaRecycled extends EnumSyntax implements Attribute {

    /**
     * The media must not be recycled.
     */
    public static final MediaRecycled NONE = new MediaRecycled(0);

    /**
     * The media must use the site-defined standard recycled stock.
     */
    public static final MediaRecycled STANDARD = new MediaRecycled(1);

     /**
     * Construct a new media recycled enumeration value with the given integer
     * value.
     *
     * @param theValue Integer value.
     */
    protected MediaRecycled(int theValue) {
	super(theValue);
    }

    /**
     * Returns the string table for class MediaRecycled.
     * @return the string table for class MediaRecycled.
     */
    @Override
    protected String[] getStringTable() {
	return new String[]{"none", "standard"};
    }

    /**
     * Returns the enumeration value table for class MediaRecycled.
     * @return the enumeration value table for class MediaRecycled.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{NONE, STANDARD};
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * 
     * For class MediaRecycled and any vendor-defined subclasses, the category
     * is class MediaRecycled itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaRecycled.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * 
     * For class MediaRecycled and any vendor-defined subclasses, the category
     * name is <CODE>"media-recycled"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-recycled";
    }

}

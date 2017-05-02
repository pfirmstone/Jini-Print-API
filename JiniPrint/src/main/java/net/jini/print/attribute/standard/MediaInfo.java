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

import java.util.Locale;

import javax.print.attribute.TextSyntax;
import javax.print.attribute.Attribute;

/**
 * Class MediaInfo is a printing attribute class, a text attribute, that
 * gives a description of a medium. An instance of class MediaInfo is not
 * placed directly into an attribute set; rather, it is always stored in a field
 * of a {@link MediaCollection Media} attribute, and the {@link Media Media} attribute is
 * placed into the attribute set.
 * <P>
 * The media description conveys no semantic information to the printer,
 * although the media description may be meaningful to a human user or
 * administrator. The printer treats the media description as just another
 * characteristic of the media that the printer must match to select the correct
 * media. Thus, the media description can be used to distinguish two media whose
 * other characteristics are identical. Furthermore, more than one medium
 * instance can have the same description text string.
 * <P>
 * <B>Support Requirements:</B> Support for media descriptions is indicated
 * along with support for media as a whole. See class {@link Media Media} for
 * further information. For the MediaDescription category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaDescription objects which represents the union of the media
 * descriptions of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * description, if any, of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * description.
 * <P>
 * <B>IPP Compatibility:</B> The string value gives the IPP text value. The
 * category name returned by <CODE>getName()</CODE> gives the IPP attribute
 * name.
 * <P>
 */
public class MediaInfo
	extends TextSyntax
	implements Attribute {

    /**
     * Constructs a new media description attribute with the given name and
     * locale.
     *
     * @param theName Media name.
     * @param theLocale Locale.
     *
     * @exception NullPointerException (unchecked exception) Thrown if
     * <CODE>theName</CODE> is null or <CODE>theLocale</CODE> is null.
     */
    public MediaInfo(String theName,
	    Locale theLocale) {
	super(theName, theLocale);
    }

    /**
     * Returns whether this media description attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions must
     * be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>theObject</CODE> is not null.
     * <LI>
     * <CODE>theObject</CODE> is an instance of class MediaDescription.
     * <LI>
     * This media description attribute's underlying string and
     * <CODE>theObject</CODE>'s underlying string are equal.
     * <LI>
     * This media description attribute's locale and <CODE>theObject</CODE>'s
     * locale are equal.
     * </OL>
     *
     * @param theObject Object to compare to.
     *
     * @return True if <CODE>theObject</CODE> is equivalent to this media
     * description attribute, false otherwise.
     */
    @Override
    public boolean equals(Object theObject) {
	return super.equals(theObject)
		&& theObject instanceof MediaInfo;
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * <P>
     * For class MediaDescription and any vendor-defined subclasses, the
     * category is class MediaDescription itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaInfo.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class MediaDescription and any vendor-defined subclasses, the
     * category name is <CODE>"media-description"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-info";
    }

}

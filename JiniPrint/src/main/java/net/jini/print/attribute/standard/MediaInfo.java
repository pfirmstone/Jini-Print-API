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
 * <P>
 * Class MediaInfo is a printing attribute class, a text attribute, that gives a
 * info of a medium. An instance of class MediaInfo is not placed
 * directly into an attribute set; rather, it is always stored in a field of a {@link MediaCollection
 * } attribute, and the {@link MediaCollection } attribute is placed into the
 * attribute set.
 * </P><P>
 * The media info conveys no semantic information to the printer,
 * although the media info may be meaningful to a human user or
 * administrator. The printer treats the media info as just another
 * characteristic of the media that the printer must match to select the correct
 * media. Thus, the media info can be used to distinguish two media whose
 * other characteristics are identical. Furthermore, more than one medium
 * instance can have the same info text string.
 * </P><P>
 * The "media-info" member attribute specifies information that helps describe
 * the media instance for human consumption. This attribute can also be used to
 * distinguish two media instances for which all other member attributes (except
 * "media-key", if implemented) are the same. For example, this member attribute
 * could be used to distinguish between self-sticking and moisture-required
 * envelopes, both of which have a “media-type” value of ‘envelope’.
 * </P><P>
 * <B>Support Requirements:</B> Support for media info is indicated
 * along with support for media as a whole. See class {@link MediaCollection} for
 * further information. For the MediaInfo category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaInfo objects which represents the union of the media
 * info of the supported {@link MediaCollection} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * info, if any, of the default {@link MediaCollection} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link MediaCollection} attribute with the given media
 * info.
 * </P><P>
 * <B>IPP Compatibility:</B> The string value gives the IPP text value. The
 * category name returned by <CODE>getName()</CODE> gives the IPP attribute
 * name.
 * </P>
 * 
 * @see MediaInfoSupported
 * @see MediaCollection
 */
public class MediaInfo
	extends TextSyntax
	implements Attribute {

    /**
     * Constructs a new media info attribute with the given name and
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
     * Returns whether this media info attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions must
     * be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>theObject</CODE> is not null.
     * <LI>
     * <CODE>theObject</CODE> is an instance of class MediaInfo.
     * <LI>
     * This media info attribute's underlying string and
     * <CODE>theObject</CODE>'s underlying string are equal.
     * <LI>
     * This media info attribute's locale and <CODE>theObject</CODE>'s
     * locale are equal.
     * </OL>
     *
     * @param theObject Object to compare to.
     *
     * @return True if <CODE>theObject</CODE> is equivalent to this media
     * info attribute, false otherwise.
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
     * For class MediaInfo and any vendor-defined subclasses, the
     * category is class MediaInfo itself.
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
     * For class MediaInfo and any vendor-defined subclasses, the
     * category name is <CODE>"media-info"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-info";
    }

}

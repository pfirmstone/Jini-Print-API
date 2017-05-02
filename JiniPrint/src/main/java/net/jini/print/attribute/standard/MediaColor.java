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
 * Class MediaColor is a printing attribute class, an enumeration, that
 * specifies the color of a medium. An instance of class MediaColor is not
 * placed directly into an attribute set; rather, it is always stored in a field
 * of a {@link Media Media} attribute, and the {@link Media Media} attribute is
 * placed into the attribute set.
 * <P>
 * Class MediaColor declares keywords for standard media color values, derived
 * primarily from the Printer MIB (<A
 * HREF="http://www.ietf.org/rfc/rfc1759.txt">RFC 1759</A>) prtInputMediaColor
 * standard values with the addition of "red," "blue," "gray," "ivory," and
 * "orange," and replacing "transparent" with "clear". (See the {@link
 * MediaOpacity MediaOpacity} attribute for specifying transparency.)
 * Implementation- or site-defined names for a media color attribute may also be
 * created by defining a subclass of class MediaColor.
 * <P>
 * <B>Support Requirements:</B> Support for media colors is indicated along with
 * support for media as a whole. See class {@link Media Media} for further
 * information. For the MediaColor category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaColor objects which represents the union of the media
 * colors of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * color of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * color.
 * <P>
 * <B>IPP Compatibility:</B> For the base class MediaColor, the string value
 * gives the IPP keyword value. For a subclass, the attribute value must be
 * localized to give the IPP name and natural language values. The category name
 * returned by <CODE>getName()</CODE> gives the IPP attribute name.
 * <P>
 */
public class MediaColor extends EnumSyntax implements Attribute {

    public static final MediaColor 
	    BLACK = new MediaColor(0),//[PWG5101.1]
	    BLUE = new MediaColor(1),//[PWG5100.3]
	    BROWN = new MediaColor(2),//[PWG5101.1]
	    BUFF = new MediaColor(3),//[PWG5100.3]
	    CLEAR_BLACK = new MediaColor(4),//[PWG5101.1]
	    CLEAR_BLUE = new MediaColor(5),//[PWG5101.1]
	    CLEAR_BROWN = new MediaColor(6),//[PWG5101.1]
	    CLEAR_BUFF = new MediaColor(7),//[PWG5101.1]
	    CLEAR_CYAN = new MediaColor(8),//[PWG5101.1]
	    CLEAR_GOLD = new MediaColor(9),//[PWG5101.1]
	    CLEAR_GOLDENROD = new MediaColor(10),//[PWG5101.1]
	    CLEAR_GRAY = new MediaColor(11),//[PWG5101.1]
	    CLEAR_GREEN = new MediaColor(12),//[PWG5101.1]
	    CLEAR_IVORY = new MediaColor(13),//[PWG5101.1]
	    CLEAR_MAGENTA = new MediaColor(14),//[PWG5101.1]
	    CLEAR_MULTI_COLOR = new MediaColor(15),//[PWG5101.1]
	    CLEAR_MUSTARD = new MediaColor(16),//[PWG5101.1]
	    CLEAR_ORANGE = new MediaColor(17),//[PWG5101.1]
	    CLEAR_PINK = new MediaColor(18),//[PWG5101.1]
	    CLEAR_RED = new MediaColor(19),//[PWG5101.1]
	    CLEAR_SILVER = new MediaColor(20),//[PWG5101.1]
	    CLEAR_TURQUOISE = new MediaColor(21),//[PWG5101.1]
	    CLEAR_VIOLET = new MediaColor(22),//[PWG5101.1]
	    CLEAR_WHITE = new MediaColor(23),//[PWG5101.1]
	    CLEAR_YELLOW = new MediaColor(24),//[PWG5101.1]
	    CYAN = new MediaColor(25),//[PWG5101.1]
	    DARK_BLUE = new MediaColor(26),//[PWG5101.1]
	    DARK_BROWN = new MediaColor(27),//[PWG5101.1]
	    DARK_BUFF = new MediaColor(28),//[PWG5101.1]
	    DARK_CYAN = new MediaColor(29),//[PWG5101.1]
	    DARK_GOLD = new MediaColor(30),//[PWG5101.1]
	    DARK_GOLDENROD = new MediaColor(31),//[PWG5101.1]
	    DARK_GRAY = new MediaColor(32),//[PWG5101.1]
	    DARK_GREEN = new MediaColor(33),//[PWG5101.1]
	    DARK_IVORY = new MediaColor(34),//[PWG5101.1]
	    DARK_MAGENTA = new MediaColor(35),//[PWG5101.1]
	    DARK_MUSTARD = new MediaColor(36),//[PWG5101.1]
	    DARK_ORANGE = new MediaColor(37),//[PWG5101.1]
	    DARK_PINK = new MediaColor(38),//[PWG5101.1]
	    DARK_RED = new MediaColor(39),//[PWG5101.1]
	    DARK_SILVER = new MediaColor(40),//[PWG5101.1]
	    DARK_TURQUOISE = new MediaColor(41),//[PWG5101.1]
	    DARK_VIOLET = new MediaColor(42),//[PWG5101.1]
	    DARK_YELLOW = new MediaColor(43),//[PWG5101.1]
	    GOLD = new MediaColor(44),//[PWG5101.1]
	    GOLDENROD = new MediaColor(45),//[PWG5100.3]
	    GRAY = new MediaColor(46),//[PWG5100.3]
	    GREEN = new MediaColor(47),//[PWG5100.3]
	    IVORY = new MediaColor(48),//[PWG5100.3]
	    LIGHT_BLACK = new MediaColor(49),//[PWG5101.1]
	    LIGHT_BLUE = new MediaColor(50),//[PWG5101.1]
	    LIGHT_BROWN = new MediaColor(51),//[PWG5101.1]
	    LIGHT_BUFF = new MediaColor(52),//[PWG5101.1]
	    LIGHT_CYAN = new MediaColor(53),//[PWG5101.1]
	    LIGHT_GOLD = new MediaColor(54),//[PWG5101.1]
	    LIGHT_GOLDENROD = new MediaColor(55),//[PWG5101.1]
	    LIGHT_GRAY = new MediaColor(56),//[PWG5101.1]
	    LIGHT_GREEN = new MediaColor(57),//[PWG5101.1]
	    LIGHT_IVORY = new MediaColor(58),//[PWG5101.1]
	    LIGHT_MAGENTA = new MediaColor(59),//[PWG5101.1]
	    LIGHT_MUSTARD = new MediaColor(60),//[PWG5101.1]
	    LIGHT_ORANGE = new MediaColor(61),//[PWG5101.1]
	    LIGHT_PINK = new MediaColor(62),//[PWG5101.1]
	    LIGHT_RED = new MediaColor(63),//[PWG5101.1]
	    LIGHT_SILVER = new MediaColor(64),//[PWG5101.1]
	    LIGHT_TURQUOISE = new MediaColor(65),//[PWG5101.1]
	    LIGHT_VIOLET = new MediaColor(66),//[PWG5101.1]
	    LIGHT_YELLOW = new MediaColor(67),//[PWG5101.1]
	    MAGENTA = new MediaColor(68),//[PWG5101.1]
	    MULTI_COLOR = new MediaColor(69),//[PWG5101.1]
	    MUSTARD = new MediaColor(70),//[PWG5101.1]
	    NO_COLOR = new MediaColor(71),//[PWG5100.3]
	    ORANGE = new MediaColor(72),//[PWG5100.3]
	    PINK = new MediaColor(73),//[PWG5100.3]
	    RED = new MediaColor(74),//[PWG5100.3]
	    SILVER = new MediaColor(75),//[PWG5101.1]
	    TURQUOISE = new MediaColor(76),//[PWG5101.1]
	    VIOLET = new MediaColor(77),//[PWG5101.1]
	    WHITE = new MediaColor(78),//[PWG5100.3]
	    YELLOW = new MediaColor(79);//[PWG5100.3]

    /**
     * Construct a new media color enumeration value with the given integer
     * value.
     *
     * @param theValue Integer value.
     */
    protected MediaColor(int theValue) {
	super(theValue);
    }

    /**
     * Returns the string table for class MediaColor.
     *
     * @return the string table for class MediaColor.
     */
    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "black",
	    "blue",
	    "brown",
	    "buff",
	    "clear-black",
	    "clear-blue",
	    "clear-brown",
	    "clear-buff",
	    "clear-cyan",
	    "clear-gold",
	    "clear-goldenrod",
	    "clear-gray",
	    "clear-green",
	    "clear-ivory",
	    "clear-magenta",
	    "clear-multi-color",
	    "clear-mustard",
	    "clear-orange",
	    "clear-pink",
	    "clear-red",
	    "clear-silver",
	    "clear-turquoise",
	    "clear-violet",
	    "clear-white",
	    "clear-yellow",
	    "cyan",
	    "dark-blue",
	    "dark-brown",
	    "dark-buff",
	    "dark-cyan",
	    "dark-gold",
	    "dark-goldenrod",
	    "dark-gray",
	    "dark-green",
	    "dark-ivory",
	    "dark-magenta",
	    "dark-mustard",
	    "dark-orange",
	    "dark-pink",
	    "dark-red",
	    "dark-silver",
	    "dark-turquoise",
	    "dark-violet",
	    "dark-yellow",
	    "gold",
	    "goldenrod",
	    "gray",
	    "green",
	    "ivory",
	    "light-black",
	    "light-blue",
	    "light-brown",
	    "light-buff",
	    "light-cyan",
	    "light-gold",
	    "light-goldenrod",
	    "light-gray",
	    "light-green",
	    "light-ivory",
	    "light-magenta",
	    "light-mustard",
	    "light-orange",
	    "light-pink",
	    "light-red",
	    "light-silver",
	    "light-turquoise",
	    "light-violet",
	    "light-yellow",
	    "magenta",
	    "multi-color",
	    "mustard",
	    "no-color",
	    "orange",
	    "pink",
	    "red",
	    "silver",
	    "turquoise",
	    "violet",
	    "white",
	    "yellow",};
    }

    /**
     * Returns the enumeration value table for class MediaColor.
     *
     * @return the enumeration value table for class MediaColor.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BLACK,
	    BLUE,
	    BROWN,
	    BUFF,
	    CLEAR_BLACK,
	    CLEAR_BLUE,
	    CLEAR_BROWN,
	    CLEAR_BUFF,
	    CLEAR_CYAN,
	    CLEAR_GOLD,
	    CLEAR_GOLDENROD,
	    CLEAR_GRAY,
	    CLEAR_GREEN,
	    CLEAR_IVORY,
	    CLEAR_MAGENTA,
	    CLEAR_MULTI_COLOR,
	    CLEAR_MUSTARD,
	    CLEAR_ORANGE,
	    CLEAR_PINK,
	    CLEAR_RED,
	    CLEAR_SILVER,
	    CLEAR_TURQUOISE,
	    CLEAR_VIOLET,
	    CLEAR_WHITE,
	    CLEAR_YELLOW,
	    CYAN,
	    DARK_BLUE,
	    DARK_BROWN,
	    DARK_BUFF,
	    DARK_CYAN,
	    DARK_GOLD,
	    DARK_GOLDENROD,
	    DARK_GRAY,
	    DARK_GREEN,
	    DARK_IVORY,
	    DARK_MAGENTA,
	    DARK_MUSTARD,
	    DARK_ORANGE,
	    DARK_PINK,
	    DARK_RED,
	    DARK_SILVER,
	    DARK_TURQUOISE,
	    DARK_VIOLET,
	    DARK_YELLOW,
	    GOLD,
	    GOLDENROD,
	    GRAY,
	    GREEN,
	    IVORY,
	    LIGHT_BLACK,
	    LIGHT_BLUE,
	    LIGHT_BROWN,
	    LIGHT_BUFF,
	    LIGHT_CYAN,
	    LIGHT_GOLD,
	    LIGHT_GOLDENROD,
	    LIGHT_GRAY,
	    LIGHT_GREEN,
	    LIGHT_IVORY,
	    LIGHT_MAGENTA,
	    LIGHT_MUSTARD,
	    LIGHT_ORANGE,
	    LIGHT_PINK,
	    LIGHT_RED,
	    LIGHT_SILVER,
	    LIGHT_TURQUOISE,
	    LIGHT_VIOLET,
	    LIGHT_YELLOW,
	    MAGENTA,
	    MULTI_COLOR,
	    MUSTARD,
	    NO_COLOR,
	    ORANGE,
	    PINK,
	    RED,
	    SILVER,
	    TURQUOISE,
	    VIOLET,
	    WHITE,
	    YELLOW,};
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS). For class MediaColor and any
     * vendor-defined subclasses, the category is class MediaColor itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaColor.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance. For class MediaColor and any vendor-defined subclasses, the
     * category name is "media-color".
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-color";
    }

}

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
import javax.print.attribute.EnumSyntax;

/**
 * This RECOMMENDED member attribute provides a PWG media color [PWG5101.1]
 * value representing the color of the material.
 *
 * @author peter
 */
public class MaterialColor extends EnumSyntax implements Attribute {

    public static final MaterialColor 
	    BLACK = new MaterialColor(0),//[PWG5101.1]
	    BLUE = new MaterialColor(1),//[PWG5100.3]
	    BROWN = new MaterialColor(2),//[PWG5101.1]
	    BUFF = new MaterialColor(3),//[PWG5100.3]
	    CLEAR_BLACK = new MaterialColor(4),//[PWG5101.1]
	    CLEAR_BLUE = new MaterialColor(5),//[PWG5101.1]
	    CLEAR_BROWN = new MaterialColor(6),//[PWG5101.1]
	    CLEAR_BUFF = new MaterialColor(7),//[PWG5101.1]
	    CLEAR_CYAN = new MaterialColor(8),//[PWG5101.1]
	    CLEAR_GOLD = new MaterialColor(9),//[PWG5101.1]
	    CLEAR_GOLDENROD = new MaterialColor(10),//[PWG5101.1]
	    CLEAR_GRAY = new MaterialColor(11),//[PWG5101.1]
	    CLEAR_GREEN = new MaterialColor(12),//[PWG5101.1]
	    CLEAR_IVORY = new MaterialColor(13),//[PWG5101.1]
	    CLEAR_MAGENTA = new MaterialColor(14),//[PWG5101.1]
	    CLEAR_MULTI_COLOR = new MaterialColor(15),//[PWG5101.1]
	    CLEAR_MUSTARD = new MaterialColor(16),//[PWG5101.1]
	    CLEAR_ORANGE = new MaterialColor(17),//[PWG5101.1]
	    CLEAR_PINK = new MaterialColor(18),//[PWG5101.1]
	    CLEAR_RED = new MaterialColor(19),//[PWG5101.1]
	    CLEAR_SILVER = new MaterialColor(20),//[PWG5101.1]
	    CLEAR_TURQUOISE = new MaterialColor(21),//[PWG5101.1]
	    CLEAR_VIOLET = new MaterialColor(22),//[PWG5101.1]
	    CLEAR_WHITE = new MaterialColor(23),//[PWG5101.1]
	    CLEAR_YELLOW = new MaterialColor(24),//[PWG5101.1]
	    CYAN = new MaterialColor(25),//[PWG5101.1]
	    DARK_BLUE = new MaterialColor(26),//[PWG5101.1]
	    DARK_BROWN = new MaterialColor(27),//[PWG5101.1]
	    DARK_BUFF = new MaterialColor(28),//[PWG5101.1]
	    DARK_CYAN = new MaterialColor(29),//[PWG5101.1]
	    DARK_GOLD = new MaterialColor(30),//[PWG5101.1]
	    DARK_GOLDENROD = new MaterialColor(31),//[PWG5101.1]
	    DARK_GRAY = new MaterialColor(32),//[PWG5101.1]
	    DARK_GREEN = new MaterialColor(33),//[PWG5101.1]
	    DARK_IVORY = new MaterialColor(34),//[PWG5101.1]
	    DARK_MAGENTA = new MaterialColor(35),//[PWG5101.1]
	    DARK_MUSTARD = new MaterialColor(36),//[PWG5101.1]
	    DARK_ORANGE = new MaterialColor(37),//[PWG5101.1]
	    DARK_PINK = new MaterialColor(38),//[PWG5101.1]
	    DARK_RED = new MaterialColor(39),//[PWG5101.1]
	    DARK_SILVER = new MaterialColor(40),//[PWG5101.1]
	    DARK_TURQUOISE = new MaterialColor(41),//[PWG5101.1]
	    DARK_VIOLET = new MaterialColor(42),//[PWG5101.1]
	    DARK_YELLOW = new MaterialColor(43),//[PWG5101.1]
	    GOLD = new MaterialColor(44),//[PWG5101.1]
	    GOLDENROD = new MaterialColor(45),//[PWG5100.3]
	    GRAY = new MaterialColor(46),//[PWG5100.3]
	    GREEN = new MaterialColor(47),//[PWG5100.3]
	    IVORY = new MaterialColor(48),//[PWG5100.3]
	    LIGHT_BLACK = new MaterialColor(49),//[PWG5101.1]
	    LIGHT_BLUE = new MaterialColor(50),//[PWG5101.1]
	    LIGHT_BROWN = new MaterialColor(51),//[PWG5101.1]
	    LIGHT_BUFF = new MaterialColor(52),//[PWG5101.1]
	    LIGHT_CYAN = new MaterialColor(53),//[PWG5101.1]
	    LIGHT_GOLD = new MaterialColor(54),//[PWG5101.1]
	    LIGHT_GOLDENROD = new MaterialColor(55),//[PWG5101.1]
	    LIGHT_GRAY = new MaterialColor(56),//[PWG5101.1]
	    LIGHT_GREEN = new MaterialColor(57),//[PWG5101.1]
	    LIGHT_IVORY = new MaterialColor(58),//[PWG5101.1]
	    LIGHT_MAGENTA = new MaterialColor(59),//[PWG5101.1]
	    LIGHT_MUSTARD = new MaterialColor(60),//[PWG5101.1]
	    LIGHT_ORANGE = new MaterialColor(61),//[PWG5101.1]
	    LIGHT_PINK = new MaterialColor(62),//[PWG5101.1]
	    LIGHT_RED = new MaterialColor(63),//[PWG5101.1]
	    LIGHT_SILVER = new MaterialColor(64),//[PWG5101.1]
	    LIGHT_TURQUOISE = new MaterialColor(65),//[PWG5101.1]
	    LIGHT_VIOLET = new MaterialColor(66),//[PWG5101.1]
	    LIGHT_YELLOW = new MaterialColor(67),//[PWG5101.1]
	    MAGENTA = new MaterialColor(68),//[PWG5101.1]
	    MULTI_COLOR = new MaterialColor(69),//[PWG5101.1]
	    MUSTARD = new MaterialColor(70),//[PWG5101.1]
	    NO_COLOR = new MaterialColor(71),//[PWG5100.3]
	    ORANGE = new MaterialColor(72),//[PWG5100.3]
	    PINK = new MaterialColor(73),//[PWG5100.3]
	    RED = new MaterialColor(74),//[PWG5100.3]
	    SILVER = new MaterialColor(75),//[PWG5101.1]
	    TURQUOISE = new MaterialColor(76),//[PWG5101.1]
	    VIOLET = new MaterialColor(77),//[PWG5101.1]
	    WHITE = new MaterialColor(78),//[PWG5100.3]
	    YELLOW = new MaterialColor(79);//[PWG5100.3]

    private MaterialColor(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialColor.class;
    }

    @Override
    public String getName() {
	return "material-color";
    }

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

}

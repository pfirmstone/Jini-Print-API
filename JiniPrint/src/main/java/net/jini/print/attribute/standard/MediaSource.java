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
 *
 */
public class MediaSource extends EnumSyntax implements Attribute {

    private static final long serialVersionUID = 1L;

    public static final MediaSource 
	    ALTERNATE = new MediaSource(0),//[PWG5100.13]
	    ALTERNATE_ROLL = new MediaSource(1),//[PWG5100.13]
	    AUTO = new MediaSource(2),//[PWG5100.13]
	    BOTTOM = new MediaSource(3),//[PWG5100.13]
	    BY_PASS_TRAY = new MediaSource(4),//[PWG5100.13]
	    CENTER = new MediaSource(5),//[PWG5100.13]
	    DISC = new MediaSource(6),//[PWG5100.13]
	    ENVELOPE = new MediaSource(7),//[PWG5100.13]
	    HAGAKI = new MediaSource(8),//[PWG5100.13]
	    LARGE_CAPACITY = new MediaSource(9),//[PWG5100.13]
	    LEFT = new MediaSource(10),//[PWG5100.13]
	    MAIN = new MediaSource(11),//[PWG5100.13]
	    MAIN_ROLL = new MediaSource(12),//[PWG5100.13]
	    MANUAL = new MediaSource(13),//[PWG5100.13]
	    MIDDLE = new MediaSource(14),//[PWG5100.13]
	    PHOTO = new MediaSource(15),//[PWG5100.13]
	    REAR = new MediaSource(16),//[PWG5100.13]
	    RIGHT = new MediaSource(17),//[PWG5100.13]
	    ROLL_1 = new MediaSource(18),//[PWG5100.13]
	    ROLL_2 = new MediaSource(19),//[PWG5100.13]
	    ROLL_3 = new MediaSource(20),//[PWG5100.13]
	    ROLL_4 = new MediaSource(21),//[PWG5100.13]
	    ROLL_5 = new MediaSource(22),//[PWG5100.13]
	    ROLL_6 = new MediaSource(23),//[PWG5100.13]
	    ROLL_7 = new MediaSource(24),//[PWG5100.13]
	    ROLL_8 = new MediaSource(25),//[PWG5100.13]
	    ROLL_9 = new MediaSource(26),//[PWG5100.13]
	    ROLL_10 = new MediaSource(27),//[PWG5100.13]
	    SIDE = new MediaSource(28),//[PWG5100.13]
	    TOP = new MediaSource(29),//[PWG5100.13]
	    TRAY_1 = new MediaSource(30),//[PWG5100.13]
	    TRAY_2 = new MediaSource(31),//[PWG5100.13]
	    TRAY_3 = new MediaSource(32),//[PWG5100.13]
	    TRAY_4 = new MediaSource(33),//[PWG5100.13]
	    TRAY_5 = new MediaSource(34),//[PWG5100.13]
	    TRAY_6 = new MediaSource(35),//[PWG5100.13]
	    TRAY_7 = new MediaSource(36),//[PWG5100.13]
	    TRAY_8 = new MediaSource(37),//[PWG5100.13]
	    TRAY_9 = new MediaSource(38),//[PWG5100.13]
	    TRAY_10 = new MediaSource(39),//[PWG5100.13]
	    TRAY_11 = new MediaSource(40),//[PWG5100.13]
	    TRAY_12 = new MediaSource(41),//[PWG5100.13]
	    TRAY_13 = new MediaSource(42),//[PWG5100.13]
	    TRAY_14 = new MediaSource(43),//[PWG5100.13]
	    TRAY_15 = new MediaSource(44),//[PWG5100.13]
	    TRAY_16 = new MediaSource(45),//[PWG5100.13]
	    TRAY_17 = new MediaSource(46),//[PWG5100.13]
	    TRAY_18 = new MediaSource(47),//[PWG5100.13]
	    TRAY_19 = new MediaSource(48),//[PWG5100.13]
	    TRAY_20 = new MediaSource(49);//[PWG5100.13]

    protected MediaSource(int value) {
	super(value);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSource.class;
    }

    @Override
    public String getName() {
	return "media-source";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "alternate",
	    "alternate-roll",
	    "auto",
	    "bottom",
	    "by-pass-tray",
	    "center",
	    "disc",
	    "envelope",
	    "hagaki",
	    "large-capacity",
	    "left",
	    "main",
	    "main-roll",
	    "manual",
	    "middle",
	    "photo",
	    "rear",
	    "right",
	    "roll-1",
	    "roll-2",
	    "roll-3",
	    "roll-4",
	    "roll-5",
	    "roll-6",
	    "roll-7",
	    "roll-8",
	    "roll-9",
	    "roll-10",
	    "side",
	    "top",
	    "tray-1",
	    "tray-2",
	    "tray-3",
	    "tray-4",
	    "tray-5",
	    "tray-6",
	    "tray-7",
	    "tray-8",
	    "tray-9",
	    "tray-10",
	    "tray-11",
	    "tray-12",
	    "tray-13",
	    "tray-14",
	    "tray-15",
	    "tray-16",
	    "tray-17",
	    "tray-18",
	    "tray-19",
	    "tray-20",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ALTERNATE,
	    ALTERNATE_ROLL,
	    AUTO,
	    BOTTOM,
	    BY_PASS_TRAY,
	    CENTER,
	    DISC,
	    ENVELOPE,
	    HAGAKI,
	    LARGE_CAPACITY,
	    LEFT,
	    MAIN,
	    MAIN_ROLL,
	    MANUAL,
	    MIDDLE,
	    PHOTO,
	    REAR,
	    RIGHT,
	    ROLL_1,
	    ROLL_2,
	    ROLL_3,
	    ROLL_4,
	    ROLL_5,
	    ROLL_6,
	    ROLL_7,
	    ROLL_8,
	    ROLL_9,
	    ROLL_10,
	    SIDE,
	    TOP,
	    TRAY_1,
	    TRAY_2,
	    TRAY_3,
	    TRAY_4,
	    TRAY_5,
	    TRAY_6,
	    TRAY_7,
	    TRAY_8,
	    TRAY_9,
	    TRAY_10,
	    TRAY_11,
	    TRAY_12,
	    TRAY_13,
	    TRAY_14,
	    TRAY_15,
	    TRAY_16,
	    TRAY_17,
	    TRAY_18,
	    TRAY_19,
	    TRAY_20,};
    }
}

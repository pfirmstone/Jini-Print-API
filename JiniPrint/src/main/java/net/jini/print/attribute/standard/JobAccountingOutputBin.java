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
import javax.print.attribute.PrintJobAttribute;

/**
 *
 * @author peter
 */
public class JobAccountingOutputBin extends EnumSyntax implements PrintJobAttribute {

    private static final JobAccountingOutputBin 
	    AUTO = new JobAccountingOutputBin(0),//[APPLE-OUTPUT-BIN]
	    BOTTOM = new JobAccountingOutputBin(1),//[PWG5100.2]
	    CENTER = new JobAccountingOutputBin(2),//[PWG5100.2]
	    FACE_DOWN = new JobAccountingOutputBin(3),//[PWG5100.2]
	    FACE_UP = new JobAccountingOutputBin(4),//[PWG5100.2]
	    LARGE_CAPACITY = new JobAccountingOutputBin(5),//[PWG5100.2]
	    LEFT = new JobAccountingOutputBin(6),//[PWG5100.2]
	    MAILBOX_1 = new JobAccountingOutputBin(7),//[PWG5100.2]
	    MAILBOX_2 = new JobAccountingOutputBin(8),//[PWG5100.2]
	    MAILBOX_3 = new JobAccountingOutputBin(9),//[PWG5100.2]
	    MAILBOX_4 = new JobAccountingOutputBin(10),//[PWG5100.2]
	    MAILBOX_5 = new JobAccountingOutputBin(11),//[PWG5100.2]
	    MAILBOX_6 = new JobAccountingOutputBin(12),//[PWG5100.2]
	    MAILBOX_7 = new JobAccountingOutputBin(13),//[PWG5100.2]
	    MAILBOX_8 = new JobAccountingOutputBin(14),//[PWG5100.2]
	    MAILBOX_9 = new JobAccountingOutputBin(15),//[PWG5100.2]
	    MAILBOX_10 = new JobAccountingOutputBin(16),//[PWG5100.2]
	    MIDDLE = new JobAccountingOutputBin(17),//[PWG5100.2]
	    MY_MAILBOX = new JobAccountingOutputBin(18),//[PWG5100.2]
	    REAR = new JobAccountingOutputBin(19),//[PWG5100.2]
	    RIGHT = new JobAccountingOutputBin(20),//[PWG5100.2]
	    SIDE = new JobAccountingOutputBin(21),//[PWG5100.2]
	    STACKER_1 = new JobAccountingOutputBin(22),//[PWG5100.2]
	    STACKER_2 = new JobAccountingOutputBin(23),//[PWG5100.2]
	    STACKER_3 = new JobAccountingOutputBin(24),//[PWG5100.2]
	    STACKER_4 = new JobAccountingOutputBin(25),//[PWG5100.2]
	    STACKER_5 = new JobAccountingOutputBin(26),//[PWG5100.2]
	    STACKER_6 = new JobAccountingOutputBin(27),//[PWG5100.2]
	    STACKER_7 = new JobAccountingOutputBin(28),//[PWG5100.2]
	    STACKER_8 = new JobAccountingOutputBin(29),//[PWG5100.2]
	    STACKER_9 = new JobAccountingOutputBin(30),//[PWG5100.2]
	    STACKER_10 = new JobAccountingOutputBin(31),//[PWG5100.2]
	    TOP = new JobAccountingOutputBin(32),//[PWG5100.2]
	    TRAY_1 = new JobAccountingOutputBin(33),//[PWG5100.2]
	    TRAY_2 = new JobAccountingOutputBin(34),//[PWG5100.2]
	    TRAY_3 = new JobAccountingOutputBin(35),//[PWG5100.2]
	    TRAY_4 = new JobAccountingOutputBin(36),//[PWG5100.2]
	    TRAY_5 = new JobAccountingOutputBin(37),//[PWG5100.2]
	    TRAY_6 = new JobAccountingOutputBin(38),//[PWG5100.2]
	    TRAY_7 = new JobAccountingOutputBin(39),//[PWG5100.2]
	    TRAY_8 = new JobAccountingOutputBin(40),//[PWG5100.2]
	    TRAY_9 = new JobAccountingOutputBin(41),//[PWG5100.2]
	    TRAY_10 = new JobAccountingOutputBin(42);//[PWG5100.2]

    JobAccountingOutputBin(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobAccountingOutputBin.class;
    }

    @Override
    public String getName() {
	return "job-accounting-output-bin";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "auto",
	    "bottom",
	    "center",
	    "face-down",
	    "face-up",
	    "large-capacity",
	    "left",
	    "mailbox-1",
	    "mailbox-2",
	    "mailbox-3",
	    "mailbox-4",
	    "mailbox-5",
	    "mailbox-6",
	    "mailbox-7",
	    "mailbox-8",
	    "mailbox-9",
	    "mailbox-10",
	    "middle",
	    "my-mailbox",
	    "rear",
	    "right",
	    "side",
	    "stacker-1",
	    "stacker-2",
	    "stacker-3",
	    "stacker-4",
	    "stacker-5",
	    "stacker-6",
	    "stacker-7",
	    "stacker-8",
	    "stacker-9",
	    "stacker-10",
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
	    "tray-10",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    AUTO,
	    BOTTOM,
	    CENTER,
	    FACE_DOWN,
	    FACE_UP,
	    LARGE_CAPACITY,
	    LEFT,
	    MAILBOX_1,
	    MAILBOX_2,
	    MAILBOX_3,
	    MAILBOX_4,
	    MAILBOX_5,
	    MAILBOX_6,
	    MAILBOX_7,
	    MAILBOX_8,
	    MAILBOX_9,
	    MAILBOX_10,
	    MIDDLE,
	    MY_MAILBOX,
	    REAR,
	    RIGHT,
	    SIDE,
	    STACKER_1,
	    STACKER_2,
	    STACKER_3,
	    STACKER_4,
	    STACKER_5,
	    STACKER_6,
	    STACKER_7,
	    STACKER_8,
	    STACKER_9,
	    STACKER_10,
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
	    TRAY_10,};
    }

}

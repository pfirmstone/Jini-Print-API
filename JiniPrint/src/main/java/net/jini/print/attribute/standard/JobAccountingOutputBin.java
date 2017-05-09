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
 * The "job-accounting-output-bin" member attribute specifies the output bin in
 * which the accounting sheets are to be placed (see [pwg-output-bin]). If this
 * member attribute is not supplied by the client or not supported by the
 * Printer, then the Printer places the accounting sheets in the same output-bin
 * as the rest of the job.
 *
 * @author peter
 */
public class JobAccountingOutputBin extends EnumSyntax implements Attribute {

    /**
     * Specifies that a Printer automatically chooses the correct output tray
     * for the given Job Template attributes.
     */
    public static final JobAccountingOutputBin AUTO = new JobAccountingOutputBin(0);//[APPLE-OUTPUT-BIN]

    /**
     * The output-bin that, when facing the device, is best identified as the
     * “bottom” bin with respect to the device.
     */
    public static final JobAccountingOutputBin BOTTOM = new JobAccountingOutputBin(1);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “center” bin with respect to the device.
     */
    public static final JobAccountingOutputBin CENTER = new JobAccountingOutputBin(2);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “face-down” bin with
     * respect to the device. The selection of this output bin does not cause
     * output to be made face-down; rather this output bin is given this name
     * because a sheet with printing on one-side arrives in the output bin in
     * the face-down position.
     */
    public static final JobAccountingOutputBin FACE_DOWN = new JobAccountingOutputBin(3);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “face-up” bin with respect
     * to the device. The selection of this output bin does not cause output to
     * be made face-up; rather this output bin is given this name because a
     * sheet with printing on one-side arrives in the output bin in the face-up
     * position.
     */
    public static final JobAccountingOutputBin FACE_UP = new JobAccountingOutputBin(4);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “large-capacity” bin (in
     * terms of the number of sheets) with respect to the device.
     */
    public static final JobAccountingOutputBin LARGE_CAPACITY = new JobAccountingOutputBin(5);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “left” bin with respect to the device.
     */
    public static final JobAccountingOutputBin LEFT = new JobAccountingOutputBin(6);//[PWG5100.2]
    /**
     * The output-bin that is best identified as a mailbox with values
     * ‘mailbox-1’, ‘mailbox-2’, ‘mailbox-3’, …. Each mailbox is typically used
     * to collect jobs for an individual or group. Whether the mailbox has doors
     * and/or locks or is open, depends on implementation. The correspondence
     * between the ‘mailbox-N’ keyword and the actual output-bin in the device
     * is implementation-dependent, as is the number of mailboxes. A system
     * administrator MAY be able to assign a name to each mailbox in order to
     * make selection of a mailbox easier for the user. If this group of values
     * is supported, at least the ‘mailbox-1’ value MUST be supported, unless
     * the system administrator has assigned names or integer values to
     * mailboxes.
     */
    public static final JobAccountingOutputBin MAILBOX_1 = new JobAccountingOutputBin(7),//[PWG5100.2]
	    MAILBOX_2 = new JobAccountingOutputBin(8),//[PWG5100.2]
	    MAILBOX_3 = new JobAccountingOutputBin(9),//[PWG5100.2]
	    MAILBOX_4 = new JobAccountingOutputBin(10),//[PWG5100.2]
	    MAILBOX_5 = new JobAccountingOutputBin(11),//[PWG5100.2]
	    MAILBOX_6 = new JobAccountingOutputBin(12),//[PWG5100.2]
	    MAILBOX_7 = new JobAccountingOutputBin(13),//[PWG5100.2]
	    MAILBOX_8 = new JobAccountingOutputBin(14),//[PWG5100.2]
	    MAILBOX_9 = new JobAccountingOutputBin(15),//[PWG5100.2]
	    MAILBOX_10 = new JobAccountingOutputBin(16);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “middle” bin with respect to the device.
     */
    public static final JobAccountingOutputBin MIDDLE = new JobAccountingOutputBin(17);//[PWG5100.2]
    /**
     * The output-bin that is best identified as functioning like a private
     * “mailbox” with respect to the device. An output-bin functions like a
     * private mailbox if a printer selects the actual output bin using
     * additional implementation-dependent criteria, such as the “authenticated
     * user” (see [RFC2911] section 8.3) that depends on the user submitting the
     * job. Whether the mailbox has doors and/or locks or is open, depends on
     * implementation, as is the number of mailboxes.
     */
    public static final JobAccountingOutputBin MY_MAILBOX = new JobAccountingOutputBin(18);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “rear” bin with respect to the device.
     */
    public static final JobAccountingOutputBin REAR = new JobAccountingOutputBin(19);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “right” bin with respect to the device.
     */
    public static final JobAccountingOutputBin RIGHT = new JobAccountingOutputBin(20);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “side” bin with respect to the device.
     */
    public static final JobAccountingOutputBin SIDE = new JobAccountingOutputBin(21);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the stacker with values
     * ‘stacker-1’, ‘stacker-2’, .... A stacker is typically used to collate
     * sheets within a single document (not to be confused with collated copies
     * in which document copies are collated within a job - see the description
     * of the ‘separate-documents-collated-copies’ value of the
     * “multiple-document-handling” attribute in [RFC2911] section 4.2.4). The
     * correspondence between the ‘stacker-N’ keyword and the actual stacker in
     * the device is implementation-dependent, as is the number of stackers. If
     * this group of values is supported, at least the ‘stacker-1’ value MUST be
     * supported, unless the system administrator has assigned names. For client
     * implementations that require distinct keywords for each possible value,
     * say, for localization purposes, it is recommended for interoperability
     * with other vendor’s Printer implementations that ‘stacker-1’ to
     * ‘stacker-10’ keywords be represented.
     */
    public static final JobAccountingOutputBin STACKER_1 = new JobAccountingOutputBin(22),//[PWG5100.2]
	    STACKER_2 = new JobAccountingOutputBin(23),//[PWG5100.2]
	    STACKER_3 = new JobAccountingOutputBin(24),//[PWG5100.2]
	    STACKER_4 = new JobAccountingOutputBin(25),//[PWG5100.2]
	    STACKER_5 = new JobAccountingOutputBin(26),//[PWG5100.2]
	    STACKER_6 = new JobAccountingOutputBin(27),//[PWG5100.2]
	    STACKER_7 = new JobAccountingOutputBin(28),//[PWG5100.2]
	    STACKER_8 = new JobAccountingOutputBin(29),//[PWG5100.2]
	    STACKER_9 = new JobAccountingOutputBin(30),//[PWG5100.2]
	    STACKER_10 = new JobAccountingOutputBin(31);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “top” bin with respect to the device.
     */
    public static final JobAccountingOutputBin TOP = new JobAccountingOutputBin(32);//[PWG5100.2]
    /**
     * Output bins that are best identified as ‘tray-1’, ‘tray-2’, ... rather
     * than the descriptive names defined in the above keyword list.
     */
    public static final JobAccountingOutputBin TRAY_1 = new JobAccountingOutputBin(33),//[PWG5100.2]
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

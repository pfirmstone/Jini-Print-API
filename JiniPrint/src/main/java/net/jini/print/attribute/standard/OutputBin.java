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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.EnumSyntax;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;

/**
 * This Job Template attribute identifies the device output bin to which the job
 * is to be delivered. There are standard values whose attribute syntax is
 * ‘keyword’, but there are no standard values whose attribute syntax is ‘name’.
 * Output bins whose attribute syntax is ‘name’, if any, are assigned by local
 * administrators (by means outside the scope of IPP/1.0 and IPP/1.1). Each
 * output bin may have implementation-dependent properties. Output bins
 * identified by ‘name’ values MAY possess any of the properties of the output
 * bins identified by the following keywords, depending on implementation.
 * However, each output bin MUST be identified by only one value of any
 * attribute syntax type. Otherwise, clients might be mis-led as to the
 * capabilities of the device when querying the associated Printer object’s
 * “output-bin-supported” attribute. Note: Output bin types, such as sorter(s)
 * or collator(s), have not been included in the values of this attribute, since
 * implementations that employ such internal or external bins, determine which
 * to use by the values of other job attributes, such as “finishings”, and
 * “copies”. When validating a job in a Job Creation (or Validate-Job)
 * operation, which subset of the output bins are allowed as a destination for a
 * job MAY depend on the user submitting that job, the user’s authentication,
 * and possibly other job attributes, such as “finishings” and “copies”. When
 * returning the values of the associated “output-bin-supported” attribute, the
 * values returned MAY depend on the user issuing the Get-Printer-Attributes
 * operation. For example, some implementations MAY omit the ‘my-mailbox’ value
 * for users who do not have a defined mailbox for this IPP Printer object,
 * while others MAY always return ‘my-mailbox’ to all users even if only
 * supported for certain users. If this IPP Printer object is associated with
 * multiple devices (fan-out) (see [RFC2911] section 2.1), the value of its
 * “output-bin-supported” attribute is the union of the values supported with
 * duplicates removed.
 *
 *
 *
 * @author peter
 */
public class OutputBin extends EnumSyntax implements PrintJobAttribute, PrintRequestAttribute, DocAttribute {

    /**
     * Specifies that a Printer automatically chooses the correct output tray
     * for the given Job Template attributes.
     */
    public static final OutputBin AUTO = new OutputBin(0);//[APPLE-OUTPUT-BIN]

    /**
     * The output-bin that, when facing the device, is best identified as the
     * “bottom” bin with respect to the device.
     */
    public static final OutputBin BOTTOM = new OutputBin(1);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “center” bin with respect to the device.
     */
    public static final OutputBin CENTER = new OutputBin(2);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “face-down” bin with
     * respect to the device. The selection of this output bin does not cause
     * output to be made face-down; rather this output bin is given this name
     * because a sheet with printing on one-side arrives in the output bin in
     * the face-down position.
     */
    public static final OutputBin FACE_DOWN = new OutputBin(3);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “face-up” bin with respect
     * to the device. The selection of this output bin does not cause output to
     * be made face-up; rather this output bin is given this name because a
     * sheet with printing on one-side arrives in the output bin in the face-up
     * position.
     */
    public static final OutputBin FACE_UP = new OutputBin(4);//[PWG5100.2]
    /**
     * The output-bin that is best identified as the “large-capacity” bin (in
     * terms of the number of sheets) with respect to the device.
     */
    public static final OutputBin LARGE_CAPACITY = new OutputBin(5);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “left” bin with respect to the device.
     */
    public static final OutputBin LEFT = new OutputBin(6);//[PWG5100.2]
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
    public static final OutputBin MAILBOX_1 = new OutputBin(7),//[PWG5100.2]
	    MAILBOX_2 = new OutputBin(8),//[PWG5100.2]
	    MAILBOX_3 = new OutputBin(9),//[PWG5100.2]
	    MAILBOX_4 = new OutputBin(10),//[PWG5100.2]
	    MAILBOX_5 = new OutputBin(11),//[PWG5100.2]
	    MAILBOX_6 = new OutputBin(12),//[PWG5100.2]
	    MAILBOX_7 = new OutputBin(13),//[PWG5100.2]
	    MAILBOX_8 = new OutputBin(14),//[PWG5100.2]
	    MAILBOX_9 = new OutputBin(15),//[PWG5100.2]
	    MAILBOX_10 = new OutputBin(16);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “middle” bin with respect to the device.
     */
    public static final OutputBin MIDDLE = new OutputBin(17);//[PWG5100.2]
    /**
     * The output-bin that is best identified as functioning like a private
     * “mailbox” with respect to the device. An output-bin functions like a
     * private mailbox if a printer selects the actual output bin using
     * additional implementation-dependent criteria, such as the “authenticated
     * user” (see [RFC2911] section 8.3) that depends on the user submitting the
     * job. Whether the mailbox has doors and/or locks or is open, depends on
     * implementation, as is the number of mailboxes.
     */
    public static final OutputBin MY_MAILBOX = new OutputBin(18);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “rear” bin with respect to the device.
     */
    public static final OutputBin REAR = new OutputBin(19);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “right” bin with respect to the device.
     */
    public static final OutputBin RIGHT = new OutputBin(20);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “side” bin with respect to the device.
     */
    public static final OutputBin SIDE = new OutputBin(21);//[PWG5100.2]
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
    public static final OutputBin STACKER_1 = new OutputBin(22),//[PWG5100.2]
	    STACKER_2 = new OutputBin(23),//[PWG5100.2]
	    STACKER_3 = new OutputBin(24),//[PWG5100.2]
	    STACKER_4 = new OutputBin(25),//[PWG5100.2]
	    STACKER_5 = new OutputBin(26),//[PWG5100.2]
	    STACKER_6 = new OutputBin(27),//[PWG5100.2]
	    STACKER_7 = new OutputBin(28),//[PWG5100.2]
	    STACKER_8 = new OutputBin(29),//[PWG5100.2]
	    STACKER_9 = new OutputBin(30),//[PWG5100.2]
	    STACKER_10 = new OutputBin(31);//[PWG5100.2]
    /**
     * The output-bin that, when facing the device, is best identified as the
     * “top” bin with respect to the device.
     */
    public static final OutputBin TOP = new OutputBin(32);//[PWG5100.2]
    /**
     * Output bins that are best identified as ‘tray-1’, ‘tray-2’, ... rather
     * than the descriptive names defined in the above keyword list.
     */
    public static final OutputBin TRAY_1 = new OutputBin(33),//[PWG5100.2]
	    TRAY_2 = new OutputBin(34),//[PWG5100.2]
	    TRAY_3 = new OutputBin(35),//[PWG5100.2]
	    TRAY_4 = new OutputBin(36),//[PWG5100.2]
	    TRAY_5 = new OutputBin(37),//[PWG5100.2]
	    TRAY_6 = new OutputBin(38),//[PWG5100.2]
	    TRAY_7 = new OutputBin(39),//[PWG5100.2]
	    TRAY_8 = new OutputBin(40),//[PWG5100.2]
	    TRAY_9 = new OutputBin(41),//[PWG5100.2]
	    TRAY_10 = new OutputBin(42);//[PWG5100.2]

    protected OutputBin(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return OutputBin.class;
    }

    @Override
    public String getName() {
	return "output-bin";
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

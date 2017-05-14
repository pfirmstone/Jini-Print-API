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
import javax.print.attribute.PrintRequestAttribute;

/**
 * <p>
 * This attribute indicates whether print-stream pages of the job are to be
 * delivered to the output bin or finisher in the same page order as the
 * original document, or, in reverse of that order, and, whether the
 * print-stream pages are delivered face up or face down. The "page-delivery"
 * attribute specifies the intent based on the "original document" page order.
 * </p><p>
 * The "page-delivery" attribute is often used in conjunction with on-line and
 * off-line finishing devices. The intent is to be able to deliver the media
 * sheets in either the order of the page-stream pages as defined in the
 * "original document" or in the reverse of that order.
 * </p><p>
 * <h1>Interaction with the "page-order-received" attribute</h1>
 * <p>
 * The "page-order-delivery" attribute is dependent on the value of the
 * "page-order-received" attribute
 * </p>
 * <TABLE BORDER=1>
 * <TR>
 * <TH>"page-order-received"</TH>
 * <TH>"page-delivery"</TH>
 * <TH>Description of behavior</TH>
 * </TR>
 * <TR>
 * <TD>'1-to-n-order'</TD>
 * <TD>'same-order-face-up'</TD>
 * <TD>The first print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second "print-stream" page, and
 * so on. Further, each media sheet MUST be delivered with side one of the sheet
 * facing up.</TD>
 * </TR>
 * <TR>
 * <TD>'1-to-n-order'</TD>
 * <TD>'same-face-order-down'</TD>
 * <TD>The first print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second "print-stream" page, and
 * so on. Further, each media sheet MUST be delivered with side one of the sheet
 * facing down.</TD>
 * </TR>
 * <TR>
 * <TD>'1-to-n-order'</TD>
 * <TD>'reverse-order-face-up'</TD>
 * <TD>The last print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second to last "print-stream"
 * page, and so on. Further, each media sheet MUST be delivered with side one of
 * the sheet facing up.</TD>
 * </TR>
 * <TR>
 * <TD>'1-to-n-order'</TD>
 * <TD>'reverse-order-face-down'</TD>
 * <TD>The last print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second to last "print-stream"
 * page, and so on. Further, each media sheet MUST be delivered with side one of
 * the sheet facing down.</TD>
 * </TR>
 * <TR>
 * <TD>'n-to-1-order'</TD>
 * <TD>'same-order-face-up'</TD>
 * <TD>The first print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second "print-stream" page, and
 * so on. Further, each media sheet MUST be delivered with side one of the sheet
 * facing up.</TD>
 * </TR>
 * <TR>
 * <TD>'n-to-1-order'</TD>
 * <TD>'same-order-face-down'</TD>
 * <TD>The first print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second "print-stream" page, and
 * so on. Further, each media sheet MUST be delivered with side one of the sheet
 * facing down.</TD>
 * </TR>
 * <TR>
 * <TD>'n-to-1-order'</TD>
 * <TD>'reverse-order-face-up'</TD>
 * <TD>The last print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second to last "print-stream"
 * page, and so on. Further, each media sheet MUST be delivered with side one of
 * the sheet facing up.</TD>
 * </TR>
 * <TR>
 * <TD>'n-to-1-order'</TD>
 * <TD>'reverse-order-face-down'</TD>
 * <TD>The last print-stream page in the "document data" MUST be the first
 * print-stream page delivered, followed by the second to last "print-stream"
 * page, and so on. Further, each media sheet MUST be delivered with side one of
 * the sheet facing</TD>
 * </TR>
 * </TABLE>
 *
 * @see PageOrderReceived
 */
public class PageDelivery extends EnumSyntax implements PrintRequestAttribute, DocAttribute {

    /**
     * The media sheets that represent the printed document MUST be delivered to
     * the output bin or finishing device in the same order as defined by the
     * "page-order-received" attribute. Further, side one of each sheet MUST be
     * delivered face up to the output bin or finishing device.
     *
     * @see PageOrderReceived
     */
    public static final PageDelivery SAME_ORDER_FACE_UP = new PageDelivery(0);
    /**
     * The media sheets that represent the printed document MUST be delivered to
     * the output bin or finishing device in the same order as defined by the
     * "page-order-received" attribute. Further, side one of each sheet MUST be
     * delivered face down to the output bin or finishing device.
     *
     * @see PageOrderReceived
     */
    public static final PageDelivery SAME_ORDER_FACE_DOWN = new PageDelivery(1);
    /**
     * The media sheets that represent the printed document MUST be delivered to
     * the output bin or finishing device in the reverse order by the
     * "page-order-received" attribute. Further, side one of each sheet MUST be
     * delivered face up to the output bin or finishing device.
     *
     * @see PageOrderReceived
     */
    public static final PageDelivery REVERSE_ORDER_FACE_UP = new PageDelivery(2);
    /**
     * The media sheets that represent the printed document MUST be delivered to
     * the output bin or finishing device in the reverse order by the
     * "page-order-received" attribute. Further, side one of each sheet MUST be
     * delivered face down to the output bin or finishing device.
     *
     * @see PageOrderReceived
     */
    public static final PageDelivery REVERSE_ORDER_FACE_DOWN = new PageDelivery(3);
    /**
     * The Printer selects the most efficient delivery order based on other Job
     * Template attributes supplied by the client, such as "finishings",
     * “finishings-col”, and "page-order-received".
     *
     * @see PageOrderReceived
     * @see FinishingsCol
     * @see javax.print.attribute.standard.Finishings
     */
    public static final PageDelivery SYSTEM_SPECIFIED = new PageDelivery(4);

    protected PageDelivery(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PageDelivery.class;
    }

    @Override
    public String getName() {
	return "page-delivery";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "same-order-face-up",
	    "same-order-face-down",
	    "reverse-order-face-up",
	    "reverse-order-face-down",
	    "system-specified",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    SAME_ORDER_FACE_UP,
	    SAME_ORDER_FACE_DOWN,
	    REVERSE_ORDER_FACE_UP,
	    REVERSE_ORDER_FACE_DOWN,
	    SYSTEM_SPECIFIED,};
    }

}

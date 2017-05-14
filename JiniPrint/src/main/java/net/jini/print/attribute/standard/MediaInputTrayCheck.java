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
 * The “media-input-tray-check” Job Template attribute indicates that the
 * Printer MUST check that the characteristics of the media in the identified
 * input tray are the same as characteristics of the media identified by the
 * Job's "media" Job Template attribute or matched (see section 3.13) by the
 * Job's "media-col" Job Template attribute. Independent of the
 * "ipp-attributes-fidelity" operation attribute supplied by the client, if the
 * characteristics differ, the Printer adds the ‘resources-are-not-ready’ value
 * (see section 6.1) to the job's "job-state-reasons" attribute and MAY either
 * (1) put the job into the ‘pending-held’ state or (2) start to process the job
 * norm ally, but im mediately stop the job (“job-state” = ‘processing-stopped’)
 * and the Printer (“printer-state” = ‘stopped’). In either implementation, the
 * operator can change the media in the input tray to agree with the job or can
 * modify the job’s “media” or “media-col ” attributes to agree with the input
 * tray, depending on policy.
 *
 * @author peter
 */
public class MediaInputTrayCheck extends EnumSyntax
	implements PrintRequestAttribute, PrintJobAttribute, DocAttribute { 

    public static final MediaInputTrayCheck BOTTOM = new MediaInputTrayCheck(0),//[RFC8011]
	    BY_PASS_TRAY = new MediaInputTrayCheck(1),//[PWG5100.3]
	    ENVELOPE = new MediaInputTrayCheck(2),//[RFC8011]
	    LARGE_CAPACITY = new MediaInputTrayCheck(3),//[RFC8011]
	    MAIN = new MediaInputTrayCheck(4),//[RFC8011]
	    MANUAL = new MediaInputTrayCheck(5),//[RFC8011]
	    MIDDLE = new MediaInputTrayCheck(6),//[RFC8011]
	    SIDE = new MediaInputTrayCheck(7),//[RFC8011]
	    TOP = new MediaInputTrayCheck(8),//[RFC8011]
	    TRAY_1 = new MediaInputTrayCheck(9),//[PWG5100.3]
	    TRAY_2 = new MediaInputTrayCheck(10),//[PWG5100.3]
	    TRAY_3 = new MediaInputTrayCheck(11),//[PWG5100.3]
	    TRAY_4 = new MediaInputTrayCheck(12),//[PWG5100.3]
	    TRAY_5 = new MediaInputTrayCheck(13),//[PWG5100.3]
	    TRAY_6 = new MediaInputTrayCheck(14),//[PWG5100.3]
	    TRAY_7 = new MediaInputTrayCheck(15),//[PWG5100.3]
	    TRAY_8 = new MediaInputTrayCheck(16),//[PWG5100.3]
	    TRAY_9 = new MediaInputTrayCheck(17),//[PWG5100.3]
	    TRAY_10 = new MediaInputTrayCheck(18);//[PWG5100.3]

    protected MediaInputTrayCheck(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaInputTrayCheck.class;
    }

    @Override
    public String getName() {
	return "media-input-tray-check";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "bottom",
	    "by-pass-tray",
	    "envelope",
	    "large-capacity",
	    "main",
	    "manual",
	    "middle",
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
	    "tray-10",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BOTTOM,
	    BY_PASS_TRAY,
	    ENVELOPE,
	    LARGE_CAPACITY,
	    MAIN,
	    MANUAL,
	    MIDDLE,
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
	    TRAY_10,};

    }

}

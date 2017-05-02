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

import javax.print.attribute.EnumSyntax;

/**
 *
 * @author peter
 */
public class MediaSizeName extends javax.print.attribute.standard.MediaSizeName {

    public static final MediaSizeName 
	    ISO_A4_WIDE = new MediaSizeName(73),
	    NA_LETTER_COVER = new MediaSizeName(74),
	    JP_REPLY_POSTCARD = new MediaSizeName(75),
	    NA_POSTCARD = new MediaSizeName(76),
	    TAIWAN_815 = new MediaSizeName(77),
	    ISO_220x330 = new MediaSizeName(78),
	    ARCH_A = new MediaSizeName(79),
	    ARCH_B = new MediaSizeName(80),
	    ARCH_C = new MediaSizeName(81),
	    ARCH_D = new MediaSizeName(82),
	    ARCH_E = new MediaSizeName(83);

    MediaSizeName(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "iso-a4-wide",
	    "na-letter-cover",
	    "jp-reply-postcard",
	    "na-postcard",
	    "taiwan-815",
	    "iso-220x330",
	    "arch-a",
	    "arch-b",
	    "arch-c",
	    "arch-d",
	    "arch-e",
	};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ISO_A4_WIDE,
	    NA_LETTER_COVER,
	    JP_REPLY_POSTCARD,
	    NA_POSTCARD,
	    TAIWAN_815,
	    ISO_220x330,
	    ARCH_A,
	    ARCH_B,
	    ARCH_C,
	    ARCH_D,
	    ARCH_E,};
    }

    @Override
    protected int getOffset() {
	return 73;
    }
}

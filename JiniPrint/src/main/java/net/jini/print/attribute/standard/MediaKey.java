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
 * <p>
 * The "media-key" member attribute contains the name of the media represented
 * as a keyword or name. Values MUST be the same as the keyword and name values
 * for the "media" Job Template attribute and represent the same media, except
 * for media size and input tray keywords (see section 6.3 in this document and
 * [RFC2911] Appendix C) which MUST NOT be "media-key" values.
 * </p><p>
 * The value of this member attribute MUST be unique for each media supported by
 * an IPP Printer instance, i.e., no two media instances can have the same
 * "media-key" value on the same IPP Printer instance. However, the same
 * "media-key" value can represent the same or different media on different IPP
 * Printer instances. For example, the 'iso-a4-white' keyword might represent
 * recycled 80 gm/mm on two Printer instances and non-recycled, 72 gm/mm on a
 * third Printer instance. An administrator or a number of administrators within
 * an organization MAY choose to have "media-key" values represent the same
 * media instances across a set of Printers.
 * </p><p>
 * Note: Since the above requires that each media instance have a unique
 * "media-key" value (if "media-key" attribute is supported), then the Printer
 * automatically meets the requirement (see section 3.13) that each media
 * instance have a unique combination of member attribute values.
 * </p><p>
 * Note: As with any combination of supported "media-col" member attributes, if
 * a client supplies the "media-key" member attribute and other member
 * attributes, the Printer will attempt to match all of the supplied member
 * attributes, including the "media-key" value, following the algorithm defined
 * in section 3.13. So if the supplied collection value does not match any
 * supported "media-col" value, the Printer treats the "media-col" attribute as
 * having an undefined attribute value. Thus, a client can ensure that the
 * Printer maps a standard media name keyword to certain expected member
 * attribute values.
 * </p><p>
 * The "media-key-supported" (1setOf (type3 keyword | name(MAX))) Printer
 * attribute identifies the values of this "media-key" member attribute that the
 * Printer supports.
 * </p><p>
 * For Printers that support a large number of media (and the "media-key"
 * attribute), the burden of an administrator to define unique "media-key"
 * values for each media instance could be quite large. Therefore, it is
 * RECOMMENDED that such a Printer assign a unique "media-key" value in an
 * IMPLEMENTATION-DEFINED manner for each media instance for which the
 * administrator has not defined a "media-key" value, rather than refusing the
 * media definition. The Printer also adds such generated values to its
 * "media-key-supported" attribute. A client can supply such a Printer-generated
 * value with either (1) the "media-key" member attribute or (2) the "media" Job
 * Template attribute.
 * </p>
 * 
 * @see MediaCollection
 * @see MediaKeySupported
 */
public class MediaKey extends EnumSyntax
	implements Attribute {

    private static final long serialVersionUID = 1L;

    public static final MediaKey DEFAULT = new MediaKey(0);
    public static final MediaKey ISO_A4_WHITE = new MediaKey(1);
    public static final MediaKey ISO_A4_COLORED = new MediaKey(2);
    public static final MediaKey ISO_A4_TRANSPARENT = new MediaKey(3);
    public static final MediaKey ISO_A3_WHITE = new MediaKey(4);
    public static final MediaKey ISO_A3_COLORED = new MediaKey(5);
    public static final MediaKey ISO_A5_WHITE = new MediaKey(6);
    public static final MediaKey ISO_A5_COLORED = new MediaKey(7);
    public static final MediaKey ISO_B4_WHITE = new MediaKey(8);
    public static final MediaKey ISO_B4_COLORED = new MediaKey(9);
    public static final MediaKey ISO_B5_WHITE = new MediaKey(10);
    public static final MediaKey ISO_B5_COLORED = new MediaKey(11);
    public static final MediaKey JIS_B4_WHITE = new MediaKey(12);
    public static final MediaKey JIS_B4_COLORED = new MediaKey(13);
    public static final MediaKey JIS_B5_WHITE = new MediaKey(14);
    public static final MediaKey JIS_B5_COLORED = new MediaKey(15);
    public static final MediaKey NA_LETTER_WHITE = new MediaKey(16);
    public static final MediaKey NA_LETTER_COLORED = new MediaKey(17);
    public static final MediaKey NA_LETTER_TRANSPARENT = new MediaKey(18);
    public static final MediaKey NA_LEGAL_WHITE = new MediaKey(19);
    public static final MediaKey NA_LEGAL_COLORED = new MediaKey(20);
    public static final MediaKey ISO_B4_ENVELOPE = new MediaKey(21);
    public static final MediaKey ISO_B5_ENVELOPE = new MediaKey(22);
    public static final MediaKey ISO_C3_ENVELOPE = new MediaKey(23);
    public static final MediaKey ISO_C4_ENVELOPE = new MediaKey(24);
    public static final MediaKey ISO_C5_ENVELOPE = new MediaKey(25);
    public static final MediaKey ISO_C6_ENVELOPE = new MediaKey(26);
    public static final MediaKey ISO_DESIGNATED_LONG_ENVELOPE = new MediaKey(27);
    public static final MediaKey NA_10X13_ENVELOPE = new MediaKey(28);
    public static final MediaKey NA_9X12_ENVELOPE = new MediaKey(29);
    public static final MediaKey MONARCH_ENVELOPE = new MediaKey(30);
    public static final MediaKey NA_NUMBER_10_ENVELOPE = new MediaKey(31);
    public static final MediaKey NA_7X9_ENVELOPE = new MediaKey(32);
    public static final MediaKey NA_9X11_ENVELOPE = new MediaKey(33);
    public static final MediaKey NA_10X14_ENVELOPE = new MediaKey(34);
    public static final MediaKey NA_NUMBER_9_ENVELOPE = new MediaKey(35);
    public static final MediaKey NA_6X9_ENVELOPE = new MediaKey(36);
    public static final MediaKey NA_10X15_ENVELOPE = new MediaKey(37);
    public static final MediaKey EXECUTIVE_WHITE = new MediaKey(38);
    public static final MediaKey FOLIO_WHITE = new MediaKey(39);
    public static final MediaKey INVOICE_WHITE = new MediaKey(40);
    public static final MediaKey LEDGER_WHITE = new MediaKey(41);
    public static final MediaKey QUARTO_WHITE = new MediaKey(42);
    public static final MediaKey ISO_A0_WHITE = new MediaKey(43);
    public static final MediaKey ISO_A0_TRANSPARENT = new MediaKey(44);
    public static final MediaKey ISO_A0_TRANSLUCENT = new MediaKey(45);
    public static final MediaKey ISO_A1_WHITE = new MediaKey(46);
    public static final MediaKey ISO_A1_TRANSPARENT = new MediaKey(47);
    public static final MediaKey ISO_A1_TRANSLUCENT = new MediaKey(48);
    public static final MediaKey ISO_A2_WHITE = new MediaKey(49);
    public static final MediaKey ISO_A2_TRANSPARENT = new MediaKey(50);
    public static final MediaKey ISO_A2_TRANSLUCENT = new MediaKey(51);
    public static final MediaKey ISO_A3_TRANSPARENT = new MediaKey(52);
    public static final MediaKey ISO_A3_TRANSLUCENT = new MediaKey(53);
    public static final MediaKey ISO_A4_TRANSLUCENT = new MediaKey(54);
    public static final MediaKey ISO_A5_TRANSPARENT = new MediaKey(55);
    public static final MediaKey ISO_A5_TRANSLUCENT = new MediaKey(56);
    public static final MediaKey ISO_A6_WHITE = new MediaKey(57);
    public static final MediaKey ISO_A7_WHITE = new MediaKey(58);
    public static final MediaKey ISO_A8_WHITE = new MediaKey(59);
    public static final MediaKey ISO_A9_WHITE = new MediaKey(60);
    public static final MediaKey ISO_A10_WHITE = new MediaKey(61);
    public static final MediaKey ISO_B0_WHITE = new MediaKey(62);
    public static final MediaKey ISO_B1_WHITE = new MediaKey(63);
    public static final MediaKey ISO_B2_WHITE = new MediaKey(64);
    public static final MediaKey ISO_B3_WHITE = new MediaKey(65);
    public static final MediaKey ISO_B6_WHITE = new MediaKey(66);
    public static final MediaKey ISO_B7_WHITE = new MediaKey(67);
    public static final MediaKey ISO_B8_WHITE = new MediaKey(68);
    public static final MediaKey ISO_B9_WHITE = new MediaKey(69);
    public static final MediaKey ISO_B10_WHITE = new MediaKey(70);
    public static final MediaKey JIS_B0_WHITE = new MediaKey(71);
    public static final MediaKey JIS_B0_TRANSPARENT = new MediaKey(72);
    public static final MediaKey JIS_B0_TRANSLUCENT = new MediaKey(73);
    public static final MediaKey JIS_B1_WHITE = new MediaKey(74);
    public static final MediaKey JIS_B1_TRANSPARENT = new MediaKey(75);
    public static final MediaKey JIS_B1_TRANSLUCENT = new MediaKey(76);
    public static final MediaKey JIS_B2_WHITE = new MediaKey(77);
    public static final MediaKey JIS_B2_TRANSPARENT = new MediaKey(78);
    public static final MediaKey JIS_B2_TRANSLUCENT = new MediaKey(79);
    public static final MediaKey JIS_B3_WHITE = new MediaKey(80);
    public static final MediaKey JIS_B3_TRANSPARENT = new MediaKey(81);
    public static final MediaKey JIS_B3_TRANSLUCENT = new MediaKey(82);
    public static final MediaKey JIS_B4_TRANSPARENT = new MediaKey(83);
    public static final MediaKey JIS_B4_TRANSLUCENT = new MediaKey(84);
    public static final MediaKey JIS_B5_TRANSPARENT = new MediaKey(85);
    public static final MediaKey JIS_B5_TRANSLUCENT = new MediaKey(86);
    public static final MediaKey JIS_B6_WHITE = new MediaKey(87);
    public static final MediaKey JIS_B7_WHITE = new MediaKey(88);
    public static final MediaKey JIS_B8_WHITE = new MediaKey(89);
    public static final MediaKey JIS_B9_WHITE = new MediaKey(90);
    public static final MediaKey JIS_B10_WHITE = new MediaKey(91);
    public static final MediaKey A_WHITE = new MediaKey(92);
    public static final MediaKey A_TRANSPARENT = new MediaKey(93);
    public static final MediaKey A_TRANSLUCENT = new MediaKey(94);
    public static final MediaKey B_WHITE = new MediaKey(95);
    public static final MediaKey B_TRANSPARENT = new MediaKey(96);
    public static final MediaKey B_TRANSLUCENT = new MediaKey(97);
    public static final MediaKey C_WHITE = new MediaKey(98);
    public static final MediaKey C_TRANSPARENT = new MediaKey(99);
    public static final MediaKey C_TRANSLUCENT = new MediaKey(100);
    public static final MediaKey D_WHITE = new MediaKey(101);
    public static final MediaKey D_TRANSPARENT = new MediaKey(102);
    public static final MediaKey D_TRANSLUCENT = new MediaKey(103);
    public static final MediaKey E_WHITE = new MediaKey(104);
    public static final MediaKey E_TRANSPARENT = new MediaKey(105);
    public static final MediaKey E_TRANSLUCENT = new MediaKey(106);
    public static final MediaKey AXSYNCHRO_WHITE = new MediaKey(107);
    public static final MediaKey AXSYNCHRO_TRANSPARENT = new MediaKey(108);
    public static final MediaKey AXSYNCHRO_TRANSLUCENT = new MediaKey(109);
    public static final MediaKey BXSYNCHRO_WHITE = new MediaKey(110);
    public static final MediaKey BXSYNCHRO_TRANSPARENT = new MediaKey(111);
    public static final MediaKey BXSYNCHRO_TRANSLUCENT = new MediaKey(112);
    public static final MediaKey CXSYNCHRO_WHITE = new MediaKey(113);
    public static final MediaKey CXSYNCHRO_TRANSPARENT = new MediaKey(114);
    public static final MediaKey CXSYNCHRO_TRANSLUCENT = new MediaKey(115);
    public static final MediaKey DXSYNCHRO_WHITE = new MediaKey(116);
    public static final MediaKey DXSYNCHRO_TRANSPARENT = new MediaKey(117);
    public static final MediaKey DXSYNCHRO_TRANSLUCENT = new MediaKey(118);
    public static final MediaKey EXSYNCHRO_WHITE = new MediaKey(119);
    public static final MediaKey EXSYNCHRO_TRANSPARENT = new MediaKey(120);
    public static final MediaKey EXSYNCHRO_TRANSLUCENT = new MediaKey(121);
    public static final MediaKey ARCH_A_WHITE = new MediaKey(122);
    public static final MediaKey ARCH_A_TRANSPARENT = new MediaKey(123);
    public static final MediaKey ARCH_A_TRANSLUCENT = new MediaKey(124);
    public static final MediaKey ARCH_B_WHITE = new MediaKey(125);
    public static final MediaKey ARCH_B_TRANSPARENT = new MediaKey(126);
    public static final MediaKey ARCH_B_TRANSLUCENT = new MediaKey(127);
    public static final MediaKey ARCH_C_WHITE = new MediaKey(128);
    public static final MediaKey ARCH_C_TRANSPARENT = new MediaKey(129);
    public static final MediaKey ARCH_C_TRANSLUCENT = new MediaKey(130);
    public static final MediaKey ARCH_D_WHITE = new MediaKey(131);
    public static final MediaKey ARCH_D_TRANSPARENT = new MediaKey(132);
    public static final MediaKey ARCH_D_TRANSLUCENT = new MediaKey(133);
    public static final MediaKey ARCH_E_WHITE = new MediaKey(134);
    public static final MediaKey ARCH_E_TRANSPARENT = new MediaKey(135);
    public static final MediaKey ARCH_E_TRANSLUCENT = new MediaKey(136);
    public static final MediaKey ARCH_AXSYNCHRO_WHITE = new MediaKey(137);
    public static final MediaKey ARCH_AXSYNCHRO_TRANSPARENT = new MediaKey(138);
    public static final MediaKey ARCH_AXSYNCHRO_TRANSLUCENT = new MediaKey(139);
    public static final MediaKey ARCH_BXSYNCHRO_WHITE = new MediaKey(140);
    public static final MediaKey ARCH_BXSYNCHRO_TRANSPARENT = new MediaKey(141);
    public static final MediaKey ARCH_BXSYNCHRO_TRANSLUCENT = new MediaKey(142);
    public static final MediaKey ARCH_CXSYNCHRO_WHITE = new MediaKey(143);
    public static final MediaKey ARCH_CXSYNCHRO_TRANSPARENT = new MediaKey(144);
    public static final MediaKey ARCH_CXSYNCHRO_TRANSLUCENT = new MediaKey(145);
    public static final MediaKey ARCH_DXSYNCHRO_WHITE = new MediaKey(146);
    public static final MediaKey ARCH_DXSYNCHRO_TRANSPARENT = new MediaKey(147);
    public static final MediaKey ARCH_DXSYNCHRO_TRANSLUCENT = new MediaKey(148);
    public static final MediaKey ARCH_EXSYNCHRO_WHITE = new MediaKey(149);
    public static final MediaKey ARCH_EXSYNCHRO_TRANSPARENT = new MediaKey(150);
    public static final MediaKey ARCH_EXSYNCHRO_TRANSLUCENT = new MediaKey(151);
    public static final MediaKey ISO_A1X3_WHITE = new MediaKey(152);
    public static final MediaKey ISO_A1X3_TRANSPARENT = new MediaKey(153);
    public static final MediaKey ISO_A1X3_TRANSLUCENT = new MediaKey(154);
    public static final MediaKey ISO_A1X4_WHITE = new MediaKey(155);
    public static final MediaKey ISO_A1X4_TRANSPARENT = new MediaKey(156);
    public static final MediaKey ISO_A1X4_TRANSLUCENT = new MediaKey(157);
    public static final MediaKey ISO_A2X3_WHITE = new MediaKey(158);
    public static final MediaKey ISO_A2X3_TRANSPARENT = new MediaKey(159);
    public static final MediaKey ISO_A2X3_TRANSLUCENT = new MediaKey(160);
    public static final MediaKey ISO_A2X4_WHITE = new MediaKey(161);
    public static final MediaKey ISO_A2X4_TRANSPARENT = new MediaKey(162);
    public static final MediaKey ISO_A2X4_TRANSLUCENT = new MediaKey(163);
    public static final MediaKey ISO_A2X5_WHITE = new MediaKey(164);
    public static final MediaKey ISO_A2X5_TRANSPARENT = new MediaKey(165);
    public static final MediaKey ISO_A2X5_TRANSLUCENT = new MediaKey(166);
    public static final MediaKey ISO_A3X3_WHITE = new MediaKey(167);
    public static final MediaKey ISO_A3X3_TRANSPARENT = new MediaKey(168);
    public static final MediaKey ISO_A3X3_TRANSLUCENT = new MediaKey(169);
    public static final MediaKey ISO_A3X4_WHITE = new MediaKey(170);
    public static final MediaKey ISO_A3X4_TRANSPARENT = new MediaKey(171);
    public static final MediaKey ISO_A3X4_TRANSLUCENT = new MediaKey(172);
    public static final MediaKey ISO_A3X5_WHITE = new MediaKey(173);
    public static final MediaKey ISO_A3X5_TRANSPARENT = new MediaKey(174);
    public static final MediaKey ISO_A3X5_TRANSLUCENT = new MediaKey(175);
    public static final MediaKey ISO_A3X6_WHITE = new MediaKey(176);
    public static final MediaKey ISO_A3X6_TRANSPARENT = new MediaKey(177);
    public static final MediaKey ISO_A3X6_TRANSLUCENT = new MediaKey(178);
    public static final MediaKey ISO_A3X7_WHITE = new MediaKey(179);
    public static final MediaKey ISO_A3X7_TRANSPARENT = new MediaKey(180);
    public static final MediaKey ISO_A3X7_TRANSLUCENT = new MediaKey(181);
    public static final MediaKey ISO_A4X3_WHITE = new MediaKey(182);
    public static final MediaKey ISO_A4X3_TRANSPARENT = new MediaKey(183);
    public static final MediaKey ISO_A4X3_TRANSLUCENT = new MediaKey(184);
    public static final MediaKey ISO_A4X4_WHITE = new MediaKey(185);
    public static final MediaKey ISO_A4X4_TRANSPARENT = new MediaKey(186);
    public static final MediaKey ISO_A4X4_TRANSLUCENT = new MediaKey(187);
    public static final MediaKey ISO_A4X5_WHITE = new MediaKey(188);
    public static final MediaKey ISO_A4X5_TRANSPARENT = new MediaKey(189);
    public static final MediaKey ISO_A4X5_TRANSLUCENT = new MediaKey(190);
    public static final MediaKey ISO_A4X6_WHITE = new MediaKey(191);
    public static final MediaKey ISO_A4X6_TRANSPARENT = new MediaKey(192);
    public static final MediaKey ISO_A4X6_TRANSLUCENT = new MediaKey(193);
    public static final MediaKey ISO_A4X7_WHITE = new MediaKey(194);
    public static final MediaKey ISO_A4X7_TRANSPARENT = new MediaKey(195);
    public static final MediaKey ISO_A4X7_TRANSLUCENT = new MediaKey(196);
    public static final MediaKey ISO_A4X8_WHITE = new MediaKey(197);
    public static final MediaKey ISO_A4X8_TRANSPARENT = new MediaKey(198);
    public static final MediaKey ISO_A4X8_TRANSLUCENT = new MediaKey(199);
    public static final MediaKey ISO_A4X9_WHITE = new MediaKey(200);
    public static final MediaKey ISO_A4X9_TRANSPARENT = new MediaKey(201);
    public static final MediaKey ISO_A4X9_TRANSLUCENT = new MediaKey(202);
    public static final MediaKey ISO_A0XSYNCHRO_WHITE = new MediaKey(203);
    public static final MediaKey ISO_A0XSYNCHRO_TRANSPARENT = new MediaKey(204);
    public static final MediaKey ISO_A0XSYNCHRO_TRANSLUCENT = new MediaKey(205);
    public static final MediaKey ISO_A1XSYNCHRO_WHITE = new MediaKey(206);
    public static final MediaKey ISO_A1XSYNCHRO_TRANSPARENT = new MediaKey(207);
    public static final MediaKey ISO_A1XSYNCHRO_TRANSLUCENT = new MediaKey(208);
    public static final MediaKey ISO_A2XSYNCHRO_WHITE = new MediaKey(209);
    public static final MediaKey ISO_A2XSYNCHRO_TRANSPARENT = new MediaKey(210);
    public static final MediaKey ISO_A2XSYNCHRO_TRANSLUCENT = new MediaKey(211);
    public static final MediaKey ISO_A3XSYNCHRO_WHITE = new MediaKey(212);
    public static final MediaKey ISO_A3XSYNCHRO_TRANSPARENT = new MediaKey(213);
    public static final MediaKey ISO_A3XSYNCHRO_TRANSLUCENT = new MediaKey(214);
    public static final MediaKey ISO_A4XSYNCHRO_WHITE = new MediaKey(215);
    public static final MediaKey ISO_A4XSYNCHRO_TRANSPARENT = new MediaKey(216);
    public static final MediaKey ISO_A4XSYNCHRO_TRANSLUCENT = new MediaKey(217);
    public static final MediaKey AUTO_WHITE = new MediaKey(218);
    public static final MediaKey AUTO_TRANSPARENT = new MediaKey(219);
    public static final MediaKey AUTO_TRANSLUCENT = new MediaKey(220);
    public static final MediaKey AUTO_FIXED_SIZE_WHITE = new MediaKey(221);
    public static final MediaKey AUTO_FIXED_SIZE_TRANSPARENT = new MediaKey(222);
    public static final MediaKey AUTO_FIXED_SIZE_TRANSLUCENT = new MediaKey(223);
    public static final MediaKey AUTO_SYNCHRO_WHITE = new MediaKey(224);
    public static final MediaKey AUTO_SYNCHRO_TRANSPARENT = new MediaKey(225);
    public static final MediaKey AUTO_SYNCHRO_TRANSLUCENT = new MediaKey(226);
    public static final MediaKey CUSTOM1 = new MediaKey(227);//[PWG5100.3]
    public static final MediaKey CUSTOM2 = new MediaKey(228);//[PWG5100.3]
    public static final MediaKey CUSTOM3 = new MediaKey(229);//[PWG5100.3]
    public static final MediaKey CUSTOM4 = new MediaKey(230);//[PWG5100.3]
    public static final MediaKey CUSTOM5 = new MediaKey(231);//[PWG5100.3]
    public static final MediaKey CUSTOM6 = new MediaKey(232);//[PWG5100.3]
    public static final MediaKey CUSTOM7 = new MediaKey(233);//[PWG5100.3]
    public static final MediaKey CUSTOM8 = new MediaKey(234);//[PWG5100.3]
    public static final MediaKey CUSTOM9 = new MediaKey(235);//[PWG5100.3]
    public static final MediaKey CUSTOM10 = new MediaKey(236);//[PWG5100.3]
    public static final MediaKey BOND = new MediaKey(237);//[PWG5100.3]
    public static final MediaKey HEAVYWEIGHT = new MediaKey(238);//[PWG5100.3]
    public static final MediaKey LABELS = new MediaKey(239);//[PWG5100.3]
    public static final MediaKey LETTERHEAD = new MediaKey(240);//[PWG5100.3]
    public static final MediaKey PLAIN = new MediaKey(241);//[PWG5100.3]
    public static final MediaKey PRE_PRINTED = new MediaKey(242);//[PWG5100.3]
    public static final MediaKey PRE_PUNCHED = new MediaKey(243);//[PWG5100.3]
    public static final MediaKey RECYCLED = new MediaKey(244);//[PWG5100.3]
    public static final MediaKey TRANSPARENCY = new MediaKey(245);//[PWG5100.3]

    protected MediaKey(int value) {
	super(value);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaKey.class;
    }

    @Override
    public String getName() {
	return "media-key";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "default",
	    "iso-a4-white",
	    "iso-a4-colored",
	    "iso-a4-transparent",
	    "iso-a3-white",
	    "iso-a3-colored",
	    "iso-a5-white",
	    "iso-a5-colored",
	    "iso-b4-white",
	    "iso-b4-colored",
	    "iso-b5-white",
	    "iso-b5-colored",
	    "jis-b4-white",
	    "jis-b4-colored",
	    "jis-b5-white",
	    "jis-b5-colored",
	    "na-letter-white",
	    "na-letter-colored",
	    "na-letter-transparent",
	    "na-legal-white",
	    "na-legal-colored",
	    "iso-b4-envelope",
	    "iso-b5-envelope",
	    "iso-c3-envelope",
	    "iso-c4-envelope",
	    "iso-c5-envelope",
	    "iso-c6-envelope",
	    "iso-designated-long-envelope",
	    "na-10x13-envelope",
	    "na-9x12-envelope",
	    "monarch-envelope",
	    "na-number-10-envelope",
	    "na-7x9-envelope",
	    "na-9x11-envelope",
	    "na-10x14-envelope",
	    "na-number-9-envelope",
	    "na-6x9-envelope",
	    "na-10x15-envelope",
	    "executive-white",
	    "folio-white",
	    "invoice-white",
	    "ledger-white",
	    "quarto-white",
	    "iso-a0-white",
	    "iso-a0-transparent",
	    "iso-a0-translucent",
	    "iso-a1-white",
	    "iso-a1-transparent",
	    "iso-a1-translucent",
	    "iso-a2-white",
	    "iso-a2-transparent",
	    "iso-a2-translucent",
	    "iso-a3-transparent",
	    "iso-a3-translucent",
	    "iso-a4-translucent",
	    "iso-a5-transparent",
	    "iso-a5-translucent",
	    "iso-a6-white",
	    "iso-a7-white",
	    "iso-a8-white",
	    "iso-a9-white",
	    "iso-a10-white",
	    "iso-b0-white",
	    "iso-b1-white",
	    "iso-b2-white",
	    "iso-b3-white",
	    "iso-b6-white",
	    "iso-b7-white",
	    "iso-b8-white",
	    "iso-b9-white",
	    "iso-b10-white",
	    "jis-b0-white",
	    "jis-b0-transparent",
	    "jis-b0-translucent",
	    "jis-b1-white",
	    "jis-b1-transparent",
	    "jis-b1-translucent",
	    "jis-b2-white",
	    "jis-b2-transparent",
	    "jis-b2-translucent",
	    "jis-b3-white",
	    "jis-b3-transparent",
	    "jis-b3-translucent",
	    "jis-b4-transparent",
	    "jis-b4-translucent",
	    "jis-b5-transparent",
	    "jis-b5-translucent",
	    "jis-b6-white",
	    "jis-b7-white",
	    "jis-b8-white",
	    "jis-b9-white",
	    "jis-b10-white",
	    "a-white",
	    "a-transparent",
	    "a-translucent",
	    "b-white",
	    "b-transparent",
	    "b-translucent",
	    "c-white",
	    "c-transparent",
	    "c-translucent",
	    "d-white",
	    "d-transparent",
	    "d-translucent",
	    "e-white",
	    "e-transparent",
	    "e-translucent",
	    "axsynchro-white",
	    "axsynchro-transparent",
	    "axsynchro-translucent",
	    "bxsynchro-white",
	    "bxsynchro-transparent",
	    "bxsynchro-translucent",
	    "cxsynchro-white",
	    "cxsynchro-transparent",
	    "cxsynchro-translucent",
	    "dxsynchro-white",
	    "dxsynchro-transparent",
	    "dxsynchro-translucent",
	    "exsynchro-white",
	    "exsynchro-transparent",
	    "exsynchro-translucent",
	    "arch-a-white",
	    "arch-a-transparent",
	    "arch-a-translucent",
	    "arch-b-white",
	    "arch-b-transparent",
	    "arch-b-translucent",
	    "arch-c-white",
	    "arch-c-transparent",
	    "arch-c-translucent",
	    "arch-d-white",
	    "arch-d-transparent",
	    "arch-d-translucent",
	    "arch-e-white",
	    "arch-e-transparent",
	    "arch-e-translucent",
	    "arch-axsynchro-white",
	    "arch-axsynchro-transparent",
	    "arch-axsynchro-translucent",
	    "arch-bxsynchro-white",
	    "arch-bxsynchro-transparent",
	    "arch-bxsynchro-translucent",
	    "arch-cxsynchro-white",
	    "arch-cxsynchro-transparent",
	    "arch-cxsynchro-translucent",
	    "arch-dxsynchro-white",
	    "arch-dxsynchro-transparent",
	    "arch-dxsynchro-translucent",
	    "arch-exsynchro-white",
	    "arch-exsynchro-transparent",
	    "arch-exsynchro-translucent",
	    "iso-a1x3-white",
	    "iso-a1x3-transparent",
	    "iso-a1x3-translucent",
	    "iso-a1x4-white",
	    "iso-a1x4-transparent",
	    "iso-a1x4- translucent",
	    "iso-a2x3-white",
	    "iso-a2x3-transparent",
	    "iso-a2x3-translucent",
	    "iso-a2x4-white",
	    "iso-a2x4-transparent",
	    "iso-a2x4-translucent",
	    "iso-a2x5-white",
	    "iso-a2x5-transparent",
	    "iso-a2x5-translucent",
	    "iso-a3x3-white",
	    "iso-a3x3-transparent",
	    "iso-a3x3-translucent",
	    "iso-a3x4-white",
	    "iso-a3x4-transparent",
	    "iso-a3x4-translucent",
	    "iso-a3x5-white",
	    "iso-a3x5-transparent",
	    "iso-a3x5-translucent",
	    "iso-a3x6-white",
	    "iso-a3x6-transparent",
	    "iso-a3x6-translucent",
	    "iso-a3x7-white",
	    "iso-a3x7-transparent",
	    "iso-a3x7-translucent",
	    "iso-a4x3-white",
	    "iso-a4x3-transparent",
	    "iso-a4x3-translucent",
	    "iso-a4x4-white",
	    "iso-a4x4-transparent",
	    "iso-a4x4-translucent",
	    "iso-a4x5-white",
	    "iso-a4x5-transparent",
	    "iso-a4x5-translucent",
	    "iso-a4x6-white",
	    "iso-a4x6-transparent",
	    "iso-a4x6-translucent",
	    "iso-a4x7-white",
	    "iso-a4x7-transparent",
	    "iso-a4x7-translucent",
	    "iso-a4x8-white",
	    "iso-a4x8-transparent",
	    "iso-a4x8-translucent",
	    "iso-a4x9-white",
	    "iso-a4x9-transparent",
	    "iso-a4x9-translucent",
	    "iso-a0xsynchro-white",
	    "iso-a0xsynchro-transparent",
	    "iso-a0xsynchro-translucent",
	    "iso-a1xsynchro-white",
	    "iso-a1xsynchro-transparent",
	    "iso-a1xsynchro-translucent",
	    "iso-a2xsynchro-white",
	    "iso-a2xsynchro-transparent",
	    "iso-a2xsynchro-translucent",
	    "iso-a3xsynchro-white",
	    "iso-a3xsynchro-transparent",
	    "iso-a3xsynchro-translucent",
	    "iso-a4xsynchro-white",
	    "iso-a4xsynchro-transparent",
	    "iso-a4xsynchro-translucent",
	    "auto-white",
	    "auto-transparent",
	    "auto-translucent",
	    "auto-fixed-size-white",
	    "auto-fixed-size-transparent",
	    "auto-fixed-size-translucent",
	    "auto-synchro-white",
	    "auto-synchro-transparent",
	    "auto-synchro-translucent",
	    "custom1",
	    "custom2",
	    "custom3",
	    "custom4",
	    "custom5",
	    "custom6",
	    "custom7",
	    "custom8",
	    "custom9",
	    "custom10",
	    "bond",
	    "heavyweight",
	    "labels",
	    "letterhead",
	    "plain",
	    "pre-printed",
	    "pre-punched",
	    "recycled",
	    "transparency",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    DEFAULT,
	    ISO_A4_WHITE,
	    ISO_A4_COLORED,
	    ISO_A4_TRANSPARENT,
	    ISO_A3_WHITE,
	    ISO_A3_COLORED,
	    ISO_A5_WHITE,
	    ISO_A5_COLORED,
	    ISO_B4_WHITE,
	    ISO_B4_COLORED,
	    ISO_B5_WHITE,
	    ISO_B5_COLORED,
	    JIS_B4_WHITE,
	    JIS_B4_COLORED,
	    JIS_B5_WHITE,
	    JIS_B5_COLORED,
	    NA_LETTER_WHITE,
	    NA_LETTER_COLORED,
	    NA_LETTER_TRANSPARENT,
	    NA_LEGAL_WHITE,
	    NA_LEGAL_COLORED,
	    ISO_B4_ENVELOPE,
	    ISO_B5_ENVELOPE,
	    ISO_C3_ENVELOPE,
	    ISO_C4_ENVELOPE,
	    ISO_C5_ENVELOPE,
	    ISO_C6_ENVELOPE,
	    ISO_DESIGNATED_LONG_ENVELOPE,
	    NA_10X13_ENVELOPE,
	    NA_9X12_ENVELOPE,
	    MONARCH_ENVELOPE,
	    NA_NUMBER_10_ENVELOPE,
	    NA_7X9_ENVELOPE,
	    NA_9X11_ENVELOPE,
	    NA_10X14_ENVELOPE,
	    NA_NUMBER_9_ENVELOPE,
	    NA_6X9_ENVELOPE,
	    NA_10X15_ENVELOPE,
	    EXECUTIVE_WHITE,
	    FOLIO_WHITE,
	    INVOICE_WHITE,
	    LEDGER_WHITE,
	    QUARTO_WHITE,
	    ISO_A0_WHITE,
	    ISO_A0_TRANSPARENT,
	    ISO_A0_TRANSLUCENT,
	    ISO_A1_WHITE,
	    ISO_A1_TRANSPARENT,
	    ISO_A1_TRANSLUCENT,
	    ISO_A2_WHITE,
	    ISO_A2_TRANSPARENT,
	    ISO_A2_TRANSLUCENT,
	    ISO_A3_TRANSPARENT,
	    ISO_A3_TRANSLUCENT,
	    ISO_A4_TRANSLUCENT,
	    ISO_A5_TRANSPARENT,
	    ISO_A5_TRANSLUCENT,
	    ISO_A6_WHITE,
	    ISO_A7_WHITE,
	    ISO_A8_WHITE,
	    ISO_A9_WHITE,
	    ISO_A10_WHITE,
	    ISO_B0_WHITE,
	    ISO_B1_WHITE,
	    ISO_B2_WHITE,
	    ISO_B3_WHITE,
	    ISO_B6_WHITE,
	    ISO_B7_WHITE,
	    ISO_B8_WHITE,
	    ISO_B9_WHITE,
	    ISO_B10_WHITE,
	    JIS_B0_WHITE,
	    JIS_B0_TRANSPARENT,
	    JIS_B0_TRANSLUCENT,
	    JIS_B1_WHITE,
	    JIS_B1_TRANSPARENT,
	    JIS_B1_TRANSLUCENT,
	    JIS_B2_WHITE,
	    JIS_B2_TRANSPARENT,
	    JIS_B2_TRANSLUCENT,
	    JIS_B3_WHITE,
	    JIS_B3_TRANSPARENT,
	    JIS_B3_TRANSLUCENT,
	    JIS_B4_TRANSPARENT,
	    JIS_B4_TRANSLUCENT,
	    JIS_B5_TRANSPARENT,
	    JIS_B5_TRANSLUCENT,
	    JIS_B6_WHITE,
	    JIS_B7_WHITE,
	    JIS_B8_WHITE,
	    JIS_B9_WHITE,
	    JIS_B10_WHITE,
	    A_WHITE,
	    A_TRANSPARENT,
	    A_TRANSLUCENT,
	    B_WHITE,
	    B_TRANSPARENT,
	    B_TRANSLUCENT,
	    C_WHITE,
	    C_TRANSPARENT,
	    C_TRANSLUCENT,
	    D_WHITE,
	    D_TRANSPARENT,
	    D_TRANSLUCENT,
	    E_WHITE,
	    E_TRANSPARENT,
	    E_TRANSLUCENT,
	    AXSYNCHRO_WHITE,
	    AXSYNCHRO_TRANSPARENT,
	    AXSYNCHRO_TRANSLUCENT,
	    BXSYNCHRO_WHITE,
	    BXSYNCHRO_TRANSPARENT,
	    BXSYNCHRO_TRANSLUCENT,
	    CXSYNCHRO_WHITE,
	    CXSYNCHRO_TRANSPARENT,
	    CXSYNCHRO_TRANSLUCENT,
	    DXSYNCHRO_WHITE,
	    DXSYNCHRO_TRANSPARENT,
	    DXSYNCHRO_TRANSLUCENT,
	    EXSYNCHRO_WHITE,
	    EXSYNCHRO_TRANSPARENT,
	    EXSYNCHRO_TRANSLUCENT,
	    ARCH_A_WHITE,
	    ARCH_A_TRANSPARENT,
	    ARCH_A_TRANSLUCENT,
	    ARCH_B_WHITE,
	    ARCH_B_TRANSPARENT,
	    ARCH_B_TRANSLUCENT,
	    ARCH_C_WHITE,
	    ARCH_C_TRANSPARENT,
	    ARCH_C_TRANSLUCENT,
	    ARCH_D_WHITE,
	    ARCH_D_TRANSPARENT,
	    ARCH_D_TRANSLUCENT,
	    ARCH_E_WHITE,
	    ARCH_E_TRANSPARENT,
	    ARCH_E_TRANSLUCENT,
	    ARCH_AXSYNCHRO_WHITE,
	    ARCH_AXSYNCHRO_TRANSPARENT,
	    ARCH_AXSYNCHRO_TRANSLUCENT,
	    ARCH_BXSYNCHRO_WHITE,
	    ARCH_BXSYNCHRO_TRANSPARENT,
	    ARCH_BXSYNCHRO_TRANSLUCENT,
	    ARCH_CXSYNCHRO_WHITE,
	    ARCH_CXSYNCHRO_TRANSPARENT,
	    ARCH_CXSYNCHRO_TRANSLUCENT,
	    ARCH_DXSYNCHRO_WHITE,
	    ARCH_DXSYNCHRO_TRANSPARENT,
	    ARCH_DXSYNCHRO_TRANSLUCENT,
	    ARCH_EXSYNCHRO_WHITE,
	    ARCH_EXSYNCHRO_TRANSPARENT,
	    ARCH_EXSYNCHRO_TRANSLUCENT,
	    ISO_A1X3_WHITE,
	    ISO_A1X3_TRANSPARENT,
	    ISO_A1X3_TRANSLUCENT,
	    ISO_A1X4_WHITE,
	    ISO_A1X4_TRANSPARENT,
	    ISO_A1X4_TRANSLUCENT,
	    ISO_A2X3_WHITE,
	    ISO_A2X3_TRANSPARENT,
	    ISO_A2X3_TRANSLUCENT,
	    ISO_A2X4_WHITE,
	    ISO_A2X4_TRANSPARENT,
	    ISO_A2X4_TRANSLUCENT,
	    ISO_A2X5_WHITE,
	    ISO_A2X5_TRANSPARENT,
	    ISO_A2X5_TRANSLUCENT,
	    ISO_A3X3_WHITE,
	    ISO_A3X3_TRANSPARENT,
	    ISO_A3X3_TRANSLUCENT,
	    ISO_A3X4_WHITE,
	    ISO_A3X4_TRANSPARENT,
	    ISO_A3X4_TRANSLUCENT,
	    ISO_A3X5_WHITE,
	    ISO_A3X5_TRANSPARENT,
	    ISO_A3X5_TRANSLUCENT,
	    ISO_A3X6_WHITE,
	    ISO_A3X6_TRANSPARENT,
	    ISO_A3X6_TRANSLUCENT,
	    ISO_A3X7_WHITE,
	    ISO_A3X7_TRANSPARENT,
	    ISO_A3X7_TRANSLUCENT,
	    ISO_A4X3_WHITE,
	    ISO_A4X3_TRANSPARENT,
	    ISO_A4X3_TRANSLUCENT,
	    ISO_A4X4_WHITE,
	    ISO_A4X4_TRANSPARENT,
	    ISO_A4X4_TRANSLUCENT,
	    ISO_A4X5_WHITE,
	    ISO_A4X5_TRANSPARENT,
	    ISO_A4X5_TRANSLUCENT,
	    ISO_A4X6_WHITE,
	    ISO_A4X6_TRANSPARENT,
	    ISO_A4X6_TRANSLUCENT,
	    ISO_A4X7_WHITE,
	    ISO_A4X7_TRANSPARENT,
	    ISO_A4X7_TRANSLUCENT,
	    ISO_A4X8_WHITE,
	    ISO_A4X8_TRANSPARENT,
	    ISO_A4X8_TRANSLUCENT,
	    ISO_A4X9_WHITE,
	    ISO_A4X9_TRANSPARENT,
	    ISO_A4X9_TRANSLUCENT,
	    ISO_A0XSYNCHRO_WHITE,
	    ISO_A0XSYNCHRO_TRANSPARENT,
	    ISO_A0XSYNCHRO_TRANSLUCENT,
	    ISO_A1XSYNCHRO_WHITE,
	    ISO_A1XSYNCHRO_TRANSPARENT,
	    ISO_A1XSYNCHRO_TRANSLUCENT,
	    ISO_A2XSYNCHRO_WHITE,
	    ISO_A2XSYNCHRO_TRANSPARENT,
	    ISO_A2XSYNCHRO_TRANSLUCENT,
	    ISO_A3XSYNCHRO_WHITE,
	    ISO_A3XSYNCHRO_TRANSPARENT,
	    ISO_A3XSYNCHRO_TRANSLUCENT,
	    ISO_A4XSYNCHRO_WHITE,
	    ISO_A4XSYNCHRO_TRANSPARENT,
	    ISO_A4XSYNCHRO_TRANSLUCENT,
	    AUTO_WHITE,
	    AUTO_TRANSPARENT,
	    AUTO_TRANSLUCENT,
	    AUTO_FIXED_SIZE_WHITE,
	    AUTO_FIXED_SIZE_TRANSPARENT,
	    AUTO_FIXED_SIZE_TRANSLUCENT,
	    AUTO_SYNCHRO_WHITE,
	    AUTO_SYNCHRO_TRANSPARENT,
	    AUTO_SYNCHRO_TRANSLUCENT,
	    CUSTOM1,
	    CUSTOM2,
	    CUSTOM3,
	    CUSTOM4,
	    CUSTOM5,
	    CUSTOM6,
	    CUSTOM7,
	    CUSTOM8,
	    CUSTOM9,
	    CUSTOM10,
	    BOND,
	    HEAVYWEIGHT,
	    LABELS,
	    LETTERHEAD,
	    PLAIN,
	    PRE_PRINTED,
	    PRE_PUNCHED,
	    RECYCLED,
	    TRANSPARENCY,};
    }
}

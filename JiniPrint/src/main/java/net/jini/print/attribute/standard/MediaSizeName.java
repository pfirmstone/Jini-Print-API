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

    public static final MediaSizeName ISO_A4_WIDE = new MediaSizeName(73),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    NA_LETTER_COVER = new MediaSizeName(74),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    JP_REPLY_POSTCARD = new MediaSizeName(75),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    NA_POSTCARD = new MediaSizeName(76),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    TAIWAN_815 = new MediaSizeName(77),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    ISO_220x330 = new MediaSizeName(78),//PWG 5100.3-2001 IPP: Production Printing Attributes - Set1
	    ARCH_A = new MediaSizeName(79),//[RFC2911] section 4.2.11
	    ARCH_B = new MediaSizeName(80),//[RFC2911] section 4.2.11
	    ARCH_C = new MediaSizeName(81),//[RFC2911] section 4.2.11
	    ARCH_D = new MediaSizeName(82),//[RFC2911] section 4.2.11
	    ARCH_E = new MediaSizeName(83);//[RFC2911] section 4.2.11
    public static final MediaSizeName ASME_F_28X40IN = new MediaSizeName(84),//[PWG5101.1]
	    CHOICE_ISO_A4_210X297MM_NA_LETTER_8_5X11IN = new MediaSizeName(85),//[PWG5100.7]
	    F = new MediaSizeName(86),//[PWG5101.1]
	    ISO_2A0_1189X1682MM = new MediaSizeName(87),//[PWG5101.1]
	    ISO_A0_841X1189MM = new MediaSizeName(88),//[PWG5101.1]
	    ISO_A1_594X841MM = new MediaSizeName(89),//[PWG5101.1]
	    ISO_A1X3_841X1783MM = new MediaSizeName(90),//[PWG5101.1]
	    ISO_A1X4_841X2378MM = new MediaSizeName(91),//[PWG5101.1]
	    ISO_A2_420X594MM = new MediaSizeName(92),//[PWG5101.1]
	    ISO_A2X3_594X1261MM = new MediaSizeName(93),//[PWG5101.1]
	    ISO_A2X4_594X1682MM = new MediaSizeName(94),//[PWG5101.1]
	    ISO_A2X5_594X2102MM = new MediaSizeName(95),//[PWG5101.1]
	    ISO_A3_EXTRA_322X445MM = new MediaSizeName(96),//[PWG5101.1]
	    ISO_A3_297X420MM = new MediaSizeName(97),//[PWG5101.1]
	    ISO_A0X3_1189X2523MM = new MediaSizeName(98),//[PWG5101.1]
	    ISO_A3X3_420X891MM = new MediaSizeName(99),//[PWG5101.1]
	    ISO_A3X4_420X1189MM = new MediaSizeName(100),//[PWG5101.1]
	    ISO_A3X5_420X1486MM = new MediaSizeName(101),//[PWG5101.1]
	    ISO_A3X6_420X1783MM = new MediaSizeName(102),//[PWG5101.1]
	    ISO_A3X7_420X2080MM = new MediaSizeName(103),//[PWG5101.1]
	    ISO_A4_EXTRA_235_5X322_3MM = new MediaSizeName(104),//[PWG5101.1]
	    ISO_A4_TAB_225X297MM = new MediaSizeName(105),//[PWG5101.1]
	    ISO_A4_210X297MM = new MediaSizeName(106),//[PWG5101.1]
	    ISO_A4X3_297X630MM = new MediaSizeName(107),//[PWG5101.1]
	    ISO_A4X4_297X841MM = new MediaSizeName(108),//[PWG5101.1]
	    ISO_A4X5_297X1051MM = new MediaSizeName(109),//[PWG5101.1]
	    ISO_A4X6_297X1261MM = new MediaSizeName(110),//[PWG5101.1]
	    ISO_A4X7_297X1471MM = new MediaSizeName(111),//[PWG5101.1]
	    ISO_A4X8_297X1682MM = new MediaSizeName(112),//[PWG5101.1]
	    ISO_A4X9_297X1892MM = new MediaSizeName(113),//[PWG5101.1]
	    ISO_A5_EXTRA_174X235MM = new MediaSizeName(114),//[PWG5101.1]
	    ISO_A5_148X210MM = new MediaSizeName(115),//[PWG5101.1]
	    ISO_A6_105X148MM = new MediaSizeName(116),//[PWG5101.1]
	    ISO_A7_74X105MM = new MediaSizeName(117),//[PWG5101.1]
	    ISO_A8_52X74MM = new MediaSizeName(118),//[PWG5101.1]
	    ISO_A9_37X52MM = new MediaSizeName(119),//[PWG5101.1]
	    ISO_A10_26X37MM = new MediaSizeName(120),//[PWG5101.1]
	    ISO_B0_1000X1414MM = new MediaSizeName(121),//[PWG5101.1]
	    ISO_B1_707X1000MM = new MediaSizeName(122),//[PWG5101.1]
	    ISO_B2_500X707MM = new MediaSizeName(123),//[PWG5101.1]
	    ISO_B3_353X500MM = new MediaSizeName(124),//[PWG5101.1]
	    ISO_B4_250X353MM = new MediaSizeName(125),//[PWG5101.1]
	    ISO_B5_EXTRA_201X276MM = new MediaSizeName(126),//[PWG5101.1]
	    ISO_B5_176X250MM = new MediaSizeName(127),//[PWG5101.1]
	    ISO_B6_125X176MM = new MediaSizeName(128),//[PWG5101.1]
	    ISO_B6C4_125X324MM = new MediaSizeName(129),//[PWG5101.1]
	    ISO_B7_88X125MM = new MediaSizeName(130),//[PWG5101.1]
	    ISO_B8_62X88MM = new MediaSizeName(131),//[PWG5101.1]
	    ISO_B9_44X62MM = new MediaSizeName(132),//[PWG5101.1]
	    ISO_B10_31X44MM = new MediaSizeName(133),//[PWG5101.1]
	    ISO_C0_917X1297MM = new MediaSizeName(134),//[PWG5101.1]
	    ISO_C1_648X917MM = new MediaSizeName(135),//[PWG5101.1]
	    ISO_C2_458X648MM = new MediaSizeName(136),//[PWG5101.1]
	    ISO_C3_324X458MM = new MediaSizeName(137),//[PWG5101.1]
	    ISO_C4_229X324MM = new MediaSizeName(138),//[PWG5101.1]
	    ISO_C5_162X229MM = new MediaSizeName(139),//[PWG5101.1]
	    ISO_C6_114X162MM = new MediaSizeName(140),//[PWG5101.1]
	    ISO_C6C5_114X229MM = new MediaSizeName(141),//[PWG5101.1]
	    ISO_C7_81X114MM = new MediaSizeName(142),//[PWG5101.1]
	    ISO_C7C6_81X162MM = new MediaSizeName(143),//[PWG5101.1]
	    ISO_C8_57X81MM = new MediaSizeName(144),//[PWG5101.1]
	    ISO_C9_40X57MM = new MediaSizeName(145),//[PWG5101.1]
	    ISO_C10_28X40MM = new MediaSizeName(146),//[PWG5101.1]
	    ISO_DL_110X220MM = new MediaSizeName(147),//[PWG5101.1]
	    ISO_RA0_860X1220MM = new MediaSizeName(148),//[PWG5101.1]
	    ISO_RA1_610X860MM = new MediaSizeName(149),//[PWG5101.1]
	    ISO_RA2_430X610MM = new MediaSizeName(150),//[PWG5101.1]
	    ISO_RA3_305X430MM = new MediaSizeName(151),//[PWG5101.1]
	    ISO_RA4_215X305MM = new MediaSizeName(152),//[PWG5101.1]
	    ISO_SRA0_900X1280MM = new MediaSizeName(153),//[PWG5101.1]
	    ISO_SRA1_640X900MM = new MediaSizeName(154),//[PWG5101.1]
	    ISO_SRA2_450X640MM = new MediaSizeName(155),//[PWG5101.1]
	    ISO_SRA3_320X450MM = new MediaSizeName(156),//[PWG5101.1]
	    ISO_SRA4_225X320MM = new MediaSizeName(157),//[PWG5101.1]
	    JIS_B0_1030X1456MM = new MediaSizeName(158),//[PWG5101.1]
	    JIS_B1_728X1030MM = new MediaSizeName(159),//[PWG5101.1]
	    JIS_B2_515X728MM = new MediaSizeName(160),//[PWG5101.1]
	    JIS_B3_364X515MM = new MediaSizeName(161),//[PWG5101.1]
	    JIS_B4_257X364MM = new MediaSizeName(162),//[PWG5101.1]
	    JIS_B5_182X257MM = new MediaSizeName(163),//[PWG5101.1]
	    JIS_B6_128X182MM = new MediaSizeName(164),//[PWG5101.1]
	    JIS_B7_91X128MM = new MediaSizeName(165),//[PWG5101.1]
	    JIS_B8_64X91MM = new MediaSizeName(166),//[PWG5101.1]
	    JIS_B9_45X64MM = new MediaSizeName(167),//[PWG5101.1]
	    JIS_B10_32X45MM = new MediaSizeName(168),//[PWG5101.1]
	    JIS_EXEC_216X330MM = new MediaSizeName(169),//[PWG5101.1]
	    JPN_CHOU2_111_1X146MM = new MediaSizeName(170),//[PWG5101.1]
	    JPN_CHOU3_120X235MM = new MediaSizeName(171),//[PWG5101.1]
	    JPN_CHOU4_90X205MM = new MediaSizeName(172),//[PWG5101.1]
	    JPN_HAGAKI_100X148MM = new MediaSizeName(173),//[PWG5101.1]
	    JPN_KAHU_240X322_1MM = new MediaSizeName(174),//[PWG5101.1]
	    JPN_KAKU2_240X332MM = new MediaSizeName(175),//[PWG5101.1]
	    JPN_KAKU3_216X277MM = new MediaSizeName(176),//[PWG5101.1]
	    JPN_KAKU4_197X267MM = new MediaSizeName(178),//[PWG5101.1]
	    JPN_KAKU5_190X240MM = new MediaSizeName(179),//[PWG5101.1]
	    JPN_KAKU7_142X205MM = new MediaSizeName(180),//[PWG5101.1]
	    JPN_KAKU8_119X197MM = new MediaSizeName(181),//[PWG5101.1]
	    JPN_OUFUKU_148X200MM = new MediaSizeName(182),//[PWG5101.1]
	    JPN_YOU4_105X235MM = new MediaSizeName(183),//[PWG5101.1]
	    NA_5X7_5X7IN = new MediaSizeName(184),//[PWG5101.1]
	    NA_6X9_6X9IN = new MediaSizeName(185),//[PWG5101.1]
	    NA_7X9_7X9IN = new MediaSizeName(186),//[PWG5101.1]
	    NA_9X11_9X11IN = new MediaSizeName(187),//[PWG5101.1]
	    NA_10X11_10X11IN = new MediaSizeName(188),//[PWG5101.1]
	    NA_10X13_10X13IN = new MediaSizeName(189),//[PWG5101.1]
	    NA_10X14_10X14IN = new MediaSizeName(190),//[PWG5101.1]
	    NA_10X15_10X15IN = new MediaSizeName(191),//[PWG5101.1]
	    NA_11X12_11X12IN = new MediaSizeName(192),//[PWG5101.1]
	    NA_11X15_11X15IN = new MediaSizeName(193),//[PWG5101.1]
	    NA_12X19_12X19IN = new MediaSizeName(194),//[PWG5101.1]
	    NA_A2_4_375X5_75IN = new MediaSizeName(195),//[PWG5101.1]
	    NA_ARCH_A_9X12IN = new MediaSizeName(196),//[PWG5101.1]
	    NA_ARCH_B_12X18IN = new MediaSizeName(197),//[PWG5101.1]
	    NA_ARCH_C_18X24IN = new MediaSizeName(198),//[PWG5101.1]
	    NA_ARCH_D_24X36IN = new MediaSizeName(199),//[PWG5101.1]
	    NA_ARCH_E2_26X38IN = new MediaSizeName(200),//[IPPWG20160229-2]
	    NA_ARCH_E3_27X39IN = new MediaSizeName(201),//[IPPWG20160229-2]
	    NA_ARCH_E_36X48IN = new MediaSizeName(202),//[PWG5101.1]
	    NA_B_PLUS_12X19_17IN = new MediaSizeName(203),//[PWG5101.1]
	    NA_C5_6_5X9_5IN = new MediaSizeName(204),//[PWG5101.1]
	    NA_C_17X22IN = new MediaSizeName(205),//[PWG5101.1]
	    NA_D_22X34IN = new MediaSizeName(206),//[PWG5101.1]
	    NA_E_34X44IN = new MediaSizeName(207),//[PWG5101.1]
	    NA_EDP_11X14IN = new MediaSizeName(208),//[PWG5101.1]
	    NA_EUR_EDP_12X14IN = new MediaSizeName(209),//[PWG5101.1]
	    NA_EXECUTIVE_7_25X10_5IN = new MediaSizeName(210),//[PWG5101.1]
	    NA_F_44X68IN = new MediaSizeName(211),//[PWG5101.1]
	    NA_FANFOLD_EUR_8_5X12IN = new MediaSizeName(212),//[PWG5101.1]
	    NA_FANFOLD_US_11X14_875IN = new MediaSizeName(213),//[PWG5101.1]
	    NA_FOOLSCAP_8_5X13IN = new MediaSizeName(214),//[PWG5101.1]
	    NA_GOVT_LEGAL_8X13IN = new MediaSizeName(215),//[PWG5101.1]
	    NA_GOVT_LETTER_8X10IN = new MediaSizeName(216),//[PWG5101.1]
	    NA_INDEX_3X5_3X5IN = new MediaSizeName(217),//[PWG5101.1]
	    NA_INDEX_4X6_EXT_6X8IN = new MediaSizeName(218),//[PWG5101.1]
	    NA_INDEX_4X6_4X6IN = new MediaSizeName(219),//[PWG5101.1]
	    NA_INDEX_5X8_5X8IN = new MediaSizeName(220),//[PWG5101.1]
	    NA_INVOICE_5_5X8_5IN = new MediaSizeName(221),//[PWG5101.1]
	    NA_LEDGER_11X17IN = new MediaSizeName(222),//[PWG5101.1]
	    NA_LEGAL_EXTRA_9_5X15IN = new MediaSizeName(223),//[PWG5101.1]
	    NA_LEGAL_8_5X14IN = new MediaSizeName(224),//[PWG5101.1]
	    NA_LETTER_EXTRA_9_5X12IN = new MediaSizeName(225),//[PWG5101.1]
	    NA_LETTER_PLUS_8_5X12_69IN = new MediaSizeName(226),//[PWG5101.1]
	    NA_LETTER_8_5X11IN = new MediaSizeName(227),//[PWG5101.1]
	    NA_MONARCH_3_875X7_5IN = new MediaSizeName(228),//[PWG5101.1]
	    NA_NUMBER_9_3_875X8_875IN = new MediaSizeName(229),//[PWG5101.1]
	    NA_NUMBER_10_4_125X9_5IN = new MediaSizeName(230),//[PWG5101.1]
	    NA_NUMBER_11_4_5X10_375IN = new MediaSizeName(231),//[PWG5101.1]
	    NA_NUMBER_12_4_75X11IN = new MediaSizeName(232),//[PWG5101.1]
	    NA_NUMBER_14_5X11_5IN = new MediaSizeName(233),//[PWG5101.1]
	    NA_OFICIO_8_5X13_4IN = new MediaSizeName(234),//[PWG5101.1]
	    NA_PERSONAL_3_625X6_5IN = new MediaSizeName(235),//[PWG5101.1]
	    NA_QUARTO_8_5X10_83IN = new MediaSizeName(236),//[PWG5101.1]
	    NA_SUPER_A_8_94X14IN = new MediaSizeName(237),//[PWG5101.1]
	    NA_SUPER_B_13X19IN = new MediaSizeName(238),//[PWG5101.1]
	    NA_WIDE_FORMAT_30X42IN = new MediaSizeName(239),//[PWG5101.1]
	    OE_12X16_12X16IN = new MediaSizeName(240),//[IPPWG20160229-2]
	    OE_14X17_14X17IN = new MediaSizeName(241),//[IPPWG20160229-2]
	    OE_18X22_18X22IN = new MediaSizeName(242),//[IPPWG20160229-2]
	    OE_A2PLUS_17X24IN = new MediaSizeName(243),//[IPPWG20160229-2]
	    OE_PHOTO_10R_10X12IN = new MediaSizeName(244),//[IPPWG20160229-2]
	    OE_PHOTO_20R_20X24IN = new MediaSizeName(245),//[IPPWG20160229-2]
	    OE_PHOTO_L_3_5X5IN = new MediaSizeName(246),//[PWG5101.1]
	    OE_PHOTO_S10R_10X15IN = new MediaSizeName(247),//[IPPWG20160229-2]
	    OM_16K_184X260MM = new MediaSizeName(248),//[HP-MEDIA]
	    OM_16K_195X270MM = new MediaSizeName(249),//[HP-MEDIA]
	    OM_DAI_PA_KAI_275X395MM = new MediaSizeName(250),//[PWG5101.1]
	    OM_FOLIO_SP_215X315MM = new MediaSizeName(251),//[PWG5101.1]
	    OM_FOLIO_210X330MM = new MediaSizeName(252),//[PWG5101.1]
	    OM_INVITE_220X220MM = new MediaSizeName(253),//[PWG5101.1]
	    OM_ITALIAN_110X230MM = new MediaSizeName(254),//[PWG5101.1]
	    OM_JUURO_KU_KAI_198X275MM = new MediaSizeName(255),//[PWG5101.1]
	    OM_LARGE_PHOTO_200X300 = new MediaSizeName(256),//[PWG5101.1]
	    OM_MEDIUM_PHOTO_130X180MM = new MediaSizeName(257),//[PWG5101.1]
	    OM_PA_KAI_267X389MM = new MediaSizeName(258),//[PWG5101.1]
	    OM_POSTFIX_114X229MM = new MediaSizeName(259),//[PWG5101.1]
	    OM_SMALL_PHOTO_100X150MM = new MediaSizeName(260),//[PWG5101.1]
	    OM_WIDE_PHOTO_100X200MM = new MediaSizeName(261),//[PWG5101.1]
	    PRC_1_102X165MM = new MediaSizeName(262),//[PWG5101.1]
	    PRC_2_102X176MM = new MediaSizeName(263),//[PWG5101.1]
	    PRC_3_125X176MM = new MediaSizeName(264),//[PWG5101.1]
	    PRC_4_110X208MM = new MediaSizeName(265),//[PWG5101.1]
	    PRC_5_110X220MM = new MediaSizeName(266),//[PWG5101.1]
	    PRC_6_120X320MM = new MediaSizeName(267),//[PWG5101.1]
	    PRC_7_160X230MM = new MediaSizeName(268),//[PWG5101.1]
	    PRC_8_120X309MM = new MediaSizeName(269),//[PWG5101.1]
	    PRC_10_324X458MM = new MediaSizeName(270),//[PWG5101.1]
	    PRC_16K_146X215MM = new MediaSizeName(271),//[PWG5101.1]
	    PRC_32K_97X151MM = new MediaSizeName(272),//[PWG5101.1]
	    ROC_8K_10_75X15_5IN = new MediaSizeName(273),//[PWG5101.1]
	    ROC_16K_7_75X10_75IN = new MediaSizeName(274),//[PWG5101.1]
	    SUPER_B = new MediaSizeName(275);//[PWG5101.1]

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
	    "asme_f_28x40in",
	    "choice_iso_a4_210x297mm_na_letter_8.5x11in",
	    "f",
	    "iso_2a0_1189x1682mm",
	    "iso_a0_841x1189mm",
	    "iso_a1_594x841mm",
	    "iso_a1x3_841x1783mm",
	    "iso_a1x4_841x2378mm",
	    "iso_a2_420x594mm",
	    "iso_a2x3_594x1261mm",
	    "iso_a2x4_594x1682mm",
	    "iso_a2x5_594x2102mm",
	    "iso_a3-extra_322x445mm",
	    "iso_a3_297x420mm",
	    "iso_a0x3_1189x2523mm",
	    "iso_a3x3_420x891mm",
	    "iso_a3x4_420x1189mm",
	    "iso_a3x5_420x1486mm",
	    "iso_a3x6_420x1783mm",
	    "iso_a3x7_420x2080mm",
	    "iso_a4-extra_235.5x322.3mm",
	    "iso_a4-tab_225x297mm",
	    "iso_a4_210x297mm",
	    "iso_a4x3_297x630mm",
	    "iso_a4x4_297x841mm",
	    "iso_a4x5_297x1051mm",
	    "iso_a4x6_297x1261mm",
	    "iso_a4x7_297x1471mm",
	    "iso_a4x8_297x1682mm",
	    "iso_a4x9_297x1892mm",
	    "iso_a5-extra_174x235mm",
	    "iso_a5_148x210mm",
	    "iso_a6_105x148mm",
	    "iso_a7_74x105mm",
	    "iso_a8_52x74mm",
	    "iso_a9_37x52mm",
	    "iso_a10_26x37mm",
	    "iso_b0_1000x1414mm",
	    "iso_b1_707x1000mm",
	    "iso_b2_500x707mm",
	    "iso_b3_353x500mm",
	    "iso_b4_250x353mm",
	    "iso_b5-extra_201x276mm",
	    "iso_b5_176x250mm",
	    "iso_b6_125x176mm",
	    "iso_b6c4_125x324mm",
	    "iso_b7_88x125mm",
	    "iso_b8_62x88mm",
	    "iso_b9_44x62mm",
	    "iso_b10_31x44mm",
	    "iso_c0_917x1297mm",
	    "iso_c1_648x917mm",
	    "iso_c2_458x648mm",
	    "iso_c3_324x458mm",
	    "iso_c4_229x324mm",
	    "iso_c5_162x229mm",
	    "iso_c6_114x162mm",
	    "iso_c6c5_114x229mm",
	    "iso_c7_81x114mm",
	    "iso_c7c6_81x162mm",
	    "iso_c8_57x81mm",
	    "iso_c9_40x57mm",
	    "iso_c10_28x40mm",
	    "iso_dl_110x220mm",
	    "iso_ra0_860x1220mm",
	    "iso_ra1_610x860mm",
	    "iso_ra2_430x610mm",
	    "iso_ra3_305x430mm",
	    "iso_ra4_215x305mm",
	    "iso_sra0_900x1280mm",
	    "iso_sra1_640x900mm",
	    "iso_sra2_450x640mm",
	    "iso_sra3_320x450mm",
	    "iso_sra4_225x320mm",
	    "jis_b0_1030x1456mm",
	    "jis_b1_728x1030mm",
	    "jis_b2_515x728mm",
	    "jis_b3_364x515mm",
	    "jis_b4_257x364mm",
	    "jis_b5_182x257mm",
	    "jis_b6_128x182mm",
	    "jis_b7_91x128mm",
	    "jis_b8_64x91mm",
	    "jis_b9_45x64mm",
	    "jis_b10_32x45mm",
	    "jis_exec_216x330mm",
	    "jpn_chou2_111.1x146mm",
	    "jpn_chou3_120x235mm",
	    "jpn_chou4_90x205mm",
	    "jpn_hagaki_100x148mm",
	    "jpn_kahu_240x322.1mm",
	    "jpn_kaku2_240x332mm",
	    "jpn_kaku3_216x277mm",
	    "jpn_kaku4_197x267mm",
	    "jpn_kaku5_190x240mm",
	    "jpn_kaku7_142x205mm",
	    "jpn_kaku8_119x197mm",
	    "jpn_oufuku_148x200mm",
	    "jpn_you4_105x235mm",
	    "na_5x7_5x7in",
	    "na_6x9_6x9in",
	    "na_7x9_7x9in",
	    "na_9x11_9x11in",
	    "na_10x11_10x11in",
	    "na_10x13_10x13in",
	    "na_10x14_10x14in",
	    "na_10x15_10x15in",
	    "na_11x12_11x12in",
	    "na_11x15_11x15in",
	    "na_12x19_12x19in",
	    "na_a2_4.375x5.75in",
	    "na_arch-a_9x12in",
	    "na_arch-b_12x18in",
	    "na_arch-c_18x24in",
	    "na_arch-d_24x36in",
	    "na_arch-e2_26x38in",
	    "na_arch-e3_27x39in",
	    "na_arch-e_36x48in",
	    "na_b-plus_12x19.17in",
	    "na_c5_6.5x9.5in",
	    "na_c_17x22in",
	    "na_d_22x34in",
	    "na_e_34x44in",
	    "na_edp_11x14in",
	    "na_eur-edp_12x14in",
	    "na_executive_7.25x10.5in",
	    "na_f_44x68in",
	    "na_fanfold-eur_8.5x12in",
	    "na_fanfold-us_11x14.875in",
	    "na_foolscap_8.5x13in",
	    "na_govt-legal_8x13in",
	    "na_govt-letter_8x10in",
	    "na_index-3x5_3x5in",
	    "na_index-4x6-ext_6x8in",
	    "na_index-4x6_4x6in",
	    "na_index-5x8_5x8in",
	    "na_invoice_5.5x8.5in",
	    "na_ledger_11x17in",
	    "na_legal-extra_9.5x15in",
	    "na_legal_8.5x14in",
	    "na_letter-extra_9.5x12in",
	    "na_letter-plus_8.5x12.69in",
	    "na_letter_8.5x11in",
	    "na_monarch_3.875x7.5in",
	    "na_number-9_3.875x8.875in",
	    "na_number-10_4.125x9.5in",
	    "na_number-11_4.5x10.375in",
	    "na_number-12_4.75x11in",
	    "na_number-14_5x11.5in",
	    "na_oficio_8.5x13.4in",
	    "na_personal_3.625x6.5in",
	    "na_quarto_8.5x10.83in",
	    "na_super-a_8.94x14in",
	    "na_super-b_13x19in",
	    "na_wide-format_30x42in",
	    "oe_12x16_12x16in",
	    "oe_14x17_14x17in",
	    "oe_18x22_18x22in",
	    "oe_a2plus_17x24in",
	    "oe_photo-10r_10x12in",
	    "oe_photo-20r_20x24in",
	    "oe_photo-l_3.5x5in",
	    "oe_photo-s10r_10x15in",
	    "om_16k_184x260mm",
	    "om_16k_195x270mm",
	    "om_dai-pa-kai_275x395mm",
	    "om_folio-sp_215x315mm",
	    "om_folio_210x330mm",
	    "om_invite_220x220mm",
	    "om_italian_110x230mm",
	    "om_juuro-ku-kai_198x275mm",
	    "om_large-photo_200x300",
	    "om_medium-photo_130x180mm",
	    "om_pa-kai_267x389mm",
	    "om_postfix_114x229mm",
	    "om_small-photo_100x150mm",
	    "om_wide-photo_100x200mm",
	    "prc_1_102x165mm",
	    "prc_2_102x176mm",
	    "prc_3_125x176mm",
	    "prc_4_110x208mm",
	    "prc_5_110x220mm",
	    "prc_6_120x320mm",
	    "prc_7_160x230mm",
	    "prc_8_120x309mm",
	    "prc_10_324x458mm",
	    "prc_16k_146x215mm",
	    "prc_32k_97x151mm",
	    "roc_8k_10.75x15.5in",
	    "roc_16k_7.75x10.75in",
	    "super-b",};
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
	    ARCH_E,
	    ASME_F_28X40IN,
	    CHOICE_ISO_A4_210X297MM_NA_LETTER_8_5X11IN,
	    F,
	    ISO_2A0_1189X1682MM,
	    ISO_A0_841X1189MM,
	    ISO_A1_594X841MM,
	    ISO_A1X3_841X1783MM,
	    ISO_A1X4_841X2378MM,
	    ISO_A2_420X594MM,
	    ISO_A2X3_594X1261MM,
	    ISO_A2X4_594X1682MM,
	    ISO_A2X5_594X2102MM,
	    ISO_A3_EXTRA_322X445MM,
	    ISO_A3_297X420MM,
	    ISO_A0X3_1189X2523MM,
	    ISO_A3X3_420X891MM,
	    ISO_A3X4_420X1189MM,
	    ISO_A3X5_420X1486MM,
	    ISO_A3X6_420X1783MM,
	    ISO_A3X7_420X2080MM,
	    ISO_A4_EXTRA_235_5X322_3MM,
	    ISO_A4_TAB_225X297MM,
	    ISO_A4_210X297MM,
	    ISO_A4X3_297X630MM,
	    ISO_A4X4_297X841MM,
	    ISO_A4X5_297X1051MM,
	    ISO_A4X6_297X1261MM,
	    ISO_A4X7_297X1471MM,
	    ISO_A4X8_297X1682MM,
	    ISO_A4X9_297X1892MM,
	    ISO_A5_EXTRA_174X235MM,
	    ISO_A5_148X210MM,
	    ISO_A6_105X148MM,
	    ISO_A7_74X105MM,
	    ISO_A8_52X74MM,
	    ISO_A9_37X52MM,
	    ISO_A10_26X37MM,
	    ISO_B0_1000X1414MM,
	    ISO_B1_707X1000MM,
	    ISO_B2_500X707MM,
	    ISO_B3_353X500MM,
	    ISO_B4_250X353MM,
	    ISO_B5_EXTRA_201X276MM,
	    ISO_B5_176X250MM,
	    ISO_B6_125X176MM,
	    ISO_B6C4_125X324MM,
	    ISO_B7_88X125MM,
	    ISO_B8_62X88MM,
	    ISO_B9_44X62MM,
	    ISO_B10_31X44MM,
	    ISO_C0_917X1297MM,
	    ISO_C1_648X917MM,
	    ISO_C2_458X648MM,
	    ISO_C3_324X458MM,
	    ISO_C4_229X324MM,
	    ISO_C5_162X229MM,
	    ISO_C6_114X162MM,
	    ISO_C6C5_114X229MM,
	    ISO_C7_81X114MM,
	    ISO_C7C6_81X162MM,
	    ISO_C8_57X81MM,
	    ISO_C9_40X57MM,
	    ISO_C10_28X40MM,
	    ISO_DL_110X220MM,
	    ISO_RA0_860X1220MM,
	    ISO_RA1_610X860MM,
	    ISO_RA2_430X610MM,
	    ISO_RA3_305X430MM,
	    ISO_RA4_215X305MM,
	    ISO_SRA0_900X1280MM,
	    ISO_SRA1_640X900MM,
	    ISO_SRA2_450X640MM,
	    ISO_SRA3_320X450MM,
	    ISO_SRA4_225X320MM,
	    JIS_B0_1030X1456MM,
	    JIS_B1_728X1030MM,
	    JIS_B2_515X728MM,
	    JIS_B3_364X515MM,
	    JIS_B4_257X364MM,
	    JIS_B5_182X257MM,
	    JIS_B6_128X182MM,
	    JIS_B7_91X128MM,
	    JIS_B8_64X91MM,
	    JIS_B9_45X64MM,
	    JIS_B10_32X45MM,
	    JIS_EXEC_216X330MM,
	    JPN_CHOU2_111_1X146MM,
	    JPN_CHOU3_120X235MM,
	    JPN_CHOU4_90X205MM,
	    JPN_HAGAKI_100X148MM,
	    JPN_KAHU_240X322_1MM,
	    JPN_KAKU2_240X332MM,
	    JPN_KAKU3_216X277MM,
	    JPN_KAKU4_197X267MM,
	    JPN_KAKU5_190X240MM,
	    JPN_KAKU7_142X205MM,
	    JPN_KAKU8_119X197MM,
	    JPN_OUFUKU_148X200MM,
	    JPN_YOU4_105X235MM,
	    NA_5X7_5X7IN,
	    NA_6X9_6X9IN,
	    NA_7X9_7X9IN,
	    NA_9X11_9X11IN,
	    NA_10X11_10X11IN,
	    NA_10X13_10X13IN,
	    NA_10X14_10X14IN,
	    NA_10X15_10X15IN,
	    NA_11X12_11X12IN,
	    NA_11X15_11X15IN,
	    NA_12X19_12X19IN,
	    NA_A2_4_375X5_75IN,
	    NA_ARCH_A_9X12IN,
	    NA_ARCH_B_12X18IN,
	    NA_ARCH_C_18X24IN,
	    NA_ARCH_D_24X36IN,
	    NA_ARCH_E2_26X38IN,
	    NA_ARCH_E3_27X39IN,
	    NA_ARCH_E_36X48IN,
	    NA_B_PLUS_12X19_17IN,
	    NA_C5_6_5X9_5IN,
	    NA_C_17X22IN,
	    NA_D_22X34IN,
	    NA_E_34X44IN,
	    NA_EDP_11X14IN,
	    NA_EUR_EDP_12X14IN,
	    NA_EXECUTIVE_7_25X10_5IN,
	    NA_F_44X68IN,
	    NA_FANFOLD_EUR_8_5X12IN,
	    NA_FANFOLD_US_11X14_875IN,
	    NA_FOOLSCAP_8_5X13IN,
	    NA_GOVT_LEGAL_8X13IN,
	    NA_GOVT_LETTER_8X10IN,
	    NA_INDEX_3X5_3X5IN,
	    NA_INDEX_4X6_EXT_6X8IN,
	    NA_INDEX_4X6_4X6IN,
	    NA_INDEX_5X8_5X8IN,
	    NA_INVOICE_5_5X8_5IN,
	    NA_LEDGER_11X17IN,
	    NA_LEGAL_EXTRA_9_5X15IN,
	    NA_LEGAL_8_5X14IN,
	    NA_LETTER_EXTRA_9_5X12IN,
	    NA_LETTER_PLUS_8_5X12_69IN,
	    NA_LETTER_8_5X11IN,
	    NA_MONARCH_3_875X7_5IN,
	    NA_NUMBER_9_3_875X8_875IN,
	    NA_NUMBER_10_4_125X9_5IN,
	    NA_NUMBER_11_4_5X10_375IN,
	    NA_NUMBER_12_4_75X11IN,
	    NA_NUMBER_14_5X11_5IN,
	    NA_OFICIO_8_5X13_4IN,
	    NA_PERSONAL_3_625X6_5IN,
	    NA_QUARTO_8_5X10_83IN,
	    NA_SUPER_A_8_94X14IN,
	    NA_SUPER_B_13X19IN,
	    NA_WIDE_FORMAT_30X42IN,
	    OE_12X16_12X16IN,
	    OE_14X17_14X17IN,
	    OE_18X22_18X22IN,
	    OE_A2PLUS_17X24IN,
	    OE_PHOTO_10R_10X12IN,
	    OE_PHOTO_20R_20X24IN,
	    OE_PHOTO_L_3_5X5IN,
	    OE_PHOTO_S10R_10X15IN,
	    OM_16K_184X260MM,
	    OM_16K_195X270MM,
	    OM_DAI_PA_KAI_275X395MM,
	    OM_FOLIO_SP_215X315MM,
	    OM_FOLIO_210X330MM,
	    OM_INVITE_220X220MM,
	    OM_ITALIAN_110X230MM,
	    OM_JUURO_KU_KAI_198X275MM,
	    OM_LARGE_PHOTO_200X300,
	    OM_MEDIUM_PHOTO_130X180MM,
	    OM_PA_KAI_267X389MM,
	    OM_POSTFIX_114X229MM,
	    OM_SMALL_PHOTO_100X150MM,
	    OM_WIDE_PHOTO_100X200MM,
	    PRC_1_102X165MM,
	    PRC_2_102X176MM,
	    PRC_3_125X176MM,
	    PRC_4_110X208MM,
	    PRC_5_110X220MM,
	    PRC_6_120X320MM,
	    PRC_7_160X230MM,
	    PRC_8_120X309MM,
	    PRC_10_324X458MM,
	    PRC_16K_146X215MM,
	    PRC_32K_97X151MM,
	    ROC_8K_10_75X15_5IN,
	    ROC_16K_7_75X10_75IN,
	    SUPER_B,};
    }

    @Override
    protected int getOffset() {
	return 73;
    }
}

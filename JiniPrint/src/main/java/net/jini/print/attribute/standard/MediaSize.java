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

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import javax.print.attribute.Attribute;
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.standard.Media;
import javax.print.attribute.standard.MediaSizeName;
import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;
import static javax.print.attribute.standard.MediaSizeName.C;
import static javax.print.attribute.standard.MediaSizeName.D;
import static javax.print.attribute.standard.MediaSizeName.E;
import static javax.print.attribute.standard.MediaSizeName.EXECUTIVE;
import static javax.print.attribute.standard.MediaSizeName.FOLIO;
import static javax.print.attribute.standard.MediaSizeName.INVOICE;
import static javax.print.attribute.standard.MediaSizeName.ISO_A0;
import static javax.print.attribute.standard.MediaSizeName.ISO_A1;
import static javax.print.attribute.standard.MediaSizeName.ISO_A10;
import static javax.print.attribute.standard.MediaSizeName.ISO_A2;
import static javax.print.attribute.standard.MediaSizeName.ISO_A3;
import static javax.print.attribute.standard.MediaSizeName.ISO_A4;
import static javax.print.attribute.standard.MediaSizeName.ISO_A5;
import static javax.print.attribute.standard.MediaSizeName.ISO_A6;
import static javax.print.attribute.standard.MediaSizeName.ISO_A7;
import static javax.print.attribute.standard.MediaSizeName.ISO_A8;
import static javax.print.attribute.standard.MediaSizeName.ISO_A9;
import static javax.print.attribute.standard.MediaSizeName.ISO_B0;
import static javax.print.attribute.standard.MediaSizeName.ISO_B1;
import static javax.print.attribute.standard.MediaSizeName.ISO_B10;
import static javax.print.attribute.standard.MediaSizeName.ISO_B2;
import static javax.print.attribute.standard.MediaSizeName.ISO_B3;
import static javax.print.attribute.standard.MediaSizeName.ISO_B4;
import static javax.print.attribute.standard.MediaSizeName.ISO_B5;
import static javax.print.attribute.standard.MediaSizeName.ISO_B6;
import static javax.print.attribute.standard.MediaSizeName.ISO_B7;
import static javax.print.attribute.standard.MediaSizeName.ISO_B8;
import static javax.print.attribute.standard.MediaSizeName.ISO_B9;
import static javax.print.attribute.standard.MediaSizeName.ISO_C0;
import static javax.print.attribute.standard.MediaSizeName.ISO_C1;
import static javax.print.attribute.standard.MediaSizeName.ISO_C2;
import static javax.print.attribute.standard.MediaSizeName.ISO_C3;
import static javax.print.attribute.standard.MediaSizeName.ISO_C4;
import static javax.print.attribute.standard.MediaSizeName.ISO_C5;
import static javax.print.attribute.standard.MediaSizeName.ISO_C6;
import static javax.print.attribute.standard.MediaSizeName.ISO_DESIGNATED_LONG;
import static javax.print.attribute.standard.MediaSizeName.ITALY_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.JAPANESE_DOUBLE_POSTCARD;
import static javax.print.attribute.standard.MediaSizeName.JAPANESE_POSTCARD;
import static javax.print.attribute.standard.MediaSizeName.JIS_B0;
import static javax.print.attribute.standard.MediaSizeName.JIS_B1;
import static javax.print.attribute.standard.MediaSizeName.JIS_B10;
import static javax.print.attribute.standard.MediaSizeName.JIS_B2;
import static javax.print.attribute.standard.MediaSizeName.JIS_B3;
import static javax.print.attribute.standard.MediaSizeName.JIS_B4;
import static javax.print.attribute.standard.MediaSizeName.JIS_B5;
import static javax.print.attribute.standard.MediaSizeName.JIS_B6;
import static javax.print.attribute.standard.MediaSizeName.JIS_B7;
import static javax.print.attribute.standard.MediaSizeName.JIS_B8;
import static javax.print.attribute.standard.MediaSizeName.JIS_B9;
import static javax.print.attribute.standard.MediaSizeName.LEDGER;
import static javax.print.attribute.standard.MediaSizeName.MONARCH_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X13_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X14_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X15_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_5X7;
import static javax.print.attribute.standard.MediaSizeName.NA_6X9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_7X9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_8X10;
import static javax.print.attribute.standard.MediaSizeName.NA_9X11_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_9X12_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_LEGAL;
import static javax.print.attribute.standard.MediaSizeName.NA_LETTER;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_10_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_11_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_12_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_14_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.PERSONAL_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.QUARTO;
import static javax.print.attribute.standard.MediaSizeName.TABLOID;
import net.jini.print.attribute.CollectionSyntax;
import net.jini.print.attribute.Dimension;
import net.jini.print.attribute.Dimension.UNIT;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_A;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_B;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_C;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_D;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_E;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_220x330;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4_WIDE;
import static net.jini.print.attribute.standard.MediaSizeName.JP_REPLY_POSTCARD;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LETTER_COVER;
import static net.jini.print.attribute.standard.MediaSizeName.NA_POSTCARD;
import static net.jini.print.attribute.standard.MediaSizeName.TAIWAN_815;
import static net.jini.print.attribute.standard.MediaSizeName.ASME_F_28X40IN;
import static net.jini.print.attribute.standard.MediaSizeName.F;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_2A0_1189X1682MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A0_841X1189MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A1_594X841MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A1X3_841X1783MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A1X4_841X2378MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A2_420X594MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A2X3_594X1261MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A2X4_594X1682MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A2X5_594X2102MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3_EXTRA_322X445MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3_297X420MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A0X3_1189X2523MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3X3_420X891MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3X4_420X1189MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3X5_420X1486MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3X6_420X1783MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A3X7_420X2080MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4_EXTRA_235_5X322_3MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4_TAB_225X297MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4_210X297MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X3_297X630MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X4_297X841MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X5_297X1051MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X6_297X1261MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X7_297X1471MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X8_297X1682MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4X9_297X1892MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A5_EXTRA_174X235MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A5_148X210MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A6_105X148MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A7_74X105MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A8_52X74MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A9_37X52MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A10_26X37MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B0_1000X1414MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B1_707X1000MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B2_500X707MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B3_353X500MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B4_250X353MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B5_EXTRA_201X276MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B5_176X250MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B6_125X176MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B6C4_125X324MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B7_88X125MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B8_62X88MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B9_44X62MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_B10_31X44MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C0_917X1297MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C1_648X917MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C2_458X648MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C3_324X458MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C4_229X324MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C5_162X229MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C6_114X162MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C6C5_114X229MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C7_81X114MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C7C6_81X162MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C8_57X81MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C9_40X57MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_C10_28X40MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_DL_110X220MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_RA0_860X1220MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_RA1_610X860MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_RA2_430X610MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_RA3_305X430MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_RA4_215X305MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_SRA0_900X1280MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_SRA1_640X900MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_SRA2_450X640MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_SRA3_320X450MM;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_SRA4_225X320MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B0_1030X1456MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B1_728X1030MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B2_515X728MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B3_364X515MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B4_257X364MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B5_182X257MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B6_128X182MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B7_91X128MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B8_64X91MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B9_45X64MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_B10_32X45MM;
import static net.jini.print.attribute.standard.MediaSizeName.JIS_EXEC_216X330MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_CHOU2_111_1X146MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_CHOU3_120X235MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_CHOU4_90X205MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_HAGAKI_100X148MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAHU_240X322_1MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU2_240X332MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU3_216X277MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU4_197X267MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU5_190X240MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU7_142X205MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_KAKU8_119X197MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_OUFUKU_148X200MM;
import static net.jini.print.attribute.standard.MediaSizeName.JPN_YOU4_105X235MM;
import static net.jini.print.attribute.standard.MediaSizeName.NA_5X7_5X7IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_6X9_6X9IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_7X9_7X9IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_9X11_9X11IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_10X11_10X11IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_10X13_10X13IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_10X14_10X14IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_10X15_10X15IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_11X12_11X12IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_11X15_11X15IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_12X19_12X19IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_A2_4_375X5_75IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_A_9X12IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_B_12X18IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_C_18X24IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_D_24X36IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_E2_26X38IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_E3_27X39IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_ARCH_E_36X48IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_B_PLUS_12X19_17IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_C5_6_5X9_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_C_17X22IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_D_22X34IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_E_34X44IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_EDP_11X14IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_EUR_EDP_12X14IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_EXECUTIVE_7_25X10_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_F_44X68IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_FANFOLD_EUR_8_5X12IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_FANFOLD_US_11X14_875IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_FOOLSCAP_8_5X13IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_GOVT_LEGAL_8X13IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_GOVT_LETTER_8X10IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_INDEX_3X5_3X5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_INDEX_4X6_EXT_6X8IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_INDEX_4X6_4X6IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_INDEX_5X8_5X8IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_INVOICE_5_5X8_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LEDGER_11X17IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LEGAL_EXTRA_9_5X15IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LEGAL_8_5X14IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LETTER_EXTRA_9_5X12IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LETTER_PLUS_8_5X12_69IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LETTER_8_5X11IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_MONARCH_3_875X7_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_NUMBER_9_3_875X8_875IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_NUMBER_10_4_125X9_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_NUMBER_11_4_5X10_375IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_NUMBER_12_4_75X11IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_NUMBER_14_5X11_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_OFICIO_8_5X13_4IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_PERSONAL_3_625X6_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_QUARTO_8_5X10_83IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_SUPER_A_8_94X14IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_SUPER_B_13X19IN;
import static net.jini.print.attribute.standard.MediaSizeName.NA_WIDE_FORMAT_30X42IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_12X16_12X16IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_14X17_14X17IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_18X22_18X22IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_A2PLUS_17X24IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_PHOTO_10R_10X12IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_PHOTO_20R_20X24IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_PHOTO_L_3_5X5IN;
import static net.jini.print.attribute.standard.MediaSizeName.OE_PHOTO_S10R_10X15IN;
import static net.jini.print.attribute.standard.MediaSizeName.OM_16K_184X260MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_16K_195X270MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_DAI_PA_KAI_275X395MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_FOLIO_SP_215X315MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_FOLIO_210X330MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_INVITE_220X220MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_ITALIAN_110X230MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_JUURO_KU_KAI_198X275MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_LARGE_PHOTO_200X300;
import static net.jini.print.attribute.standard.MediaSizeName.OM_MEDIUM_PHOTO_130X180MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_PA_KAI_267X389MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_POSTFIX_114X229MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_SMALL_PHOTO_100X150MM;
import static net.jini.print.attribute.standard.MediaSizeName.OM_WIDE_PHOTO_100X200MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_1_102X165MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_2_102X176MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_3_125X176MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_4_110X208MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_5_110X220MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_6_120X320MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_7_160X230MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_8_120X309MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_10_324X458MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_16K_146X215MM;
import static net.jini.print.attribute.standard.MediaSizeName.PRC_32K_97X151MM;
import static net.jini.print.attribute.standard.MediaSizeName.ROC_8K_10_75X15_5IN;
import static net.jini.print.attribute.standard.MediaSizeName.ROC_16K_7_75X10_75IN;
import static net.jini.print.attribute.standard.MediaSizeName.SUPER_B;

/**
 * PWG 5100.3-2001 IPP: Production Printing Attributes - Set1 Section 3.13.8
 * page 45.
 *
 * The "media-size" member attribute is a collection that explicitly specifies
 * the numerical media width and height dimensions. It is RECOMMENDED that a
 * client localize the collection values to the size names that users are
 * familiar with, such as 'letter' and ' A4', possibly also including the exact
 * dimensions as well (and in the units appropriate for the user's locale). If a
 * client does not recognize a pair of numbers as a named size, it can simply
 * display the two numbers instead. Thus the pair of size dimensions serve the
 * same function as keyword values, except that the client has an obvious
 * fallback display for an unrecognized pair, namely, the actual dimension
 * numbers.
 */
public class MediaSize extends CollectionSyntax implements Attribute {

    private static final MediaSizeName[] MEDIA_SIZE_NAMES = {
	ISO_A0,
	ISO_A1,
	ISO_A2,
	ISO_A3,
	ISO_A4,
	ISO_A5,
	ISO_A6,
	ISO_A7,
	ISO_A8,
	ISO_A9,
	ISO_A10,
	ISO_B0,
	ISO_B1,
	ISO_B2,
	ISO_B3,
	ISO_B4,
	ISO_B5,
	ISO_B6,
	ISO_B7,
	ISO_B8,
	ISO_B9,
	ISO_B10,
	JIS_B0,
	JIS_B1,
	JIS_B2,
	JIS_B3,
	JIS_B4,
	JIS_B5,
	JIS_B6,
	JIS_B7,
	JIS_B8,
	JIS_B9,
	JIS_B10,
	ISO_C0,
	ISO_C1,
	ISO_C2,
	ISO_C3,
	ISO_C4,
	ISO_C5,
	ISO_C6,
	NA_LETTER,
	NA_LEGAL,
	EXECUTIVE,
	LEDGER,
	TABLOID,
	INVOICE,
	FOLIO,
	QUARTO,
	JAPANESE_POSTCARD,
	JAPANESE_DOUBLE_POSTCARD,
	A,
	B,
	C,
	D,
	E,
	ISO_DESIGNATED_LONG,
	ITALY_ENVELOPE,
	MONARCH_ENVELOPE,
	PERSONAL_ENVELOPE,
	NA_NUMBER_9_ENVELOPE,
	NA_NUMBER_10_ENVELOPE,
	NA_NUMBER_11_ENVELOPE,
	NA_NUMBER_12_ENVELOPE,
	NA_NUMBER_14_ENVELOPE,
	NA_6X9_ENVELOPE,
	NA_7X9_ENVELOPE,
	NA_9X11_ENVELOPE,
	NA_9X12_ENVELOPE,
	NA_10X13_ENVELOPE,
	NA_10X14_ENVELOPE,
	NA_10X15_ENVELOPE,
	NA_5X7,
	NA_8X10,
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
	//	CHOICE_ISO_A4_210X297MM_NA_LETTER_8_5X11IN, not supported
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

    private static final MediaSize[] MEDIA_SIZE = {
	new MediaSize(841, 1189, UNIT.MM), //	ISO_A0,
	new MediaSize(594, 841, UNIT.MM), //	ISO_A1,
	new MediaSize(420, 594, UNIT.MM), //	ISO_A2,
	new MediaSize(297, 420, UNIT.MM), //	ISO_A3,
	new MediaSize(210, 297, UNIT.MM), //	ISO_A4,
	new MediaSize(148, 210, UNIT.MM), //	ISO_A5,
	new MediaSize(105, 148, UNIT.MM), //	ISO_A6,
	new MediaSize(74, 105, UNIT.MM), //	ISO_A7,
	new MediaSize(52, 74, UNIT.MM), //	ISO_A8,
	new MediaSize(37, 52, UNIT.MM), //	ISO_A9,
	new MediaSize(26, 37, UNIT.MM), //	ISO_A10,
	new MediaSize(1000, 1414, UNIT.MM), //	ISO_B0,
	new MediaSize(707, 1000, UNIT.MM), //	ISO_B1,
	new MediaSize(500, 707, UNIT.MM), //	ISO_B2,
	new MediaSize(353, 500, UNIT.MM), //	ISO_B3,
	new MediaSize(250, 353, UNIT.MM), //	ISO_B4,
	new MediaSize(176, 250, UNIT.MM), //	ISO_B5,
	new MediaSize(125, 176, UNIT.MM), //	ISO_B6,
	new MediaSize(88, 125, UNIT.MM), //	ISO_B7,
	new MediaSize(62, 88, UNIT.MM), //	ISO_B8,
	new MediaSize(44, 62, UNIT.MM), //	ISO_B9,
	new MediaSize(31, 44, UNIT.MM), //	ISO_B10,
	new MediaSize(1030, 1456, UNIT.MM), //	JIS_B0,
	new MediaSize(728, 1030, UNIT.MM), //	JIS_B1,
	new MediaSize(515, 728, UNIT.MM), //	JIS_B2,
	new MediaSize(364, 515, UNIT.MM), //	JIS_B3,
	new MediaSize(257, 364, UNIT.MM), //	JIS_B4,
	new MediaSize(182, 257, UNIT.MM), //	JIS_B5,
	new MediaSize(128, 182, UNIT.MM), //	JIS_B6,
	new MediaSize(91, 128, UNIT.MM), //	JIS_B7,
	new MediaSize(64, 91, UNIT.MM), //	JIS_B8,
	new MediaSize(45, 64, UNIT.MM), //	JIS_B9,
	new MediaSize(32, 45, UNIT.MM), //	JIS_B10,
	new MediaSize(917, 1297, UNIT.MM), //	ISO_C0,
	new MediaSize(648, 917, UNIT.MM), //	ISO_C1,
	new MediaSize(458, 648, UNIT.MM), //	ISO_C2,
	new MediaSize(324, 458, UNIT.MM), //	ISO_C3,
	new MediaSize(229, 324, UNIT.MM), //	ISO_C4,
	new MediaSize(162, 229, UNIT.MM), //	ISO_C5,
	new MediaSize(114, 162, UNIT.MM), //	ISO_C6,
	new MediaSize(8500, 11000, UNIT.THOU_INCH), //	NA_LETTER,
	new MediaSize(8500, 14000, UNIT.THOU_INCH), //	NA_LEGAL,
	new MediaSize(7250, 10500, UNIT.THOU_INCH), //	EXECUTIVE,
	new MediaSize(11000, 17000, UNIT.THOU_INCH), //	LEDGER,
	new MediaSize(11, 17, UNIT.INCH), //	TABLOID,
	new MediaSize(5500, 8500, UNIT.THOU_INCH), //	INVOICE,
	new MediaSize(8500, 13000, UNIT.THOU_INCH), //	FOLIO,
	new MediaSize(8500, 10830, UNIT.THOU_INCH), //	QUARTO,
	new MediaSize(100, 148, UNIT.MM), //	JAPANESE_POSTCARD,
	new MediaSize(148, 200, UNIT.MM), //	JAPANESE_DOUBLE_POSTCARD,
	new MediaSize(8500, 11000, UNIT.THOU_INCH), //	A,
	new MediaSize(11, 17, UNIT.INCH), //	B,
	new MediaSize(17, 22, UNIT.INCH), //	C,
	new MediaSize(22, 34, UNIT.INCH), //	D,
	new MediaSize(34, 44, UNIT.INCH), //	E,
	new MediaSize(110, 220, UNIT.MM), //	ISO_DESIGNATED_LONG,
	new MediaSize(110, 230, UNIT.MM), //	ITALY_ENVELOPE,
	new MediaSize(3870, 7500, UNIT.THOU_INCH), //	MONARCH_ENVELOPE,
	new MediaSize(3625, 6500, UNIT.THOU_INCH), //	PERSONAL_ENVELOPE,
	new MediaSize(3875, 8875, UNIT.THOU_INCH), //	NA_NUMBER_9_ENVELOPE,
	new MediaSize(4125, 9500, UNIT.THOU_INCH), //	NA_NUMBER_10_ENVELOPE,
	new MediaSize(4500, 10375, UNIT.THOU_INCH), //	NA_NUMBER_11_ENVELOPE,
	new MediaSize(4750, 11000, UNIT.THOU_INCH), //	NA_NUMBER_12_ENVELOPE,
	new MediaSize(5000, 11500, UNIT.THOU_INCH), //	NA_NUMBER_14_ENVELOPE,
	new MediaSize(6, 9, UNIT.INCH), //	NA_6X9_ENVELOPE,
	new MediaSize(7, 9, UNIT.INCH), //	NA_7X9_ENVELOPE,
	new MediaSize(9, 11, UNIT.INCH), //	NA_9X11_ENVELOPE,
	new MediaSize(9, 12, UNIT.INCH), //	NA_9X12_ENVELOPE,
	new MediaSize(10, 13, UNIT.INCH), //	NA_10X13_ENVELOPE,
	new MediaSize(10, 14, UNIT.INCH), //	NA_10X14_ENVELOPE,
	new MediaSize(10, 15, UNIT.INCH), //	NA_10X15_ENVELOPE,
	new MediaSize(5, 7, UNIT.INCH), //	NA_5X7,
	new MediaSize(8, 10, UNIT.INCH), //	NA_8X10,
	new MediaSize(223, 297, UNIT.MM), //	ISO_A4_WIDE,
	new MediaSize(9, 11, UNIT.INCH), //	NA_LETTER_COVER,
	new MediaSize(148, 200, UNIT.MM), //	JP_REPLY_POSTCARD,
	new MediaSize(4500, 6000, UNIT.THOU_INCH), //	NA_POSTCARD,
	new MediaSize(267, 388, UNIT.MM), //	TAIWAN-815,
	new MediaSize(220, 330, UNIT.MM), //	ISO_220x330,
	new MediaSize(9, 12, UNIT.INCH), //	ARCH_A,
	new MediaSize(12, 18, UNIT.INCH), //	ARCH_B,
	new MediaSize(18, 24, UNIT.INCH), //	ARCH_C,
	new MediaSize(24, 36, UNIT.INCH), //	ARCH_D,
	new MediaSize(36, 48, UNIT.INCH), //	ARCH_E,
	new MediaSize(28, 40, UNIT.INCH), //ASME_F_28X40IN
	//CHOICE_ISO_A4_210X297MM_NA_LETTER_8_5X11IN  not supported
	new MediaSize(28, 40, UNIT.INCH), //F
	new MediaSize(1129, 1682, UNIT.MM), //ISO_2A0_1189X1682MM
	new MediaSize(841, 1189, UNIT.MM), //ISO_A0_841X1189MM
	new MediaSize(594, 841, UNIT.MM), //ISO_A1_594X841MM
	new MediaSize(841, 1783, UNIT.MM), //ISO_A1X3_841X1783MM
	new MediaSize(841, 2378, UNIT.MM), //ISO_A1X4_841X2378MM
	new MediaSize(420, 594, UNIT.MM), //ISO_A2_420X594MM
	new MediaSize(594, 1261, UNIT.MM), //ISO_A2X3_594X1261MM
	new MediaSize(594, 1682, UNIT.MM), //ISO_A2X4_594X1682MM
	new MediaSize(594, 2102, UNIT.MM), //ISO_A2X5_594X2102MM
	new MediaSize(322, 445, UNIT.MM), //ISO_A3_EXTRA_322X445MM
	new MediaSize(297, 420, UNIT.MM), //ISO_A3_297X420MM
	new MediaSize(1189, 2523, UNIT.MM), //ISO_A0X3_1189X2523MM
	new MediaSize(420, 891, UNIT.MM), //ISO_A3X3_420X891MM
	new MediaSize(420, 1189, UNIT.MM), //ISO_A3X4_420X1189MM
	new MediaSize(420, 1486, UNIT.MM), //ISO_A3X5_420X1486MM
	new MediaSize(420, 1783, UNIT.MM), //ISO_A3X6_420X1783MM
	new MediaSize(420, 2080, UNIT.MM), //ISO_A3X7_420X2080MM
	new MediaSize(23550, 32230, UNIT.HUNDREDTH_MM), //ISO_A4_EXTRA_235_5X322_3MM
	new MediaSize(225, 297, UNIT.MM), //ISO_A4_TAB_225X297MM
	new MediaSize(210, 297, UNIT.MM), //ISO_A4_210X297MM
	new MediaSize(297, 630, UNIT.MM), //ISO_A4X3_297X630MM
	new MediaSize(297, 841, UNIT.MM), //ISO_A4X4_297X841MM
	new MediaSize(297, 1051, UNIT.MM), //ISO_A4X5_297X1051MM
	new MediaSize(297, 1261, UNIT.MM), //ISO_A4X6_297X1261MM
	new MediaSize(297, 1471, UNIT.MM), //ISO_A4X7_297X1471MM
	new MediaSize(297, 1682, UNIT.MM), //ISO_A4X8_297X1682MM
	new MediaSize(279, 1892, UNIT.MM), //ISO_A4X9_297X1892MM
	new MediaSize(174, 235, UNIT.MM), //ISO_A5_EXTRA_174X235MM
	new MediaSize(148, 210, UNIT.MM), //ISO_A5_148X210MM
	new MediaSize(105, 148, UNIT.MM), //ISO_A6_105X148MM
	new MediaSize(74, 105, UNIT.MM), //ISO_A7_74X105MM
	new MediaSize(52, 74, UNIT.MM), //ISO_A8_52X74MM
	new MediaSize(37, 52, UNIT.MM), //ISO_A9_37X52MM
	new MediaSize(26, 37, UNIT.MM), //ISO_A10_26X37MM
	new MediaSize(1000, 1414, UNIT.MM), //ISO_B0_1000X1414MM
	new MediaSize(707, 1000, UNIT.MM), //ISO_B1_707X1000MM
	new MediaSize(500, 707, UNIT.MM), //ISO_B2_500X707MM
	new MediaSize(353, 500, UNIT.MM), //ISO_B3_353X500MM
	new MediaSize(250, 353, UNIT.MM), //ISO_B4_250X353MM
	new MediaSize(201, 276, UNIT.MM), //ISO_B5_EXTRA_201X276MM
	new MediaSize(176, 250, UNIT.MM), //ISO_B5_176X250MM
	new MediaSize(125, 176, UNIT.MM), //ISO_B6_125X176MM
	new MediaSize(125, 324, UNIT.MM), //ISO_B6C4_125X324MM
	new MediaSize(88, 125, UNIT.MM), //ISO_B7_88X125MM
	new MediaSize(62, 88, UNIT.MM), //ISO_B8_62X88MM
	new MediaSize(44, 62, UNIT.MM), //ISO_B9_44X62MM
	new MediaSize(31, 44, UNIT.MM), //ISO_B10_31X44MM
	new MediaSize(917, 1297, UNIT.MM), //ISO_C0_917X1297MM
	new MediaSize(684, 917, UNIT.MM), //ISO_C1_648X917MM
	new MediaSize(458, 648, UNIT.MM), //ISO_C2_458X648MM
	new MediaSize(324, 458, UNIT.MM), //ISO_C3_324X458MM
	new MediaSize(229, 324, UNIT.MM), //ISO_C4_229X324MM
	new MediaSize(162, 229, UNIT.MM), //ISO_C5_162X229MM
	new MediaSize(114, 162, UNIT.MM), //ISO_C6_114X162MM
	new MediaSize(114, 229, UNIT.MM), //ISO_C6C5_114X229MM
	new MediaSize(81, 114, UNIT.MM), //ISO_C7_81X114MM
	new MediaSize(81, 162, UNIT.MM), //ISO_C7C6_81X162MM
	new MediaSize(57, 81, UNIT.MM), //ISO_C8_57X81MM
	new MediaSize(40, 57, UNIT.MM), //ISO_C9_40X57MM
	new MediaSize(28, 40, UNIT.MM), //ISO_C10_28X40MM
	new MediaSize(110, 220, UNIT.MM), //ISO_DL_110X220MM
	new MediaSize(860, 1220, UNIT.MM), //ISO_RA0_860X1220MM
	new MediaSize(610, 860, UNIT.MM), //ISO_RA1_610X860MM
	new MediaSize(430, 610, UNIT.MM), //ISO_RA2_430X610MM
	new MediaSize(305, 430, UNIT.MM), //ISO_RA3_305X430MM
	new MediaSize(214, 305, UNIT.MM), //ISO_RA4_215X305MM
	new MediaSize(900, 1280, UNIT.MM), //ISO_SRA0_900X1280MM
	new MediaSize(640, 900, UNIT.MM), //ISO_SRA1_640X900MM
	new MediaSize(450, 640, UNIT.MM), //ISO_SRA2_450X640MM
	new MediaSize(320, 450, UNIT.MM), //ISO_SRA3_320X450MM
	new MediaSize(225, 320, UNIT.MM), //ISO_SRA4_225X320MM
	new MediaSize(1030, 1456, UNIT.MM), //JIS_B0_1030X1456MM
	new MediaSize(728, 1030, UNIT.MM), //JIS_B1_728X1030MM
	new MediaSize(515, 728, UNIT.MM), //JIS_B2_515X728MM
	new MediaSize(364, 515, UNIT.MM), //JIS_B3_364X515MM
	new MediaSize(257, 364, UNIT.MM), //JIS_B4_257X364MM
	new MediaSize(182, 257, UNIT.MM), //JIS_B5_182X257MM
	new MediaSize(128, 182, UNIT.MM), //JIS_B6_128X182MM
	new MediaSize(91, 128, UNIT.MM), //JIS_B7_91X128MM
	new MediaSize(64, 91, UNIT.MM), //JIS_B8_64X91MM
	new MediaSize(45, 64, UNIT.MM), //JIS_B9_45X64MM
	new MediaSize(32, 45, UNIT.MM), //JIS_B10_32X45MM
	new MediaSize(216, 330, UNIT.MM), //JIS_EXEC_216X330MM
	new MediaSize(11110, 14600, UNIT.HUNDREDTH_MM), //JPN_CHOU2_111_1X146MM
	new MediaSize(120, 235, UNIT.MM), //JPN_CHOU3_120X235MM
	new MediaSize(90, 205, UNIT.MM), //JPN_CHOU4_90X205MM
	new MediaSize(100, 148, UNIT.MM), //JPN_HAGAKI_100X148MM
	new MediaSize(24000, 32210, UNIT.HUNDREDTH_MM), //JPN_KAHU_240X322_1MM
	new MediaSize(240, 332, UNIT.MM), //JPN_KAKU2_240X332MM
	new MediaSize(216, 277, UNIT.MM), //JPN_KAKU3_216X277MM
	new MediaSize(197, 267, UNIT.MM), //JPN_KAKU4_197X267MM
	new MediaSize(190, 240, UNIT.MM), //JPN_KAKU5_190X240MM
	new MediaSize(142, 205, UNIT.MM), //JPN_KAKU7_142X205MM
	new MediaSize(119, 197, UNIT.MM), //JPN_KAKU8_119X197MM
	new MediaSize(148, 200, UNIT.MM), //JPN_OUFUKU_148X200MM
	new MediaSize(105, 235, UNIT.MM), //JPN_YOU4_105X235MM
	new MediaSize(5, 7, UNIT.INCH), //NA_5X7_5X7IN
	new MediaSize(6, 9, UNIT.INCH), //NA_6X9_6X9IN
	new MediaSize(7, 9, UNIT.INCH), //NA_7X9_7X9IN
	new MediaSize(9, 11, UNIT.INCH), //NA_9X11_9X11IN
	new MediaSize(10, 11, UNIT.INCH), //NA_10X11_10X11IN
	new MediaSize(10, 13, UNIT.INCH), //NA_10X13_10X13IN
	new MediaSize(10, 14, UNIT.INCH), //NA_10X14_10X14IN
	new MediaSize(10, 15, UNIT.INCH), //NA_10X15_10X15IN
	new MediaSize(11, 12, UNIT.INCH), //NA_11X12_11X12IN
	new MediaSize(11, 15, UNIT.INCH), //NA_11X15_11X15IN
	new MediaSize(12, 19, UNIT.INCH), //NA_12X19_12X19IN
	new MediaSize(4375, 5750, UNIT.THOU_INCH), //NA_A2_4_375X5_75IN
	new MediaSize(9, 12, UNIT.INCH), //NA_ARCH_A_9X12IN
	new MediaSize(12, 18, UNIT.INCH), //NA_ARCH_B_12X18IN
	new MediaSize(18, 24, UNIT.INCH), //NA_ARCH_C_18X24IN
	new MediaSize(24, 36, UNIT.INCH), //NA_ARCH_D_24X36IN
	new MediaSize(36, 38, UNIT.INCH), //NA_ARCH_E2_26X38IN
	new MediaSize(27, 39, UNIT.INCH), //NA_ARCH_E3_27X39IN
	new MediaSize(36, 48, UNIT.INCH), //NA_ARCH_E_36X48IN
	new MediaSize(12000, 19170, UNIT.THOU_INCH), //NA_B_PLUS_12X19_17IN
	new MediaSize(6500, 9500, UNIT.THOU_INCH), //NA_C5_6_5X9_5IN
	new MediaSize(17, 22, UNIT.INCH), //NA_C_17X22IN
	new MediaSize(22, 34, UNIT.INCH), //NA_D_22X34IN
	new MediaSize(34, 44, UNIT.INCH), //NA_E_34X44IN
	new MediaSize(11, 14, UNIT.INCH), //NA_EDP_11X14IN
	new MediaSize(12, 14, UNIT.INCH), //NA_EUR_EDP_12X14IN
	new MediaSize(7250, 10500, UNIT.THOU_INCH), //NA_EXECUTIVE_7_25X10_5IN
	new MediaSize(44, 68, UNIT.INCH), //NA_F_44X68IN
	new MediaSize(8500, 12000, UNIT.THOU_INCH), //NA_FANFOLD_EUR_8_5X12IN
	new MediaSize(11000, 14875, UNIT.THOU_INCH), //NA_FANFOLD_US_11X14_875IN
	new MediaSize(8500, 13000, UNIT.THOU_INCH), //NA_FOOLSCAP_8_5X13IN
	new MediaSize(8, 13, UNIT.INCH), //NA_GOVT_LEGAL_8X13IN
	new MediaSize(8, 10, UNIT.INCH), //NA_GOVT_LETTER_8X10IN
	new MediaSize(3, 5, UNIT.INCH), //NA_INDEX_3X5_3X5IN
	new MediaSize(6, 8, UNIT.INCH), //NA_INDEX_4X6_EXT_6X8IN
	new MediaSize(4, 6, UNIT.INCH), //NA_INDEX_4X6_4X6IN
	new MediaSize(5, 8, UNIT.INCH), //NA_INDEX_5X8_5X8IN
	new MediaSize(5500, 8500, UNIT.THOU_INCH), //NA_INVOICE_5_5X8_5IN
	new MediaSize(11, 17, UNIT.INCH), //NA_LEDGER_11X17IN
	new MediaSize(9500, 15000, UNIT.THOU_INCH), //NA_LEGAL_EXTRA_9_5X15IN
	new MediaSize(8500, 14000, UNIT.THOU_INCH), //NA_LEGAL_8_5X14IN
	new MediaSize(9500, 12000, UNIT.THOU_INCH), //NA_LETTER_EXTRA_9_5X12IN
	new MediaSize(8500, 12690, UNIT.THOU_INCH), //NA_LETTER_PLUS_8_5X12_69IN
	new MediaSize(8500, 11000, UNIT.THOU_INCH), //NA_LETTER_8_5X11IN
	new MediaSize(3875, 7500, UNIT.THOU_INCH), //NA_MONARCH_3_875X7_5IN
	new MediaSize(3875, 8875, UNIT.THOU_INCH), //NA_NUMBER_9_3_875X8_875IN
	new MediaSize(4125, 9500, UNIT.THOU_INCH), //NA_NUMBER_10_4_125X9_5IN
	new MediaSize(4500, 10375, UNIT.THOU_INCH), //NA_NUMBER_11_4_5X10_375IN
	new MediaSize(4750, 11000, UNIT.THOU_INCH), //NA_NUMBER_12_4_75X11IN
	new MediaSize(14500, 11500, UNIT.THOU_INCH), //NA_NUMBER_14_5X11_5IN
	new MediaSize(8500, 13400, UNIT.THOU_INCH), //NA_OFICIO_8_5X13_4IN
	new MediaSize(3625, 6500, UNIT.THOU_INCH), //NA_PERSONAL_3_625X6_5IN
	new MediaSize(8500, 10830, UNIT.THOU_INCH), //NA_QUARTO_8_5X10_83IN
	new MediaSize(8940, 14000, UNIT.THOU_INCH), //NA_SUPER_A_8_94X14IN
	new MediaSize(13, 19, UNIT.INCH), //NA_SUPER_B_13X19IN
	new MediaSize(30, 42, UNIT.INCH), //NA_WIDE_FORMAT_30X42IN
	new MediaSize(12, 16, UNIT.INCH), //OE_12X16_12X16IN
	new MediaSize(14, 17, UNIT.INCH), //OE_14X17_14X17IN
	new MediaSize(18, 22, UNIT.INCH), //OE_18X22_18X22IN
	new MediaSize(17, 24, UNIT.INCH), //OE_A2PLUS_17X24IN
	new MediaSize(10, 12, UNIT.INCH), //OE_PHOTO_10R_10X12IN
	new MediaSize(20, 24, UNIT.INCH), //OE_PHOTO_20R_20X24IN
	new MediaSize(3500, 5000, UNIT.THOU_INCH), //OE_PHOTO_L_3_5X5IN
	new MediaSize(10, 15, UNIT.INCH), //OE_PHOTO_S10R_10X15IN
	new MediaSize(184, 260, UNIT.MM), //OM_16K_184X260MM
	new MediaSize(195, 270, UNIT.MM), //OM_16K_195X270MM
	new MediaSize(275, 395, UNIT.MM), //OM_DAI_PA_KAI_275X395MM
	new MediaSize(215, 315, UNIT.MM), //OM_FOLIO_SP_215X315MM
	new MediaSize(210, 330, UNIT.MM), //OM_FOLIO_210X330MM
	new MediaSize(220, 220, UNIT.MM), //OM_INVITE_220X220MM
	new MediaSize(110, 230, UNIT.MM), //OM_ITALIAN_110X230MM
	new MediaSize(198, 275, UNIT.MM), //OM_JUURO_KU_KAI_198X275MM
	new MediaSize(200, 300, UNIT.MM), //OM_LARGE_PHOTO_200X300
	new MediaSize(130, 180, UNIT.MM), //OM_MEDIUM_PHOTO_130X180MM
	new MediaSize(267, 389, UNIT.MM), //OM_PA_KAI_267X389MM
	new MediaSize(114, 229, UNIT.MM), //OM_POSTFIX_114X229MM
	new MediaSize(100, 150, UNIT.MM), //OM_SMALL_PHOTO_100X150MM
	new MediaSize(100, 200, UNIT.MM), //OM_WIDE_PHOTO_100X200MM
	new MediaSize(102, 165, UNIT.MM), //PRC_1_102X165MM
	new MediaSize(102, 176, UNIT.MM), //PRC_2_102X176MM
	new MediaSize(125, 176, UNIT.MM), //PRC_3_125X176MM
	new MediaSize(110, 208, UNIT.MM), //PRC_4_110X208MM
	new MediaSize(110, 220, UNIT.MM), //PRC_5_110X220MM
	new MediaSize(120, 320, UNIT.MM), //PRC_6_120X320MM
	new MediaSize(160, 230, UNIT.MM), //PRC_7_160X230MM
	new MediaSize(120, 309, UNIT.MM), //PRC_8_120X309MM
	new MediaSize(324, 458, UNIT.MM), //PRC_10_324X458MM
	new MediaSize(146, 215, UNIT.MM), //PRC_16K_146X215MM
	new MediaSize(97, 151, UNIT.MM), //PRC_32K_97X151MM
	new MediaSize(10750, 15500, UNIT.THOU_INCH), //ROC_8K_10_75X15_5IN
	new MediaSize(7750, 10750, UNIT.INCH), //ROC_16K_7_75X10_75IN
	new MediaSize(13, 19, UNIT.INCH), //SUPER_B
    };

    /**
     * Method to choose media size from standard names.
     *
     * @param name
     * @return
     */
    public static MediaSize getMediaSize(MediaSizeName name) {
	for (int i = 0, l = MEDIA_SIZE_NAMES.length; i < l; i++) {
	    if (name == MEDIA_SIZE_NAMES[i]) {
		return MEDIA_SIZE[i];
	    }
	}
	return null;
    }

    /**
     * @serialField Indicates the size of the media in hundredths of a
     * millimeter along the bottom edge of the media.
     */
    private final Attribute x;
    /**
     * @serialField Indicates the size of the media in hundredths of a
     * millimeter along the left edge of the media.
     */
    private final Attribute y;

    public MediaSize(int xDimension, int yDimension, UNIT unit) {
	x = new Xdimension(xDimension, unit);
	y = new Ydimension(yDimension, unit);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Media.class;
    }

    @Override
    public String getName() {
	return "media-size";
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{x, y};
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * bottom edge of the media.
     *
     * @return
     */
    public int getXdimension() {
	return ((IntegerSyntax) x).getValue();
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * left edge of the media.
     *
     * @return
     */
    public int getYdimension() {
	return ((IntegerSyntax) y).getValue();
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * bottom edge of the media.
     */
    public static class Xdimension extends Dimension implements Attribute {

	/**
	 * Creates a new Xdimension instance.
	 *
	 * @param x size of media in hundredths of a millimeter along the bottom
	 * edge of the media.
	 */
	Xdimension(int x, UNIT unit) {
	    super(check(x), unit);
	}

	@Override
	public Class<? extends Attribute> getCategory() {
	    return Xdimension.class;
	}

	@Override
	public String getName() {
	    return "x-dimension";
	}

	@Override
	public boolean equals(Object theObject) {
	    return super.equals(theObject) && this.getClass().isInstance(theObject);
	}

	private static int check(int i) {
	    if (i < 0) {
		throw new IllegalArgumentException("integer must be positive");
	    }
	    return i;
	}

	/**
	 * IntegerSyntax can be de-serialized by AtomicMarshalInputStream, since
	 * it only contains primitive fields, which are not seen as a threat for
	 * gadget attacks, however this object still has invariants which need
	 * to be checked. Implementing @AtomicSerial would make this class
	 * responsible for managing serial form, while implementing readObject()
	 * would prevent de-serialization with AtomicMarshalInputStream. As such
	 * readResolve is the only option to validate input in this case, it is
	 * protected so that all subclasses inherit it, to ensure it is also
	 * called for subclass instances. It is final to ensure the validation
	 * check cannot be bypassed.
	 *
	 *
	 * @serial Checks the value from the stream satisfies the same
	 * invariants as our constructor.
	 *
	 * @return this
	 * @throws ObjectStreamException
	 */
	protected final Object readResolve() throws ObjectStreamException {
	    try {
		check(getValue());
		validateInvariants();
		return this;
	    } catch (IllegalArgumentException e) {
		throw new InvalidObjectException(e.getMessage());
	    }
	}

	/**
	 * Subclasses can override this method to have check their invariants
	 * during de-serialization.
	 *
	 * @throws ObjectStreamException
	 */
	protected void validateInvariants() throws ObjectStreamException {
	}

    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * left edge of the media.
     */
    public static class Ydimension extends Dimension implements Attribute {

	Ydimension(int y, UNIT unit) {
	    super(check(y), unit);
	}

	@Override
	public Class<? extends Attribute> getCategory() {
	    return Ydimension.class;
	}

	@Override
	public String getName() {
	    return "y-dimension";
	}

	@Override
	public boolean equals(Object theObject) {
	    return super.equals(theObject) && this.getClass().isInstance(theObject);
	}

	private static int check(int i) {
	    if (i < 0) {
		throw new IllegalArgumentException("integer must be positive");
	    }
	    return i;
	}

	/**
	 * IntegerSyntax can be de-serialized by AtomicMarshalInputStream, since
	 * it only contains primitive fields, which are not seen as a threat for
	 * gadget attacks, however this object still has invariants which need
	 * to be checked. Implementing @AtomicSerial would make this class
	 * responsible for managing serial form, while implementing readObject()
	 * would prevent de-serialization with AtomicMarshalInputStream. As such
	 * readResolve is the only option to validate input in this case, it is
	 * protected so that all subclasses inherit it, to ensure it is also
	 * called for subclass instances. It is final to ensure the validation
	 * check cannot be bypassed.
	 *
	 *
	 * @serial Checks the value from the stream satisfies the same
	 * invariants as our constructor.
	 *
	 * @return this
	 * @throws ObjectStreamException
	 */
	protected final Object readResolve() throws ObjectStreamException {
	    try {
		check(getValue());
		validateInvariants();
		return this;
	    } catch (IllegalArgumentException e) {
		throw new InvalidObjectException(e.getMessage());
	    }
	}

	/**
	 * Subclasses can override this method to have check their invariants
	 * during de-serialization.
	 *
	 * @throws ObjectStreamException
	 */
	protected void validateInvariants() throws ObjectStreamException {
	}

    }

}

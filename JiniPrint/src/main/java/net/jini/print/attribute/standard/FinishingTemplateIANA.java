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
 * <a
 * href="https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xhtml">
 * IANA IPP Registrations</a>
 *
 * @author peter
 */
public class FinishingTemplateIANA extends EnumSyntax implements FinishingTemplate {

    public static final EnumSyntax 
	    BALE = new FinishingTemplateIANA(0),
	    BIND = new FinishingTemplateIANA(1),
	    BIND_BOTTOM = new FinishingTemplateIANA(2),
	    BIND_LEFT = new FinishingTemplateIANA(3),
	    BIND_RIGHT = new FinishingTemplateIANA(4),
	    BIND_TOP = new FinishingTemplateIANA(5),
	    BOOKLET_MAKER = new FinishingTemplateIANA(6),
	    COAT = new FinishingTemplateIANA(7),
	    COVER = new FinishingTemplateIANA(8),
	    EDGE_STITCH = new FinishingTemplateIANA(9),
	    EDGE_STITCH_BOTTOM = new FinishingTemplateIANA(10),
	    EDGE_STITCH_LEFT = new FinishingTemplateIANA(11),
	    EDGE_STITCH_RIGHT = new FinishingTemplateIANA(12),
	    EDGE_STITCH_TOP = new FinishingTemplateIANA(13),
	    FOLD = new FinishingTemplateIANA(14),
	    FOLD_ACCORDION = new FinishingTemplateIANA(15),
	    FOLD_DOUBLE_GATE = new FinishingTemplateIANA(16),
	    FOLD_ENGINEERING_Z = new FinishingTemplateIANA(17),
	    FOLD_GATE = new FinishingTemplateIANA(18),
	    FOLD_HALF = new FinishingTemplateIANA(19),
	    FOLD_HALF_Z = new FinishingTemplateIANA(20),
	    FOLD_LEFT_GATE = new FinishingTemplateIANA(21),
	    FOLD_LETTER = new FinishingTemplateIANA(22),
	    FOLD_PARALLEL = new FinishingTemplateIANA(23),
	    FOLD_POSTER = new FinishingTemplateIANA(24),
	    FOLD_RIGHT_GATE = new FinishingTemplateIANA(25),
	    FOLD_Z = new FinishingTemplateIANA(26),
	    JDF_F2_1 = new FinishingTemplateIANA(27),
	    JDF_F4_1 = new FinishingTemplateIANA(28),
	    JDF_F4_2 = new FinishingTemplateIANA(29),
	    JDF_F6_1 = new FinishingTemplateIANA(30),
	    JDF_F6_2 = new FinishingTemplateIANA(31),
	    JDF_F6_3 = new FinishingTemplateIANA(32),
	    JDF_F6_4 = new FinishingTemplateIANA(33),
	    JDF_F6_5 = new FinishingTemplateIANA(34),
	    JDF_F6_6 = new FinishingTemplateIANA(35),
	    JDF_F6_7 = new FinishingTemplateIANA(36),
	    JDF_F6_8 = new FinishingTemplateIANA(37),
	    JDF_F8_1 = new FinishingTemplateIANA(38),
	    JDF_F8_2 = new FinishingTemplateIANA(39),
	    JDF_F8_3 = new FinishingTemplateIANA(40),
	    JDF_F8_4 = new FinishingTemplateIANA(41),
	    JDF_F8_5 = new FinishingTemplateIANA(42),
	    JDF_F8_6 = new FinishingTemplateIANA(43),
	    JDF_F8_7 = new FinishingTemplateIANA(44),
	    JDF_F10_1 = new FinishingTemplateIANA(45),
	    JDF_F10_2 = new FinishingTemplateIANA(46),
	    JDF_F10_3 = new FinishingTemplateIANA(47),
	    JDF_F12_1 = new FinishingTemplateIANA(48),
	    JDF_F12_2 = new FinishingTemplateIANA(49),
	    JDF_F12_3 = new FinishingTemplateIANA(50),
	    JDF_F12_4 = new FinishingTemplateIANA(51),
	    JDF_F12_5 = new FinishingTemplateIANA(52),
	    JDF_F12_6 = new FinishingTemplateIANA(53),
	    JDF_F12_7 = new FinishingTemplateIANA(54),
	    JDF_F12_8 = new FinishingTemplateIANA(55),
	    JDF_F12_9 = new FinishingTemplateIANA(56),
	    JDF_F12_10 = new FinishingTemplateIANA(57),
	    JDF_F12_11 = new FinishingTemplateIANA(58),
	    JDF_F12_12 = new FinishingTemplateIANA(59),
	    JDF_F12_13 = new FinishingTemplateIANA(60),
	    JDF_F12_14 = new FinishingTemplateIANA(61),
	    JDF_F14_1 = new FinishingTemplateIANA(62),
	    JDF_F16_1 = new FinishingTemplateIANA(63),
	    JDF_F16_2 = new FinishingTemplateIANA(64),
	    JDF_F16_3 = new FinishingTemplateIANA(65),
	    JDF_F16_4 = new FinishingTemplateIANA(66),
	    JDF_F16_5 = new FinishingTemplateIANA(67),
	    JDF_F16_6 = new FinishingTemplateIANA(68),
	    JDF_F16_7 = new FinishingTemplateIANA(69),
	    JDF_F16_8 = new FinishingTemplateIANA(70),
	    JDF_F16_9 = new FinishingTemplateIANA(71),
	    JDF_F16_10 = new FinishingTemplateIANA(72),
	    JDF_F16_11 = new FinishingTemplateIANA(73),
	    JDF_F16_12 = new FinishingTemplateIANA(74),
	    JDF_F16_13 = new FinishingTemplateIANA(75),
	    JDF_F16_14 = new FinishingTemplateIANA(76),
	    JDF_F18_1 = new FinishingTemplateIANA(77),
	    JDF_F18_2 = new FinishingTemplateIANA(78),
	    JDF_F18_3 = new FinishingTemplateIANA(79),
	    JDF_F18_4 = new FinishingTemplateIANA(80),
	    JDF_F18_5 = new FinishingTemplateIANA(81),
	    JDF_F18_6 = new FinishingTemplateIANA(82),
	    JDF_F18_7 = new FinishingTemplateIANA(83),
	    JDF_F18_8 = new FinishingTemplateIANA(84),
	    JDF_F18_9 = new FinishingTemplateIANA(85),
	    JDF_F20_1 = new FinishingTemplateIANA(86),
	    JDF_F20_2 = new FinishingTemplateIANA(87),
	    JDF_F24_1 = new FinishingTemplateIANA(88),
	    JDF_F24_2 = new FinishingTemplateIANA(89),
	    JDF_F24_3 = new FinishingTemplateIANA(90),
	    JDF_F24_4 = new FinishingTemplateIANA(91),
	    JDF_F24_5 = new FinishingTemplateIANA(92),
	    JDF_F24_6 = new FinishingTemplateIANA(93),
	    JDF_F24_7 = new FinishingTemplateIANA(94),
	    JDF_F24_8 = new FinishingTemplateIANA(95),
	    JDF_F24_9 = new FinishingTemplateIANA(96),
	    JDF_F24_10 = new FinishingTemplateIANA(97),
	    JDF_F24_11 = new FinishingTemplateIANA(98),
	    JDF_F28_1 = new FinishingTemplateIANA(99),
	    JDF_F32_1 = new FinishingTemplateIANA(100),
	    JDF_F32_2 = new FinishingTemplateIANA(101),
	    JDF_F32_3 = new FinishingTemplateIANA(102),
	    JDF_F32_4 = new FinishingTemplateIANA(103),
	    JDF_F32_5 = new FinishingTemplateIANA(104),
	    JDF_F32_6 = new FinishingTemplateIANA(105),
	    JDF_F32_7 = new FinishingTemplateIANA(106),
	    JDF_F32_8 = new FinishingTemplateIANA(107),
	    JDF_F32_9 = new FinishingTemplateIANA(108),
	    JDF_F36_1 = new FinishingTemplateIANA(109),
	    JDF_F36_2 = new FinishingTemplateIANA(110),
	    JDF_F40_1 = new FinishingTemplateIANA(111),
	    JDF_F48_1 = new FinishingTemplateIANA(112),
	    JDF_F48_2 = new FinishingTemplateIANA(113),
	    JDF_F64_1 = new FinishingTemplateIANA(114),
	    JDF_F64_2 = new FinishingTemplateIANA(115),
	    JOG_OFFSET = new FinishingTemplateIANA(116),
	    LAMINATE = new FinishingTemplateIANA(117),
	    PUNCH = new FinishingTemplateIANA(118),
	    PUNCH_BOTTOM_LEFT = new FinishingTemplateIANA(119),
	    PUNCH_BOTTOM_RIGHT = new FinishingTemplateIANA(120),
	    PUNCH_DUAL_BOTTOM = new FinishingTemplateIANA(121),
	    PUNCH_DUAL_LEFT = new FinishingTemplateIANA(122),
	    PUNCH_DUAL_RIGHT = new FinishingTemplateIANA(123),
	    PUNCH_DUAL_TOP = new FinishingTemplateIANA(124),
	    PUNCH_MULTIPLE_BOTTOM = new FinishingTemplateIANA(125),
	    PUNCH_MULTIPLE_LEFT = new FinishingTemplateIANA(126),
	    PUNCH_MULTIPLE_RIGHT = new FinishingTemplateIANA(127),
	    PUNCH_MULTIPLE_TOP = new FinishingTemplateIANA(128),
	    PUNCH_QUAD_BOTTOM = new FinishingTemplateIANA(129),
	    PUNCH_QUAD_LEFT = new FinishingTemplateIANA(130),
	    PUNCH_QUAD_RIGHT = new FinishingTemplateIANA(131),
	    PUNCH_QUAD_TOP = new FinishingTemplateIANA(132),
	    PUNCH_TOP_LEFT = new FinishingTemplateIANA(133),
	    PUNCH_TOP_RIGHT = new FinishingTemplateIANA(134),
	    PUNCH_TRIPLE_BOTTOM = new FinishingTemplateIANA(135),
	    PUNCH_TRIPLE_LEFT = new FinishingTemplateIANA(136),
	    PUNCH_TRIPLE_RIGHT = new FinishingTemplateIANA(137),
	    PUNCH_TRIPLE_TOP = new FinishingTemplateIANA(138),
	    SADDLE_STITCH = new FinishingTemplateIANA(139),
	    STAPLE = new FinishingTemplateIANA(140),
	    STAPLE_BOTTOM_LEFT = new FinishingTemplateIANA(141),
	    STAPLE_BOTTOM_RIGHT = new FinishingTemplateIANA(142),
	    STAPLE_DUAL_BOTTOM = new FinishingTemplateIANA(143),
	    STAPLE_DUAL_LEFT = new FinishingTemplateIANA(144),
	    STAPLE_DUAL_RIGHT = new FinishingTemplateIANA(145),
	    STAPLE_DUAL_TOP = new FinishingTemplateIANA(146),
	    STAPLE_TOP_LEFT = new FinishingTemplateIANA(147),
	    STAPLE_TOP_RIGHT = new FinishingTemplateIANA(148),
	    STAPLE_TRIPLE_BOTTOM = new FinishingTemplateIANA(149),
	    STAPLE_TRIPLE_LEFT = new FinishingTemplateIANA(150),
	    STAPLE_TRIPLE_RIGHT = new FinishingTemplateIANA(151),
	    STAPLE_TRIPLE_TOP = new FinishingTemplateIANA(152),
	    TRIM = new FinishingTemplateIANA(153),
	    TRIM_AFTER_COPIES = new FinishingTemplateIANA(154),
	    TRIM_AFTER_DOCUMENTS = new FinishingTemplateIANA(155),
	    TRIM_AFTER_JOB = new FinishingTemplateIANA(156),
	    TRIM_AFTER_PAGES = new FinishingTemplateIANA(157);

    protected FinishingTemplateIANA(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "bale",
	    "bind",
	    "bind-bottom",
	    "bind-left",
	    "bind-right",
	    "bind-top",
	    "booklet-maker",
	    "coat",
	    "cover",
	    "edge-stitch",
	    "edge-stitch-bottom",
	    "edge-stitch-left",
	    "edge-stitch-right",
	    "edge-stitch-top",
	    "fold",
	    "fold-accordion",
	    "fold-double-gate",
	    "fold-engineering-z",
	    "fold-gate",
	    "fold-half",
	    "fold-half-z",
	    "fold-left-gate",
	    "fold-letter",
	    "fold-parallel",
	    "fold-poster",
	    "fold-right-gate",
	    "fold-z",
	    "jdf-f2-1",
	    "jdf-f4-1",
	    "jdf-f4-2",
	    "jdf-f6-1",
	    "jdf-f6-2",
	    "jdf-f6-3",
	    "jdf-f6-4",
	    "jdf-f6-5",
	    "jdf-f6-6",
	    "jdf-f6-7",
	    "jdf-f6-8",
	    "jdf-f8-1",
	    "jdf-f8-2",
	    "jdf-f8-3",
	    "jdf-f8-4",
	    "jdf-f8-5",
	    "jdf-f8-6",
	    "jdf-f8-7",
	    "jdf-f10-1",
	    "jdf-f10-2",
	    "jdf-f10-3",
	    "jdf-f12-1",
	    "jdf-f12-2",
	    "jdf-f12-3",
	    "jdf-f12-4",
	    "jdf-f12-5",
	    "jdf-f12-6",
	    "jdf-f12-7",
	    "jdf-f12-8",
	    "jdf-f12-9",
	    "jdf-f12-10",
	    "jdf-f12-11",
	    "jdf-f12-12",
	    "jdf-f12-13",
	    "jdf-f12-14",
	    "jdf-f14-1",
	    "jdf-f16-1",
	    "jdf-f16-2",
	    "jdf-f16-3",
	    "jdf-f16-4",
	    "jdf-f16-5",
	    "jdf-f16-6",
	    "jdf-f16-7",
	    "jdf-f16-8",
	    "jdf-f16-9",
	    "jdf-f16-10",
	    "jdf-f16-11",
	    "jdf-f16-12",
	    "jdf-f16-13",
	    "jdf-f16-14",
	    "jdf-f18-1",
	    "jdf-f18-2",
	    "jdf-f18-3",
	    "jdf-f18-4",
	    "jdf-f18-5",
	    "jdf-f18-6",
	    "jdf-f18-7",
	    "jdf-f18-8",
	    "jdf-f18-9",
	    "jdf-f20-1",
	    "jdf-f20-2",
	    "jdf-f24-1",
	    "jdf-f24-2",
	    "jdf-f24-3",
	    "jdf-f24-4",
	    "jdf-f24-5",
	    "jdf-f24-6",
	    "jdf-f24-7",
	    "jdf-f24-8",
	    "jdf-f24-9",
	    "jdf-f24-10",
	    "jdf-f24-11",
	    "jdf-f28-1",
	    "jdf-f32-1",
	    "jdf-f32-2",
	    "jdf-f32-3",
	    "jdf-f32-4",
	    "jdf-f32-5",
	    "jdf-f32-6",
	    "jdf-f32-7",
	    "jdf-f32-8",
	    "jdf-f32-9",
	    "jdf-f36-1",
	    "jdf-f36-2",
	    "jdf-f40-1",
	    "jdf-f48-1",
	    "jdf-f48-2",
	    "jdf-f64-1",
	    "jdf-f64-2",
	    "jog-offset",
	    "laminate",
	    "punch",
	    "punch-bottom-left",
	    "punch-bottom-right",
	    "punch-dual-bottom",
	    "punch-dual-left",
	    "punch-dual-right",
	    "punch-dual-top",
	    "punch-multiple-bottom",
	    "punch-multiple-left",
	    "punch-multiple-right",
	    "punch-multiple-top",
	    "punch-quad-bottom",
	    "punch-quad-left",
	    "punch-quad-right",
	    "punch-quad-top",
	    "punch-top-left",
	    "punch-top-right",
	    "punch-triple-bottom",
	    "punch-triple-left",
	    "punch-triple-right",
	    "punch-triple-top",
	    "saddle-stitch",
	    "staple",
	    "staple-bottom-left",
	    "staple-bottom-right",
	    "staple-dual-bottom",
	    "staple-dual-left",
	    "staple-dual-right",
	    "staple-dual-top",
	    "staple-top-left",
	    "staple-top-right",
	    "staple-triple-bottom",
	    "staple-triple-left",
	    "staple-triple-right",
	    "staple-triple-top",
	    "trim",
	    "trim-after-copies",
	    "trim-after-documents",
	    "trim-after-job",
	    "trim-after-pages",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BALE,
	    BIND,
	    BIND_BOTTOM,
	    BIND_LEFT,
	    BIND_RIGHT,
	    BIND_TOP,
	    BOOKLET_MAKER,
	    COAT,
	    COVER,
	    EDGE_STITCH,
	    EDGE_STITCH_BOTTOM,
	    EDGE_STITCH_LEFT,
	    EDGE_STITCH_RIGHT,
	    EDGE_STITCH_TOP,
	    FOLD,
	    FOLD_ACCORDION,
	    FOLD_DOUBLE_GATE,
	    FOLD_ENGINEERING_Z,
	    FOLD_GATE,
	    FOLD_HALF,
	    FOLD_HALF_Z,
	    FOLD_LEFT_GATE,
	    FOLD_LETTER,
	    FOLD_PARALLEL,
	    FOLD_POSTER,
	    FOLD_RIGHT_GATE,
	    FOLD_Z,
	    JDF_F2_1,
	    JDF_F4_1,
	    JDF_F4_2,
	    JDF_F6_1,
	    JDF_F6_2,
	    JDF_F6_3,
	    JDF_F6_4,
	    JDF_F6_5,
	    JDF_F6_6,
	    JDF_F6_7,
	    JDF_F6_8,
	    JDF_F8_1,
	    JDF_F8_2,
	    JDF_F8_3,
	    JDF_F8_4,
	    JDF_F8_5,
	    JDF_F8_6,
	    JDF_F8_7,
	    JDF_F10_1,
	    JDF_F10_2,
	    JDF_F10_3,
	    JDF_F12_1,
	    JDF_F12_2,
	    JDF_F12_3,
	    JDF_F12_4,
	    JDF_F12_5,
	    JDF_F12_6,
	    JDF_F12_7,
	    JDF_F12_8,
	    JDF_F12_9,
	    JDF_F12_10,
	    JDF_F12_11,
	    JDF_F12_12,
	    JDF_F12_13,
	    JDF_F12_14,
	    JDF_F14_1,
	    JDF_F16_1,
	    JDF_F16_2,
	    JDF_F16_3,
	    JDF_F16_4,
	    JDF_F16_5,
	    JDF_F16_6,
	    JDF_F16_7,
	    JDF_F16_8,
	    JDF_F16_9,
	    JDF_F16_10,
	    JDF_F16_11,
	    JDF_F16_12,
	    JDF_F16_13,
	    JDF_F16_14,
	    JDF_F18_1,
	    JDF_F18_2,
	    JDF_F18_3,
	    JDF_F18_4,
	    JDF_F18_5,
	    JDF_F18_6,
	    JDF_F18_7,
	    JDF_F18_8,
	    JDF_F18_9,
	    JDF_F20_1,
	    JDF_F20_2,
	    JDF_F24_1,
	    JDF_F24_2,
	    JDF_F24_3,
	    JDF_F24_4,
	    JDF_F24_5,
	    JDF_F24_6,
	    JDF_F24_7,
	    JDF_F24_8,
	    JDF_F24_9,
	    JDF_F24_10,
	    JDF_F24_11,
	    JDF_F28_1,
	    JDF_F32_1,
	    JDF_F32_2,
	    JDF_F32_3,
	    JDF_F32_4,
	    JDF_F32_5,
	    JDF_F32_6,
	    JDF_F32_7,
	    JDF_F32_8,
	    JDF_F32_9,
	    JDF_F36_1,
	    JDF_F36_2,
	    JDF_F40_1,
	    JDF_F48_1,
	    JDF_F48_2,
	    JDF_F64_1,
	    JDF_F64_2,
	    JOG_OFFSET,
	    LAMINATE,
	    PUNCH,
	    PUNCH_BOTTOM_LEFT,
	    PUNCH_BOTTOM_RIGHT,
	    PUNCH_DUAL_BOTTOM,
	    PUNCH_DUAL_LEFT,
	    PUNCH_DUAL_RIGHT,
	    PUNCH_DUAL_TOP,
	    PUNCH_MULTIPLE_BOTTOM,
	    PUNCH_MULTIPLE_LEFT,
	    PUNCH_MULTIPLE_RIGHT,
	    PUNCH_MULTIPLE_TOP,
	    PUNCH_QUAD_BOTTOM,
	    PUNCH_QUAD_LEFT,
	    PUNCH_QUAD_RIGHT,
	    PUNCH_QUAD_TOP,
	    PUNCH_TOP_LEFT,
	    PUNCH_TOP_RIGHT,
	    PUNCH_TRIPLE_BOTTOM,
	    PUNCH_TRIPLE_LEFT,
	    PUNCH_TRIPLE_RIGHT,
	    PUNCH_TRIPLE_TOP,
	    SADDLE_STITCH,
	    STAPLE,
	    STAPLE_BOTTOM_LEFT,
	    STAPLE_BOTTOM_RIGHT,
	    STAPLE_DUAL_BOTTOM,
	    STAPLE_DUAL_LEFT,
	    STAPLE_DUAL_RIGHT,
	    STAPLE_DUAL_TOP,
	    STAPLE_TOP_LEFT,
	    STAPLE_TOP_RIGHT,
	    STAPLE_TRIPLE_BOTTOM,
	    STAPLE_TRIPLE_LEFT,
	    STAPLE_TRIPLE_RIGHT,
	    STAPLE_TRIPLE_TOP,
	    TRIM,
	    TRIM_AFTER_COPIES,
	    TRIM_AFTER_DOCUMENTS,
	    TRIM_AFTER_JOB,
	    TRIM_AFTER_PAGES,};
    }

}

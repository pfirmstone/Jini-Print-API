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
public class PrinterStateReason extends javax.print.attribute.standard.PrinterStateReason {

    public static PrinterStateReason 
	    ALERT_REMOVAL_OF_BINARY_CHANGE_ENTRY = new PrinterStateReason(33),//[PWG5100.9]
	    BANDER_ADDED = new PrinterStateReason(34),//[PWG5100.9]
	    BANDER_ALMOST_EMPTY = new PrinterStateReason(35),//[PWG5100.9]
	    BANDER_ALMOST_FULL = new PrinterStateReason(36),//[PWG5100.9]
	    BANDER_AT_LIMIT = new PrinterStateReason(37),//[PWG5100.9]
	    BANDER_CLOSED = new PrinterStateReason(38),//[PWG5100.9]
	    BANDER_CONFIGURATION_CHANGE = new PrinterStateReason(39),//[PWG5100.9]
	    BANDER_COVER_CLOSED = new PrinterStateReason(40),//[PWG5100.9]
	    BANDER_COVER_OPEN = new PrinterStateReason(41),//[PWG5100.9]
	    BANDER_EMPTY = new PrinterStateReason(42),//[PWG5100.9]
	    BANDER_FULL = new PrinterStateReason(43),//[PWG5100.9]
	    BANDER_INTERLOCK_CLOSED = new PrinterStateReason(44),//[PWG5100.9]
	    BANDER_INTERLOCK_OPEN = new PrinterStateReason(45),//[PWG5100.9]
	    BANDER_JAM = new PrinterStateReason(46),//[PWG5100.9]
	    BANDER_LIFE_ALMOST_OVER = new PrinterStateReason(47),//[PWG5100.9]
	    BANDER_LIFE_OVER = new PrinterStateReason(48),//[PWG5100.9]
	    BANDER_MEMORY_EXHAUSTED = new PrinterStateReason(49),//[PWG5100.9]
	    BANDER_MISSING = new PrinterStateReason(50),//[PWG5100.9]
	    BANDER_MOTOR_FAILURE = new PrinterStateReason(51),//[PWG5100.9]
	    BANDER_NEAR_LIMIT = new PrinterStateReason(52),//[PWG5100.9]
	    BANDER_OFFLINE = new PrinterStateReason(53),//[PWG5100.9]
	    BANDER_OPENED = new PrinterStateReason(54),//[PWG5100.9]
	    BANDER_OVER_TEMPERATURE = new PrinterStateReason(55),//[PWG5100.9]
	    BANDER_POWER_SAVER = new PrinterStateReason(56),//[PWG5100.9]
	    BANDER_RECOVERABLE_FAILURE = new PrinterStateReason(57),//[PWG5100.9]
	    BANDER_RECOVERABLE_STORAGE = new PrinterStateReason(58),//[PWG5100.9]
	    BANDER_REMOVED = new PrinterStateReason(59),//[PWG5100.9]
	    BANDER_RESOURCE_ADDED = new PrinterStateReason(60),//[PWG5100.9]
	    BANDER_RESOURCE_REMOVED = new PrinterStateReason(61),//[PWG5100.9]
	    BANDER_THERMISTOR_FAILURE = new PrinterStateReason(62),//[PWG5100.9]
	    BANDER_TIMING_FAILURE = new PrinterStateReason(63),//[PWG5100.9]
	    BANDER_TURNED_OFF = new PrinterStateReason(64),//[PWG5100.9]
	    BANDER_TURNED_ON = new PrinterStateReason(65),//[PWG5100.9]
	    BANDER_UNDER_TEMPERATURE = new PrinterStateReason(66),//[PWG5100.9]
	    BANDER_UNRECOVERABLE_FAILURE = new PrinterStateReason(67),//[PWG5100.9]
	    BANDER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(68),//[PWG5100.9]
	    BANDER_WARMING_UP = new PrinterStateReason(69),//[PWG5100.9]
	    BINDER_ADDED = new PrinterStateReason(70),//[PWG5100.9]
	    BINDER_ALMOST_EMPTY = new PrinterStateReason(71),//[PWG5100.9]
	    BINDER_ALMOST_FULL = new PrinterStateReason(72),//[PWG5100.9]
	    BINDER_AT_LIMIT = new PrinterStateReason(73),//[PWG5100.9]
	    BINDER_CLOSED = new PrinterStateReason(74),//[PWG5100.9]
	    BINDER_CONFIGURATION_CHANGE = new PrinterStateReason(75),//[PWG5100.9]
	    BINDER_COVER_CLOSED = new PrinterStateReason(76),//[PWG5100.9]
	    BINDER_COVER_OPEN = new PrinterStateReason(77),//[PWG5100.9]
	    BINDER_EMPTY = new PrinterStateReason(78),//[PWG5100.9]
	    BINDER_FULL = new PrinterStateReason(79),//[PWG5100.9]
	    BINDER_INTERLOCK_CLOSED = new PrinterStateReason(80),//[PWG5100.9]
	    BINDER_INTERLOCK_OPEN = new PrinterStateReason(81),//[PWG5100.9]
	    BINDER_JAM = new PrinterStateReason(82),//[PWG5100.9]
	    BINDER_LIFE_ALMOST_OVER = new PrinterStateReason(83),//[PWG5100.9]
	    BINDER_LIFE_OVER = new PrinterStateReason(84),//[PWG5100.9]
	    BINDER_MEMORY_EXHAUSTED = new PrinterStateReason(85),//[PWG5100.9]
	    BINDER_MISSING = new PrinterStateReason(86),//[PWG5100.9]
	    BINDER_MOTOR_FAILURE = new PrinterStateReason(87),//[PWG5100.9]
	    BINDER_NEAR_LIMIT = new PrinterStateReason(88),//[PWG5100.9]
	    BINDER_OFFLINE = new PrinterStateReason(89),//[PWG5100.9]
	    BINDER_OPENED = new PrinterStateReason(90),//[PWG5100.9]
	    BINDER_OVER_TEMPERATURE = new PrinterStateReason(91),//[PWG5100.9]
	    BINDER_POWER_SAVER = new PrinterStateReason(92),//[PWG5100.9]
	    BINDER_RECOVERABLE_FAILURE = new PrinterStateReason(93),//[PWG5100.9]
	    BINDER_RECOVERABLE_STORAGE = new PrinterStateReason(94),//[PWG5100.9]
	    BINDER_REMOVED = new PrinterStateReason(95),//[PWG5100.9]
	    BINDER_RESOURCE_ADDED = new PrinterStateReason(96),//[PWG5100.9]
	    BINDER_RESOURCE_REMOVED = new PrinterStateReason(97),//[PWG5100.9]
	    BINDER_THERMISTOR_FAILURE = new PrinterStateReason(98),//[PWG5100.9]
	    BINDER_TIMING_FAILURE = new PrinterStateReason(99),//[PWG5100.9]
	    BINDER_TURNED_OFF = new PrinterStateReason(100),//[PWG5100.9]
	    BINDER_TURNED_ON = new PrinterStateReason(101),//[PWG5100.9]
	    BINDER_UNDER_TEMPERATURE = new PrinterStateReason(102),//[PWG5100.9]
	    BINDER_UNRECOVERABLE_FAILURE = new PrinterStateReason(103),//[PWG5100.9]
	    BINDER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(104),//[PWG5100.9]
	    BINDER_WARMING_UP = new PrinterStateReason(105),//[PWG5100.9]
	    CAMERA_FAILURE = new PrinterStateReason(106),//[PWG5100.21]
	    CHAMBER_COOLING = new PrinterStateReason(107),//[PWG5100.21]
	    CHAMBER_HEATING = new PrinterStateReason(108),//[PWG5100.21]
	    CHAMBER_TEMPERATURE_HIGH = new PrinterStateReason(109),//[PWG5100.21]
	    CHAMBER_TEMPERATURE_LOW = new PrinterStateReason(110),//[PWG5100.21]
	    CLEANER_LIFE_ALMOST_OVER = new PrinterStateReason(111),//[PWG5100.13]
	    CLEANER_LIFE_OVER = new PrinterStateReason(112),//[PWG5100.13]
	    CONFIGURATION_CHANGE = new PrinterStateReason(113),//[PWG5100.9]
	    DEACTIVATED = new PrinterStateReason(114),//[RFC3998]
	    DIE_CUTTER_ADDED = new PrinterStateReason(115),//[PWG5100.9]
	    DIE_CUTTER_ALMOST_EMPTY = new PrinterStateReason(116),//[PWG5100.9]
	    DIE_CUTTER_ALMOST_FULL = new PrinterStateReason(117),//[PWG5100.9]
	    DIE_CUTTER_AT_LIMIT = new PrinterStateReason(118),//[PWG5100.9]
	    DIE_CUTTER_CLOSED = new PrinterStateReason(119),//[PWG5100.9]
	    DIE_CUTTER_CONFIGURATION_CHANGE = new PrinterStateReason(120),//[PWG5100.9]
	    DIE_CUTTER_COVER_CLOSED = new PrinterStateReason(121),//[PWG5100.9]
	    DIE_CUTTER_COVER_OPEN = new PrinterStateReason(122),//[PWG5100.9]
	    DIE_CUTTER_EMPTY = new PrinterStateReason(123),//[PWG5100.9]
	    DIE_CUTTER_FULL = new PrinterStateReason(124),//[PWG5100.9]
	    DIE_CUTTER_INTERLOCK_CLOSED = new PrinterStateReason(125),//[PWG5100.9]
	    DIE_CUTTER_INTERLOCK_OPEN = new PrinterStateReason(126),//[PWG5100.9]
	    DIE_CUTTER_JAM = new PrinterStateReason(127),//[PWG5100.9]
	    DIE_CUTTER_LIFE_ALMOST_OVER = new PrinterStateReason(128),//[PWG5100.9]
	    DIE_CUTTER_LIFE_OVER = new PrinterStateReason(129),//[PWG5100.9]
	    DIE_CUTTER_MEMORY_EXHAUSTED = new PrinterStateReason(130),//[PWG5100.9]
	    DIE_CUTTER_MISSING = new PrinterStateReason(131),//[PWG5100.9]
	    DIE_CUTTER_MOTOR_FAILURE = new PrinterStateReason(132),//[PWG5100.9]
	    DIE_CUTTER_NEAR_LIMIT = new PrinterStateReason(133),//[PWG5100.9]
	    DIE_CUTTER_OFFLINE = new PrinterStateReason(134),//[PWG5100.9]
	    DIE_CUTTER_OPENED = new PrinterStateReason(135),//[PWG5100.9]
	    DIE_CUTTER_OVER_TEMPERATURE = new PrinterStateReason(136),//[PWG5100.9]
	    DIE_CUTTER_POWER_SAVER = new PrinterStateReason(137),//[PWG5100.9]
	    DIE_CUTTER_RECOVERABLE_FAILURE = new PrinterStateReason(138),//[PWG5100.9]
	    DIE_CUTTER_RECOVERABLE_STORAGE = new PrinterStateReason(139),//[PWG5100.9]
	    DIE_CUTTER_REMOVED = new PrinterStateReason(140),//[PWG5100.9]
	    DIE_CUTTER_RESOURCE_ADDED = new PrinterStateReason(141),//[PWG5100.9]
	    DIE_CUTTER_RESOURCE_REMOVED = new PrinterStateReason(142),//[PWG5100.9]
	    DIE_CUTTER_THERMISTOR_FAILURE = new PrinterStateReason(143),//[PWG5100.9]
	    DIE_CUTTER_TIMING_FAILURE = new PrinterStateReason(144),//[PWG5100.9]
	    DIE_CUTTER_TURNED_OFF = new PrinterStateReason(145),//[PWG5100.9]
	    DIE_CUTTER_TURNED_ON = new PrinterStateReason(146),//[PWG5100.9]
	    DIE_CUTTER_UNDER_TEMPERATURE = new PrinterStateReason(147),//[PWG5100.9]
	    DIE_CUTTER_UNRECOVERABLE_FAILURE = new PrinterStateReason(148),//[PWG5100.9]
	    DIE_CUTTER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(149),//[PWG5100.9]
	    DIE_CUTTER_WARMING_UP = new PrinterStateReason(150),//[PWG5100.9]
	    EXTRUDER_COOLING = new PrinterStateReason(151),//[PWG5100.21]
	    EXTRUDER_FAILURE = new PrinterStateReason(152),//[PWG5100.21]
	    EXTRUDER_HEATING = new PrinterStateReason(153),//[PWG5100.21]
	    EXTRUDER_JAM = new PrinterStateReason(154),//[PWG5100.21]
	    EXTRUDER_TEMPERATURE_HIGH = new PrinterStateReason(155),//[PWG5100.21]
	    EXTRUDER_TEMPERATURE_LOW = new PrinterStateReason(156),//[PWG5100.21]
	    FAN_FAILURE = new PrinterStateReason(157),//[PWG5100.21]
	    FOLDER_ADDED = new PrinterStateReason(158),//[PWG5100.9]
	    FOLDER_ALMOST_EMPTY = new PrinterStateReason(159),//[PWG5100.9]
	    FOLDER_ALMOST_FULL = new PrinterStateReason(160),//[PWG5100.9]
	    FOLDER_AT_LIMIT = new PrinterStateReason(161),//[PWG5100.9]
	    FOLDER_CLOSED = new PrinterStateReason(162),//[PWG5100.9]
	    FOLDER_CONFIGURATION_CHANGE = new PrinterStateReason(163),//[PWG5100.9]
	    FOLDER_COVER_CLOSED = new PrinterStateReason(164),//[PWG5100.9]
	    FOLDER_COVER_OPEN = new PrinterStateReason(165),//[PWG5100.9]
	    FOLDER_EMPTY = new PrinterStateReason(166),//[PWG5100.9]
	    FOLDER_FULL = new PrinterStateReason(167),//[PWG5100.9]
	    FOLDER_INTERLOCK_CLOSED = new PrinterStateReason(168),//[PWG5100.9]
	    FOLDER_INTERLOCK_OPEN = new PrinterStateReason(169),//[PWG5100.9]
	    FOLDER_JAM = new PrinterStateReason(170),//[PWG5100.9]
	    FOLDER_LIFE_ALMOST_OVER = new PrinterStateReason(171),//[PWG5100.9]
	    FOLDER_LIFE_OVER = new PrinterStateReason(172),//[PWG5100.9]
	    FOLDER_MEMORY_EXHAUSTED = new PrinterStateReason(173),//[PWG5100.9]
	    FOLDER_MISSING = new PrinterStateReason(174),//[PWG5100.9]
	    FOLDER_MOTOR_FAILURE = new PrinterStateReason(175),//[PWG5100.9]
	    FOLDER_NEAR_LIMIT = new PrinterStateReason(176),//[PWG5100.9]
	    FOLDER_OFFLINE = new PrinterStateReason(177),//[PWG5100.9]
	    FOLDER_OPENED = new PrinterStateReason(178),//[PWG5100.9]
	    FOLDER_OVER_TEMPERATURE = new PrinterStateReason(179),//[PWG5100.9]
	    FOLDER_POWER_SAVER = new PrinterStateReason(180),//[PWG5100.9]
	    FOLDER_RECOVERABLE_FAILURE = new PrinterStateReason(181),//[PWG5100.9]
	    FOLDER_RECOVERABLE_STORAGE = new PrinterStateReason(182),//[PWG5100.9]
	    FOLDER_REMOVED = new PrinterStateReason(183),//[PWG5100.9]
	    FOLDER_RESOURCE_ADDED = new PrinterStateReason(184),//[PWG5100.9]
	    FOLDER_RESOURCE_REMOVED = new PrinterStateReason(185),//[PWG5100.9]
	    FOLDER_THERMISTOR_FAILURE = new PrinterStateReason(186),//[PWG5100.9]
	    FOLDER_TIMING_FAILURE = new PrinterStateReason(187),//[PWG5100.9]
	    FOLDER_TURNED_OFF = new PrinterStateReason(188),//[PWG5100.9]
	    FOLDER_TURNED_ON = new PrinterStateReason(189),//[PWG5100.9]
	    FOLDER_UNDER_TEMPERATURE = new PrinterStateReason(190),//[PWG5100.9]
	    FOLDER_UNRECOVERABLE_FAILURE = new PrinterStateReason(191),//[PWG5100.9]
	    FOLDER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(192),//[PWG5100.9]
	    FOLDER_WARMING_UP = new PrinterStateReason(193),//[PWG5100.9]
	    HOLD_NEW_JOBS = new PrinterStateReason(194),//[RFC3998]
	    IDENTIFY_PRINTER_REQUESTED = new PrinterStateReason(195),//[PWG5100.18]
	    IMPRINTER_ADDED = new PrinterStateReason(196),//[PWG5100.9]
	    IMPRINTER_ALMOST_EMPTY = new PrinterStateReason(197),//[PWG5100.9]
	    IMPRINTER_ALMOST_FULL = new PrinterStateReason(198),//[PWG5100.9]
	    IMPRINTER_AT_LIMIT = new PrinterStateReason(199),//[PWG5100.9]
	    IMPRINTER_CLOSED = new PrinterStateReason(200),//[PWG5100.9]
	    IMPRINTER_CONFIGURATION_CHANGE = new PrinterStateReason(201),//[PWG5100.9]
	    IMPRINTER_COVER_CLOSED = new PrinterStateReason(202),//[PWG5100.9]
	    IMPRINTER_COVER_OPEN = new PrinterStateReason(203),//[PWG5100.9]
	    IMPRINTER_EMPTY = new PrinterStateReason(204),//[PWG5100.9]
	    IMPRINTER_FULL = new PrinterStateReason(205),//[PWG5100.9]
	    IMPRINTER_INTERLOCK_CLOSED = new PrinterStateReason(206),//[PWG5100.9]
	    IMPRINTER_INTERLOCK_OPEN = new PrinterStateReason(207),//[PWG5100.9]
	    IMPRINTER_JAM = new PrinterStateReason(208),//[PWG5100.9]
	    IMPRINTER_LIFE_ALMOST_OVER = new PrinterStateReason(209),//[PWG5100.9]
	    IMPRINTER_LIFE_OVER = new PrinterStateReason(210),//[PWG5100.9]
	    IMPRINTER_MEMORY_EXHAUSTED = new PrinterStateReason(211),//[PWG5100.9]
	    IMPRINTER_MISSING = new PrinterStateReason(212),//[PWG5100.9]
	    IMPRINTER_MOTOR_FAILURE = new PrinterStateReason(213),//[PWG5100.9]
	    IMPRINTER_NEAR_LIMIT = new PrinterStateReason(214),//[PWG5100.9]
	    IMPRINTER_OFFLINE = new PrinterStateReason(215),//[PWG5100.9]
	    IMPRINTER_OPENED = new PrinterStateReason(216),//[PWG5100.9]
	    IMPRINTER_OVER_TEMPERATURE = new PrinterStateReason(217),//[PWG5100.9]
	    IMPRINTER_POWER_SAVER = new PrinterStateReason(218),//[PWG5100.9]
	    IMPRINTER_RECOVERABLE_FAILURE = new PrinterStateReason(219),//[PWG5100.9]
	    IMPRINTER_RECOVERABLE_STORAGE = new PrinterStateReason(220),//[PWG5100.9]
	    IMPRINTER_REMOVED = new PrinterStateReason(221),//[PWG5100.9]
	    IMPRINTER_RESOURCE_ADDED = new PrinterStateReason(222),//[PWG5100.9]
	    IMPRINTER_RESOURCE_REMOVED = new PrinterStateReason(223),//[PWG5100.9]
	    IMPRINTER_THERMISTOR_FAILURE = new PrinterStateReason(224),//[PWG5100.9]
	    IMPRINTER_TIMING_FAILURE = new PrinterStateReason(225),//[PWG5100.9]
	    IMPRINTER_TURNED_OFF = new PrinterStateReason(226),//[PWG5100.9]
	    IMPRINTER_TURNED_ON = new PrinterStateReason(227),//[PWG5100.9]
	    IMPRINTER_UNDER_TEMPERATURE = new PrinterStateReason(228),//[PWG5100.9]
	    IMPRINTER_UNRECOVERABLE_FAILURE = new PrinterStateReason(229),//[PWG5100.9]
	    IMPRINTER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(230),//[PWG5100.9]
	    IMPRINTER_WARMING_UP = new PrinterStateReason(231),//[PWG5100.9]
	    INPUT_CANNOT_FEED_SIZE_SELECTED = new PrinterStateReason(232),//[PWG5100.9]
	    INPUT_MANUAL_INPUT_REQUEST = new PrinterStateReason(233),//[PWG5100.9]
	    INPUT_MEDIA_COLOR_CHANGE = new PrinterStateReason(234),//[PWG5100.9]
	    INPUT_MEDIA_FORM_PARTS_CHANGE = new PrinterStateReason(235),//[PWG5100.9]
	    INPUT_MEDIA_SIZE_CHANGE = new PrinterStateReason(236),//[PWG5100.9]
	    INPUT_MEDIA_TYPE_CHANGE = new PrinterStateReason(237),//[PWG5100.9]
	    INPUT_MEDIA_WEIGHT_CHANGE = new PrinterStateReason(238),//[PWG5100.9]
	    INPUT_TRAY_ELEVATION_FAILURE = new PrinterStateReason(239),//[PWG5100.9]
	    INPUT_TRAY_POSITION_FAILURE = new PrinterStateReason(240),//[PWG5100.9]
	    INSERTER_ADDED = new PrinterStateReason(241),//[PWG5100.9]
	    INSERTER_ALMOST_EMPTY = new PrinterStateReason(242),//[PWG5100.9]
	    INSERTER_ALMOST_FULL = new PrinterStateReason(243),//[PWG5100.9]
	    INSERTER_AT_LIMIT = new PrinterStateReason(244),//[PWG5100.9]
	    INSERTER_CLOSED = new PrinterStateReason(245),//[PWG5100.9]
	    INSERTER_CONFIGURATION_CHANGE = new PrinterStateReason(246),//[PWG5100.9]
	    INSERTER_COVER_CLOSED = new PrinterStateReason(247),//[PWG5100.9]
	    INSERTER_COVER_OPEN = new PrinterStateReason(248),//[PWG5100.9]
	    INSERTER_EMPTY = new PrinterStateReason(249),//[PWG5100.9]
	    INSERTER_FULL = new PrinterStateReason(250),//[PWG5100.9]
	    INSERTER_INTERLOCK_CLOSED = new PrinterStateReason(251),//[PWG5100.9]
	    INSERTER_INTERLOCK_OPEN = new PrinterStateReason(252),//[PWG5100.9]
	    INSERTER_JAM = new PrinterStateReason(253),//[PWG5100.9]
	    INSERTER_LIFE_ALMOST_OVER = new PrinterStateReason(254),//[PWG5100.9]
	    INSERTER_LIFE_OVER = new PrinterStateReason(255),//[PWG5100.9]
	    INSERTER_MEMORY_EXHAUSTED = new PrinterStateReason(256),//[PWG5100.9]
	    INSERTER_MISSING = new PrinterStateReason(257),//[PWG5100.9]
	    INSERTER_MOTOR_FAILURE = new PrinterStateReason(258),//[PWG5100.9]
	    INSERTER_NEAR_LIMIT = new PrinterStateReason(259),//[PWG5100.9]
	    INSERTER_OFFLINE = new PrinterStateReason(260),//[PWG5100.9]
	    INSERTER_OPENED = new PrinterStateReason(261),//[PWG5100.9]
	    INSERTER_OVER_TEMPERATURE = new PrinterStateReason(262),//[PWG5100.9]
	    INSERTER_POWER_SAVER = new PrinterStateReason(263),//[PWG5100.9]
	    INSERTER_RECOVERABLE_FAILURE = new PrinterStateReason(264),//[PWG5100.9]
	    INSERTER_RECOVERABLE_STORAGE = new PrinterStateReason(265),//[PWG5100.9]
	    INSERTER_REMOVED = new PrinterStateReason(266),//[PWG5100.9]
	    INSERTER_RESOURCE_ADDED = new PrinterStateReason(267),//[PWG5100.9]
	    INSERTER_RESOURCE_REMOVED = new PrinterStateReason(268),//[PWG5100.9]
	    INSERTER_THERMISTOR_FAILURE = new PrinterStateReason(269),//[PWG5100.9]
	    INSERTER_TIMING_FAILURE = new PrinterStateReason(270),//[PWG5100.9]
	    INSERTER_TURNED_OFF = new PrinterStateReason(271),//[PWG5100.9]
	    INSERTER_TURNED_ON = new PrinterStateReason(272),//[PWG5100.9]
	    INSERTER_UNDER_TEMPERATURE = new PrinterStateReason(273),//[PWG5100.9]
	    INSERTER_UNRECOVERABLE_FAILURE = new PrinterStateReason(274),//[PWG5100.9]
	    INSERTER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(275),//[PWG5100.9]
	    INSERTER_WARMING_UP = new PrinterStateReason(276),//[PWG5100.9]
	    INTERLOCK_CLOSED = new PrinterStateReason(277),//[PWG5100.9]
	    INTERPRETER_CARTRIDGE_ADDED = new PrinterStateReason(278),//[PWG5100.9]
	    INTERPRETER_CARTRIDGE_DELETED = new PrinterStateReason(279),//[PWG5100.9]
	    INTERPRETER_COMPLEX_PAGE_ENCOUNTERED = new PrinterStateReason(280),//[PWG5100.9]
	    INTERPRETER_MEMORY_DECREASE = new PrinterStateReason(281),//[PWG5100.9]
	    INTERPRETER_MEMORY_INCREASE = new PrinterStateReason(282),//[PWG5100.9]
	    INTERPRETER_RESOURCE_ADDED = new PrinterStateReason(283),//[PWG5100.9]
	    INTERPRETER_RESOURCE_DELETED = new PrinterStateReason(284),//[PWG5100.9]
	    LAMP_AT_EOL = new PrinterStateReason(285),//[PWG5100.21]
	    LAMP_FAILURE = new PrinterStateReason(286),//[PWG5100.21]
	    LAMP_NEAR_EOL = new PrinterStateReason(287),//[PWG5100.21]
	    LASER_AT_EOL = new PrinterStateReason(288),//[PWG5100.21]
	    LASER_FAILURE = new PrinterStateReason(289),//[PWG5100.21]
	    LASER_NEAR_EOL = new PrinterStateReason(290),//[PWG5100.21]
	    MAKE_ENVELOPE_ADDED = new PrinterStateReason(291),//[PWG5100.9]
	    MAKE_ENVELOPE_ALMOST_EMPTY = new PrinterStateReason(292),//[PWG5100.9]
	    MAKE_ENVELOPE_ALMOST_FULL = new PrinterStateReason(293),//[PWG5100.9]
	    MAKE_ENVELOPE_AT_LIMIT = new PrinterStateReason(294),//[PWG5100.9]
	    MAKE_ENVELOPE_CLOSED = new PrinterStateReason(295),//[PWG5100.9]
	    MAKE_ENVELOPE_CONFIGURATION_CHANGE = new PrinterStateReason(296),//[PWG5100.9]
	    MAKE_ENVELOPE_COVER_CLOSED = new PrinterStateReason(297),//[PWG5100.9]
	    MAKE_ENVELOPE_COVER_OPEN = new PrinterStateReason(298),//[PWG5100.9]
	    MAKE_ENVELOPE_EMPTY = new PrinterStateReason(299),//[PWG5100.9]
	    MAKE_ENVELOPE_FULL = new PrinterStateReason(300),//[PWG5100.9]
	    MAKE_ENVELOPE_INTERLOCK_CLOSED = new PrinterStateReason(301),//[PWG5100.9]
	    MAKE_ENVELOPE_INTERLOCK_OPEN = new PrinterStateReason(302),//[PWG5100.9]
	    MAKE_ENVELOPE_JAM = new PrinterStateReason(303),//[PWG5100.9]
	    MAKE_ENVELOPE_LIFE_ALMOST_OVER = new PrinterStateReason(304),//[PWG5100.9]
	    MAKE_ENVELOPE_LIFE_OVER = new PrinterStateReason(305),//[PWG5100.9]
	    MAKE_ENVELOPE_MEMORY_EXHAUSTED = new PrinterStateReason(306),//[PWG5100.9]
	    MAKE_ENVELOPE_MISSING = new PrinterStateReason(307),//[PWG5100.9]
	    MAKE_ENVELOPE_MOTOR_FAILURE = new PrinterStateReason(308),//[PWG5100.9]
	    MAKE_ENVELOPE_NEAR_LIMIT = new PrinterStateReason(309),//[PWG5100.9]
	    MAKE_ENVELOPE_OFFLINE = new PrinterStateReason(310),//[PWG5100.9]
	    MAKE_ENVELOPE_OPENED = new PrinterStateReason(311),//[PWG5100.9]
	    MAKE_ENVELOPE_OVER_TEMPERATURE = new PrinterStateReason(312),//[PWG5100.9]
	    MAKE_ENVELOPE_POWER_SAVER = new PrinterStateReason(313),//[PWG5100.9]
	    MAKE_ENVELOPE_RECOVERABLE_FAILURE = new PrinterStateReason(314),//[PWG5100.9]
	    MAKE_ENVELOPE_RECOVERABLE_STORAGE = new PrinterStateReason(315),//[PWG5100.9]
	    MAKE_ENVELOPE_REMOVED = new PrinterStateReason(316),//[PWG5100.9]
	    MAKE_ENVELOPE_RESOURCE_ADDED = new PrinterStateReason(317),//[PWG5100.9]
	    MAKE_ENVELOPE_RESOURCE_REMOVED = new PrinterStateReason(318),//[PWG5100.9]
	    MAKE_ENVELOPE_THERMISTOR_FAILURE = new PrinterStateReason(319),//[PWG5100.9]
	    MAKE_ENVELOPE_TIMING_FAILURE = new PrinterStateReason(320),//[PWG5100.9]
	    MAKE_ENVELOPE_TURNED_OFF = new PrinterStateReason(321),//[PWG5100.9]
	    MAKE_ENVELOPE_TURNED_ON = new PrinterStateReason(322),//[PWG5100.9]
	    MAKE_ENVELOPE_UNDER_TEMPERATURE = new PrinterStateReason(323),//[PWG5100.9]
	    MAKE_ENVELOPE_UNRECOVERABLE_FAILURE = new PrinterStateReason(324),//[PWG5100.9]
	    MAKE_ENVELOPE_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(325),//[PWG5100.9]
	    MAKE_ENVELOPE_WARMING_UP = new PrinterStateReason(326),//[PWG5100.9]
	    MARKER_ADJUSTING_PRINT_QUALITY = new PrinterStateReason(327),//[PWG5100.9]
	    MARKER_DEVELOPER_ALMOST_EMPTY = new PrinterStateReason(328),//[PWG5100.9]
	    MARKER_DEVELOPER_EMPTY = new PrinterStateReason(329),//[PWG5100.9]
	    MARKER_FUSER_THERMISTOR_FAILURE = new PrinterStateReason(330),//[PWG5100.9]
	    MARKER_FUSER_TIMING_FAILURE = new PrinterStateReason(331),//[PWG5100.9]
	    MARKER_INK_ALMOST_EMPTY = new PrinterStateReason(332),//[PWG5100.9]
	    MARKER_INK_EMPTY = new PrinterStateReason(333),//[PWG5100.9]
	    MARKER_PRINT_RIBBON_ALMOST_EMPTY = new PrinterStateReason(334),//[PWG5100.9]
	    MARKER_PRINT_RIBBON_EMPTY = new PrinterStateReason(335),//[PWG5100.9]
	    MARKER_TONER_CARTRIDGE_MISSING = new PrinterStateReason(336),//[PWG5100.9]
	    MARKER_WASTE_INK_RECEPTACLE_ALMOST_FULL = new PrinterStateReason(337),//[PWG5100.9]
	    MARKER_WASTE_INK_RECEPTACLE_FULL = new PrinterStateReason(338),//[PWG5100.9]
	    MARKER_WASTE_TONER_RECEPTACLE_ALMOST_FULL = new PrinterStateReason(339),//[PWG5100.9]
	    MARKER_WASTE_TONER_RECEPTACLE_FULL = new PrinterStateReason(340),//[PWG5100.9]
	    MATERIAL_EMPTY = new PrinterStateReason(341),//[PWG5100.21]
	    MATERIAL_LOW = new PrinterStateReason(342),//[PWG5100.21]
	    MATERIAL_NEEDED = new PrinterStateReason(343),//[PWG5100.21]
	    MEDIA_PATH_CANNOT_DUPLEX_MEDIA_SELECTED = new PrinterStateReason(344),//[PWG5100.9]
	    MEDIA_PATH_MEDIA_TRAY_ALMOST_FULL = new PrinterStateReason(345),//[PWG5100.9]
	    MEDIA_PATH_MEDIA_TRAY_FULL = new PrinterStateReason(346),//[PWG5100.9]
	    MEDIA_PATH_MEDIA_TRAY_MISSING = new PrinterStateReason(347),//[PWG5100.9]
	    MOTOR_FAILURE = new PrinterStateReason(348),//[PWG5100.21]
	    OUTPUT_MAILBOX_SELECT_FAILURE = new PrinterStateReason(349),//[PWG5100.9]
	    PERFORATER_ADDED = new PrinterStateReason(350),//[PWG5100.9]
	    PERFORATER_ALMOST_EMPTY = new PrinterStateReason(351),//[PWG5100.9]
	    PERFORATER_ALMOST_FULL = new PrinterStateReason(352),//[PWG5100.9]
	    PERFORATER_AT_LIMIT = new PrinterStateReason(353),//[PWG5100.9]
	    PERFORATER_CLOSED = new PrinterStateReason(354),//[PWG5100.9]
	    PERFORATER_CONFIGURATION_CHANGE = new PrinterStateReason(355),//[PWG5100.9]
	    PERFORATER_COVER_CLOSED = new PrinterStateReason(356),//[PWG5100.9]
	    PERFORATER_COVER_OPEN = new PrinterStateReason(357),//[PWG5100.9]
	    PERFORATER_EMPTY = new PrinterStateReason(358),//[PWG5100.9]
	    PERFORATER_FULL = new PrinterStateReason(359),//[PWG5100.9]
	    PERFORATER_INTERLOCK_CLOSED = new PrinterStateReason(360),//[PWG5100.9]
	    PERFORATER_INTERLOCK_OPEN = new PrinterStateReason(361),//[PWG5100.9]
	    PERFORATER_JAM = new PrinterStateReason(362),//[PWG5100.9]
	    PERFORATER_LIFE_ALMOST_OVER = new PrinterStateReason(363),//[PWG5100.9]
	    PERFORATER_LIFE_OVER = new PrinterStateReason(364),//[PWG5100.9]
	    PERFORATER_MEMORY_EXHAUSTED = new PrinterStateReason(365),//[PWG5100.9]
	    PERFORATER_MISSING = new PrinterStateReason(366),//[PWG5100.9]
	    PERFORATER_MOTOR_FAILURE = new PrinterStateReason(367),//[PWG5100.9]
	    PERFORATER_NEAR_LIMIT = new PrinterStateReason(368),//[PWG5100.9]
	    PERFORATER_OFFLINE = new PrinterStateReason(369),//[PWG5100.9]
	    PERFORATER_OPENED = new PrinterStateReason(370),//[PWG5100.9]
	    PERFORATER_OVER_TEMPERATURE = new PrinterStateReason(371),//[PWG5100.9]
	    PERFORATER_POWER_SAVER = new PrinterStateReason(372),//[PWG5100.9]
	    PERFORATER_RECOVERABLE_FAILURE = new PrinterStateReason(373),//[PWG5100.9]
	    PERFORATER_RECOVERABLE_STORAGE = new PrinterStateReason(374),//[PWG5100.9]
	    PERFORATER_REMOVED = new PrinterStateReason(375),//[PWG5100.9]
	    PERFORATER_RESOURCE_ADDED = new PrinterStateReason(376),//[PWG5100.9]
	    PERFORATER_RESOURCE_REMOVED = new PrinterStateReason(377),//[PWG5100.9]
	    PERFORATER_THERMISTOR_FAILURE = new PrinterStateReason(378),//[PWG5100.9]
	    PERFORATER_TIMING_FAILURE = new PrinterStateReason(379),//[PWG5100.9]
	    PERFORATER_TURNED_OFF = new PrinterStateReason(380),//[PWG5100.9]
	    PERFORATER_TURNED_ON = new PrinterStateReason(381),//[PWG5100.9]
	    PERFORATER_UNDER_TEMPERATURE = new PrinterStateReason(382),//[PWG5100.9]
	    PERFORATER_UNRECOVERABLE_FAILURE = new PrinterStateReason(383),//[PWG5100.9]
	    PERFORATER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(384),//[PWG5100.9]
	    PERFORATER_WARMING_UP = new PrinterStateReason(385),//[PWG5100.9]
	    POWER_DOWN = new PrinterStateReason(386),//[PWG5100.9]
	    POWER_UP = new PrinterStateReason(387),//[PWG5100.9]
	    PRINTER_MANUAL_RESET = new PrinterStateReason(388),//[PWG5100.9]
	    PRINTER_NMS_RESET = new PrinterStateReason(389),//[PWG5100.9]
	    PRINTER_READY_TO_PRINT = new PrinterStateReason(390),//[PWG5100.9]
	    PUNCHER_ADDED = new PrinterStateReason(391),//[PWG5100.9]
	    PUNCHER_ALMOST_EMPTY = new PrinterStateReason(392),//[PWG5100.9]
	    PUNCHER_ALMOST_FULL = new PrinterStateReason(393),//[PWG5100.9]
	    PUNCHER_AT_LIMIT = new PrinterStateReason(394),//[PWG5100.9]
	    PUNCHER_CLOSED = new PrinterStateReason(395),//[PWG5100.9]
	    PUNCHER_CONFIGURATION_CHANGE = new PrinterStateReason(396),//[PWG5100.9]
	    PUNCHER_COVER_CLOSED = new PrinterStateReason(397),//[PWG5100.9]
	    PUNCHER_COVER_OPEN = new PrinterStateReason(398),//[PWG5100.9]
	    PUNCHER_EMPTY = new PrinterStateReason(399),//[PWG5100.9]
	    PUNCHER_FULL = new PrinterStateReason(400),//[PWG5100.9]
	    PUNCHER_INTERLOCK_CLOSED = new PrinterStateReason(401),//[PWG5100.9]
	    PUNCHER_INTERLOCK_OPEN = new PrinterStateReason(402),//[PWG5100.9]
	    PUNCHER_JAM = new PrinterStateReason(403),//[PWG5100.9]
	    PUNCHER_LIFE_ALMOST_OVER = new PrinterStateReason(404),//[PWG5100.9]
	    PUNCHER_LIFE_OVER = new PrinterStateReason(405),//[PWG5100.9]
	    PUNCHER_MEMORY_EXHAUSTED = new PrinterStateReason(406),//[PWG5100.9]
	    PUNCHER_MISSING = new PrinterStateReason(407),//[PWG5100.9]
	    PUNCHER_MOTOR_FAILURE = new PrinterStateReason(408),//[PWG5100.9]
	    PUNCHER_NEAR_LIMIT = new PrinterStateReason(409),//[PWG5100.9]
	    PUNCHER_OFFLINE = new PrinterStateReason(410),//[PWG5100.9]
	    PUNCHER_OPENED = new PrinterStateReason(411),//[PWG5100.9]
	    PUNCHER_OVER_TEMPERATURE = new PrinterStateReason(412),//[PWG5100.9]
	    PUNCHER_POWER_SAVER = new PrinterStateReason(413),//[PWG5100.9]
	    PUNCHER_RECOVERABLE_FAILURE = new PrinterStateReason(414),//[PWG5100.9]
	    PUNCHER_RECOVERABLE_STORAGE = new PrinterStateReason(415),//[PWG5100.9]
	    PUNCHER_REMOVED = new PrinterStateReason(416),//[PWG5100.9]
	    PUNCHER_RESOURCE_ADDED = new PrinterStateReason(417),//[PWG5100.9]
	    PUNCHER_RESOURCE_REMOVED = new PrinterStateReason(418),//[PWG5100.9]
	    PUNCHER_THERMISTOR_FAILURE = new PrinterStateReason(419),//[PWG5100.9]
	    PUNCHER_TIMING_FAILURE = new PrinterStateReason(420),//[PWG5100.9]
	    PUNCHER_TURNED_OFF = new PrinterStateReason(421),//[PWG5100.9]
	    PUNCHER_TURNED_ON = new PrinterStateReason(422),//[PWG5100.9]
	    PUNCHER_UNDER_TEMPERATURE = new PrinterStateReason(423),//[PWG5100.9]
	    PUNCHER_UNRECOVERABLE_FAILURE = new PrinterStateReason(424),//[PWG5100.9]
	    PUNCHER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(425),//[PWG5100.9]
	    PUNCHER_WARMING_UP = new PrinterStateReason(426),//[PWG5100.9]
	    SEPARATION_CUTTER_ADDED = new PrinterStateReason(427),//[PWG5100.9]
	    SEPARATION_CUTTER_ALMOST_EMPTY = new PrinterStateReason(428),//[PWG5100.9]
	    SEPARATION_CUTTER_ALMOST_FULL = new PrinterStateReason(429),//[PWG5100.9]
	    SEPARATION_CUTTER_AT_LIMIT = new PrinterStateReason(430),//[PWG5100.9]
	    SEPARATION_CUTTER_CLOSED = new PrinterStateReason(431),//[PWG5100.9]
	    SEPARATION_CUTTER_CONFIGURATION_CHANGE = new PrinterStateReason(432),//[PWG5100.9]
	    SEPARATION_CUTTER_COVER_CLOSED = new PrinterStateReason(433),//[PWG5100.9]
	    SEPARATION_CUTTER_COVER_OPEN = new PrinterStateReason(434),//[PWG5100.9]
	    SEPARATION_CUTTER_EMPTY = new PrinterStateReason(435),//[PWG5100.9]
	    SEPARATION_CUTTER_FULL = new PrinterStateReason(436),//[PWG5100.9]
	    SEPARATION_CUTTER_INTERLOCK_CLOSED = new PrinterStateReason(437),//[PWG5100.9]
	    SEPARATION_CUTTER_INTERLOCK_OPEN = new PrinterStateReason(438),//[PWG5100.9]
	    SEPARATION_CUTTER_JAM = new PrinterStateReason(439),//[PWG5100.9]
	    SEPARATION_CUTTER_LIFE_ALMOST_OVER = new PrinterStateReason(440),//[PWG5100.9]
	    SEPARATION_CUTTER_LIFE_OVER = new PrinterStateReason(441),//[PWG5100.9]
	    SEPARATION_CUTTER_MEMORY_EXHAUSTED = new PrinterStateReason(442),//[PWG5100.9]
	    SEPARATION_CUTTER_MISSING = new PrinterStateReason(443),//[PWG5100.9]
	    SEPARATION_CUTTER_MOTOR_FAILURE = new PrinterStateReason(444),//[PWG5100.9]
	    SEPARATION_CUTTER_NEAR_LIMIT = new PrinterStateReason(445),//[PWG5100.9]
	    SEPARATION_CUTTER_OFFLINE = new PrinterStateReason(446),//[PWG5100.9]
	    SEPARATION_CUTTER_OPENED = new PrinterStateReason(447),//[PWG5100.9]
	    SEPARATION_CUTTER_OVER_TEMPERATURE = new PrinterStateReason(448),//[PWG5100.9]
	    SEPARATION_CUTTER_POWER_SAVER = new PrinterStateReason(449),//[PWG5100.9]
	    SEPARATION_CUTTER_RECOVERABLE_FAILURE = new PrinterStateReason(450),//[PWG5100.9]
	    SEPARATION_CUTTER_RECOVERABLE_STORAGE = new PrinterStateReason(451),//[PWG5100.9]
	    SEPARATION_CUTTER_REMOVED = new PrinterStateReason(452),//[PWG5100.9]
	    SEPARATION_CUTTER_RESOURCE_ADDED = new PrinterStateReason(453),//[PWG5100.9]
	    SEPARATION_CUTTER_RESOURCE_REMOVED = new PrinterStateReason(454),//[PWG5100.9]
	    SEPARATION_CUTTER_THERMISTOR_FAILURE = new PrinterStateReason(455),//[PWG5100.9]
	    SEPARATION_CUTTER_TIMING_FAILURE = new PrinterStateReason(456),//[PWG5100.9]
	    SEPARATION_CUTTER_TURNED_OFF = new PrinterStateReason(457),//[PWG5100.9]
	    SEPARATION_CUTTER_TURNED_ON = new PrinterStateReason(458),//[PWG5100.9]
	    SEPARATION_CUTTER_UNDER_TEMPERATURE = new PrinterStateReason(459),//[PWG5100.9]
	    SEPARATION_CUTTER_UNRECOVERABLE_FAILURE = new PrinterStateReason(460),//[PWG5100.9]
	    SEPARATION_CUTTER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(461),//[PWG5100.9]
	    SEPARATION_CUTTER_WARMING_UP = new PrinterStateReason(462),//[PWG5100.9]
	    SHEET_ROTATOR_ADDED = new PrinterStateReason(463),//[PWG5100.9]
	    SHEET_ROTATOR_ALMOST_EMPTY = new PrinterStateReason(464),//[PWG5100.9]
	    SHEET_ROTATOR_ALMOST_FULL = new PrinterStateReason(465),//[PWG5100.9]
	    SHEET_ROTATOR_AT_LIMIT = new PrinterStateReason(466),//[PWG5100.9]
	    SHEET_ROTATOR_CLOSED = new PrinterStateReason(467),//[PWG5100.9]
	    SHEET_ROTATOR_CONFIGURATION_CHANGE = new PrinterStateReason(468),//[PWG5100.9]
	    SHEET_ROTATOR_COVER_CLOSED = new PrinterStateReason(469),//[PWG5100.9]
	    SHEET_ROTATOR_COVER_OPEN = new PrinterStateReason(470),//[PWG5100.9]
	    SHEET_ROTATOR_EMPTY = new PrinterStateReason(471),//[PWG5100.9]
	    SHEET_ROTATOR_FULL = new PrinterStateReason(472),//[PWG5100.9]
	    SHEET_ROTATOR_INTERLOCK_CLOSED = new PrinterStateReason(473),//[PWG5100.9]
	    SHEET_ROTATOR_INTERLOCK_OPEN = new PrinterStateReason(474),//[PWG5100.9]
	    SHEET_ROTATOR_JAM = new PrinterStateReason(475),//[PWG5100.9]
	    SHEET_ROTATOR_LIFE_ALMOST_OVER = new PrinterStateReason(476),//[PWG5100.9]
	    SHEET_ROTATOR_LIFE_OVER = new PrinterStateReason(477),//[PWG5100.9]
	    SHEET_ROTATOR_MEMORY_EXHAUSTED = new PrinterStateReason(478),//[PWG5100.9]
	    SHEET_ROTATOR_MISSING = new PrinterStateReason(479),//[PWG5100.9]
	    SHEET_ROTATOR_MOTOR_FAILURE = new PrinterStateReason(480),//[PWG5100.9]
	    SHEET_ROTATOR_NEAR_LIMIT = new PrinterStateReason(481),//[PWG5100.9]
	    SHEET_ROTATOR_OFFLINE = new PrinterStateReason(482),//[PWG5100.9]
	    SHEET_ROTATOR_OPENED = new PrinterStateReason(483),//[PWG5100.9]
	    SHEET_ROTATOR_OVER_TEMPERATURE = new PrinterStateReason(484),//[PWG5100.9]
	    SHEET_ROTATOR_POWER_SAVER = new PrinterStateReason(485),//[PWG5100.9]
	    SHEET_ROTATOR_RECOVERABLE_FAILURE = new PrinterStateReason(486),//[PWG5100.9]
	    SHEET_ROTATOR_RECOVERABLE_STORAGE = new PrinterStateReason(487),//[PWG5100.9]
	    SHEET_ROTATOR_REMOVED = new PrinterStateReason(488),//[PWG5100.9]
	    SHEET_ROTATOR_RESOURCE_ADDED = new PrinterStateReason(489),//[PWG5100.9]
	    SHEET_ROTATOR_RESOURCE_REMOVED = new PrinterStateReason(490),//[PWG5100.9]
	    SHEET_ROTATOR_THERMISTOR_FAILURE = new PrinterStateReason(491),//[PWG5100.9]
	    SHEET_ROTATOR_TIMING_FAILURE = new PrinterStateReason(492),//[PWG5100.9]
	    SHEET_ROTATOR_TURNED_OFF = new PrinterStateReason(493),//[PWG5100.9]
	    SHEET_ROTATOR_TURNED_ON = new PrinterStateReason(494),//[PWG5100.9]
	    SHEET_ROTATOR_UNDER_TEMPERATURE = new PrinterStateReason(495),//[PWG5100.9]
	    SHEET_ROTATOR_UNRECOVERABLE_FAILURE = new PrinterStateReason(496),//[PWG5100.9]
	    SHEET_ROTATOR_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(497),//[PWG5100.9]
	    SHEET_ROTATOR_WARMING_UP = new PrinterStateReason(498),//[PWG5100.9]
	    SLITTER_ADDED = new PrinterStateReason(499),//[PWG5100.9]
	    SLITTER_ALMOST_EMPTY = new PrinterStateReason(500),//[PWG5100.9]
	    SLITTER_ALMOST_FULL = new PrinterStateReason(501),//[PWG5100.9]
	    SLITTER_AT_LIMIT = new PrinterStateReason(502),//[PWG5100.9]
	    SLITTER_CLOSED = new PrinterStateReason(503),//[PWG5100.9]
	    SLITTER_CONFIGURATION_CHANGE = new PrinterStateReason(504),//[PWG5100.9]
	    SLITTER_COVER_CLOSED = new PrinterStateReason(505),//[PWG5100.9]
	    SLITTER_COVER_OPEN = new PrinterStateReason(506),//[PWG5100.9]
	    SLITTER_EMPTY = new PrinterStateReason(507),//[PWG5100.9]
	    SLITTER_FULL = new PrinterStateReason(508),//[PWG5100.9]
	    SLITTER_INTERLOCK_CLOSED = new PrinterStateReason(509),//[PWG5100.9]
	    SLITTER_INTERLOCK_OPEN = new PrinterStateReason(510),//[PWG5100.9]
	    SLITTER_JAM = new PrinterStateReason(511),//[PWG5100.9]
	    SLITTER_LIFE_ALMOST_OVER = new PrinterStateReason(512),//[PWG5100.9]
	    SLITTER_LIFE_OVER = new PrinterStateReason(513),//[PWG5100.9]
	    SLITTER_MEMORY_EXHAUSTED = new PrinterStateReason(514),//[PWG5100.9]
	    SLITTER_MISSING = new PrinterStateReason(515),//[PWG5100.9]
	    SLITTER_MOTOR_FAILURE = new PrinterStateReason(516),//[PWG5100.9]
	    SLITTER_NEAR_LIMIT = new PrinterStateReason(517),//[PWG5100.9]
	    SLITTER_OFFLINE = new PrinterStateReason(518),//[PWG5100.9]
	    SLITTER_OPENED = new PrinterStateReason(519),//[PWG5100.9]
	    SLITTER_OVER_TEMPERATURE = new PrinterStateReason(520),//[PWG5100.9]
	    SLITTER_POWER_SAVER = new PrinterStateReason(521),//[PWG5100.9]
	    SLITTER_RECOVERABLE_FAILURE = new PrinterStateReason(522),//[PWG5100.9]
	    SLITTER_RECOVERABLE_STORAGE = new PrinterStateReason(523),//[PWG5100.9]
	    SLITTER_REMOVED = new PrinterStateReason(524),//[PWG5100.9]
	    SLITTER_RESOURCE_ADDED = new PrinterStateReason(525),//[PWG5100.9]
	    SLITTER_RESOURCE_REMOVED = new PrinterStateReason(526),//[PWG5100.9]
	    SLITTER_THERMISTOR_FAILURE = new PrinterStateReason(527),//[PWG5100.9]
	    SLITTER_TIMING_FAILURE = new PrinterStateReason(528),//[PWG5100.9]
	    SLITTER_TURNED_OFF = new PrinterStateReason(529),//[PWG5100.9]
	    SLITTER_TURNED_ON = new PrinterStateReason(530),//[PWG5100.9]
	    SLITTER_UNDER_TEMPERATURE = new PrinterStateReason(531),//[PWG5100.9]
	    SLITTER_UNRECOVERABLE_FAILURE = new PrinterStateReason(532),//[PWG5100.9]
	    SLITTER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(533),//[PWG5100.9]
	    SLITTER_WARMING_UP = new PrinterStateReason(534),//[PWG5100.9]
	    STACKER_ADDED = new PrinterStateReason(535),//[PWG5100.9]
	    STACKER_ALMOST_EMPTY = new PrinterStateReason(536),//[PWG5100.9]
	    STACKER_ALMOST_FULL = new PrinterStateReason(537),//[PWG5100.9]
	    STACKER_AT_LIMIT = new PrinterStateReason(538),//[PWG5100.9]
	    STACKER_CLOSED = new PrinterStateReason(539),//[PWG5100.9]
	    STACKER_CONFIGURATION_CHANGE = new PrinterStateReason(540),//[PWG5100.9]
	    STACKER_COVER_CLOSED = new PrinterStateReason(541),//[PWG5100.9]
	    STACKER_COVER_OPEN = new PrinterStateReason(542),//[PWG5100.9]
	    STACKER_EMPTY = new PrinterStateReason(543),//[PWG5100.9]
	    STACKER_FULL = new PrinterStateReason(544),//[PWG5100.9]
	    STACKER_INTERLOCK_CLOSED = new PrinterStateReason(545),//[PWG5100.9]
	    STACKER_INTERLOCK_OPEN = new PrinterStateReason(546),//[PWG5100.9]
	    STACKER_JAM = new PrinterStateReason(547),//[PWG5100.9]
	    STACKER_LIFE_ALMOST_OVER = new PrinterStateReason(548),//[PWG5100.9]
	    STACKER_LIFE_OVER = new PrinterStateReason(549),//[PWG5100.9]
	    STACKER_MEMORY_EXHAUSTED = new PrinterStateReason(550),//[PWG5100.9]
	    STACKER_MISSING = new PrinterStateReason(551),//[PWG5100.9]
	    STACKER_MOTOR_FAILURE = new PrinterStateReason(552),//[PWG5100.9]
	    STACKER_NEAR_LIMIT = new PrinterStateReason(553),//[PWG5100.9]
	    STACKER_OFFLINE = new PrinterStateReason(554),//[PWG5100.9]
	    STACKER_OPENED = new PrinterStateReason(555),//[PWG5100.9]
	    STACKER_OVER_TEMPERATURE = new PrinterStateReason(556),//[PWG5100.9]
	    STACKER_POWER_SAVER = new PrinterStateReason(557),//[PWG5100.9]
	    STACKER_RECOVERABLE_FAILURE = new PrinterStateReason(558),//[PWG5100.9]
	    STACKER_RECOVERABLE_STORAGE = new PrinterStateReason(559),//[PWG5100.9]
	    STACKER_REMOVED = new PrinterStateReason(560),//[PWG5100.9]
	    STACKER_RESOURCE_ADDED = new PrinterStateReason(561),//[PWG5100.9]
	    STACKER_RESOURCE_REMOVED = new PrinterStateReason(562),//[PWG5100.9]
	    STACKER_THERMISTOR_FAILURE = new PrinterStateReason(563),//[PWG5100.9]
	    STACKER_TIMING_FAILURE = new PrinterStateReason(564),//[PWG5100.9]
	    STACKER_TURNED_OFF = new PrinterStateReason(565),//[PWG5100.9]
	    STACKER_TURNED_ON = new PrinterStateReason(566),//[PWG5100.9]
	    STACKER_UNDER_TEMPERATURE = new PrinterStateReason(567),//[PWG5100.9]
	    STACKER_UNRECOVERABLE_FAILURE = new PrinterStateReason(568),//[PWG5100.9]
	    STACKER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(569),//[PWG5100.9]
	    STACKER_WARMING_UP = new PrinterStateReason(570),//[PWG5100.9]
	    STAPLER_ADDED = new PrinterStateReason(571),//[PWG5100.9]
	    STAPLER_ALMOST_EMPTY = new PrinterStateReason(572),//[PWG5100.9]
	    STAPLER_ALMOST_FULL = new PrinterStateReason(573),//[PWG5100.9]
	    STAPLER_AT_LIMIT = new PrinterStateReason(574),//[PWG5100.9]
	    STAPLER_CLOSED = new PrinterStateReason(575),//[PWG5100.9]
	    STAPLER_CONFIGURATION_CHANGE = new PrinterStateReason(576),//[PWG5100.9]
	    STAPLER_COVER_CLOSED = new PrinterStateReason(577),//[PWG5100.9]
	    STAPLER_COVER_OPEN = new PrinterStateReason(578),//[PWG5100.9]
	    STAPLER_EMPTY = new PrinterStateReason(579),//[PWG5100.9]
	    STAPLER_FULL = new PrinterStateReason(580),//[PWG5100.9]
	    STAPLER_INTERLOCK_CLOSED = new PrinterStateReason(581),//[PWG5100.9]
	    STAPLER_INTERLOCK_OPEN = new PrinterStateReason(582),//[PWG5100.9]
	    STAPLER_JAM = new PrinterStateReason(583),//[PWG5100.9]
	    STAPLER_LIFE_ALMOST_OVER = new PrinterStateReason(584),//[PWG5100.9]
	    STAPLER_LIFE_OVER = new PrinterStateReason(585),//[PWG5100.9]
	    STAPLER_MEMORY_EXHAUSTED = new PrinterStateReason(586),//[PWG5100.9]
	    STAPLER_MISSING = new PrinterStateReason(587),//[PWG5100.9]
	    STAPLER_MOTOR_FAILURE = new PrinterStateReason(588),//[PWG5100.9]
	    STAPLER_NEAR_LIMIT = new PrinterStateReason(589),//[PWG5100.9]
	    STAPLER_OFFLINE = new PrinterStateReason(590),//[PWG5100.9]
	    STAPLER_OPENED = new PrinterStateReason(591),//[PWG5100.9]
	    STAPLER_OVER_TEMPERATURE = new PrinterStateReason(592),//[PWG5100.9]
	    STAPLER_POWER_SAVER = new PrinterStateReason(593),//[PWG5100.9]
	    STAPLER_RECOVERABLE_FAILURE = new PrinterStateReason(594),//[PWG5100.9]
	    STAPLER_RECOVERABLE_STORAGE = new PrinterStateReason(595),//[PWG5100.9]
	    STAPLER_REMOVED = new PrinterStateReason(596),//[PWG5100.9]
	    STAPLER_RESOURCE_ADDED = new PrinterStateReason(597),//[PWG5100.9]
	    STAPLER_RESOURCE_REMOVED = new PrinterStateReason(598),//[PWG5100.9]
	    STAPLER_THERMISTOR_FAILURE = new PrinterStateReason(599),//[PWG5100.9]
	    STAPLER_TIMING_FAILURE = new PrinterStateReason(600),//[PWG5100.9]
	    STAPLER_TURNED_OFF = new PrinterStateReason(601),//[PWG5100.9]
	    STAPLER_TURNED_ON = new PrinterStateReason(602),//[PWG5100.9]
	    STAPLER_UNDER_TEMPERATURE = new PrinterStateReason(603),//[PWG5100.9]
	    STAPLER_UNRECOVERABLE_FAILURE = new PrinterStateReason(604),//[PWG5100.9]
	    STAPLER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(605),//[PWG5100.9]
	    STAPLER_WARMING_UP = new PrinterStateReason(606),//[PWG5100.9]
	    STITCHER_ADDED = new PrinterStateReason(607),//[PWG5100.9]
	    STITCHER_ALMOST_EMPTY = new PrinterStateReason(608),//[PWG5100.9]
	    STITCHER_ALMOST_FULL = new PrinterStateReason(609),//[PWG5100.9]
	    STITCHER_AT_LIMIT = new PrinterStateReason(610),//[PWG5100.9]
	    STITCHER_CLOSED = new PrinterStateReason(611),//[PWG5100.9]
	    STITCHER_CONFIGURATION_CHANGE = new PrinterStateReason(612),//[PWG5100.9]
	    STITCHER_COVER_CLOSED = new PrinterStateReason(613),//[PWG5100.9]
	    STITCHER_COVER_OPEN = new PrinterStateReason(614),//[PWG5100.9]
	    STITCHER_EMPTY = new PrinterStateReason(615),//[PWG5100.9]
	    STITCHER_FULL = new PrinterStateReason(616),//[PWG5100.9]
	    STITCHER_INTERLOCK_CLOSED = new PrinterStateReason(617),//[PWG5100.9]
	    STITCHER_INTERLOCK_OPEN = new PrinterStateReason(618),//[PWG5100.9]
	    STITCHER_JAM = new PrinterStateReason(619),//[PWG5100.9]
	    STITCHER_LIFE_ALMOST_OVER = new PrinterStateReason(620),//[PWG5100.9]
	    STITCHER_LIFE_OVER = new PrinterStateReason(621),//[PWG5100.9]
	    STITCHER_MEMORY_EXHAUSTED = new PrinterStateReason(622),//[PWG5100.9]
	    STITCHER_MISSING = new PrinterStateReason(623),//[PWG5100.9]
	    STITCHER_MOTOR_FAILURE = new PrinterStateReason(624),//[PWG5100.9]
	    STITCHER_NEAR_LIMIT = new PrinterStateReason(625),//[PWG5100.9]
	    STITCHER_OFFLINE = new PrinterStateReason(626),//[PWG5100.9]
	    STITCHER_OPENED = new PrinterStateReason(627),//[PWG5100.9]
	    STITCHER_OVER_TEMPERATURE = new PrinterStateReason(628),//[PWG5100.9]
	    STITCHER_POWER_SAVER = new PrinterStateReason(629),//[PWG5100.9]
	    STITCHER_RECOVERABLE_FAILURE = new PrinterStateReason(630),//[PWG5100.9]
	    STITCHER_RECOVERABLE_STORAGE = new PrinterStateReason(631),//[PWG5100.9]
	    STITCHER_REMOVED = new PrinterStateReason(632),//[PWG5100.9]
	    STITCHER_RESOURCE_ADDED = new PrinterStateReason(633),//[PWG5100.9]
	    STITCHER_RESOURCE_REMOVED = new PrinterStateReason(634),//[PWG5100.9]
	    STITCHER_THERMISTOR_FAILURE = new PrinterStateReason(635),//[PWG5100.9]
	    STITCHER_TIMING_FAILURE = new PrinterStateReason(636),//[PWG5100.9]
	    STITCHER_TURNED_OFF = new PrinterStateReason(637),//[PWG5100.9]
	    STITCHER_TURNED_ON = new PrinterStateReason(638),//[PWG5100.9]
	    STITCHER_UNDER_TEMPERATURE = new PrinterStateReason(639),//[PWG5100.9]
	    STITCHER_UNRECOVERABLE_FAILURE = new PrinterStateReason(640),//[PWG5100.9]
	    STITCHER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(641),//[PWG5100.9]
	    STITCHER_WARMING_UP = new PrinterStateReason(642),//[PWG5100.9]
	    SUBUNIT_ADDED = new PrinterStateReason(643),//[PWG5100.9]
	    SUBUNIT_ALMOST_EMPTY = new PrinterStateReason(644),//[PWG5100.9]
	    SUBUNIT_ALMOST_FULL = new PrinterStateReason(645),//[PWG5100.9]
	    SUBUNIT_AT_LIMIT = new PrinterStateReason(646),//[PWG5100.9]
	    SUBUNIT_CLOSED = new PrinterStateReason(647),//[PWG5100.9]
	    SUBUNIT_EMPTY = new PrinterStateReason(648),//[PWG5100.9]
	    SUBUNIT_FULL = new PrinterStateReason(649),//[PWG5100.9]
	    SUBUNIT_LIFE_ALMOST_OVER = new PrinterStateReason(650),//[PWG5100.9]
	    SUBUNIT_LIFE_OVER = new PrinterStateReason(651),//[PWG5100.9]
	    SUBUNIT_MEMORY_EXHAUSTED = new PrinterStateReason(652),//[PWG5100.9]
	    SUBUNIT_MISSING = new PrinterStateReason(653),//[PWG5100.9]
	    SUBUNIT_MOTOR_FAILURE = new PrinterStateReason(654),//[PWG5100.9]
	    SUBUNIT_NEAR_LIMIT = new PrinterStateReason(655),//[PWG5100.9]
	    SUBUNIT_OFFLINE = new PrinterStateReason(656),//[PWG5100.9]
	    SUBUNIT_OPENED = new PrinterStateReason(657),//[PWG5100.9]
	    SUBUNIT_OVER_TEMPERATURE = new PrinterStateReason(658),//[PWG5100.9]
	    SUBUNIT_POWER_SAVER = new PrinterStateReason(659),//[PWG5100.9]
	    SUBUNIT_RECOVERABLE_FAILURE = new PrinterStateReason(660),//[PWG5100.9]
	    SUBUNIT_RECOVERABLE_STORAGE = new PrinterStateReason(661),//[PWG5100.9]
	    SUBUNIT_REMOVED = new PrinterStateReason(662),//[PWG5100.9]
	    SUBUNIT_RESOURCE_ADDED = new PrinterStateReason(663),//[PWG5100.9]
	    SUBUNIT_RESOURCE_REMOVED = new PrinterStateReason(664),//[PWG5100.9]
	    SUBUNIT_THERMISTOR_FAILURE = new PrinterStateReason(665),//[PWG5100.9]
	    SUBUNIT_TIMING_FAILURE = new PrinterStateReason(666),//[PWG5100.9]
	    SUBUNIT_TURNED_OFF = new PrinterStateReason(667),//[PWG5100.9]
	    SUBUNIT_TURNED_ON = new PrinterStateReason(668),//[PWG5100.9]
	    SUBUNIT_UNDER_TEMPERATURE = new PrinterStateReason(669),//[PWG5100.9]
	    SUBUNIT_UNRECOVERABLE_FAILURE = new PrinterStateReason(670),//[PWG5100.9]
	    SUBUNIT_UNRECOVERABLE_STORAGE = new PrinterStateReason(671),//[PWG5100.9]
	    SUBUNIT_WARMING_UP = new PrinterStateReason(672),//[PWG5100.9]
	    TRIMMER_ADDED = new PrinterStateReason(673),//[PWG5100.9]
	    TRIMMER_ALMOST_EMPTY = new PrinterStateReason(675),//[PWG5100.9]
	    TRIMMER_ALMOST_FULL = new PrinterStateReason(677),//[PWG5100.9]
	    TRIMMER_AT_LIMIT = new PrinterStateReason(679),//[PWG5100.9]
	    TRIMMER_CLOSED = new PrinterStateReason(681),//[PWG5100.9]
	    TRIMMER_CONFIGURATION_CHANGE = new PrinterStateReason(683),//[PWG5100.9]
	    TRIMMER_COVER_CLOSED = new PrinterStateReason(685),//[PWG5100.9]
	    TRIMMER_COVER_OPEN = new PrinterStateReason(687),//[PWG5100.9]
	    TRIMMER_EMPTY = new PrinterStateReason(689),//[PWG5100.9]
	    TRIMMER_FULL = new PrinterStateReason(691),//[PWG5100.9]
	    TRIMMER_INTERLOCK_CLOSED = new PrinterStateReason(693),//[PWG5100.9]
	    TRIMMER_INTERLOCK_OPEN = new PrinterStateReason(695),//[PWG5100.9]
	    TRIMMER_JAM = new PrinterStateReason(697),//[PWG5100.9]
	    TRIMMER_LIFE_ALMOST_OVER = new PrinterStateReason(699),//[PWG5100.9]
	    TRIMMER_LIFE_OVER = new PrinterStateReason(701),//[PWG5100.9]
	    TRIMMER_MEMORY_EXHAUSTED = new PrinterStateReason(703),//[PWG5100.9]
	    TRIMMER_MISSING = new PrinterStateReason(705),//[PWG5100.9]
	    TRIMMER_MOTOR_FAILURE = new PrinterStateReason(707),//[PWG5100.9]
	    TRIMMER_NEAR_LIMIT = new PrinterStateReason(709),//[PWG5100.9]
	    TRIMMER_OFFLINE = new PrinterStateReason(711),//[PWG5100.9]
	    TRIMMER_OPENED = new PrinterStateReason(713),//[PWG5100.9]
	    TRIMMER_OVER_TEMPERATURE = new PrinterStateReason(715),//[PWG5100.9]
	    TRIMMER_POWER_SAVER = new PrinterStateReason(717),//[PWG5100.9]
	    TRIMMER_RECOVERABLE_FAILURE = new PrinterStateReason(719),//[PWG5100.9]
	    TRIMMER_RECOVERABLE_STORAGE = new PrinterStateReason(721),//[PWG5100.9]
	    TRIMMER_REMOVED = new PrinterStateReason(722),//[PWG5100.9]
	    TRIMMER_RESOURCE_ADDED = new PrinterStateReason(723),//[PWG5100.9]
	    TRIMMER_RESOURCE_REMOVED = new PrinterStateReason(724),//[PWG5100.9]
	    TRIMMER_THERMISTOR_FAILURE = new PrinterStateReason(725),//[PWG5100.9]
	    TRIMMER_TIMING_FAILURE = new PrinterStateReason(726),//[PWG5100.9]
	    TRIMMER_TURNED_OFF = new PrinterStateReason(727),//[PWG5100.9]
	    TRIMMER_TURNED_ON = new PrinterStateReason(728),//[PWG5100.9]
	    TRIMMER_UNDER_TEMPERATURE = new PrinterStateReason(729),//[PWG5100.9]
	    TRIMMER_UNRECOVERABLE_FAILURE = new PrinterStateReason(730),//[PWG5100.9]
	    TRIMMER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(731),//[PWG5100.9]
	    TRIMMER_WARMING_UP = new PrinterStateReason(732),//[PWG5100.9]
	    UNKNOWN = new PrinterStateReason(733),//[PWG5100.9]
	    WRAPPER_ADDED = new PrinterStateReason(734),//[PWG5100.9]
	    WRAPPER_ALMOST_EMPTY = new PrinterStateReason(735),//[PWG5100.9]
	    WRAPPER_ALMOST_FULL = new PrinterStateReason(736),//[PWG5100.9]
	    WRAPPER_AT_LIMIT = new PrinterStateReason(737),//[PWG5100.9]
	    WRAPPER_CLOSED = new PrinterStateReason(738),//[PWG5100.9]
	    WRAPPER_CONFIGURATION_CHANGE = new PrinterStateReason(739),//[PWG5100.9]
	    WRAPPER_COVER_CLOSED = new PrinterStateReason(740),//[PWG5100.9]
	    WRAPPER_COVER_OPEN = new PrinterStateReason(741),//[PWG5100.9]
	    WRAPPER_EMPTY = new PrinterStateReason(742),//[PWG5100.9]
	    WRAPPER_FULL = new PrinterStateReason(743),//[PWG5100.9]
	    WRAPPER_INTERLOCK_CLOSED = new PrinterStateReason(744),//[PWG5100.9]
	    WRAPPER_INTERLOCK_OPEN = new PrinterStateReason(745),//[PWG5100.9]
	    WRAPPER_JAM = new PrinterStateReason(746),//[PWG5100.9]
	    WRAPPER_LIFE_ALMOST_OVER = new PrinterStateReason(747),//[PWG5100.9]
	    WRAPPER_LIFE_OVER = new PrinterStateReason(748),//[PWG5100.9]
	    WRAPPER_MEMORY_EXHAUSTED = new PrinterStateReason(749),//[PWG5100.9]
	    WRAPPER_MISSING = new PrinterStateReason(750),//[PWG5100.9]
	    WRAPPER_MOTOR_FAILURE = new PrinterStateReason(751),//[PWG5100.9]
	    WRAPPER_NEAR_LIMIT = new PrinterStateReason(752),//[PWG5100.9]
	    WRAPPER_OFFLINE = new PrinterStateReason(753),//[PWG5100.9]
	    WRAPPER_OPENED = new PrinterStateReason(754),//[PWG5100.9]
	    WRAPPER_OVER_TEMPERATURE = new PrinterStateReason(755),//[PWG5100.9]
	    WRAPPER_POWER_SAVER = new PrinterStateReason(756),//[PWG5100.9]
	    WRAPPER_RECOVERABLE_FAILURE = new PrinterStateReason(757),//[PWG5100.9]
	    WRAPPER_RECOVERABLE_STORAGE = new PrinterStateReason(758),//[PWG5100.9]
	    WRAPPER_REMOVED = new PrinterStateReason(759),//[PWG5100.9]
	    WRAPPER_RESOURCE_ADDED = new PrinterStateReason(760),//[PWG5100.9]
	    WRAPPER_RESOURCE_REMOVED = new PrinterStateReason(761),//[PWG5100.9]
	    WRAPPER_THERMISTOR_FAILURE = new PrinterStateReason(762),//[PWG5100.9]
	    WRAPPER_TIMING_FAILURE = new PrinterStateReason(763),//[PWG5100.9]
	    WRAPPER_TURNED_OFF = new PrinterStateReason(764),//[PWG5100.9]
	    WRAPPER_TURNED_ON = new PrinterStateReason(765),//[PWG5100.9]
	    WRAPPER_UNDER_TEMPERATURE = new PrinterStateReason(766),//[PWG5100.9]
	    WRAPPER_UNRECOVERABLE_FAILURE = new PrinterStateReason(767),//[PWG5100.9]
	    WRAPPER_UNRECOVERABLE_STORAGE_ERROR = new PrinterStateReason(768),//[PWG5100.9]
	    WRAPPER_WARMING_UP = new PrinterStateReason(769);//[PWG5100.9]

    protected PrinterStateReason(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "alert-removal-of-binary-change-entry",
	    "bander-added",
	    "bander-almost-empty",
	    "bander-almost-full",
	    "bander-at-limit",
	    "bander-closed",
	    "bander-configuration-change",
	    "bander-cover-closed",
	    "bander-cover-open",
	    "bander-empty",
	    "bander-full",
	    "bander-interlock-closed",
	    "bander-interlock-open",
	    "bander-jam",
	    "bander-life-almost-over",
	    "bander-life-over",
	    "bander-memory-exhausted",
	    "bander-missing",
	    "bander-motor-failure",
	    "bander-near-limit",
	    "bander-offline",
	    "bander-opened",
	    "bander-over-temperature",
	    "bander-power-saver",
	    "bander-recoverable-failure",
	    "bander-recoverable-storage",
	    "bander-removed",
	    "bander-resource-added",
	    "bander-resource-removed",
	    "bander-thermistor-failure",
	    "bander-timing-failure",
	    "bander-turned-off",
	    "bander-turned-on",
	    "bander-under-temperature",
	    "bander-unrecoverable-failure",
	    "bander-unrecoverable-storage-error",
	    "bander-warming-up",
	    "binder-added",
	    "binder-almost-empty",
	    "binder-almost-full",
	    "binder-at-limit",
	    "binder-closed",
	    "binder-configuration-change",
	    "binder-cover-closed",
	    "binder-cover-open",
	    "binder-empty",
	    "binder-full",
	    "binder-interlock-closed",
	    "binder-interlock-open",
	    "binder-jam",
	    "binder-life-almost-over",
	    "binder-life-over",
	    "binder-memory-exhausted",
	    "binder-missing",
	    "binder-motor-failure",
	    "binder-near-limit",
	    "binder-offline",
	    "binder-opened",
	    "binder-over-temperature",
	    "binder-power-saver",
	    "binder-recoverable-failure",
	    "binder-recoverable-storage",
	    "binder-removed",
	    "binder-resource-added",
	    "binder-resource-removed",
	    "binder-thermistor-failure",
	    "binder-timing-failure",
	    "binder-turned-off",
	    "binder-turned-on",
	    "binder-under-temperature",
	    "binder-unrecoverable-failure",
	    "binder-unrecoverable-storage-error",
	    "binder-warming-up",
	    "camera-failure",
	    "chamber-cooling",
	    "chamber-heating",
	    "chamber-temperature-high",
	    "chamber-temperature-low",
	    "cleaner-life-almost-over",
	    "cleaner-life-over",
	    "configuration-change",
	    "deactivated",
	    "die-cutter-added",
	    "die-cutter-almost-empty",
	    "die-cutter-almost-full",
	    "die-cutter-at-limit",
	    "die-cutter-closed",
	    "die-cutter-configuration-change",
	    "die-cutter-cover-closed",
	    "die-cutter-cover-open",
	    "die-cutter-empty",
	    "die-cutter-full",
	    "die-cutter-interlock-closed",
	    "die-cutter-interlock-open",
	    "die-cutter-jam",
	    "die-cutter-life-almost-over",
	    "die-cutter-life-over",
	    "die-cutter-memory-exhausted",
	    "die-cutter-missing",
	    "die-cutter-motor-failure",
	    "die-cutter-near-limit",
	    "die-cutter-offline",
	    "die-cutter-opened",
	    "die-cutter-over-temperature",
	    "die-cutter-power-saver",
	    "die-cutter-recoverable-failure",
	    "die-cutter-recoverable-storage",
	    "die-cutter-removed",
	    "die-cutter-resource-added",
	    "die-cutter-resource-removed",
	    "die-cutter-thermistor-failure",
	    "die-cutter-timing-failure",
	    "die-cutter-turned-off",
	    "die-cutter-turned-on",
	    "die-cutter-under-temperature",
	    "die-cutter-unrecoverable-failure",
	    "die-cutter-unrecoverable-storage-error",
	    "die-cutter-warming-up",
	    "extruder-cooling",
	    "extruder-failure",
	    "extruder-heating",
	    "extruder-jam",
	    "extruder-temperature-high",
	    "extruder-temperature-low",
	    "fan-failure",
	    "folder-added",
	    "folder-almost-empty",
	    "folder-almost-full",
	    "folder-at-limit",
	    "folder-closed",
	    "folder-configuration-change",
	    "folder-cover-closed",
	    "folder-cover-open",
	    "folder-empty",
	    "folder-full",
	    "folder-interlock-closed",
	    "folder-interlock-open",
	    "folder-jam",
	    "folder-life-almost-over",
	    "folder-life-over",
	    "folder-memory-exhausted",
	    "folder-missing",
	    "folder-motor-failure",
	    "folder-near-limit",
	    "folder-offline",
	    "folder-opened",
	    "folder-over-temperature",
	    "folder-power-saver",
	    "folder-recoverable-failure",
	    "folder-recoverable-storage",
	    "folder-removed",
	    "folder-resource-added",
	    "folder-resource-removed",
	    "folder-thermistor-failure",
	    "folder-timing-failure",
	    "folder-turned-off",
	    "folder-turned-on",
	    "folder-under-temperature",
	    "folder-unrecoverable-failure",
	    "folder-unrecoverable-storage-error",
	    "folder-warming-up",
	    "hold-new-jobs",
	    "identify-printer-requested",
	    "imprinter-added",
	    "imprinter-almost-empty",
	    "imprinter-almost-full",
	    "imprinter-at-limit",
	    "imprinter-closed",
	    "imprinter-configuration-change",
	    "imprinter-cover-closed",
	    "imprinter-cover-open",
	    "imprinter-empty",
	    "imprinter-full",
	    "imprinter-interlock-closed",
	    "imprinter-interlock-open",
	    "imprinter-jam",
	    "imprinter-life-almost-over",
	    "imprinter-life-over",
	    "imprinter-memory-exhausted",
	    "imprinter-missing",
	    "imprinter-motor-failure",
	    "imprinter-near-limit",
	    "imprinter-offline",
	    "imprinter-opened",
	    "imprinter-over-temperature",
	    "imprinter-power-saver",
	    "imprinter-recoverable-failure",
	    "imprinter-recoverable-storage",
	    "imprinter-removed",
	    "imprinter-resource-added",
	    "imprinter-resource-removed",
	    "imprinter-thermistor-failure",
	    "imprinter-timing-failure",
	    "imprinter-turned-off",
	    "imprinter-turned-on",
	    "imprinter-under-temperature",
	    "imprinter-unrecoverable-failure",
	    "imprinter-unrecoverable-storage-error",
	    "imprinter-warming-up",
	    "input-cannot-feed-size-selected",
	    "input-manual-input-request",
	    "input-media-color-change",
	    "input-media-form-parts-change",
	    "input-media-size-change",
	    "input-media-type-change",
	    "input-media-weight-change",
	    "input-tray-elevation-failure",
	    "input-tray-position-failure",
	    "inserter-added",
	    "inserter-almost-empty",
	    "inserter-almost-full",
	    "inserter-at-limit",
	    "inserter-closed",
	    "inserter-configuration-change",
	    "inserter-cover-closed",
	    "inserter-cover-open",
	    "inserter-empty",
	    "inserter-full",
	    "inserter-interlock-closed",
	    "inserter-interlock-open",
	    "inserter-jam",
	    "inserter-life-almost-over",
	    "inserter-life-over",
	    "inserter-memory-exhausted",
	    "inserter-missing",
	    "inserter-motor-failure",
	    "inserter-near-limit",
	    "inserter-offline",
	    "inserter-opened",
	    "inserter-over-temperature",
	    "inserter-power-saver",
	    "inserter-recoverable-failure",
	    "inserter-recoverable-storage",
	    "inserter-removed",
	    "inserter-resource-added",
	    "inserter-resource-removed",
	    "inserter-thermistor-failure",
	    "inserter-timing-failure",
	    "inserter-turned-off",
	    "inserter-turned-on",
	    "inserter-under-temperature",
	    "inserter-unrecoverable-failure",
	    "inserter-unrecoverable-storage-error",
	    "inserter-warming-up",
	    "interlock-closed",
	    "interpreter-cartridge-added",
	    "interpreter-cartridge-deleted",
	    "interpreter-complex-page-encountered",
	    "interpreter-memory-decrease",
	    "interpreter-memory-increase",
	    "interpreter-resource-added",
	    "interpreter-resource-deleted",
	    "lamp-at-eol",
	    "lamp-failure",
	    "lamp-near-eol",
	    "laser-at-eol",
	    "laser-failure",
	    "laser-near-eol",
	    "make-envelope-added",
	    "make-envelope-almost-empty",
	    "make-envelope-almost-full",
	    "make-envelope-at-limit",
	    "make-envelope-closed",
	    "make-envelope-configuration-change",
	    "make-envelope-cover-closed",
	    "make-envelope-cover-open",
	    "make-envelope-empty",
	    "make-envelope-full",
	    "make-envelope-interlock-closed",
	    "make-envelope-interlock-open",
	    "make-envelope-jam",
	    "make-envelope-life-almost-over",
	    "make-envelope-life-over",
	    "make-envelope-memory-exhausted",
	    "make-envelope-missing",
	    "make-envelope-motor-failure",
	    "make-envelope-near-limit",
	    "make-envelope-offline",
	    "make-envelope-opened",
	    "make-envelope-over-temperature",
	    "make-envelope-power-saver",
	    "make-envelope-recoverable-failure",
	    "make-envelope-recoverable-storage",
	    "make-envelope-removed",
	    "make-envelope-resource-added",
	    "make-envelope-resource-removed",
	    "make-envelope-thermistor-failure",
	    "make-envelope-timing-failure",
	    "make-envelope-turned-off",
	    "make-envelope-turned-on",
	    "make-envelope-under-temperature",
	    "make-envelope-unrecoverable-failure",
	    "make-envelope-unrecoverable-storage-error",
	    "make-envelope-warming-up",
	    "marker-adjusting-print-quality",
	    "marker-developer-almost-empty",
	    "marker-developer-empty",
	    "marker-fuser-thermistor-failure",
	    "marker-fuser-timing-failure",
	    "marker-ink-almost-empty",
	    "marker-ink-empty",
	    "marker-print-ribbon-almost-empty",
	    "marker-print-ribbon-empty",
	    "marker-toner-cartridge-missing",
	    "marker-waste-ink-receptacle-almost-full",
	    "marker-waste-ink-receptacle-full",
	    "marker-waste-toner-receptacle-almost-full",
	    "marker-waste-toner-receptacle-full",
	    "material-empty",
	    "material-low",
	    "material-needed",
	    "media-path-cannot-duplex-media-selected",
	    "media-path-media-tray-almost-full",
	    "media-path-media-tray-full",
	    "media-path-media-tray-missing",
	    "motor-failure",
	    "output-mailbox-select-failure",
	    "perforater-added",
	    "perforater-almost-empty",
	    "perforater-almost-full",
	    "perforater-at-limit",
	    "perforater-closed",
	    "perforater-configuration-change",
	    "perforater-cover-closed",
	    "perforater-cover-open",
	    "perforater-empty",
	    "perforater-full",
	    "perforater-interlock-closed",
	    "perforater-interlock-open",
	    "perforater-jam",
	    "perforater-life-almost-over",
	    "perforater-life-over",
	    "perforater-memory-exhausted",
	    "perforater-missing",
	    "perforater-motor-failure",
	    "perforater-near-limit",
	    "perforater-offline",
	    "perforater-opened",
	    "perforater-over-temperature",
	    "perforater-power-saver",
	    "perforater-recoverable-failure",
	    "perforater-recoverable-storage",
	    "perforater-removed",
	    "perforater-resource-added",
	    "perforater-resource-removed",
	    "perforater-thermistor-failure",
	    "perforater-timing-failure",
	    "perforater-turned-off",
	    "perforater-turned-on",
	    "perforater-under-temperature",
	    "perforater-unrecoverable-failure",
	    "perforater-unrecoverable-storage-error",
	    "perforater-warming-up",
	    "power-down",
	    "power-up",
	    "printer-manual-reset",
	    "printer-nms-reset",
	    "printer-ready-to-print",
	    "puncher-added",
	    "puncher-almost-empty",
	    "puncher-almost-full",
	    "puncher-at-limit",
	    "puncher-closed",
	    "puncher-configuration-change",
	    "puncher-cover-closed",
	    "puncher-cover-open",
	    "puncher-empty",
	    "puncher-full",
	    "puncher-interlock-closed",
	    "puncher-interlock-open",
	    "puncher-jam",
	    "puncher-life-almost-over",
	    "puncher-life-over",
	    "puncher-memory-exhausted",
	    "puncher-missing",
	    "puncher-motor-failure",
	    "puncher-near-limit",
	    "puncher-offline",
	    "puncher-opened",
	    "puncher-over-temperature",
	    "puncher-power-saver",
	    "puncher-recoverable-failure",
	    "puncher-recoverable-storage",
	    "puncher-removed",
	    "puncher-resource-added",
	    "puncher-resource-removed",
	    "puncher-thermistor-failure",
	    "puncher-timing-failure",
	    "puncher-turned-off",
	    "puncher-turned-on",
	    "puncher-under-temperature",
	    "puncher-unrecoverable-failure",
	    "puncher-unrecoverable-storage-error",
	    "puncher-warming-up",
	    "separation-cutter-added",
	    "separation-cutter-almost-empty",
	    "separation-cutter-almost-full",
	    "separation-cutter-at-limit",
	    "separation-cutter-closed",
	    "separation-cutter-configuration-change",
	    "separation-cutter-cover-closed",
	    "separation-cutter-cover-open",
	    "separation-cutter-empty",
	    "separation-cutter-full",
	    "separation-cutter-interlock-closed",
	    "separation-cutter-interlock-open",
	    "separation-cutter-jam",
	    "separation-cutter-life-almost-over",
	    "separation-cutter-life-over",
	    "separation-cutter-memory-exhausted",
	    "separation-cutter-missing",
	    "separation-cutter-motor-failure",
	    "separation-cutter-near-limit",
	    "separation-cutter-offline",
	    "separation-cutter-opened",
	    "separation-cutter-over-temperature",
	    "separation-cutter-power-saver",
	    "separation-cutter-recoverable-failure",
	    "separation-cutter-recoverable-storage",
	    "separation-cutter-removed",
	    "separation-cutter-resource-added",
	    "separation-cutter-resource-removed",
	    "separation-cutter-thermistor-failure",
	    "separation-cutter-timing-failure",
	    "separation-cutter-turned-off",
	    "separation-cutter-turned-on",
	    "separation-cutter-under-temperature",
	    "separation-cutter-unrecoverable-failure",
	    "separation-cutter-unrecoverable-storage-error",
	    "separation-cutter-warming-up",
	    "sheet-rotator-added",
	    "sheet-rotator-almost-empty",
	    "sheet-rotator-almost-full",
	    "sheet-rotator-at-limit",
	    "sheet-rotator-closed",
	    "sheet-rotator-configuration-change",
	    "sheet-rotator-cover-closed",
	    "sheet-rotator-cover-open",
	    "sheet-rotator-empty",
	    "sheet-rotator-full",
	    "sheet-rotator-interlock-closed",
	    "sheet-rotator-interlock-open",
	    "sheet-rotator-jam",
	    "sheet-rotator-life-almost-over",
	    "sheet-rotator-life-over",
	    "sheet-rotator-memory-exhausted",
	    "sheet-rotator-missing",
	    "sheet-rotator-motor-failure",
	    "sheet-rotator-near-limit",
	    "sheet-rotator-offline",
	    "sheet-rotator-opened",
	    "sheet-rotator-over-temperature",
	    "sheet-rotator-power-saver",
	    "sheet-rotator-recoverable-failure",
	    "sheet-rotator-recoverable-storage",
	    "sheet-rotator-removed",
	    "sheet-rotator-resource-added",
	    "sheet-rotator-resource-removed",
	    "sheet-rotator-thermistor-failure",
	    "sheet-rotator-timing-failure",
	    "sheet-rotator-turned-off",
	    "sheet-rotator-turned-on",
	    "sheet-rotator-under-temperature",
	    "sheet-rotator-unrecoverable-failure",
	    "sheet-rotator-unrecoverable-storage-error",
	    "sheet-rotator-warming-up",
	    "slitter-added",
	    "slitter-almost-empty",
	    "slitter-almost-full",
	    "slitter-at-limit",
	    "slitter-closed",
	    "slitter-configuration-change",
	    "slitter-cover-closed",
	    "slitter-cover-open",
	    "slitter-empty",
	    "slitter-full",
	    "slitter-interlock-closed",
	    "slitter-interlock-open",
	    "slitter-jam",
	    "slitter-life-almost-over",
	    "slitter-life-over",
	    "slitter-memory-exhausted",
	    "slitter-missing",
	    "slitter-motor-failure",
	    "slitter-near-limit",
	    "slitter-offline",
	    "slitter-opened",
	    "slitter-over-temperature",
	    "slitter-power-saver",
	    "slitter-recoverable-failure",
	    "slitter-recoverable-storage",
	    "slitter-removed",
	    "slitter-resource-added",
	    "slitter-resource-removed",
	    "slitter-thermistor-failure",
	    "slitter-timing-failure",
	    "slitter-turned-off",
	    "slitter-turned-on",
	    "slitter-under-temperature",
	    "slitter-unrecoverable-failure",
	    "slitter-unrecoverable-storage-error",
	    "slitter-warming-up",
	    "stacker-added",
	    "stacker-almost-empty",
	    "stacker-almost-full",
	    "stacker-at-limit",
	    "stacker-closed",
	    "stacker-configuration-change",
	    "stacker-cover-closed",
	    "stacker-cover-open",
	    "stacker-empty",
	    "stacker-full",
	    "stacker-interlock-closed",
	    "stacker-interlock-open",
	    "stacker-jam",
	    "stacker-life-almost-over",
	    "stacker-life-over",
	    "stacker-memory-exhausted",
	    "stacker-missing",
	    "stacker-motor-failure",
	    "stacker-near-limit",
	    "stacker-offline",
	    "stacker-opened",
	    "stacker-over-temperature",
	    "stacker-power-saver",
	    "stacker-recoverable-failure",
	    "stacker-recoverable-storage",
	    "stacker-removed",
	    "stacker-resource-added",
	    "stacker-resource-removed",
	    "stacker-thermistor-failure",
	    "stacker-timing-failure",
	    "stacker-turned-off",
	    "stacker-turned-on",
	    "stacker-under-temperature",
	    "stacker-unrecoverable-failure",
	    "stacker-unrecoverable-storage-error",
	    "stacker-warming-up",
	    "stapler-added",
	    "stapler-almost-empty",
	    "stapler-almost-full",
	    "stapler-at-limit",
	    "stapler-closed",
	    "stapler-configuration-change",
	    "stapler-cover-closed",
	    "stapler-cover-open",
	    "stapler-empty",
	    "stapler-full",
	    "stapler-interlock-closed",
	    "stapler-interlock-open",
	    "stapler-jam",
	    "stapler-life-almost-over",
	    "stapler-life-over",
	    "stapler-memory-exhausted",
	    "stapler-missing",
	    "stapler-motor-failure",
	    "stapler-near-limit",
	    "stapler-offline",
	    "stapler-opened",
	    "stapler-over-temperature",
	    "stapler-power-saver",
	    "stapler-recoverable-failure",
	    "stapler-recoverable-storage",
	    "stapler-removed",
	    "stapler-resource-added",
	    "stapler-resource-removed",
	    "stapler-thermistor-failure",
	    "stapler-timing-failure",
	    "stapler-turned-off",
	    "stapler-turned-on",
	    "stapler-under-temperature",
	    "stapler-unrecoverable-failure",
	    "stapler-unrecoverable-storage-error",
	    "stapler-warming-up",
	    "stitcher-added",
	    "stitcher-almost-empty",
	    "stitcher-almost-full",
	    "stitcher-at-limit",
	    "stitcher-closed",
	    "stitcher-configuration-change",
	    "stitcher-cover-closed",
	    "stitcher-cover-open",
	    "stitcher-empty",
	    "stitcher-full",
	    "stitcher-interlock-closed",
	    "stitcher-interlock-open",
	    "stitcher-jam",
	    "stitcher-life-almost-over",
	    "stitcher-life-over",
	    "stitcher-memory-exhausted",
	    "stitcher-missing",
	    "stitcher-motor-failure",
	    "stitcher-near-limit",
	    "stitcher-offline",
	    "stitcher-opened",
	    "stitcher-over-temperature",
	    "stitcher-power-saver",
	    "stitcher-recoverable-failure",
	    "stitcher-recoverable-storage",
	    "stitcher-removed",
	    "stitcher-resource-added",
	    "stitcher-resource-removed",
	    "stitcher-thermistor-failure",
	    "stitcher-timing-failure",
	    "stitcher-turned-off",
	    "stitcher-turned-on",
	    "stitcher-under-temperature",
	    "stitcher-unrecoverable-failure",
	    "stitcher-unrecoverable-storage-error",
	    "stitcher-warming-up",
	    "subunit-added",
	    "subunit-almost-empty",
	    "subunit-almost-full",
	    "subunit-at-limit",
	    "subunit-closed",
	    "subunit-empty",
	    "subunit-full",
	    "subunit-life-almost-over",
	    "subunit-life-over",
	    "subunit-memory-exhausted",
	    "subunit-missing",
	    "subunit-motor-failure",
	    "subunit-near-limit",
	    "subunit-offline",
	    "subunit-opened",
	    "subunit-over-temperature",
	    "subunit-power-saver",
	    "subunit-recoverable-failure",
	    "subunit-recoverable-storage",
	    "subunit-removed",
	    "subunit-resource-added",
	    "subunit-resource-removed",
	    "subunit-thermistor-failure",
	    "subunit-timing-Failure",
	    "subunit-turned-off",
	    "subunit-turned-on",
	    "subunit-under-temperature",
	    "subunit-unrecoverable-failure",
	    "subunit-unrecoverable-storage",
	    "subunit-warming-up",
	    "trimmer-added",
	    "trimmer-almost-empty",
	    "trimmer-almost-full",
	    "trimmer-at-limit",
	    "trimmer-closed",
	    "trimmer-configuration-change",
	    "trimmer-cover-closed",
	    "trimmer-cover-open",
	    "trimmer-empty",
	    "trimmer-full",
	    "trimmer-interlock-closed",
	    "trimmer-interlock-open",
	    "trimmer-jam",
	    "trimmer-life-almost-over",
	    "trimmer-life-over",
	    "trimmer-memory-exhausted",
	    "trimmer-missing",
	    "trimmer-motor-failure",
	    "trimmer-near-limit",
	    "trimmer-offline",
	    "trimmer-opened",
	    "trimmer-over-temperature",
	    "trimmer-power-saver",
	    "trimmer-recoverable-failure",
	    "trimmer-recoverable-storage",
	    "trimmer-removed",
	    "trimmer-resource-added",
	    "trimmer-resource-removed",
	    "trimmer-thermistor-failure",
	    "trimmer-timing-failure",
	    "trimmer-turned-off",
	    "trimmer-turned-on",
	    "trimmer-under-temperature",
	    "trimmer-unrecoverable-failure",
	    "trimmer-unrecoverable-storage-error",
	    "trimmer-warming-up",
	    "unknown",
	    "wrapper-added",
	    "wrapper-almost-empty",
	    "wrapper-almost-full",
	    "wrapper-at-limit",
	    "wrapper-closed",
	    "wrapper-configuration-change",
	    "wrapper-cover-closed",
	    "wrapper-cover-open",
	    "wrapper-empty",
	    "wrapper-full",
	    "wrapper-interlock-closed",
	    "wrapper-interlock-open",
	    "wrapper-jam",
	    "wrapper-life-almost-over",
	    "wrapper-life-over",
	    "wrapper-memory-exhausted",
	    "wrapper-missing",
	    "wrapper-motor-failure",
	    "wrapper-near-limit",
	    "wrapper-offline",
	    "wrapper-opened",
	    "wrapper-over-temperature",
	    "wrapper-power-saver",
	    "wrapper-recoverable-failure",
	    "wrapper-recoverable-storage",
	    "wrapper-removed",
	    "wrapper-resource-added",
	    "wrapper-resource-removed",
	    "wrapper-thermistor-failure",
	    "wrapper-timing-failure",
	    "wrapper-turned-off",
	    "wrapper-turned-on",
	    "wrapper-under-temperature",
	    "wrapper-unrecoverable-failure",
	    "wrapper-unrecoverable-storage-error",
	    "wrapper-warming-up",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ALERT_REMOVAL_OF_BINARY_CHANGE_ENTRY,
	    BANDER_ADDED,
	    BANDER_ALMOST_EMPTY,
	    BANDER_ALMOST_FULL,
	    BANDER_AT_LIMIT,
	    BANDER_CLOSED,
	    BANDER_CONFIGURATION_CHANGE,
	    BANDER_COVER_CLOSED,
	    BANDER_COVER_OPEN,
	    BANDER_EMPTY,
	    BANDER_FULL,
	    BANDER_INTERLOCK_CLOSED,
	    BANDER_INTERLOCK_OPEN,
	    BANDER_JAM,
	    BANDER_LIFE_ALMOST_OVER,
	    BANDER_LIFE_OVER,
	    BANDER_MEMORY_EXHAUSTED,
	    BANDER_MISSING,
	    BANDER_MOTOR_FAILURE,
	    BANDER_NEAR_LIMIT,
	    BANDER_OFFLINE,
	    BANDER_OPENED,
	    BANDER_OVER_TEMPERATURE,
	    BANDER_POWER_SAVER,
	    BANDER_RECOVERABLE_FAILURE,
	    BANDER_RECOVERABLE_STORAGE,
	    BANDER_REMOVED,
	    BANDER_RESOURCE_ADDED,
	    BANDER_RESOURCE_REMOVED,
	    BANDER_THERMISTOR_FAILURE,
	    BANDER_TIMING_FAILURE,
	    BANDER_TURNED_OFF,
	    BANDER_TURNED_ON,
	    BANDER_UNDER_TEMPERATURE,
	    BANDER_UNRECOVERABLE_FAILURE,
	    BANDER_UNRECOVERABLE_STORAGE_ERROR,
	    BANDER_WARMING_UP,
	    BINDER_ADDED,
	    BINDER_ALMOST_EMPTY,
	    BINDER_ALMOST_FULL,
	    BINDER_AT_LIMIT,
	    BINDER_CLOSED,
	    BINDER_CONFIGURATION_CHANGE,
	    BINDER_COVER_CLOSED,
	    BINDER_COVER_OPEN,
	    BINDER_EMPTY,
	    BINDER_FULL,
	    BINDER_INTERLOCK_CLOSED,
	    BINDER_INTERLOCK_OPEN,
	    BINDER_JAM,
	    BINDER_LIFE_ALMOST_OVER,
	    BINDER_LIFE_OVER,
	    BINDER_MEMORY_EXHAUSTED,
	    BINDER_MISSING,
	    BINDER_MOTOR_FAILURE,
	    BINDER_NEAR_LIMIT,
	    BINDER_OFFLINE,
	    BINDER_OPENED,
	    BINDER_OVER_TEMPERATURE,
	    BINDER_POWER_SAVER,
	    BINDER_RECOVERABLE_FAILURE,
	    BINDER_RECOVERABLE_STORAGE,
	    BINDER_REMOVED,
	    BINDER_RESOURCE_ADDED,
	    BINDER_RESOURCE_REMOVED,
	    BINDER_THERMISTOR_FAILURE,
	    BINDER_TIMING_FAILURE,
	    BINDER_TURNED_OFF,
	    BINDER_TURNED_ON,
	    BINDER_UNDER_TEMPERATURE,
	    BINDER_UNRECOVERABLE_FAILURE,
	    BINDER_UNRECOVERABLE_STORAGE_ERROR,
	    BINDER_WARMING_UP,
	    CAMERA_FAILURE,
	    CHAMBER_COOLING,
	    CHAMBER_HEATING,
	    CHAMBER_TEMPERATURE_HIGH,
	    CHAMBER_TEMPERATURE_LOW,
	    CLEANER_LIFE_ALMOST_OVER,
	    CLEANER_LIFE_OVER,
	    CONFIGURATION_CHANGE,
	    DEACTIVATED,
	    DIE_CUTTER_ADDED,
	    DIE_CUTTER_ALMOST_EMPTY,
	    DIE_CUTTER_ALMOST_FULL,
	    DIE_CUTTER_AT_LIMIT,
	    DIE_CUTTER_CLOSED,
	    DIE_CUTTER_CONFIGURATION_CHANGE,
	    DIE_CUTTER_COVER_CLOSED,
	    DIE_CUTTER_COVER_OPEN,
	    DIE_CUTTER_EMPTY,
	    DIE_CUTTER_FULL,
	    DIE_CUTTER_INTERLOCK_CLOSED,
	    DIE_CUTTER_INTERLOCK_OPEN,
	    DIE_CUTTER_JAM,
	    DIE_CUTTER_LIFE_ALMOST_OVER,
	    DIE_CUTTER_LIFE_OVER,
	    DIE_CUTTER_MEMORY_EXHAUSTED,
	    DIE_CUTTER_MISSING,
	    DIE_CUTTER_MOTOR_FAILURE,
	    DIE_CUTTER_NEAR_LIMIT,
	    DIE_CUTTER_OFFLINE,
	    DIE_CUTTER_OPENED,
	    DIE_CUTTER_OVER_TEMPERATURE,
	    DIE_CUTTER_POWER_SAVER,
	    DIE_CUTTER_RECOVERABLE_FAILURE,
	    DIE_CUTTER_RECOVERABLE_STORAGE,
	    DIE_CUTTER_REMOVED,
	    DIE_CUTTER_RESOURCE_ADDED,
	    DIE_CUTTER_RESOURCE_REMOVED,
	    DIE_CUTTER_THERMISTOR_FAILURE,
	    DIE_CUTTER_TIMING_FAILURE,
	    DIE_CUTTER_TURNED_OFF,
	    DIE_CUTTER_TURNED_ON,
	    DIE_CUTTER_UNDER_TEMPERATURE,
	    DIE_CUTTER_UNRECOVERABLE_FAILURE,
	    DIE_CUTTER_UNRECOVERABLE_STORAGE_ERROR,
	    DIE_CUTTER_WARMING_UP,
	    EXTRUDER_COOLING,
	    EXTRUDER_FAILURE,
	    EXTRUDER_HEATING,
	    EXTRUDER_JAM,
	    EXTRUDER_TEMPERATURE_HIGH,
	    EXTRUDER_TEMPERATURE_LOW,
	    FAN_FAILURE,
	    FOLDER_ADDED,
	    FOLDER_ALMOST_EMPTY,
	    FOLDER_ALMOST_FULL,
	    FOLDER_AT_LIMIT,
	    FOLDER_CLOSED,
	    FOLDER_CONFIGURATION_CHANGE,
	    FOLDER_COVER_CLOSED,
	    FOLDER_COVER_OPEN,
	    FOLDER_EMPTY,
	    FOLDER_FULL,
	    FOLDER_INTERLOCK_CLOSED,
	    FOLDER_INTERLOCK_OPEN,
	    FOLDER_JAM,
	    FOLDER_LIFE_ALMOST_OVER,
	    FOLDER_LIFE_OVER,
	    FOLDER_MEMORY_EXHAUSTED,
	    FOLDER_MISSING,
	    FOLDER_MOTOR_FAILURE,
	    FOLDER_NEAR_LIMIT,
	    FOLDER_OFFLINE,
	    FOLDER_OPENED,
	    FOLDER_OVER_TEMPERATURE,
	    FOLDER_POWER_SAVER,
	    FOLDER_RECOVERABLE_FAILURE,
	    FOLDER_RECOVERABLE_STORAGE,
	    FOLDER_REMOVED,
	    FOLDER_RESOURCE_ADDED,
	    FOLDER_RESOURCE_REMOVED,
	    FOLDER_THERMISTOR_FAILURE,
	    FOLDER_TIMING_FAILURE,
	    FOLDER_TURNED_OFF,
	    FOLDER_TURNED_ON,
	    FOLDER_UNDER_TEMPERATURE,
	    FOLDER_UNRECOVERABLE_FAILURE,
	    FOLDER_UNRECOVERABLE_STORAGE_ERROR,
	    FOLDER_WARMING_UP,
	    HOLD_NEW_JOBS,
	    IDENTIFY_PRINTER_REQUESTED,
	    IMPRINTER_ADDED,
	    IMPRINTER_ALMOST_EMPTY,
	    IMPRINTER_ALMOST_FULL,
	    IMPRINTER_AT_LIMIT,
	    IMPRINTER_CLOSED,
	    IMPRINTER_CONFIGURATION_CHANGE,
	    IMPRINTER_COVER_CLOSED,
	    IMPRINTER_COVER_OPEN,
	    IMPRINTER_EMPTY,
	    IMPRINTER_FULL,
	    IMPRINTER_INTERLOCK_CLOSED,
	    IMPRINTER_INTERLOCK_OPEN,
	    IMPRINTER_JAM,
	    IMPRINTER_LIFE_ALMOST_OVER,
	    IMPRINTER_LIFE_OVER,
	    IMPRINTER_MEMORY_EXHAUSTED,
	    IMPRINTER_MISSING,
	    IMPRINTER_MOTOR_FAILURE,
	    IMPRINTER_NEAR_LIMIT,
	    IMPRINTER_OFFLINE,
	    IMPRINTER_OPENED,
	    IMPRINTER_OVER_TEMPERATURE,
	    IMPRINTER_POWER_SAVER,
	    IMPRINTER_RECOVERABLE_FAILURE,
	    IMPRINTER_RECOVERABLE_STORAGE,
	    IMPRINTER_REMOVED,
	    IMPRINTER_RESOURCE_ADDED,
	    IMPRINTER_RESOURCE_REMOVED,
	    IMPRINTER_THERMISTOR_FAILURE,
	    IMPRINTER_TIMING_FAILURE,
	    IMPRINTER_TURNED_OFF,
	    IMPRINTER_TURNED_ON,
	    IMPRINTER_UNDER_TEMPERATURE,
	    IMPRINTER_UNRECOVERABLE_FAILURE,
	    IMPRINTER_UNRECOVERABLE_STORAGE_ERROR,
	    IMPRINTER_WARMING_UP,
	    INPUT_CANNOT_FEED_SIZE_SELECTED,
	    INPUT_MANUAL_INPUT_REQUEST,
	    INPUT_MEDIA_COLOR_CHANGE,
	    INPUT_MEDIA_FORM_PARTS_CHANGE,
	    INPUT_MEDIA_SIZE_CHANGE,
	    INPUT_MEDIA_TYPE_CHANGE,
	    INPUT_MEDIA_WEIGHT_CHANGE,
	    INPUT_TRAY_ELEVATION_FAILURE,
	    INPUT_TRAY_POSITION_FAILURE,
	    INSERTER_ADDED,
	    INSERTER_ALMOST_EMPTY,
	    INSERTER_ALMOST_FULL,
	    INSERTER_AT_LIMIT,
	    INSERTER_CLOSED,
	    INSERTER_CONFIGURATION_CHANGE,
	    INSERTER_COVER_CLOSED,
	    INSERTER_COVER_OPEN,
	    INSERTER_EMPTY,
	    INSERTER_FULL,
	    INSERTER_INTERLOCK_CLOSED,
	    INSERTER_INTERLOCK_OPEN,
	    INSERTER_JAM,
	    INSERTER_LIFE_ALMOST_OVER,
	    INSERTER_LIFE_OVER,
	    INSERTER_MEMORY_EXHAUSTED,
	    INSERTER_MISSING,
	    INSERTER_MOTOR_FAILURE,
	    INSERTER_NEAR_LIMIT,
	    INSERTER_OFFLINE,
	    INSERTER_OPENED,
	    INSERTER_OVER_TEMPERATURE,
	    INSERTER_POWER_SAVER,
	    INSERTER_RECOVERABLE_FAILURE,
	    INSERTER_RECOVERABLE_STORAGE,
	    INSERTER_REMOVED,
	    INSERTER_RESOURCE_ADDED,
	    INSERTER_RESOURCE_REMOVED,
	    INSERTER_THERMISTOR_FAILURE,
	    INSERTER_TIMING_FAILURE,
	    INSERTER_TURNED_OFF,
	    INSERTER_TURNED_ON,
	    INSERTER_UNDER_TEMPERATURE,
	    INSERTER_UNRECOVERABLE_FAILURE,
	    INSERTER_UNRECOVERABLE_STORAGE_ERROR,
	    INSERTER_WARMING_UP,
	    INTERLOCK_CLOSED,
	    INTERPRETER_CARTRIDGE_ADDED,
	    INTERPRETER_CARTRIDGE_DELETED,
	    INTERPRETER_COMPLEX_PAGE_ENCOUNTERED,
	    INTERPRETER_MEMORY_DECREASE,
	    INTERPRETER_MEMORY_INCREASE,
	    INTERPRETER_RESOURCE_ADDED,
	    INTERPRETER_RESOURCE_DELETED,
	    LAMP_AT_EOL,
	    LAMP_FAILURE,
	    LAMP_NEAR_EOL,
	    LASER_AT_EOL,
	    LASER_FAILURE,
	    LASER_NEAR_EOL,
	    MAKE_ENVELOPE_ADDED,
	    MAKE_ENVELOPE_ALMOST_EMPTY,
	    MAKE_ENVELOPE_ALMOST_FULL,
	    MAKE_ENVELOPE_AT_LIMIT,
	    MAKE_ENVELOPE_CLOSED,
	    MAKE_ENVELOPE_CONFIGURATION_CHANGE,
	    MAKE_ENVELOPE_COVER_CLOSED,
	    MAKE_ENVELOPE_COVER_OPEN,
	    MAKE_ENVELOPE_EMPTY,
	    MAKE_ENVELOPE_FULL,
	    MAKE_ENVELOPE_INTERLOCK_CLOSED,
	    MAKE_ENVELOPE_INTERLOCK_OPEN,
	    MAKE_ENVELOPE_JAM,
	    MAKE_ENVELOPE_LIFE_ALMOST_OVER,
	    MAKE_ENVELOPE_LIFE_OVER,
	    MAKE_ENVELOPE_MEMORY_EXHAUSTED,
	    MAKE_ENVELOPE_MISSING,
	    MAKE_ENVELOPE_MOTOR_FAILURE,
	    MAKE_ENVELOPE_NEAR_LIMIT,
	    MAKE_ENVELOPE_OFFLINE,
	    MAKE_ENVELOPE_OPENED,
	    MAKE_ENVELOPE_OVER_TEMPERATURE,
	    MAKE_ENVELOPE_POWER_SAVER,
	    MAKE_ENVELOPE_RECOVERABLE_FAILURE,
	    MAKE_ENVELOPE_RECOVERABLE_STORAGE,
	    MAKE_ENVELOPE_REMOVED,
	    MAKE_ENVELOPE_RESOURCE_ADDED,
	    MAKE_ENVELOPE_RESOURCE_REMOVED,
	    MAKE_ENVELOPE_THERMISTOR_FAILURE,
	    MAKE_ENVELOPE_TIMING_FAILURE,
	    MAKE_ENVELOPE_TURNED_OFF,
	    MAKE_ENVELOPE_TURNED_ON,
	    MAKE_ENVELOPE_UNDER_TEMPERATURE,
	    MAKE_ENVELOPE_UNRECOVERABLE_FAILURE,
	    MAKE_ENVELOPE_UNRECOVERABLE_STORAGE_ERROR,
	    MAKE_ENVELOPE_WARMING_UP,
	    MARKER_ADJUSTING_PRINT_QUALITY,
	    MARKER_DEVELOPER_ALMOST_EMPTY,
	    MARKER_DEVELOPER_EMPTY,
	    MARKER_FUSER_THERMISTOR_FAILURE,
	    MARKER_FUSER_TIMING_FAILURE,
	    MARKER_INK_ALMOST_EMPTY,
	    MARKER_INK_EMPTY,
	    MARKER_PRINT_RIBBON_ALMOST_EMPTY,
	    MARKER_PRINT_RIBBON_EMPTY,
	    MARKER_TONER_CARTRIDGE_MISSING,
	    MARKER_WASTE_INK_RECEPTACLE_ALMOST_FULL,
	    MARKER_WASTE_INK_RECEPTACLE_FULL,
	    MARKER_WASTE_TONER_RECEPTACLE_ALMOST_FULL,
	    MARKER_WASTE_TONER_RECEPTACLE_FULL,
	    MATERIAL_EMPTY,
	    MATERIAL_LOW,
	    MATERIAL_NEEDED,
	    MEDIA_PATH_CANNOT_DUPLEX_MEDIA_SELECTED,
	    MEDIA_PATH_MEDIA_TRAY_ALMOST_FULL,
	    MEDIA_PATH_MEDIA_TRAY_FULL,
	    MEDIA_PATH_MEDIA_TRAY_MISSING,
	    MOTOR_FAILURE,
	    OUTPUT_MAILBOX_SELECT_FAILURE,
	    PERFORATER_ADDED,
	    PERFORATER_ALMOST_EMPTY,
	    PERFORATER_ALMOST_FULL,
	    PERFORATER_AT_LIMIT,
	    PERFORATER_CLOSED,
	    PERFORATER_CONFIGURATION_CHANGE,
	    PERFORATER_COVER_CLOSED,
	    PERFORATER_COVER_OPEN,
	    PERFORATER_EMPTY,
	    PERFORATER_FULL,
	    PERFORATER_INTERLOCK_CLOSED,
	    PERFORATER_INTERLOCK_OPEN,
	    PERFORATER_JAM,
	    PERFORATER_LIFE_ALMOST_OVER,
	    PERFORATER_LIFE_OVER,
	    PERFORATER_MEMORY_EXHAUSTED,
	    PERFORATER_MISSING,
	    PERFORATER_MOTOR_FAILURE,
	    PERFORATER_NEAR_LIMIT,
	    PERFORATER_OFFLINE,
	    PERFORATER_OPENED,
	    PERFORATER_OVER_TEMPERATURE,
	    PERFORATER_POWER_SAVER,
	    PERFORATER_RECOVERABLE_FAILURE,
	    PERFORATER_RECOVERABLE_STORAGE,
	    PERFORATER_REMOVED,
	    PERFORATER_RESOURCE_ADDED,
	    PERFORATER_RESOURCE_REMOVED,
	    PERFORATER_THERMISTOR_FAILURE,
	    PERFORATER_TIMING_FAILURE,
	    PERFORATER_TURNED_OFF,
	    PERFORATER_TURNED_ON,
	    PERFORATER_UNDER_TEMPERATURE,
	    PERFORATER_UNRECOVERABLE_FAILURE,
	    PERFORATER_UNRECOVERABLE_STORAGE_ERROR,
	    PERFORATER_WARMING_UP,
	    POWER_DOWN,
	    POWER_UP,
	    PRINTER_MANUAL_RESET,
	    PRINTER_NMS_RESET,
	    PRINTER_READY_TO_PRINT,
	    PUNCHER_ADDED,
	    PUNCHER_ALMOST_EMPTY,
	    PUNCHER_ALMOST_FULL,
	    PUNCHER_AT_LIMIT,
	    PUNCHER_CLOSED,
	    PUNCHER_CONFIGURATION_CHANGE,
	    PUNCHER_COVER_CLOSED,
	    PUNCHER_COVER_OPEN,
	    PUNCHER_EMPTY,
	    PUNCHER_FULL,
	    PUNCHER_INTERLOCK_CLOSED,
	    PUNCHER_INTERLOCK_OPEN,
	    PUNCHER_JAM,
	    PUNCHER_LIFE_ALMOST_OVER,
	    PUNCHER_LIFE_OVER,
	    PUNCHER_MEMORY_EXHAUSTED,
	    PUNCHER_MISSING,
	    PUNCHER_MOTOR_FAILURE,
	    PUNCHER_NEAR_LIMIT,
	    PUNCHER_OFFLINE,
	    PUNCHER_OPENED,
	    PUNCHER_OVER_TEMPERATURE,
	    PUNCHER_POWER_SAVER,
	    PUNCHER_RECOVERABLE_FAILURE,
	    PUNCHER_RECOVERABLE_STORAGE,
	    PUNCHER_REMOVED,
	    PUNCHER_RESOURCE_ADDED,
	    PUNCHER_RESOURCE_REMOVED,
	    PUNCHER_THERMISTOR_FAILURE,
	    PUNCHER_TIMING_FAILURE,
	    PUNCHER_TURNED_OFF,
	    PUNCHER_TURNED_ON,
	    PUNCHER_UNDER_TEMPERATURE,
	    PUNCHER_UNRECOVERABLE_FAILURE,
	    PUNCHER_UNRECOVERABLE_STORAGE_ERROR,
	    PUNCHER_WARMING_UP,
	    SEPARATION_CUTTER_ADDED,
	    SEPARATION_CUTTER_ALMOST_EMPTY,
	    SEPARATION_CUTTER_ALMOST_FULL,
	    SEPARATION_CUTTER_AT_LIMIT,
	    SEPARATION_CUTTER_CLOSED,
	    SEPARATION_CUTTER_CONFIGURATION_CHANGE,
	    SEPARATION_CUTTER_COVER_CLOSED,
	    SEPARATION_CUTTER_COVER_OPEN,
	    SEPARATION_CUTTER_EMPTY,
	    SEPARATION_CUTTER_FULL,
	    SEPARATION_CUTTER_INTERLOCK_CLOSED,
	    SEPARATION_CUTTER_INTERLOCK_OPEN,
	    SEPARATION_CUTTER_JAM,
	    SEPARATION_CUTTER_LIFE_ALMOST_OVER,
	    SEPARATION_CUTTER_LIFE_OVER,
	    SEPARATION_CUTTER_MEMORY_EXHAUSTED,
	    SEPARATION_CUTTER_MISSING,
	    SEPARATION_CUTTER_MOTOR_FAILURE,
	    SEPARATION_CUTTER_NEAR_LIMIT,
	    SEPARATION_CUTTER_OFFLINE,
	    SEPARATION_CUTTER_OPENED,
	    SEPARATION_CUTTER_OVER_TEMPERATURE,
	    SEPARATION_CUTTER_POWER_SAVER,
	    SEPARATION_CUTTER_RECOVERABLE_FAILURE,
	    SEPARATION_CUTTER_RECOVERABLE_STORAGE,
	    SEPARATION_CUTTER_REMOVED,
	    SEPARATION_CUTTER_RESOURCE_ADDED,
	    SEPARATION_CUTTER_RESOURCE_REMOVED,
	    SEPARATION_CUTTER_THERMISTOR_FAILURE,
	    SEPARATION_CUTTER_TIMING_FAILURE,
	    SEPARATION_CUTTER_TURNED_OFF,
	    SEPARATION_CUTTER_TURNED_ON,
	    SEPARATION_CUTTER_UNDER_TEMPERATURE,
	    SEPARATION_CUTTER_UNRECOVERABLE_FAILURE,
	    SEPARATION_CUTTER_UNRECOVERABLE_STORAGE_ERROR,
	    SEPARATION_CUTTER_WARMING_UP,
	    SHEET_ROTATOR_ADDED,
	    SHEET_ROTATOR_ALMOST_EMPTY,
	    SHEET_ROTATOR_ALMOST_FULL,
	    SHEET_ROTATOR_AT_LIMIT,
	    SHEET_ROTATOR_CLOSED,
	    SHEET_ROTATOR_CONFIGURATION_CHANGE,
	    SHEET_ROTATOR_COVER_CLOSED,
	    SHEET_ROTATOR_COVER_OPEN,
	    SHEET_ROTATOR_EMPTY,
	    SHEET_ROTATOR_FULL,
	    SHEET_ROTATOR_INTERLOCK_CLOSED,
	    SHEET_ROTATOR_INTERLOCK_OPEN,
	    SHEET_ROTATOR_JAM,
	    SHEET_ROTATOR_LIFE_ALMOST_OVER,
	    SHEET_ROTATOR_LIFE_OVER,
	    SHEET_ROTATOR_MEMORY_EXHAUSTED,
	    SHEET_ROTATOR_MISSING,
	    SHEET_ROTATOR_MOTOR_FAILURE,
	    SHEET_ROTATOR_NEAR_LIMIT,
	    SHEET_ROTATOR_OFFLINE,
	    SHEET_ROTATOR_OPENED,
	    SHEET_ROTATOR_OVER_TEMPERATURE,
	    SHEET_ROTATOR_POWER_SAVER,
	    SHEET_ROTATOR_RECOVERABLE_FAILURE,
	    SHEET_ROTATOR_RECOVERABLE_STORAGE,
	    SHEET_ROTATOR_REMOVED,
	    SHEET_ROTATOR_RESOURCE_ADDED,
	    SHEET_ROTATOR_RESOURCE_REMOVED,
	    SHEET_ROTATOR_THERMISTOR_FAILURE,
	    SHEET_ROTATOR_TIMING_FAILURE,
	    SHEET_ROTATOR_TURNED_OFF,
	    SHEET_ROTATOR_TURNED_ON,
	    SHEET_ROTATOR_UNDER_TEMPERATURE,
	    SHEET_ROTATOR_UNRECOVERABLE_FAILURE,
	    SHEET_ROTATOR_UNRECOVERABLE_STORAGE_ERROR,
	    SHEET_ROTATOR_WARMING_UP,
	    SLITTER_ADDED,
	    SLITTER_ALMOST_EMPTY,
	    SLITTER_ALMOST_FULL,
	    SLITTER_AT_LIMIT,
	    SLITTER_CLOSED,
	    SLITTER_CONFIGURATION_CHANGE,
	    SLITTER_COVER_CLOSED,
	    SLITTER_COVER_OPEN,
	    SLITTER_EMPTY,
	    SLITTER_FULL,
	    SLITTER_INTERLOCK_CLOSED,
	    SLITTER_INTERLOCK_OPEN,
	    SLITTER_JAM,
	    SLITTER_LIFE_ALMOST_OVER,
	    SLITTER_LIFE_OVER,
	    SLITTER_MEMORY_EXHAUSTED,
	    SLITTER_MISSING,
	    SLITTER_MOTOR_FAILURE,
	    SLITTER_NEAR_LIMIT,
	    SLITTER_OFFLINE,
	    SLITTER_OPENED,
	    SLITTER_OVER_TEMPERATURE,
	    SLITTER_POWER_SAVER,
	    SLITTER_RECOVERABLE_FAILURE,
	    SLITTER_RECOVERABLE_STORAGE,
	    SLITTER_REMOVED,
	    SLITTER_RESOURCE_ADDED,
	    SLITTER_RESOURCE_REMOVED,
	    SLITTER_THERMISTOR_FAILURE,
	    SLITTER_TIMING_FAILURE,
	    SLITTER_TURNED_OFF,
	    SLITTER_TURNED_ON,
	    SLITTER_UNDER_TEMPERATURE,
	    SLITTER_UNRECOVERABLE_FAILURE,
	    SLITTER_UNRECOVERABLE_STORAGE_ERROR,
	    SLITTER_WARMING_UP,
	    STACKER_ADDED,
	    STACKER_ALMOST_EMPTY,
	    STACKER_ALMOST_FULL,
	    STACKER_AT_LIMIT,
	    STACKER_CLOSED,
	    STACKER_CONFIGURATION_CHANGE,
	    STACKER_COVER_CLOSED,
	    STACKER_COVER_OPEN,
	    STACKER_EMPTY,
	    STACKER_FULL,
	    STACKER_INTERLOCK_CLOSED,
	    STACKER_INTERLOCK_OPEN,
	    STACKER_JAM,
	    STACKER_LIFE_ALMOST_OVER,
	    STACKER_LIFE_OVER,
	    STACKER_MEMORY_EXHAUSTED,
	    STACKER_MISSING,
	    STACKER_MOTOR_FAILURE,
	    STACKER_NEAR_LIMIT,
	    STACKER_OFFLINE,
	    STACKER_OPENED,
	    STACKER_OVER_TEMPERATURE,
	    STACKER_POWER_SAVER,
	    STACKER_RECOVERABLE_FAILURE,
	    STACKER_RECOVERABLE_STORAGE,
	    STACKER_REMOVED,
	    STACKER_RESOURCE_ADDED,
	    STACKER_RESOURCE_REMOVED,
	    STACKER_THERMISTOR_FAILURE,
	    STACKER_TIMING_FAILURE,
	    STACKER_TURNED_OFF,
	    STACKER_TURNED_ON,
	    STACKER_UNDER_TEMPERATURE,
	    STACKER_UNRECOVERABLE_FAILURE,
	    STACKER_UNRECOVERABLE_STORAGE_ERROR,
	    STACKER_WARMING_UP,
	    STAPLER_ADDED,
	    STAPLER_ALMOST_EMPTY,
	    STAPLER_ALMOST_FULL,
	    STAPLER_AT_LIMIT,
	    STAPLER_CLOSED,
	    STAPLER_CONFIGURATION_CHANGE,
	    STAPLER_COVER_CLOSED,
	    STAPLER_COVER_OPEN,
	    STAPLER_EMPTY,
	    STAPLER_FULL,
	    STAPLER_INTERLOCK_CLOSED,
	    STAPLER_INTERLOCK_OPEN,
	    STAPLER_JAM,
	    STAPLER_LIFE_ALMOST_OVER,
	    STAPLER_LIFE_OVER,
	    STAPLER_MEMORY_EXHAUSTED,
	    STAPLER_MISSING,
	    STAPLER_MOTOR_FAILURE,
	    STAPLER_NEAR_LIMIT,
	    STAPLER_OFFLINE,
	    STAPLER_OPENED,
	    STAPLER_OVER_TEMPERATURE,
	    STAPLER_POWER_SAVER,
	    STAPLER_RECOVERABLE_FAILURE,
	    STAPLER_RECOVERABLE_STORAGE,
	    STAPLER_REMOVED,
	    STAPLER_RESOURCE_ADDED,
	    STAPLER_RESOURCE_REMOVED,
	    STAPLER_THERMISTOR_FAILURE,
	    STAPLER_TIMING_FAILURE,
	    STAPLER_TURNED_OFF,
	    STAPLER_TURNED_ON,
	    STAPLER_UNDER_TEMPERATURE,
	    STAPLER_UNRECOVERABLE_FAILURE,
	    STAPLER_UNRECOVERABLE_STORAGE_ERROR,
	    STAPLER_WARMING_UP,
	    STITCHER_ADDED,
	    STITCHER_ALMOST_EMPTY,
	    STITCHER_ALMOST_FULL,
	    STITCHER_AT_LIMIT,
	    STITCHER_CLOSED,
	    STITCHER_CONFIGURATION_CHANGE,
	    STITCHER_COVER_CLOSED,
	    STITCHER_COVER_OPEN,
	    STITCHER_EMPTY,
	    STITCHER_FULL,
	    STITCHER_INTERLOCK_CLOSED,
	    STITCHER_INTERLOCK_OPEN,
	    STITCHER_JAM,
	    STITCHER_LIFE_ALMOST_OVER,
	    STITCHER_LIFE_OVER,
	    STITCHER_MEMORY_EXHAUSTED,
	    STITCHER_MISSING,
	    STITCHER_MOTOR_FAILURE,
	    STITCHER_NEAR_LIMIT,
	    STITCHER_OFFLINE,
	    STITCHER_OPENED,
	    STITCHER_OVER_TEMPERATURE,
	    STITCHER_POWER_SAVER,
	    STITCHER_RECOVERABLE_FAILURE,
	    STITCHER_RECOVERABLE_STORAGE,
	    STITCHER_REMOVED,
	    STITCHER_RESOURCE_ADDED,
	    STITCHER_RESOURCE_REMOVED,
	    STITCHER_THERMISTOR_FAILURE,
	    STITCHER_TIMING_FAILURE,
	    STITCHER_TURNED_OFF,
	    STITCHER_TURNED_ON,
	    STITCHER_UNDER_TEMPERATURE,
	    STITCHER_UNRECOVERABLE_FAILURE,
	    STITCHER_UNRECOVERABLE_STORAGE_ERROR,
	    STITCHER_WARMING_UP,
	    SUBUNIT_ADDED,
	    SUBUNIT_ALMOST_EMPTY,
	    SUBUNIT_ALMOST_FULL,
	    SUBUNIT_AT_LIMIT,
	    SUBUNIT_CLOSED,
	    SUBUNIT_EMPTY,
	    SUBUNIT_FULL,
	    SUBUNIT_LIFE_ALMOST_OVER,
	    SUBUNIT_LIFE_OVER,
	    SUBUNIT_MEMORY_EXHAUSTED,
	    SUBUNIT_MISSING,
	    SUBUNIT_MOTOR_FAILURE,
	    SUBUNIT_NEAR_LIMIT,
	    SUBUNIT_OFFLINE,
	    SUBUNIT_OPENED,
	    SUBUNIT_OVER_TEMPERATURE,
	    SUBUNIT_POWER_SAVER,
	    SUBUNIT_RECOVERABLE_FAILURE,
	    SUBUNIT_RECOVERABLE_STORAGE,
	    SUBUNIT_REMOVED,
	    SUBUNIT_RESOURCE_ADDED,
	    SUBUNIT_RESOURCE_REMOVED,
	    SUBUNIT_THERMISTOR_FAILURE,
	    SUBUNIT_TIMING_FAILURE,
	    SUBUNIT_TURNED_OFF,
	    SUBUNIT_TURNED_ON,
	    SUBUNIT_UNDER_TEMPERATURE,
	    SUBUNIT_UNRECOVERABLE_FAILURE,
	    SUBUNIT_UNRECOVERABLE_STORAGE,
	    SUBUNIT_WARMING_UP,
	    TRIMMER_ADDED,
	    TRIMMER_ALMOST_EMPTY,
	    TRIMMER_ALMOST_FULL,
	    TRIMMER_AT_LIMIT,
	    TRIMMER_CLOSED,
	    TRIMMER_CONFIGURATION_CHANGE,
	    TRIMMER_COVER_CLOSED,
	    TRIMMER_COVER_OPEN,
	    TRIMMER_EMPTY,
	    TRIMMER_FULL,
	    TRIMMER_INTERLOCK_CLOSED,
	    TRIMMER_INTERLOCK_OPEN,
	    TRIMMER_JAM,
	    TRIMMER_LIFE_ALMOST_OVER,
	    TRIMMER_LIFE_OVER,
	    TRIMMER_MEMORY_EXHAUSTED,
	    TRIMMER_MISSING,
	    TRIMMER_MOTOR_FAILURE,
	    TRIMMER_NEAR_LIMIT,
	    TRIMMER_OFFLINE,
	    TRIMMER_OPENED,
	    TRIMMER_OVER_TEMPERATURE,
	    TRIMMER_POWER_SAVER,
	    TRIMMER_RECOVERABLE_FAILURE,
	    TRIMMER_RECOVERABLE_STORAGE,
	    TRIMMER_REMOVED,
	    TRIMMER_RESOURCE_ADDED,
	    TRIMMER_RESOURCE_REMOVED,
	    TRIMMER_THERMISTOR_FAILURE,
	    TRIMMER_TIMING_FAILURE,
	    TRIMMER_TURNED_OFF,
	    TRIMMER_TURNED_ON,
	    TRIMMER_UNDER_TEMPERATURE,
	    TRIMMER_UNRECOVERABLE_FAILURE,
	    TRIMMER_UNRECOVERABLE_STORAGE_ERROR,
	    TRIMMER_WARMING_UP,
	    UNKNOWN,
	    WRAPPER_ADDED,
	    WRAPPER_ALMOST_EMPTY,
	    WRAPPER_ALMOST_FULL,
	    WRAPPER_AT_LIMIT,
	    WRAPPER_CLOSED,
	    WRAPPER_CONFIGURATION_CHANGE,
	    WRAPPER_COVER_CLOSED,
	    WRAPPER_COVER_OPEN,
	    WRAPPER_EMPTY,
	    WRAPPER_FULL,
	    WRAPPER_INTERLOCK_CLOSED,
	    WRAPPER_INTERLOCK_OPEN,
	    WRAPPER_JAM,
	    WRAPPER_LIFE_ALMOST_OVER,
	    WRAPPER_LIFE_OVER,
	    WRAPPER_MEMORY_EXHAUSTED,
	    WRAPPER_MISSING,
	    WRAPPER_MOTOR_FAILURE,
	    WRAPPER_NEAR_LIMIT,
	    WRAPPER_OFFLINE,
	    WRAPPER_OPENED,
	    WRAPPER_OVER_TEMPERATURE,
	    WRAPPER_POWER_SAVER,
	    WRAPPER_RECOVERABLE_FAILURE,
	    WRAPPER_RECOVERABLE_STORAGE,
	    WRAPPER_REMOVED,
	    WRAPPER_RESOURCE_ADDED,
	    WRAPPER_RESOURCE_REMOVED,
	    WRAPPER_THERMISTOR_FAILURE,
	    WRAPPER_TIMING_FAILURE,
	    WRAPPER_TURNED_OFF,
	    WRAPPER_TURNED_ON,
	    WRAPPER_UNDER_TEMPERATURE,
	    WRAPPER_UNRECOVERABLE_FAILURE,
	    WRAPPER_UNRECOVERABLE_STORAGE_ERROR,
	    WRAPPER_WARMING_UP,};
    }

    @Override
    protected int getOffset() {
	return 33;
    }
}

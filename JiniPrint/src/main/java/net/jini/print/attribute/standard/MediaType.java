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
 *
 */
public class MediaType extends EnumSyntax
	implements Attribute {

    private static final long serialVersionUID = 1L;

    public static final MediaType 
	    ALUMINUM = new MediaType(0),//[PWG5100.11]
	    AUTO = new MediaType(1),//[PWG5101.1]
	    BACK_PRINT_FILM = new MediaType(2),//[PWG5101.1]
	    CARDBOARD = new MediaType(3),//[PWG5100.11]
	    CARDSTOCK = new MediaType(4),//[PWG5100.3]
	    CD = new MediaType(5),//[PWG5100.11]
	    CONTINUOUS = new MediaType(6),//[PWG5100.3]
	    CONTINUOUS_LONG = new MediaType(7),//[PWG5100.3]
	    CONTINUOUS_SHORT = new MediaType(8),//[PWG5100.3]
	    CORRUGATED_BOARD = new MediaType(9),//[PWG5100.11]
	    DISC = new MediaType(10),//[PWG5100.11]
	    DISC_GLOSSY = new MediaType(11),//[PWG5101.1]
	    DISC_HIGH_GLOSS = new MediaType(12),//[PWG5101.1]
	    DISC_MATTE = new MediaType(13),//[PWG5101.1]
	    DISC_SATIN = new MediaType(14),//[PWG5101.1]
	    DISC_SEMI_GLOSS = new MediaType(15),//[PWG5101.1]
	    DOUBLE_WALL = new MediaType(16),//[PWG5100.11]
	    DRY_FILM = new MediaType(17),//[PWG5100.11]
	    DVD = new MediaType(18),//[PWG5100.11]
	    EMBOSSING_FOIL = new MediaType(19),//[PWG5100.11]
	    END_BOARD = new MediaType(20),//[PWG5100.11]
	    ENVELOPE = new MediaType(21),//[PWG5100.3]
	    ENVELOPE_ARCHIVAL = new MediaType(22),//[PWG5101.1]
	    ENVELOPE_BOND = new MediaType(23),//[PWG5101.1]
	    ENVELOPE_COATED = new MediaType(24),//[PWG5101.1]
	    ENVELOPE_COTTON = new MediaType(25),//[PWG5101.1]
	    ENVELOPE_FINE = new MediaType(26),//[PWG5101.1]
	    ENVELOPE_HEAVYWEIGHT = new MediaType(27),//[PWG5101.1]
	    ENVELOPE_INKJET = new MediaType(28),//[PWG5101.1]
	    ENVELOPE_LIGHTWEIGHT = new MediaType(29),//[PWG5101.1]
	    ENVELOPE_PLAIN = new MediaType(30),//[PWG5100.3]
	    ENVELOPE_PREPRINTED = new MediaType(31),//[PWG5101.1]
	    ENVELOPE_WINDOW = new MediaType(32),//[PWG5100.3]
	    FABRIC = new MediaType(33),//[PWG5101.1]
	    FABRIC_ARCHIVAL = new MediaType(34),//[PWG5101.1]
	    FABRIC_GLOSSY = new MediaType(35),//[PWG5101.1]
	    FABRIC_HIGH_GLOSS = new MediaType(36),//[PWG5101.1]
	    FABRIC_MATTE = new MediaType(37),//[PWG5101.1]
	    FABRIC_SEMI_GLOSS = new MediaType(38),//[PWG5101.1]
	    FABRIC_WATERPROOF = new MediaType(39),//[PWG5101.1]
	    FILM = new MediaType(40),//[PWG5100.11]
	    FLEXO_BASE = new MediaType(41),//[PWG5100.11]
	    FLEXO_PHOTO_POLYMER = new MediaType(42),//[PWG5100.11]
	    FLUTE = new MediaType(43),//[PWG5100.11]
	    FOIL = new MediaType(44),//[PWG5100.11]
	    FULL_CUT_TABS = new MediaType(45),//[PWG5100.3]
	    GLASS = new MediaType(46),//[PWG5101.1]
	    GLASS_COLORED = new MediaType(47),//[PWG5101.1]
	    GLASS_OPAQUE = new MediaType(48),//[PWG5101.1]
	    GLASS_SURFACED = new MediaType(49),//[PWG5101.1]
	    GLASS_TEXTURED = new MediaType(50),//[PWG5101.1]
	    GRAVURE_CYLINDER = new MediaType(51),//[PWG5100.11]
	    IMAGE_SETTER_PAPER = new MediaType(52),//[PWG5100.11]
	    IMAGING_CYLINDER = new MediaType(53),//[PWG5100.11]
	    LABELS = new MediaType(54),//[PWG5100.3]
	    LABELS_COLORED = new MediaType(55),//[PWG5101.1]
	    LABELS_GLOSSY = new MediaType(56),//[PWG5101.1]
	    LABELS_HIGH_GLOSS = new MediaType(57),//[PWG5101.1]
	    LABELS_INKJET = new MediaType(58),//[PWG5101.1]
	    LABELS_MATTE = new MediaType(59),//[PWG5101.1]
	    LABELS_PERMANENT = new MediaType(60),//[PWG5101.1]
	    LABELS_SATIN = new MediaType(61),//[PWG5101.1]
	    LABELS_SECURITY = new MediaType(62),//[PWG5101.1]
	    LABELS_SEMI_GLOSS = new MediaType(63),//[PWG5101.1]
	    LAMINATING_FOIL = new MediaType(64),//[PWG5100.11]
	    LETTERHEAD = new MediaType(65),//[PWG5100.11]
	    METAL = new MediaType(66),//[PWG5101.1]
	    METAL_GLOSSY = new MediaType(67),//[PWG5101.1]
	    METAL_HIGH_GLOSS = new MediaType(68),//[PWG5101.1]
	    METAL_MATTE = new MediaType(69),//[PWG5101.1]
	    METAL_SATIN = new MediaType(70),//[PWG5101.1]
	    METAL_SEMI_GLOSS = new MediaType(71),//[PWG5101.1]
	    MOUNTING_TAPE = new MediaType(72),//[PWG5100.11]
	    MULTI_LAYER = new MediaType(73),//[PWG5100.3]
	    MULTI_PART_FORM = new MediaType(74),//[PWG5100.3]
	    OTHER = new MediaType(75),//[PWG5100.3]
	    PAPER = new MediaType(76),//[PWG5100.11]
	    PHOTOGRAPHIC = new MediaType(77),//[PWG5100.3]
	    PHOTOGRAPHIC_ARCHIVAL = new MediaType(78),//[PWG5101.1]
	    PHOTOGRAPHIC_FILM = new MediaType(79),//[PWG5101.1]
	    PHOTOGRAPHIC_GLOSSY = new MediaType(80),//[PWG5101.1]
	    PHOTOGRAPHIC_HIGH_GLOSS = new MediaType(81),//[PWG5101.1]
	    PHOTOGRAPHIC_MATTE = new MediaType(82),//[PWG5101.1]
	    PHOTOGRAPHIC_SATIN = new MediaType(83),//[PWG5101.1]
	    PHOTOGRAPHIC_SEMI_GLOSS = new MediaType(84),//[PWG5101.1]
	    PLASTIC = new MediaType(85),//[PWG5101.1]
	    PLASTIC_ARCHIVAL = new MediaType(86),//[PWG5101.1]
	    PLASTIC_COLORED = new MediaType(87),//[PWG5101.1]
	    PLASTIC_GLOSSY = new MediaType(88),//[PWG5101.1]
	    PLASTIC_HIGH_GLOSS = new MediaType(89),//[PWG5101.1]
	    PLASTIC_MATTE = new MediaType(90),//[PWG5101.1]
	    PLASTIC_SATIN = new MediaType(91),//[PWG5101.1]
	    PLASTIC_SEMI_GLOSS = new MediaType(92),//[PWG5101.1]
	    PLATE = new MediaType(93),//[PWG5100.11]
	    POLYESTER = new MediaType(94),//[PWG5100.11]
	    PRE_CUT_TABS = new MediaType(95),//[PWG5100.3]
	    ROLL = new MediaType(96),//[PWG5101.1]
	    SCREEN = new MediaType(97),//[PWG5100.3]
	    SCREEN_PAGED = new MediaType(98),//[PWG5100.3]
	    SELF_ADHESIVE = new MediaType(99),//[PWG5100.11]
	    SELF_ADHESIVE_FILM = new MediaType(100),//[PWG5101.1]
	    SHRINK_FOIL = new MediaType(101),//[PWG5100.11]
	    SINGLE_FACE = new MediaType(102),//[PWG5100.11]
	    SINGLE_WALL = new MediaType(103),//[PWG5100.11]
	    SLEEVE = new MediaType(104),//[PWG5100.11]
	    STATIONERY = new MediaType(105),//[PWG5100.3]
	    STATIONERY_ARCHIVAL = new MediaType(106),//[PWG5101.1]
	    STATIONERY_COATED = new MediaType(107),//[PWG5101.1]
	    STATIONERY_COTTON = new MediaType(108),//[PWG5101.1]
	    STATIONERY_FINE = new MediaType(109),//[PWG5101.1]
	    STATIONERY_HEAVYWEIGHT = new MediaType(110),//[PWG5101.1]
	    STATIONERY_HEAVYWEIGHT_COATED = new MediaType(111),//[PWG5101.1]
	    STATIONERY_INKJET = new MediaType(112),//[PWG5101.1]
	    STATIONERY_LETTERHEAD = new MediaType(113),//[PWG5101.1]
	    STATIONERY_LIGHTWEIGHT = new MediaType(114),//[PWG5101.1]
	    STATIONERY_PREPRINTED = new MediaType(115),//[PWG5101.1]
	    STATIONERY_PREPUNCHED = new MediaType(116),//[PWG5101.1]
	    TAB_STOCK = new MediaType(117),//[PWG5100.3]
	    TRACTOR = new MediaType(118),//[PWG5100.11]
	    TRANSFER = new MediaType(119),//[PWG5101.1]
	    TRANSPARENCY = new MediaType(120),//[PWG5100.3]
	    TRIPLE_WALL = new MediaType(121),//[PWG5100.11]
	    WET_FILM = new MediaType(122);//[PWG5100.11]

    protected MediaType(int value) {
	super(value);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaType.class;
    }

    @Override
    public String getName() {
	return "media-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "aluminum",
	    "auto",
	    "back-print-film",
	    "cardboard",
	    "cardstock",
	    "cd",
	    "continuous",
	    "continuous-long",
	    "continuous-short",
	    "corrugated-board",
	    "disc",
	    "disc-glossy",
	    "disc-high-gloss",
	    "disc-matte",
	    "disc-satin",
	    "disc-semi-gloss",
	    "double-wall",
	    "dry-film",
	    "dvd",
	    "embossing-foil",
	    "end-board",
	    "envelope",
	    "envelope-archival",
	    "envelope-bond",
	    "envelope-coated",
	    "envelope-cotton",
	    "envelope-fine",
	    "envelope-heavyweight",
	    "envelope-inkjet",
	    "envelope-lightweight",
	    "envelope-plain",
	    "envelope-preprinted",
	    "envelope-window",
	    "fabric",
	    "fabric-archival",
	    "fabric-glossy",
	    "fabric-high-gloss",
	    "fabric-matte",
	    "fabric-semi-gloss",
	    "fabric-waterproof",
	    "film",
	    "flexo-base",
	    "flexo-photo-polymer",
	    "flute",
	    "foil",
	    "full-cut-tabs",
	    "glass",
	    "glass-colored",
	    "glass-opaque",
	    "glass-surfaced",
	    "glass-textured",
	    "gravure-cylinder",
	    "image-setter-paper",
	    "imaging-cylinder",
	    "labels",
	    "labels-colored",
	    "labels-glossy",
	    "labels-high-gloss",
	    "labels-inkjet",
	    "labels-matte",
	    "labels-permanent",
	    "labels-satin",
	    "labels-security",
	    "labels-semi-gloss",
	    "laminating-foil",
	    "letterhead",
	    "metal",
	    "metal-glossy",
	    "metal-high-gloss",
	    "metal-matte",
	    "metal-satin",
	    "metal-semi-gloss",
	    "mounting-tape",
	    "multi-layer",
	    "multi-part-form",
	    "other",
	    "paper",
	    "photographic",
	    "photographic-archival",
	    "photographic-film",
	    "photographic-glossy",
	    "photographic-high-gloss",
	    "photographic-matte",
	    "photographic-satin",
	    "photographic-semi-gloss",
	    "plastic",
	    "plastic-archival",
	    "plastic-colored",
	    "plastic-glossy",
	    "plastic-high-gloss",
	    "plastic-matte",
	    "plastic-satin",
	    "plastic-semi-gloss",
	    "plate",
	    "polyester",
	    "pre-cut-tabs",
	    "roll",
	    "screen",
	    "screen-paged",
	    "self-adhesive",
	    "self-adhesive-film",
	    "shrink-foil",
	    "single-face",
	    "single-wall",
	    "sleeve",
	    "stationery",
	    "stationery-archival",
	    "stationery-coated",
	    "stationery-cotton",
	    "stationery-fine",
	    "stationery-heavyweight",
	    "stationery-heavyweight-coated",
	    "stationery-inkjet",
	    "stationery-letterhead",
	    "stationery-lightweight",
	    "stationery-preprinted",
	    "stationery-prepunched",
	    "tab-stock",
	    "tractor",
	    "transfer",
	    "transparency",
	    "triple-wall",
	    "wet-film",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ALUMINUM,
	    AUTO,
	    BACK_PRINT_FILM,
	    CARDBOARD,
	    CARDSTOCK,
	    CD,
	    CONTINUOUS,
	    CONTINUOUS_LONG,
	    CONTINUOUS_SHORT,
	    CORRUGATED_BOARD,
	    DISC,
	    DISC_GLOSSY,
	    DISC_HIGH_GLOSS,
	    DISC_MATTE,
	    DISC_SATIN,
	    DISC_SEMI_GLOSS,
	    DOUBLE_WALL,
	    DRY_FILM,
	    DVD,
	    EMBOSSING_FOIL,
	    END_BOARD,
	    ENVELOPE,
	    ENVELOPE_ARCHIVAL,
	    ENVELOPE_BOND,
	    ENVELOPE_COATED,
	    ENVELOPE_COTTON,
	    ENVELOPE_FINE,
	    ENVELOPE_HEAVYWEIGHT,
	    ENVELOPE_INKJET,
	    ENVELOPE_LIGHTWEIGHT,
	    ENVELOPE_PLAIN,
	    ENVELOPE_PREPRINTED,
	    ENVELOPE_WINDOW,
	    FABRIC,
	    FABRIC_ARCHIVAL,
	    FABRIC_GLOSSY,
	    FABRIC_HIGH_GLOSS,
	    FABRIC_MATTE,
	    FABRIC_SEMI_GLOSS,
	    FABRIC_WATERPROOF,
	    FILM,
	    FLEXO_BASE,
	    FLEXO_PHOTO_POLYMER,
	    FLUTE,
	    FOIL,
	    FULL_CUT_TABS,
	    GLASS,
	    GLASS_COLORED,
	    GLASS_OPAQUE,
	    GLASS_SURFACED,
	    GLASS_TEXTURED,
	    GRAVURE_CYLINDER,
	    IMAGE_SETTER_PAPER,
	    IMAGING_CYLINDER,
	    LABELS,
	    LABELS_COLORED,
	    LABELS_GLOSSY,
	    LABELS_HIGH_GLOSS,
	    LABELS_INKJET,
	    LABELS_MATTE,
	    LABELS_PERMANENT,
	    LABELS_SATIN,
	    LABELS_SECURITY,
	    LABELS_SEMI_GLOSS,
	    LAMINATING_FOIL,
	    LETTERHEAD,
	    METAL,
	    METAL_GLOSSY,
	    METAL_HIGH_GLOSS,
	    METAL_MATTE,
	    METAL_SATIN,
	    METAL_SEMI_GLOSS,
	    MOUNTING_TAPE,
	    MULTI_LAYER,
	    MULTI_PART_FORM,
	    OTHER,
	    PAPER,
	    PHOTOGRAPHIC,
	    PHOTOGRAPHIC_ARCHIVAL,
	    PHOTOGRAPHIC_FILM,
	    PHOTOGRAPHIC_GLOSSY,
	    PHOTOGRAPHIC_HIGH_GLOSS,
	    PHOTOGRAPHIC_MATTE,
	    PHOTOGRAPHIC_SATIN,
	    PHOTOGRAPHIC_SEMI_GLOSS,
	    PLASTIC,
	    PLASTIC_ARCHIVAL,
	    PLASTIC_COLORED,
	    PLASTIC_GLOSSY,
	    PLASTIC_HIGH_GLOSS,
	    PLASTIC_MATTE,
	    PLASTIC_SATIN,
	    PLASTIC_SEMI_GLOSS,
	    PLATE,
	    POLYESTER,
	    PRE_CUT_TABS,
	    ROLL,
	    SCREEN,
	    SCREEN_PAGED,
	    SELF_ADHESIVE,
	    SELF_ADHESIVE_FILM,
	    SHRINK_FOIL,
	    SINGLE_FACE,
	    SINGLE_WALL,
	    SLEEVE,
	    STATIONERY,
	    STATIONERY_ARCHIVAL,
	    STATIONERY_COATED,
	    STATIONERY_COTTON,
	    STATIONERY_FINE,
	    STATIONERY_HEAVYWEIGHT,
	    STATIONERY_HEAVYWEIGHT_COATED,
	    STATIONERY_INKJET,
	    STATIONERY_LETTERHEAD,
	    STATIONERY_LIGHTWEIGHT,
	    STATIONERY_PREPRINTED,
	    STATIONERY_PREPUNCHED,
	    TAB_STOCK,
	    TRACTOR,
	    TRANSFER,
	    TRANSPARENCY,
	    TRIPLE_WALL,
	    WET_FILM,};
    }
}

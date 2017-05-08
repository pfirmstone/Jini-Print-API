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
 * <p>
 * Defines enum attributes used by {@link FinishingSet} to identify the
 * finishing processes that the Printer uses for each copy of each printed
 * Document in the Job. For Jobs with multiple Documents, the
 * "multiple-document-handling" attribute determines what constitutes a "copy"
 * for purposes of finishing.
 * </p>
 *
 *
 *
 * @see FinishingsSet
 * @author peter
 */
public class Finishing extends javax.print.attribute.standard.Finishings {

    public static final Finishing // PWG5100.1-2001 "finishings" values:public static final Finishing 
	    // PWG5100.1-2001 "finishings" values:
	    FOLD = new Finishing(10),
	    TRIM = new Finishing(11),
	    BALE = new Finishing(12),
	    BOOKLET_MAKER = new Finishing(13),
	    JOG_OFFSET = new Finishing(14),
	    BIND_LEFT = new Finishing(50),
	    BIND_TOP = new Finishing(51),
	    BIND_RIGHT = new Finishing(52),
	    BIND_BOTTOM = new Finishing(53),
	    // PWG5100.1-2014 "finishings" values:
	    COAT = new Finishing(15),
	    LAMINATE = new Finishing(16),
	    STAPLE_TRIPLE_LEFT = new Finishing(32),
	    STAPLE_TRIPLE_TOP = new Finishing(33),
	    STAPLE_TRIPLE_RIGHT = new Finishing(34),
	    STAPLE_TRIPLE_BOTTOM = new Finishing(35),
	    PUNCH_TOP_LEFT = new Finishing(70),
	    PUNCH_BOTTOM_LEFT = new Finishing(71),
	    PUNCH_TOP_RIGHT = new Finishing(72),
	    PUNCH_BOTTOM_RIGHT = new Finishing(73),
	    PUNCH_DUAL_LEFT = new Finishing(74),
	    PUNCH_DUAL_TOP = new Finishing(75),
	    PUNCH_DUAL_RIGHT = new Finishing(76),
	    PUNCH_DUAL_BOTTOM = new Finishing(77),
	    PUNCH_TRIPLE_LEFT = new Finishing(78),
	    PUNCH_TRIPLE_TOP = new Finishing(79),
	    PUNCH_TRIPLE_RIGHT = new Finishing(80),
	    PUNCH_TRIPLE_BOTTOM = new Finishing(81),
	    PUNCH_QUAD_LEFT = new Finishing(82),
	    PUNCH_QUAD_TOP = new Finishing(83),
	    PUNCH_QUAD_RIGHT = new Finishing(84),
	    PUNCH_QUAD_BOTTOM = new Finishing(85),
	    FOLD_ACCORDION = new Finishing(90),
	    FOLD_DOUBLE_GATE = new Finishing(91),
	    FOLD_GATE = new Finishing(92),
	    FOLD_HALF = new Finishing(93),
	    FOLD_HALF_Z = new Finishing(94),
	    FOLD_LEFT_GATE = new Finishing(95),
	    FOLD_LETTER = new Finishing(96),
	    FOLD_PARALLEL = new Finishing(97),
	    FOLD_POSTER = new Finishing(98),
	    FOLD_RIGHT_GATE = new Finishing(99),
	    FOLD_Z = new Finishing(100),
	    //The IPP  Job  and  Printer  Extensions - 
	    // Set  3  (JPS3)  [PWG5100.13]  defines  the  following standard enum values:
	    TRIM_AFTER_PAGES = new Finishing(60),
	    TRIM_AFTER_DOCUMENTS = new Finishing(61),
	    TRIM_AFTER_COPIES = new Finishing(62),
	    TRIM_AFTER_JOB = new Finishing(63);

    Finishing(int i) {
	super(i);
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "fold", //10
	    "trim", //11
	    "bale", //12
	    "booklet-maker", //13
	    "jog-offset", //14
	    "coat", //15
	    "laminate", //16
	    null, //17
	    null, //18
	    null, //19
	    null, //20
	    null, //21
	    null, //22
	    null, //23
	    null, //24
	    null, //25
	    null, //26
	    null, //27
	    null, //28
	    null, //29
	    null, //30
	    null, //31
	    "staple-triple-left",//32
	    "staple-triple-top",//33
	    "staple-triple-right",//34
	    "staple-triple-bottom",//35
	    null, //36
	    null, //37
	    null, //38
	    null, //39
	    null, //40
	    null, //41
	    null, //42
	    null, //43
	    null, //44
	    null, //45
	    null, //46
	    null, //47
	    null, //48
	    null, //49
	    "bind-left", //50
	    "bind-top", //51
	    "bind-right", //52
	    "bind-bottom", //53
	    null, //54
	    null, //55
	    null, //56
	    null, //57
	    null, //58
	    null, //59
	    "trim-after-pages",//60
	    "trim-after-documents",//61
	    "trim-after-copies",//62
	    "trim-after-job",//63
	    null, //64
	    null, //65
	    null, //66
	    null, //67
	    null, //68
	    null, //69
	    "punch-top-left",//70
	    "punch-bottom-left",//71
	    "punch-top-right",//72
	    "punch-bottom-right",//73
	    "punch-dual-left",//74
	    "punch-dual-top",//75
	    "punch-dual-right",//76
	    "punch-dual-bottom",//77
	    "punch-triple-left",//78
	    "punch-triple-top",//79
	    "punch-triple-right",//80
	    "punch-triple-bottom",//81
	    "punch-quad-left",//82
	    "punch-quad-top",//83
	    "punch-quad-right",//84
	    "punch-quad-bottom",//85
	    null, //86
	    null, //87
	    null, //88
	    null, //89
	    "fold-accordion",//90
	    "fold-double-gate",//91
	    "fold-gate",//92
	    "fold-half",//93
	    "fold-half-z",//94
	    "fold-left-gate",//95
	    "fold-letter",//96
	    "fold-parallel",//97
	    "fold-poster",//98
	    "fold-right-gate",//99
	    "fold-z",//100
	};

    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    FOLD, //10
	    TRIM, //11
	    BALE, //12
	    BOOKLET_MAKER, //13
	    JOG_OFFSET, //14
	    COAT, //15
	    LAMINATE, //16
	    null, //17
	    null, //18
	    null, //19
	    null, //20
	    null, //21
	    null, //22
	    null, //23
	    null, //24
	    null, //25
	    null, //26
	    null, //27
	    null, //28
	    null, //29
	    null, //30
	    null, //31
	    STAPLE_TRIPLE_LEFT,//32
	    STAPLE_TRIPLE_TOP,//33
	    STAPLE_TRIPLE_RIGHT,//34
	    STAPLE_TRIPLE_BOTTOM,//35
	    null, //36
	    null, //37
	    null, //38
	    null, //39
	    null, //40
	    null, //41
	    null, //42
	    null, //43
	    null, //44
	    null, //45
	    null, //46
	    null, //47
	    null, //48
	    null, //49
	    BIND_LEFT, //50
	    BIND_TOP, //51
	    BIND_RIGHT, //52
	    BIND_BOTTOM, //53
	    null, //54
	    null, //55
	    null, //56
	    null, //57
	    null, //58
	    null, //59
	    TRIM_AFTER_PAGES,//60
	    TRIM_AFTER_DOCUMENTS,//61
	    TRIM_AFTER_COPIES,//62
	    TRIM_AFTER_JOB,//63
	    null, //64
	    null, //65
	    null, //66
	    null, //67
	    null, //68
	    null, //69
	    PUNCH_TOP_LEFT,//70
	    PUNCH_BOTTOM_LEFT,//71
	    PUNCH_TOP_RIGHT,//72
	    PUNCH_BOTTOM_RIGHT,//73
	    PUNCH_DUAL_LEFT,//74
	    PUNCH_DUAL_TOP,//75
	    PUNCH_DUAL_RIGHT,//76
	    PUNCH_DUAL_BOTTOM,//77
	    PUNCH_TRIPLE_LEFT,//78
	    PUNCH_TRIPLE_TOP,//79
	    PUNCH_TRIPLE_RIGHT,//80
	    PUNCH_TRIPLE_BOTTOM,//81
	    PUNCH_QUAD_LEFT,//82
	    PUNCH_QUAD_TOP,//83
	    PUNCH_QUAD_RIGHT,//84
	    PUNCH_QUAD_BOTTOM,//85
	    null, //86
	    null, //87
	    null, //88
	    null, //89
	    FOLD_ACCORDION,//90
	    FOLD_DOUBLE_GATE,//91
	    FOLD_GATE,//92
	    FOLD_HALF,//93
	    FOLD_HALF_Z,//94
	    FOLD_LEFT_GATE,//95
	    FOLD_LETTER,//96
	    FOLD_PARALLEL,//97
	    FOLD_POSTER,//98
	    FOLD_RIGHT_GATE,//99
	    FOLD_Z,//100
	};
    }

    @Override
    protected int getOffset() {
	return 10;
    }
}

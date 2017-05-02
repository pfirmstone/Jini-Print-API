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
public class Finishings extends javax.print.attribute.standard.Finishings {

    public static final Finishings // PWG5100.1-2001 "finishings" values:
	    FOLD = new Finishings(10),
	    TRIM = new Finishings(11),
	    BALE = new Finishings(12),
	    BOOKLET_MAKER = new Finishings(13),
	    JOG_OFFSET = new Finishings(14),
	    BIND_LEFT = new Finishings(50),
	    BIND_TOP = new Finishings(51),
	    BIND_RIGHT = new Finishings(52),
	    BIND_BOTTOM = new Finishings(53),
	    // PWG5100.1-2014 "finishings" values:
	    COAT = new Finishings(15),
	    LAMINATE = new Finishings(16),
	    STAPLE_TRIPLE_LEFT = new Finishings(32),
	    STAPLE_TRIPLE_TOP = new Finishings(33),
	    STAPLE_TRIPLE_RIGHT = new Finishings(34),
	    STAPLE_TRIPLE_BOTTOM = new Finishings(35),
	    PUNCH_TOP_LEFT = new Finishings(70),
	    PUNCH_BOTTOM_LEFT = new Finishings(71),
	    PUNCH_TOP_RIGHT = new Finishings(72),
	    PUNCH_BOTTOM_RIGHT = new Finishings(73),
	    PUNCH_DUAL_LEFT = new Finishings(74),
	    PUNCH_DUAL_TOP = new Finishings(75),
	    PUNCH_DUAL_RIGHT = new Finishings(76),
	    PUNCH_DUAL_BOTTOM = new Finishings(77),
	    PUNCH_TRIPLE_LEFT = new Finishings(78),
	    PUNCH_TRIPLE_TOP = new Finishings(79),
	    PUNCH_TRIPLE_RIGHT = new Finishings(80),
	    PUNCH_TRIPLE_BOTTOM = new Finishings(81),
	    PUNCH_QUAD_LEFT = new Finishings(82),
	    PUNCH_QUAD_TOP = new Finishings(83),
	    PUNCH_QUAD_RIGHT = new Finishings(84),
	    PUNCH_QUAD_BOTTOM = new Finishings(85),
	    FOLD_ACCORDION = new Finishings(90),
	    FOLD_DOUBLE_GATE = new Finishings(91),
	    FOLD_GATE = new Finishings(92),
	    FOLD_HALF = new Finishings(93),
	    FOLD_HALF_Z = new Finishings(94),
	    FOLD_LEFT_GATE = new Finishings(95),
	    FOLD_LETTER = new Finishings(96),
	    FOLD_PARALLEL = new Finishings(97),
	    FOLD_POSTER = new Finishings(98),
	    FOLD_RIGHT_GATE = new Finishings(99),
	    FOLD_Z = new Finishings(100),
	    //The IPP  Job  and  Printer  Extensions - 
	    // Set  3  (JPS3)  [PWG5100.13]  defines  the  following standard enum values:
	    TRIM_AFTER_PAGES = new Finishings(60),
	    TRIM_AFTER_DOCUMENTS = new Finishings(61),
	    TRIM_AFTER_COPIES = new Finishings(62),
	    TRIM_AFTER_JOB = new Finishings(63);

    Finishings(int i) {
	super(i);
    }

   
    @Override
    protected String[] getStringTable() {
	return new String[]{};

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

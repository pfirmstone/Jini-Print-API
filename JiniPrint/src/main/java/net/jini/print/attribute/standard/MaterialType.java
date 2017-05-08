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
import javax.print.attribute.EnumSyntax;

/**
 *
 * This REQUIRED member attribute specifies the type of material. Keyword values
 * are general names for materials (sometimes qualified) and are localized using
 * the message catalog specified by the "printer-strings-uri" Printer
 * Description attribute [PWG5100.13]. Name values are vendor or site specific
 * human readable (already localized) strings.
 *
 * @author peter
 */
public class MaterialType extends EnumSyntax implements Attribute {

    public static final MaterialType 
	    ABS = new MaterialType(0),//[PWG5100.21]
	    ABS_CARBON_FIBER = new MaterialType(1),//[PWG5100.21]
	    ABS_CARBON_NANOTUBE = new MaterialType(2),//[PWG5100.21]
	    CHOCOLATE = new MaterialType(3),//[PWG5100.21]
	    GOLD = new MaterialType(4),//[PWG5100.21]
	    NYLON = new MaterialType(5),//[PWG5100.21]
	    PET = new MaterialType(6),//[PWG5100.21]
	    PHOTOPOLYMER = new MaterialType(7),//[PWG5100.21]
	    PLA = new MaterialType(8),//[PWG5100.21]
	    PLA_CONDUCTIVE = new MaterialType(9),//[PWG5100.21]
	    PLA_DISSOLVABLE = new MaterialType(10),//[PWG5100.21]
	    PLA_FLEXIBLE = new MaterialType(11),//[PWG5100.21]
	    PLA_MAGNETIC = new MaterialType(12),//[PWG5100.21]
	    PLA_STEEL = new MaterialType(13),//[PWG5100.21]
	    PLA_STONE = new MaterialType(14),//[PWG5100.21]
	    PLA_WOOD = new MaterialType(15),//[PWG5100.21]
	    POLYCARBONATE = new MaterialType(16),//[PWG5100.21]
	    SILVER = new MaterialType(17),//[PWG5100.21]
	    TITANIUM = new MaterialType(18),//[PWG5100.21]
	    WAX = new MaterialType(19);//[PWG5100.21]

    private MaterialType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialType.class;
    }

    @Override
    public String getName() {
	return "material-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "abs",
	    "abs-carbon-fiber",
	    "abs-carbon-nanotube",
	    "chocolate",
	    "gold",
	    "nylon",
	    "pet",
	    "photopolymer",
	    "pla",
	    "pla-conductive",
	    "pla-dissolvable",
	    "pla-flexible",
	    "pla-magnetic",
	    "pla-steel",
	    "pla-stone",
	    "pla-wood",
	    "polycarbonate",
	    "silver",
	    "titanium",
	    "wax",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ABS,
	    ABS_CARBON_FIBER,
	    ABS_CARBON_NANOTUBE,
	    CHOCOLATE,
	    GOLD,
	    NYLON,
	    PET,
	    PHOTOPOLYMER,
	    PLA,
	    PLA_CONDUCTIVE,
	    PLA_DISSOLVABLE,
	    PLA_FLEXIBLE,
	    PLA_MAGNETIC,
	    PLA_STEEL,
	    PLA_STONE,
	    PLA_WOOD,
	    POLYCARBONATE,
	    SILVER,
	    TITANIUM,
	    WAX,};
    }

}

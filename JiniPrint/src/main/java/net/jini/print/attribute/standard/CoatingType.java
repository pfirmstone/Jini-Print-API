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
import javax.print.attribute.PrintJobAttribute;

/**
 * The "coating-type" member attribute specifies the type of coating to apply.
 *
 * @see Coating
 * @see FinishingsCollection
 *
 * @author peter
 */
public class CoatingType extends EnumSyntax implements PrintJobAttribute {

    /**
     * Each sheet is coated to preserve the output for an extended period of
     * time, e.g., a UV protectant.
     */
    public static final CoatingType ARCHIVAL = new CoatingType(0);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a glossy surface that preserves the
     * output for an extended period of time, e.g., a UV protectant.
     */
    public static final CoatingType ARCHIVAL_GLOSSY = new CoatingType(1);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a matte surface that preserves the output
     * for an extended period of time, e.g., a UV protectant.
     */
    public static final CoatingType ARCHIVAL_MATTE = new CoatingType(2);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a semi-gloss surface that preserves the
     * output for an extended period of time, e.g., a UV protectant.
     */
    public static final CoatingType ARCHIVAL_SEMI_GLOSS = new CoatingType(3);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a glossy surface.
     */
    public static final CoatingType GLOSSY = new CoatingType(4);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a high-gloss surface.
     */
    public static final CoatingType HIGH_GLOSS = new CoatingType(5);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a matte surface.
     */
    public static final CoatingType MATTE = new CoatingType(6);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a semi-gloss surface.
     */
    public static final CoatingType SEMI_GLOSS = new CoatingType(7);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a water resistent surface.
     */
    public static final CoatingType SILICONE = new CoatingType(8);//[PWG5100.1]
    /**
     * Each sheet is coated to produce a translucent surface.
     */
    public static final CoatingType TRANSLUCENT = new CoatingType(9);//[PWG5100.1]

    protected CoatingType(int i) {
	super(i);
    }

    /**
     *
     * @return CoatingType.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return CoatingType.class;
    }

    /**
     *
     * @return "coating-type" string.
     */
    @Override
    public String getName() {
	return "coating-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "archival",
	    "archival-glossy",
	    "archival-matte",
	    "archival-semi-gloss",
	    "glossy",
	    "high-gloss",
	    "matte",
	    "semi-gloss",
	    "silicone",
	    "translucent",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ARCHIVAL,
	    ARCHIVAL_GLOSSY,
	    ARCHIVAL_MATTE,
	    ARCHIVAL_SEMI_GLOSS,
	    GLOSSY,
	    HIGH_GLOSS,
	    MATTE,
	    SEMI_GLOSS,
	    SILICONE,
	    TRANSLUCENT,};
    }

}

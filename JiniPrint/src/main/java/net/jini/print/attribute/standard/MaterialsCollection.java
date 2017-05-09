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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * This REQUIRED Job Template attribute defines the materials to be used for the
 * Job. When specified, the Printer validates the requested materials both when
 * the Job is created and when it enters the 'processing' state. If the
 * requested materials are not loaded, the 'material-needed' keyword is added to
 * the Printer's "printer-state-reasons" values and the Job is placed in the
 * 'processing-stopped' state. The Printer advertises which "materials-col"
 * member attributes are supported in the "materials-col-supported" (section
 * 8.3.13) Printer Description attribute. The Printer lists only those member
 * attributes that are applicable to the technology being used for printing. The
 * Client typically supplies "materials-col" values matching those returned in
 * the "materials-col-database" (section 8.3.1) or "materials-col-ready"
 * (section 8.3.12) Printer Description attributes, although specifying the
 * "material-name" or "material-key" member attribute from either of these
 * Printer Description attributes is enough to specify the default values for
 * the named material. Table 11 lists the member attributes.
 *
 * PWG 5100.21 – IPP 3D Printing Extensions (3D) February 10, 2017 Page 31
 * Copyright © 2015-2017 The Printer Working Group. All rights reserved.
 *
 * @author peter
 */
public class MaterialsCollection extends CollectionSyntax
	implements DocAttribute, PrintRequestAttribute {

    private final MaterialAmount amount;
    private final MaterialAmountUnits amountUnits;
    private final MaterialColor color;
    private final MaterialDiameter nanometres;
    private final MaterialFillDensity density;
    private final MaterialKey key;
    private final MaterialName materialName;
    private final MaterialPurpose purpose;
    private final MaterialRate rate;
    private final MaterialRateUnits rateUnits;
    private final MaterialShellThickness shellThickness;
    private final MaterialTemperature temperatureRange;
    private final MaterialType type;
    private final MaterialDiameterTolerance tolerance;

    public MaterialsCollection(MaterialAmount amount,
	    MaterialAmountUnits amountUnits,
	    MaterialColor color,
	    MaterialDiameter nanometres,
	    MaterialDiameterTolerance tolerance,
	    MaterialFillDensity density,
	    MaterialKey key,
	    MaterialName name,
	    MaterialPurpose purpose,
	    MaterialRate rate,
	    MaterialRateUnits rateUnits,
	    MaterialShellThickness shellThickness,
	    MaterialTemperature temperatureRange,
	    MaterialType type
    ) {
	this.amount = amount;
	this.amountUnits = amountUnits;
	this.color = color;
	this.nanometres = nanometres;
	this.tolerance = tolerance;
	this.density = density;
	this.key = key;
	this.materialName = name;
	this.purpose = purpose;
	this.rate = rate;
	this.rateUnits = rateUnits;
	this.shellThickness = shellThickness;
	this.temperatureRange = temperatureRange;
	this.type = type;
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{
	    amount,
	    amountUnits,
	    color,
	    nanometres,
	    tolerance,
	    density,
	    key,
	    materialName,
	    purpose,
	    rate,
	    rateUnits,
	    shellThickness,
	    temperatureRange,
	    type,};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialsCollection.class;
    }

    @Override
    public String getName() {
	return "materials-col";
    }

    /**
     * @return the amount
     */
    public MaterialAmount getAmount() {
	return amount;
    }

    /**
     * @return the amountUnits
     */
    public MaterialAmountUnits getAmountUnits() {
	return amountUnits;
    }

    /**
     * @return the color
     */
    public MaterialColor getColor() {
	return color;
    }

    /**
     * @return the nanometres
     */
    public MaterialDiameter getNanometres() {
	return nanometres;
    }

    /**
     * @return the density
     */
    public MaterialFillDensity getDensity() {
	return density;
    }

    /**
     * @return the key
     */
    public MaterialKey getKey() {
	return key;
    }

    /**
     * @return the purpose
     */
    public MaterialPurpose getPurpose() {
	return purpose;
    }

    /**
     * @return the rate
     */
    public MaterialRate getRate() {
	return rate;
    }

    /**
     * @return the rateUnits
     */
    public MaterialRateUnits getRateUnits() {
	return rateUnits;
    }

    /**
     * @return the shellThickness
     */
    public MaterialShellThickness getShellThickness() {
	return shellThickness;
    }

    /**
     * @return the temperatureRange
     */
    public MaterialTemperature getTemperatureRange() {
	return temperatureRange;
    }

    /**
     * @return the type
     */
    public MaterialType getType() {
	return type;
    }

    /**
     * @return the tolerance
     */
    public MaterialDiameterTolerance getTolerance() {
	return tolerance;
    }

    /**
     * @return the materialName
     */
    public MaterialName getMaterialName() {
	return materialName;
    }

}

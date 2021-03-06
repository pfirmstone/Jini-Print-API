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

import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.PrintJobAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * This REQUIRED Job Status attribute contains the material(s) that were used
 * when processing the Job.
 *
 * @author peter
 */
public class MaterialsColActual extends OneSetOfSyntax implements PrintJobAttribute {

    public MaterialsColActual(Set<MaterialsCollection> materialsCol) {
	super(materialsCol);
    }

    @Override
    public Class<? extends Attribute> getCategory() {

	return MaterialsColActual.class;
    }

    @Override
    public String getName() {
	return "materials-col-actual";
    }

}

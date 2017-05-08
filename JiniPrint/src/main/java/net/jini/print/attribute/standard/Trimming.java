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
import net.jini.print.attribute.CollectionSyntax;

/**
 * //TODO.
 * @author peter
 */
public class Trimming extends CollectionSyntax implements Attribute {
    private final TrimmingOffset offset;
    private final TrimmingReferenceEdge referenceEdge;
    private final TrimmingType type;
    private final TrimmingWhen when;
    
    public Trimming(
	    TrimmingOffset offset,
	    TrimmingReferenceEdge referenceEdge,
	    TrimmingType type,
	    TrimmingWhen when
    ){
	this.offset = offset;
	this.referenceEdge = referenceEdge;
	this.type = type;
	this.when = when;
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{
	    offset, referenceEdge, type, when,
	};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Trimming.class;
    }

    @Override
    public String getName() {
	return "trimming";
    }

    /**
     * @return the offset
     */
    public TrimmingOffset getOffset() {
	return offset;
    }

    /**
     * @return the referenceEdge
     */
    public TrimmingReferenceEdge getReferenceEdge() {
	return referenceEdge;
    }

    /**
     * @return the type
     */
    public TrimmingType getType() {
	return type;
    }

    /**
     * @return the when
     */
    public TrimmingWhen getWhen() {
	return when;
    }
    
}

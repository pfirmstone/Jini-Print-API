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
 *
 * @author peter
 */
public class Folding extends CollectionSyntax implements Attribute {
    private final FoldingDirection direction;
    private final FoldingOffset offset;
    private final FoldingReferenceEdge referenceEdge;
    
    public Folding(
	    FoldingDirection direction,
	    FoldingOffset offset,
	    FoldingReferenceEdge referenceEdge    
	)
    {
	this.direction =direction;
	this.offset = offset;
	this.referenceEdge = referenceEdge;
    }

    @Override
    protected Attribute[] getAttributes() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the direction
     */
    public FoldingDirection getDirection() {
	return direction;
    }

    /**
     * @return the offset
     */
    public FoldingOffset getOffset() {
	return offset;
    }

    /**
     * @return the referenceEdge
     */
    public FoldingReferenceEdge getReferenceEdge() {
	return referenceEdge;
    }
    
}

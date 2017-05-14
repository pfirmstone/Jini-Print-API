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
 * <p>
 * The "folding" member attribute specifies the location and direction of folds
 * to apply to the hardcopy output. Printers with a folding finisher MUST
 * support this member attribute and all "folding-xxx" member attributes if they
 * support the "finishings-col" attribute.
 * </p><p>
 * Note: The order of “folding” values is significant and is part of the fold
 * intent. Printers MAY re-order “folding” values so long as the final result
 * matches the specified intent.
 * </p><p>
 * Note: This specification only defines folds parallel to the reference edge.
 * Diagonal folds are explicitly not supported.</p>
 * 
 * @see FinishingCollection
 * @see FoldingSeq
 *
 * @author peter
 */
public class Folding extends CollectionSyntax {

    private final FoldingDirection direction;
    private final FoldingOffset offset;
    private final FoldingReferenceEdge referenceEdge;

    public Folding(
	    FoldingDirection direction,
	    FoldingOffset offset,
	    FoldingReferenceEdge referenceEdge
    ) {
	this.direction = direction;
	this.offset = offset;
	this.referenceEdge = referenceEdge;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{direction, offset, referenceEdge};
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

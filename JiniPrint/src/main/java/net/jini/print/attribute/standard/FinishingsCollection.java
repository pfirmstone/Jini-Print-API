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
 * Reference: PWG 5100.1 – IPP Finishings 2.0 (FIN) December 19, 2014
 * <p>
 * The "finishings" Job Template attribute [RFC2911] allows Clients to specify
 * simple intent - staple, fold, trim, etc. This specification extends the
 * original values to include positional characteristics, e.g., staple top-left,
 * as well as common variations, e.g., Z fold.
 * </p><p>
 * The "finishings-col" Job Template attribute [PWG5100.3] allows Clients to
 * specify detailed intent - staple at the following coordinates, fold at the
 * following positions and directions, trim at the following positions and cut
 * types, etc. This specification extends the original "finishing-template"
 * member attribute to include standard names and adds member attributes for
 * each type of finishing.
 * </p><p>
 * The coordinate system scheme used in this specification agrees with the
 * Finisher MIB [RFC3806], which in turn follows the ISO DPA [ISO10175] approach
 * of using a coordinate system as if the document were portrait. The approach
 * for coordinate system being relative to the intended reading direction
 * depends on the device being able to understand the orientation embedded in
 * the PDL, which is too problematic for many PDLs. The approach for the
 * coordinate system of being relative to the media feed direction is too
 * dependent on the way the device is configured, i.e., pulling short edge first
 * vs. long edge first, and can vary between different output bins in the same
 * device.
 * </p>
 *
 * @author peter
 */
public class FinishingsCollection extends CollectionSyntax {

    private final FinishingTemplate template;
    private final Bailing bailing;
    private final Binding binding;
    private final Coating coating;
    private final Covering covering;
    private final FoldingSeq folding;
    private final ImpositionTemplate impositionTemplate;
    private final Laminating laminating;
    private final MediaSize mediaSize;
    private final MediaSizeName mediaSizeName;
    private final Punching punching;
    private final Stitching stitching;
    private final Trimming trimming;

    /**
     * Constructs a new instance.
     * 
     * Older printers may not recognise the full range of media size names,
     * media size may be a better option for compatibility.
     * 
     * @param template finishings template
     * @param bailing bailing or null
     * @param binding binding or null
     * @param coating coating or null
     * @param covering covering or null
     * @param folding folding or null
     * @param impositionTemplate imposition template or null
     * @param laminating laminating or null
     * @param mediaSize media size or null
     * @param punching punching or null
     * @param stitching stitching or null
     * @param trimming trimming or null
     * 
     * @throws NullPointerException if finishing template is null.
     */
    public FinishingsCollection(
	    FinishingTemplate template,
	    Bailing bailing,
	    Binding binding,
	    Coating coating,
	    Covering covering,
	    FoldingSeq folding,
	    ImpositionTemplate impositionTemplate,
	    Laminating laminating,
	    MediaSize mediaSize,
	    Punching punching,
	    Stitching stitching,
	    Trimming trimming
    ) {
	this(notNull(template), bailing, binding, coating, covering, folding,
		impositionTemplate, laminating, mediaSize, null, punching,
		stitching, trimming);
    }

    /**
     * Constructs a new instance.  MediaSizeName is preferred.
     * 
     * @param template finishing template
     * @param bailing bailing or null
     * @param binding binding or null
     * @param coating coating or null
     * @param covering covering or null
     * @param folding folding or null
     * @param impositionTemplate imposition template or null
     * @param laminating laminating or null
     * @param mediaSizeName media size name or null
     * @param punching punching or null
     * @param stitching stitching or null
     * @param trimming trimming or null
     * @throws NullPointerException if finishing template is null.
     */
    public FinishingsCollection(
	    FinishingTemplate template,
	    Bailing bailing,
	    Binding binding,
	    Coating coating,
	    Covering covering,
	    FoldingSeq folding,
	    ImpositionTemplate impositionTemplate,
	    Laminating laminating,
	    MediaSizeName mediaSizeName,
	    Punching punching,
	    Stitching stitching,
	    Trimming trimming
    ) {
	this(notNull(template), bailing, binding, coating, covering, folding,
		impositionTemplate, laminating, null, mediaSizeName, punching,
		stitching, trimming);
    }
    
    private FinishingsCollection(
	    FinishingTemplate template,
	    Bailing bailing,
	    Binding binding,
	    Coating coating,
	    Covering covering,
	    FoldingSeq folding,
	    ImpositionTemplate impositionTemplate,
	    Laminating laminating,
	    MediaSize mediaSize,
	    MediaSizeName mediaSizeName,
	    Punching punching,
	    Stitching stitching,
	    Trimming trimming
    ) {
	this.template = template;
	this.bailing = bailing;
	this.binding = binding;
	this.coating = coating;
	this.covering = covering;
	this.folding = folding;
	this.impositionTemplate = impositionTemplate;
	this.laminating = laminating;
	this.mediaSize = mediaSize;
	this.mediaSizeName = mediaSizeName;
	this.punching = punching;
	this.stitching = stitching;
	this.trimming = trimming;
    }
    
    /**
     * Invariant check
     * @param template
     * @return 
     * @throws NullPointerException
     */
    private static FinishingTemplate notNull(FinishingTemplate template){
	if (template != null) return template;
	throw new NullPointerException("template cannot be null");
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{
	    template,
	    bailing,
	    binding,
	    coating,
	    covering,
	    folding,
	    impositionTemplate,
	    laminating,
	    mediaSizeName != null ? mediaSizeName : mediaSize,
	    punching,
	    stitching,
	    trimming,};
    }

    /**
     * @return the template
     */
    public FinishingTemplate getTemplate() {
	return template;
    }

    /**
     * @return the bailing
     */
    public Bailing getBailing() {
	return bailing;
    }

    /**
     * @return the binding
     */
    public Binding getBinding() {
	return binding;
    }

    /**
     * @return the coating
     */
    public Coating getCoating() {
	return coating;
    }

    /**
     * @return the covering
     */
    public Covering getCovering() {
	return covering;
    }

    /**
     * @return the folding
     */
    public FoldingSeq getFolding() {
	return folding;
    }

    /**
     * @return the impositionTemplate
     */
    public ImpositionTemplate getImpositionTemplate() {
	return impositionTemplate;
    }

    /**
     * @return the laminating
     */
    public Laminating getLaminating() {
	return laminating;
    }

    /**
     * @return the mediaSize
     */
    public MediaSize getMediaSize() {
	return mediaSize;
    }

    /**
     * @return the mediaSizeName
     */
    public MediaSizeName getMediaSizeName() {
	return mediaSizeName;
    }

    /**
     * @return the punching
     */
    public Punching getPunching() {
	return punching;
    }

    /**
     * @return the stitching
     */
    public Stitching getStitching() {
	return stitching;
    }

    /**
     * @return the trimming
     */
    public Trimming getTrimming() {
	return trimming;
    }

}

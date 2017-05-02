/*
 * Copyright (C) the original author or authors.
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
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * IPP 2.1 Internet Printing Protocol (IPP) : Production Printing Attributes –
 * Set 1 (for 185 “media-col” attributes) [PWG5100.3]
 *
 * @author Peter Firmstone
 *
 */
public class MediaCollection extends CollectionSyntax 
	implements DocAttribute, PrintRequestAttribute, PrintJobAttribute {

    /**
     * Media key, or null if not specified.
     *
     * @serialField
     */
    private final MediaKey mediaKey;
    private final MediaBottomMargin mediaBottomMargin;
    private final MediaLeftMargin mediaLeftMargin;
    private final MediaRightMargin mediaRightMargin;
    private final MediaTopMargin mediaTopMargin;
    private final MediaSource mediaSource;
    private final MediaSourceProperties mediaSourceProp;
    private final MediaSizeName mediaSizeName;

    /**
     *
     * @return Media key, or null if not specified.
     */
    public MediaKey getMediaKey() {
	return mediaKey;
    }
    /**
     * Media type, or null if not specified.
     *
     * @serialField
     */
    private final MediaType mediaType;

    /**
     *
     * @return Media Type, or null if not specified.
     */
    public MediaType getMediaType() {
	return mediaType;
    }
    /**
     * Media info, or null if not specified.
     *
     * @serialField
     */
    private final MediaInfo mediaInfo;

    /**
     *
     * @return Media Info, or null if not specified.
     */
    public MediaInfo getMediaInfo() {
	return mediaInfo;
    }
    /**
     * Media color, or null if not specified.
     *
     * @serialField
     */
    private final MediaColor mediaColor;

    /**
     *
     * @return Media , or null if not specified.
     */
    public MediaColor getMediaColor() {
	return mediaColor;
    }
    /**
     * Media pre-printed, or null if not specified.
     *
     * @serialField
     */
    private final MediaPrePrinted mediaPrePrinted;

    /**
     *
     * @return Media PrePrinted, or null if not specified.
     */
    public MediaPrePrinted getMediaPrePrinted() {
	return mediaPrePrinted;
    }
    /**
     * Media hole count, or null if not specified.
     *
     * @serialField
     */
    private final MediaHoleCount mediaHoleCount;

    /**
     *
     * @return Media HoleCount, or null if not specified.
     */
    public MediaHoleCount getMediaHoleCount() {
	return mediaHoleCount;
    }
    /**
     * Media order count, or null if not specified.
     *
     * @serialField
     */
    private final MediaOrderCount mediaOrderCount;

    /**
     *
     * @return Media OrderCount, or null if not specified.
     */
    public MediaOrderCount getMediaOrderCount() {
	return mediaOrderCount;
    }
    /**
     * Media size, or null if not specified.
     *
     * @serialField
     */
    private final MediaSize mediaSize;

    /**
     * Note that Java's MediaSize is incorrect, its x, y dimensions need to be
     * defined in hundredths of millimeters. So we'll need to do some sort of
     * conversion. TODO: implement MediaSize according to the standard.
     *
     * @return Media Size, or null if not specified.
     */
    public MediaSize getMediaSize() {
	return mediaSize;
    }
    /**
     * Media metric weight, or null if not specified.
     *
     * @serialField
     */
    private final MediaWeightMetric mediaWeightMetric;

    /**
     *
     * @return Media WeightMetric, or null if not specified.
     */
    public MediaWeightMetric getMediaWeightMetric() {
	return mediaWeightMetric;
    }

    /**
     * Media back coating, or null if not specified.
     *
     * @serialField
     */
    private final MediaBackCoating mediaBackCoating;

    /**
     *
     * @return Media BackCoating , or null if not specified.
     */
    public MediaBackCoating getMediaBackCoating() {
	return mediaBackCoating;
    }

    /**
     * Media front coating, or null if not specified.
     *
     * @serialField
     */
    private final MediaFrontCoating mediaFrontCoating;

    /**
     *
     * @return Media FrontCoating, or null if not specified.
     */
    public MediaFrontCoating getMediaFrontCoating() {
	return mediaFrontCoating;
    }

    /**
     * Media recycled, or null if not specified.
     *
     * @serialField
     */
    private final MediaRecycled mediaRecycled;

    /**
     *
     * @return Media Recycled, or null if not specified.
     */
    public MediaRecycled getMediaRecycled() {
	return mediaRecycled;
    }
    
    

    /**
     *
     * @param mediaKey
     * @param mediaType
     * @param mediaInfo
     * @param mediaColor
     * @param mediaPrePrinted
     * @param mediaHoleCount
     * @param mediaOrderCount
     * @param mediaSize
     * @param mediaWeightMetric
     * @param mediaBackCoating
     * @param mediaFrontCoating
     * @param mediaRecycled
     * @param mediaBottomMargin
     * @param mediaLeftMargin
     * @param mediaRightMargin
     * @param mediaTopMargin
     * @param mediaSource
     * @param mediaSourceProp
     */
    public MediaCollection(
	    MediaKey mediaKey,
	    MediaType mediaType,
	    MediaInfo mediaInfo,
	    MediaColor mediaColor,
	    MediaPrePrinted mediaPrePrinted,
	    MediaHoleCount mediaHoleCount,
	    MediaOrderCount mediaOrderCount,
	    MediaSize mediaSize,
	    MediaWeightMetric mediaWeightMetric,
	    MediaBackCoating mediaBackCoating,
	    MediaFrontCoating mediaFrontCoating,
	    MediaRecycled mediaRecycled,
	    MediaBottomMargin mediaBottomMargin,
	    MediaLeftMargin mediaLeftMargin,
	    MediaRightMargin mediaRightMargin,
	    MediaTopMargin mediaTopMargin,
	    MediaSource mediaSource,
	    MediaSourceProperties mediaSourceProp
    ) {
	this.mediaKey = mediaKey;
	this.mediaType = mediaType;
	this.mediaInfo = mediaInfo;
	this.mediaColor = mediaColor;
	this.mediaPrePrinted = mediaPrePrinted;
	this.mediaHoleCount = mediaHoleCount;
	this.mediaOrderCount = mediaOrderCount;
	this.mediaSize = mediaSize;
	this.mediaWeightMetric = mediaWeightMetric;
	this.mediaBackCoating = mediaBackCoating;
	this.mediaFrontCoating = mediaFrontCoating;
	this.mediaRecycled = mediaRecycled;
	this.mediaBottomMargin = mediaBottomMargin;
	this.mediaLeftMargin = mediaLeftMargin;
	this.mediaRightMargin = mediaRightMargin;
	this.mediaTopMargin = mediaTopMargin;
	this.mediaSource = mediaSource;
	this.mediaSourceProp = mediaSourceProp;
	this.mediaSizeName = null;
    }
    
    /**
     * 
     * @param mediaKey
     * @param mediaType
     * @param mediaInfo
     * @param mediaColor
     * @param mediaPrePrinted
     * @param mediaHoleCount
     * @param mediaOrderCount
     * @param mediaSizeName
     * @param mediaWeightMetric
     * @param mediaBackCoating
     * @param mediaFrontCoating
     * @param mediaRecycled
     * @param mediaBottomMargin
     * @param mediaLeftMargin
     * @param mediaRightMargin
     * @param mediaTopMargin
     * @param mediaSource
     * @param mediaSourceProp 
     */
    public MediaCollection(
	    MediaKey mediaKey,
	    MediaType mediaType,
	    MediaInfo mediaInfo,
	    MediaColor mediaColor,
	    MediaPrePrinted mediaPrePrinted,
	    MediaHoleCount mediaHoleCount,
	    MediaOrderCount mediaOrderCount,
	    MediaSizeName mediaSizeName,
	    MediaWeightMetric mediaWeightMetric,
	    MediaBackCoating mediaBackCoating,
	    MediaFrontCoating mediaFrontCoating,
	    MediaRecycled mediaRecycled,
	    MediaBottomMargin mediaBottomMargin,
	    MediaLeftMargin mediaLeftMargin,
	    MediaRightMargin mediaRightMargin,
	    MediaTopMargin mediaTopMargin,
	    MediaSource mediaSource,
	    MediaSourceProperties mediaSourceProp
    ) {
	this.mediaKey = mediaKey;
	this.mediaType = mediaType;
	this.mediaInfo = mediaInfo;
	this.mediaColor = mediaColor;
	this.mediaPrePrinted = mediaPrePrinted;
	this.mediaHoleCount = mediaHoleCount;
	this.mediaOrderCount = mediaOrderCount;
	this.mediaSizeName = mediaSizeName;
	this.mediaWeightMetric = mediaWeightMetric;
	this.mediaBackCoating = mediaBackCoating;
	this.mediaFrontCoating = mediaFrontCoating;
	this.mediaRecycled = mediaRecycled;
	this.mediaBottomMargin = mediaBottomMargin;
	this.mediaLeftMargin = mediaLeftMargin;
	this.mediaRightMargin = mediaRightMargin;
	this.mediaTopMargin = mediaTopMargin;
	this.mediaSource = mediaSource;
	this.mediaSourceProp = mediaSourceProp;
	this.mediaSize = null;
    }

    /**
     *
     * @param theCharacteristics
     */
//    public MediaCollection(Attribute[] theCharacteristics) {
//	this(get(theCharacteristics, MediaKey.class),
//		get(theCharacteristics, MediaType.class),
//		get(theCharacteristics, MediaInfo.class),
//		get(theCharacteristics, MediaColor.class),
//		get(theCharacteristics, MediaPrePrinted.class),
//		get(theCharacteristics, MediaHoleCount.class),
//		get(theCharacteristics, MediaOrderCount.class),
//		get(theCharacteristics, MediaSize.class),
//		get(theCharacteristics, MediaWeightMetric.class),
//		get(theCharacteristics, MediaBackCoating.class),
//		get(theCharacteristics, MediaFrontCoating.class),
//		get(theCharacteristics, MediaRecycled.class)
//	);
//    }

    private static <T> T get(Attribute[] charac, Class<T> clas) {
	int n = charac == null ? 0 : charac.length;
	for (int i = 0; i < n; ++i) {
	    if (clas.isInstance(charac[i])) {
		return (T) charac[i];
	    }
	}
	return null;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaCollection.class;
    }

    @Override
    public String getName() {
	return "media-col";
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{
	    this.mediaKey,
	    this.mediaType,
	    this.mediaInfo,
	    this.mediaColor,
	    this.mediaPrePrinted,
	    this.mediaHoleCount,
	    this.mediaOrderCount,
	    this.mediaSize,
	    this.mediaWeightMetric,
	    this.mediaBackCoating,
	    this.mediaFrontCoating,
	    this.mediaRecycled,};
    }

    /**
     * @return the mediaBottomMargin
     */
    public MediaBottomMargin getMediaBottomMargin() {
	return mediaBottomMargin;
    }

    /**
     * @return the mediaLeftMargin
     */
    public MediaLeftMargin getMediaLeftMargin() {
	return mediaLeftMargin;
    }

    /**
     * @return the mediaRightMargin
     */
    public MediaRightMargin getMediaRightMargin() {
	return mediaRightMargin;
    }

    /**
     * @return the mediaTopMargin
     */
    public MediaTopMargin getMediaTopMargin() {
	return mediaTopMargin;
    }

    /**
     * @return the mediaSource
     */
    public MediaSource getMediaSource() {
	return mediaSource;
    }

    /**
     * @return the mediaSourceProp
     */
    public MediaSourceProperties getMediaSourceProp() {
	return mediaSourceProp;
    }
}

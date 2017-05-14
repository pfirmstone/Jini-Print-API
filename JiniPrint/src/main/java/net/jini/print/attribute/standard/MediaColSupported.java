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

import java.lang.annotation.Annotation;
import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 *
 * The "media-col-supported" Printer attribute identifies the keyword names of
 * the member attributes supported in the "media-col" collection Job Template
 * attribute, i.e., the keyword names of the member attributes in Table 10 that
 * the Printer supports.
 *
 * @see MediaCollection
 */
public class MediaColSupported extends OneSetOfSyntax implements SupportedValuesAttribute {

    public static enum Keyword implements Attribute {

	MEDIA_KEY("media-key"),
	MEDIA_TYPE("media-type"),
	MEDIA_INFO("media-info"),
	MEDIA_COLOR("media-color"),
	MEDIA_PRE_PRINTED("media-pre-printed"),
	MEDIA_HOLE_COUNT("media-hole-count"),
	MEDIA_ORDER_COUNT("media-order-count"),
	MEDIA_SIZE("media-size"),
	MEDIA_SIZE_NAME("media-size-name"),
	MEDIA_WEIGHT_METRIC("media-weight-metric"),
	MEDIA_BACK_COATING("media-back-coating"),
	MEDIA_FRONT_COATING("media-front-coating"),
	MEDIA_RECYCLED("media-recycled"),
	MEDIA_BOTTOM_MARGIN("media-bottom-margin"),
	MEDIA_LEFT_MARGIN("media-left_margin"),
	MEDIA_RIGHT_MARGIN("media-right-margin"),
	MEDIA_TOP_MARGIN("media-top-margin"),
	MEDIA_SOURCE("media-source"),
	MEDIA_SOURCE_PROPERTIES("media-source-properties");

	@Override
	public String toString() {
	    return keyword;
	}

	private final String keyword;

	private Keyword(String keyword) {
	    this.keyword = keyword;
	}

	@Override
	public Class<? extends Attribute> getCategory() {
	    return Keyword.class;
	}

	@Override
	public String getName() {
	    return "media-col-supported";
	}
    }

    public MediaColSupported(Set<Keyword> supported) {
	super(supported);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaColSupported.class;
    }

    @Override
    public String getName() {
	return "media-col-supported";
    }

}

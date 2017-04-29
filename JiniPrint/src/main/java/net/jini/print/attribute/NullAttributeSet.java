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

package net.jini.print.attribute;

import java.io.Serializable;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.UnmodifiableSetException;

/**
 * Null object pattern AttributeSet.
 */
public final class NullAttributeSet implements AttributeSet, Serializable {
    
    public static final AttributeSet NULL_SET = new NullAttributeSet();
    private static final Attribute[] ATTRIBUTES = new Attribute[0];
    
    private NullAttributeSet(){}

    @Override
    public Attribute get(Class<?> category) {
	if (category == null) throw new NullPointerException("category cannot be null");
	if (Attribute.class.isAssignableFrom(category)) return null;
	throw new ClassCastException("category isn't an instance of Attribute");
    }

    @Override
    public boolean add(Attribute attribute) {
	if (attribute == null) throw new NullPointerException("attribute was null");
	throw new UnmodifiableSetException("Immutable set");
    }

    @Override
    public boolean remove(Class<?> category) {
	throw new UnmodifiableSetException("Immutable set");
    }

    @Override
    public boolean remove(Attribute attribute) {
	throw new UnmodifiableSetException("Immutable set");
    }

    @Override
    public boolean containsKey(Class<?> category) {
	return false;
    }

    @Override
    public boolean containsValue(Attribute attribute) {
	return false;
    }

    @Override
    public boolean addAll(AttributeSet attributes) {
	throw new UnmodifiableSetException("Immutable set");
    }

    @Override
    public int size() {
	return 0;
    }

    @Override
    public Attribute[] toArray() {
	return ATTRIBUTES;
    }

    @Override
    public void clear() {
	throw new UnmodifiableSetException("Immutable set");
    }

    @Override
    public boolean isEmpty() {
	return true;
    }
    
    @Override
    public boolean equals(Object o){
	if (!(o instanceof AttributeSet)) return false;
	return ((AttributeSet)o).isEmpty();
    }

    @Override
    public int hashCode() {
	return 0;
    }
    
}

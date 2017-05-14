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
package net.jini.print.lookup;

import javax.print.attribute.Attribute;
import net.jini.entry.AbstractEntry;
import net.jini.lookup.entry.ServiceControlled;

/**
 * <P>
 * Class AttributeEntry is a Jini service attribute indicating a printing
 * attribute that a Jini Print Service instance supports. See package
 * {@link javax.print.attribute} <A
 * HREF="../../../../javax/print/attribute/package-summary.html">javax.print.attribute</A>
 * for further information about printing attributes. The AttributeEntry
 * contains three fields:
 * </P>
 * <OL TYPE=1>
 * <LI>
 * The fully-qualified class name of the supported printing attribute's
 * category.
 *
 * <LI>
 * The fully-qualified class name of the supported printing attribute's runtime
 * class, which may be the same as the category or may be a subclass thereof.
 *
 * <LI>
 * The supported printing attribute's value, an instance of the runtime class.
 * </OL>
 * <P>
 * To search the Jini Lookup Service (JLUS) for a Jini Print Service instance
 * that supports a given attribute <I>category</I>, the client sets up a service
 * template with an AttributeEntry with the category field containing the
 * category's class name and the runtime class and value fields wildcarded
 * (null). To search the JLUS for a Jini Print Service instance that supports a
 * given attribute <I>value</I>, the client sets up a service template with an
 * AttributeEntry with the category field containing the category's class name,
 * the runtime class field containing the attribute object's runtime class name
 * (which may be a subclass of the category), and the value field containing the
 * attribute value itself.
 * </P><P>
 * For each printing attribute it supports, a Jini Print Service instance must
 * register one or more service attributes of class AttributeEntry in its
 * service registration in the JLUS. See the documentation for each printing
 * attribute class for further information about how each printing attribute is
 * registered into the JLUS.
 * </P><P>
 * <B>Design Rationale</B>
 * </P><P>
 * A single, generic attribute entry that covers all printing attributes (except
 * media) is used to avoid having to duplicate the printing attribute class
 * hierarchy in the Entry class hierarchy. See package <A
 * HREF="../../../../javax/print/attribute/package-summary.html">javax.print.attribute</A>
 * for further information.
 * </P><P>
 * The category and the runtime class fields are declared as String objects
 * rather than Class objects because Entry fields are stored in the JLUS in
 * marshalled (serialized) form. The marshalled form of a Class object includes
 * the fully-qualified class name string plus a bunch of other information -- a
 * serial version ID, some flags, and a list of descriptors for the class's
 * fields. Since only the class name is relevant for JLUS searches, it reduces
 * storage and search time to include just a class name String object in the
 * Entry, omitting the extraneous information contained in a marshalled Class
 * object.
 * </P><P>
 * The attribute's runtime class name has to be included in the AttributeEntry
 * to distinguish a value in a subclass from a value in a superclass during a
 * JLUS search if the two values happen to have the same marshalled form (which
 * can happen with enumerated attributes).
 * </P>
 */
public class AttributeEntry extends AbstractEntry implements ServiceControlled {

    /**
     * The fully-qualified class name of the supported printing attribute's
     * category. This is the name of a class that implements interface
     * {@link Attribute}
     */
    public String category;

    /**
     * The fully-qualified class name of the supported printing attribute's
     * runtime class, which may be the same as the category or may be a subclass
     * thereof.
     */
    public String runtimeClass;

    /**
     * The supported printing attribute's value. This is an instance of the
     * class named in the runtimeClass field.
     */
    public Attribute value;

    /**
     * Construct an attribute entry containing category field = null (wildcard),
     * runtime class field = null (wildcard), and value field = null (wildcard).
     * This lets you search the JLUS for any attribute value of any attribute
     * class.
     */
    public AttributeEntry() {
    }

    /**
     * Construct an attribute entry containing category field = the
     * fully-qualified class name of the given printing attribute value's
     * category (obtained by calling {@link Attribute#getCategory() } ), runtime
     * class field = the fully-qualified class name of the given printing
     * attribute's runtime class, and value field = the given attribute value.
     * This lets you search the JLUS for Jini Print Service instances that
     * support the given printing attribute value.
     *
     * @param value Printing attribute value that must be supported.
     */
    public AttributeEntry(Attribute value) {
	category = value.getCategory().getName();
	runtimeClass = value.getClass().getName();
	this.value = value;
    }

    /**
     * Construct an attribute entry containing category field = the
     * fully-qualified class name of the given printing attribute category,
     * runtime class field = null (wildcard), and value field = null (wildcard).
     * This lets you search the JLUS for Jini Print Service instances that
     * support the given printing attribute category without saying which
     * particular attribute value they have to support.
     *
     * @param theCategory Printing attribute category that must be supported. It
     * is assumed to be a class that implements interface {@link Attribute}.
     *
     *
     */
    public AttributeEntry(Class<? extends Attribute> theCategory) {
	category = theCategory.getName();
    }

}

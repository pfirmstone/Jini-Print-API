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
package net.jini.print;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import org.apache.river.api.io.AtomicSerial;
import org.apache.river.api.io.AtomicSerial.GetArg;
import org.apache.river.api.io.Valid;

/**
 * <P>
 * AbstractDoc extends {@link Doc}, defining an interface for an object that
 * supplies one piece of print data for a Print Job. "Doc" is a short,
 * easy-to-pronounce term that means "a piece of print data." The client passes
 * to the Print Job a {@link Serializable} object that implements interface {@link Doc},
 *  and the Print Job calls methods on that object to
 * obtain the print data. The {@link Doc} interface lets a Print Job:
 * </P>
 * <UL>
 * <LI>
 * Determine the format, or "doc flavor" (class {@link javax.print.DocFlavor}),
 * in which the print data is available. A doc flavor designates the print data
 * format (a MIME type) and the representation class of the object from which
 * the print data comes.
 *
 * <LI>
 * Obtain the print data representation object, which is an instance of the doc
 * flavor's representation class. The Print Job can then obtain the actual print
 * data from the representation object.
 *
 * <LI>
 * Obtain the printing attributes that specify additional characteristics of the
 * doc or that specify processing instructions to be applied to the doc.
 * Printing attributes are defined in package {@link javax.print.attribute} The
 * doc returns its printing attributes stored in an
 * {@link javax.print.attribute.AttributeSet} .
 * </UL>
 * <P>
 * The abstract class net.jini.print.data.AbstractDoc extends interface
 * {@link javax.print.Doc}. The superinterface {@link javax.print.Doc} defines
 * doc semantics that pertains to both the Unified Printing API and the Jini
 * Print Service API. The abstract class net.jini.print.data.AbstractDoc defines
 * more restricted doc semantics that pertains to just the Jini Print Service
 * API. In particular, a doc object used in the Jini Print Service API must be
 * serializable, must take into account the possibility that the doc's methods
 * are being called in a remote location, and must take into account the
 * possibility that the print data is leased (see below for further
 * information).
 * </P><P>
 * Abstract class AbstractDoc implements interface {@link Serializable}, ensuring all
 * AbstractDoc implementations must be serializable objects. If a {@link Doc}
 * implementation is not serializable -- for example, if it has a non-transient
 * non-serializable field or fields -- then the {@link Doc} implementation has a
 * defect. If a client passes such a defective {@link Doc} object to a print
 * service proxy, the print service proxy's behavior is unspecified. For
 * example, the print service proxy is permitted (but not required) to throw a
 * NotSerializableException.
 * </P><P>
 * An implementation of interface {@link Doc} must be serializable so that a
 * Doc object will work properly even if it is serialized and sent to a
 * remote location where its methods are called. In other words, when a client
 * passes a AbstractDoc object to a Jini Print Service proxy object, either the
 * print service proxy can extract the doc's information by calling the
 * AbstractDoc object's methods in the client's local Java Virtual Machine
 * (JVM), or the print service proxy can send the AbstractDoc object to a remote
 * print service which extracts the doc's information by calling the AbstractDoc
 * object's methods in the remote JVM.
 * </P><P>
 * Nonetheless, interface {@link Doc} is not intended to be implemented as a
 * remote object. An implementation of AbstractDoc is intended always
 * to be just a container of the information needed to return the doc flavor,
 * print data representation object, and attribute set when called for, and
 * interface AbstractDoc's methods are intended always to execute locally in the
 * caller's JVM (i.e., not make remote method calls). To allow a Print Job to
 * obtain print data from a remote JVM, the doc object can be implemented so
 * the {@link Doc#getPrintData()} method returns a print data representation
 * object that accesses the remote JVM; for example, the print data
 * representation object is proxy for a remote object exported by the
 * remote JVM.
 * </P><P>
 * Each method in an implementation of AbstractDoc is permitted always
 * to return the same object each time the method is called. This has
 * implications for a Print Job or other caller of a doc object whose print data
 * representation object "consumes" the print data as the caller obtains the
 * print data, such as a print data representation object which is a stream.
 * Once the Print Job has called {@link Doc#getPrintData()} and obtained the
 * stream, any further calls to {@link Doc#getPrintData()} will return the same
 * stream object upon which reading may already be in progress, <I>not</I> a new
 * stream object that will re-read the print data from the beginning. Specifying
 * a doc object to behave this way simplifies the implementation of doc objects,
 * and is justified on the grounds that a particular doc is intended to convey
 * print data only to one Print Job, not to several different Print Jobs. (To
 * convey the same print data to several different Print Jobs, you have to
 * create several different doc objects on top of the same print data source.)
 * </P><P>
 * Interface AbstractDoc affords considerable implementation flexibility. The
 * print data might already be in existence when the doc object is constructed.
 * In this case the objects returned by the doc's methods can be supplied to the
 * doc's constructor, be stored in the doc ahead of time, and simply be returned
 * when called for. Alternatively, the print data might not exist yet when the
 * doc object is constructed. In this case the doc object might provide a "lazy"
 * implementation that generates the print data representation object (and/or
 * the print data) only when the Print Job calls for it (when the Print Job
 * calls the {@link Doc#getPrintData()} method).
 * </P><P>
 * Some print data sources may allocate resources that need to be deallocated if
 * there is a distributed failure of the Print Service printing the data. For
 * example, the print data may be ephemeral and the print data source may need
 * to release storage or other resources once the print data has been
 * transferred to the Print Service. The print data source must be able
 * eventually to release resources if the Print Service fails to obtain the
 * print data. This is done using the standard Jini lease mechanism. A doc
 * object can convey a lease on the print data by implementing the optional
 * interface {@link LeasedDoc}. See interface {@link LeasedDoc} for further
 * information.
 * </P><P>
 * If a doc object is leased, the doc object's user (typically the printer) must
 * get the lease object before doing anything else with the doc. Specifically,
 * if a doc object implements interface {@link LeasedDoc}, then the first method
 * invoked on the doc object after it is created must be the {@link LeasedDoc#getLease()
 * }
 * method. Other AbstractDoc methods will throw an IllegalStateException until
 * the user has obtained the doc's lease object.
 * </P><P>
 * A print data source is permitted (but not required) to impose a restriction
 * on how the multiple doc objects in a multidoc print job are accessed: that
 * the printer must finish obtaining all the print data from one doc before
 * going on to another doc. This is to accommodate the needs of low-end clients
 * which may lack the resources to provide print data for more than one doc at a
 * time. If the print data source imposes this restriction, the doc object's
 * null {@link Doc#getPrintData() },
 * {@link Doc#getReaderForText() } and {@link Doc#getStreamForBytes() }
 * methods will throw an IllegalStateException if this restriction is violated.
 * Since a printer doesn't know whether any particular print data source imposes
 * this restriction, every Jini Print Service instance must be implemented
 * assuming that <I>all</I> print data sources impose this restriction.
 * </P><P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same doc. Therefore, all implementations of
 * interface AbstractDoc must be designed to be multiple thread safe.
 * </P>
 * <HR>
 * <H3>Design Rationale</H3>
 * <P>
 * A AbstractDoc object must be able to execute locally or remotely to afford
 * more choice for implementing Jini Print Service instances and to enable
 * greater flexibility for setting up distributed printing applications. Since a
 * AbstractDoc object will work when executed either locally or remotely, a Jini
 * Print Service client doesn't need to know whether a Jini Print Service
 * instance is implemented locally or remotely; it just passes the AbstractDoc
 * object to the Jini Print Service instance. In fact, a AbstractDoc object
 * could be created in one place and passed from place to place through several
 * intermediate services before finally ending up at a Jini Print Service
 * instance.
 * </P><P>
 * Interface AbstractDoc in package net.jini.print.data is similar to interface
 * <CODE>Transferable</CODE> in package {@link java.awt.datatransfer}, which is
 * used for clipboard-style data transfers. Interface
 * java.awt.datatransfer.Transferable is not used in the Jini Print Service API
 * for four reasons:
 * </P>
 * <OL TYPE=1>
 * <LI>
 * Since not all Java profiles include the AWT, the Jini Print Service should
 * not depend on an AWT interface.
 *
 * <LI>
 * While a Transferable object indicates the data format using class
 * <CODE>java.awt.datatransfer.DataFlavor</CODE>, a AbstractDoc object needs to
 * indicate the print data format using class {@link javax.print.DocFlavor}. See
 * class {@link javax.print.DocFlavor} for further explanation.
 *
 * <LI>
 * Since clipboard-style data transfers typically make the same data available
 * in several different formats, a Transferable object needs the capability to
 * support multiple data flavors. However, print data is typically available in
 * only one predetermined format. Interface Transferable's multiple data format
 * capability would introduce unnecessary complexity to the Jini Print Service,
 * so interface AbstractDoc provides the print data in just one doc flavor.
 *
 * <LI>
 * A Print Job needs additional information about the doc, namely the printing
 * attributes, that a Transferable object can't supply.
 * </OL>
 *
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 *
 *
 */
@AtomicSerial
public abstract class AbstractDoc implements Doc, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Supported doc flavor.
     *
     * @serial
     */
    private final DocFlavor flavor;
    /**
     * Set of printing attributes, or null to use defaults.
     *
     * @serial
     */
    private final DocAttribute[] attributes;

    /**
     * Construct an abstract doc object.
     *
     * @param flavor the DocFlavor supported.
     * @param attributes Unmodifiable set of printing attributes, or null to
     * request the Print Job's default values.
     * @throws (unchecked exception) Thrown if theFlavor is null.
     */
    protected AbstractDoc(DocFlavor flavor,
	    DocAttributeSet attributes) {
	this(notNull(flavor), convert(attributes));
    }

    private static DocFlavor notNull(DocFlavor flavor) {
	if (flavor == null) {
	    throw new NullPointerException("doc flavor cannot be null");
	}
	return flavor;
    }

    private static DocAttribute[] convert(DocAttributeSet attributes) {
	if (attributes == null) {
	    return null;
	}
	Collection<DocAttribute> atCol = Collections.checkedCollection(
		(Collection) Arrays.asList(attributes.toArray()),
		DocAttribute.class
	);
	return atCol.toArray(new DocAttribute[atCol.size()]);
    }

    private AbstractDoc(DocFlavor flavor,
	    DocAttribute[] attributes) {
	this.flavor = flavor;
	this.attributes = attributes;
    }

    /**
     *
     * @param arg
     * @throws IOException
     */
    protected AbstractDoc(GetArg arg) throws IOException {
	this(Valid.notNull(
		arg.get("flavor", null, DocFlavor.class),
		"doc flavor cannot be null"
	),
		convert(arg.get("attributes", null, DocAttribute[].class))
	);
    }

    private static DocAttributeSet convert(DocAttribute[] attributes) throws IOException {
	if (attributes == null) {
	    return null;
	}
	try {
	    HashDocAttributeSet set = new HashDocAttributeSet(attributes);
	    return set;
	} catch (NullPointerException e) {
	    InvalidObjectException ex = new InvalidObjectException("invariant checks failed during deserialization");
	    ex.initCause(e);
	    throw ex;
	}
    }

    @Override
    public DocFlavor getDocFlavor() {
	return flavor;
    }

    @Override
    public DocAttributeSet getAttributes() {
	return attributes == null ? null : new HashDocAttributeSet(attributes);
    }

}

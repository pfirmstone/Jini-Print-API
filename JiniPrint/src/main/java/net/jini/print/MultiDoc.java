/*
 * Copyright 2017 Peter Firmstone.
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

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.print.Doc;
import net.jini.core.lease.Lease;

/**
 * <P>
 * Interface MultiDoc specifies the interface for an object that supplies more
 * than one piece of print data for a Print Job. "Doc" is a short,
 * easy-to-pronounce term that means "a piece of print data," and a "multidoc"
 * is a group of several docs. The client passes to the Print Service an object
 * that implements interface MultiDoc, and the Print Service calls methods on
 * that object to obtain the print data.
 * </P><P>
 * Interface MultiDoc provides an abstraction similar to a "linked list" of
 * docs. A multidoc object is like a node in the linked list, containing the
 * current doc in the list and a pointer to the next node (multidoc) in the
 * list. The Print Service can call the multidoc's {@link MultiDoc#getDoc() }
 * method to get the current doc. When it's ready to go on to the next doc, the
 * Print Service can call the multidoc's {@link MultiDoc#next() }
 * method to get the next multidoc, which contains the next doc. So Print
 * Service code for iterating through a multidoc might look like this:
 * </P>
 * <PRE>
 * void processMultiDoc
 * (MultiDoc theMultiDoc)
 * {
 * MultiDoc current = theMultiDoc;
 * while (current != null)
 * {
 * processDoc (current.getDoc());
 * current = current.next();
 * }
 * }
 * </PRE>
 * <P>
 * Of course, interface MultiDoc can be implemented in any way that fulfills the
 * contract; it doesn't have to use a linked list in the implementation.
 * </P><P>
 * Interface net.jini.print.data.MultiDoc extends interface
 * {@link javax.print.MultiDoc} The superinterface {@link javax.print.MultiDoc}
 * defines multidoc semantics that pertains to both the Unified Printing API and
 * the Jini Print Service API. The subinterface net.jini.print.data.MultiDoc
 * defines more restricted multidoc semantics that pertains to just the Jini
 * Print Service API. In particular, a multidoc object used in the Jini Print
 * Service API must be serializable and must be a remote interface to take into
 * account the possibility that the multidoc's methods are being called in a
 * remote location (see below for further information).
 * </P><P>
 * Interface MultiDoc extends interface {@link java.io.Serializable}, and all
 * MultiDoc implementations must be serializable objects. If a MultiDoc
 * implementation is not serializable -- for example, if it has a non-transient
 * non-serializable field or fields -- then the MultiDoc implementation has a
 * defect. If a client passes such a defective MultiDoc object to a print
 * service proxy, the print service proxy's behavior is unspecified. For
 * example, the print service proxy is permitted (but not required) to throw a
 * NotSerializableException.
 * </P><P>
 * An implementation of interface MultiDoc must be serializable so that a
 * MultiDoc object will work properly even if it is serialized and sent to a
 * remote location where its methods are called. In other words, when a client
 * passes a MultiDoc object to a Jini Print Service proxy object, either the
 * print service proxy can obtain the docs by calling the MultiDoc object's
 * methods in the client's local Java Virtual Machine (JVM), or the print
 * service proxy can send the MultiDoc object to a remote print service which
 * obtains the docs by calling the MultiDoc object's methods in the remote JVM.
 * </P><P>
 * Interface MultiDoc's methods all throw {@link java.rmi.RemoteException} to
 * provide for the possibility that the MultiDoc object's implementation
 * performs remote method calls. The MultiDoc object's implementation in fact
 * may or may not perform remote method calls.
 * </P><P>
 * To ease the design of distributed printing systems using multidocs, all the
 * methods of interface MultiDoc must behave idempotently. A particular
 * multidoc's {@link MultiDoc#getDoc() }
 * method must always return the same current doc object each time it is called.
 * A particular multidoc's {@link MultiDoc#next() }
 * method must always return the same next multidoc object each time it is
 * called. Thus, if a Print Service calls a multidoc method and experiences a
 * RemoteException, the Print Service can if it chooses call the method a second
 * time and expect to get the same result as the first time (provided the
 * RemoteException doesn't happen again).
 * </P><P>
 * Interface MultiDoc affords considerable implementation flexibility. The
 * individual docs might already be in existence when the MultiDoc object is
 * constructed, and the MultiDoc object just provides access to the preexisting
 * docs. Alternatively, the individual docs might not exist yet, and the
 * MultiDoc object provides a "lazy" implementation that creates each doc only
 * when the Print Service calls for it.
 * </P><P>
 * However, a client passing a MultiDoc object to a Print Service must be
 * prepared to have all the multidoc and doc objects in the conceptual "linked
 * list" of docs be in existence at the same time. This is because the Print
 * Service is allowed to iterate through the multidoc as many times as the Print
 * Service needs to, and the Print Service is allowed to access or re-access the
 * multidoc and doc objects idempotently whenever the Print Service needs to.
 * </P><P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same multidoc. Therefore, all implementations of
 * interface MultiDoc must be designed to be multiple thread safe. In fact, a
 * client thread could be adding docs to the end of the (conceptual) list while
 * a Print Service thread is simultaneously obtaining docs from the beginning of
 * the list; provided the multidoc object synchronizes the threads properly, the
 * two threads will not interfere with each other.
 * </P>
 * <HR>
 * <H3>Design Rationale</H3>
 * <P>
 * A MultiDoc object must be able to execute locally or remotely to afford more
 * choice for implementing Jini Print Service instances and to enable greater
 * flexibility for setting up distributed printing applications. Since a
 * MultiDoc object will work when executed either locally or remotely, a Jini
 * Print Service client doesn't need to know whether a Jini Print Service
 * instance is implemented locally or remotely; it just passes the MultiDoc
 * object to the Jini Print Service instance. In fact, a MultiDoc object could
 * be created in one place and passed from place to place through several
 * intermediate services before finally ending up at a Jini Print Service
 * instance.
 * </P><P>
 * The "linked list" abstraction is motivated by the need for MultiDoc methods
 * to be idempotent in a distributed system. Rather than use an "iterator" style
 * interface, which is notoriously difficult to get to work properly in a remote
 * setting, interface MultiDoc uses a "cursor" style interface. The multidoc
 * object encapsulates information about the position in the list of docs that
 * allows the caller to move from one doc to the next idempotently.
 * </P><P>
 * <B>DRAFT STANDARD VERSION 1.1 (28-April-2017)</B>
 * </P>
 *
 */
public interface MultiDoc extends javax.print.MultiDoc, Serializable {

    /**
     * Returns a proxy to the {@link Lease} associated with this MultiDoc, or
     * <code>null</code> if this MultiDoc is not leased.
     *
     * @return a proxy for the MultiDoc's lease, or <code>null</code> if there
     * is no lease associated with this MultiDoc
     */
    public Lease getLease();

    /**
     * MultiDocClient is a back end proxy the client implements, to allow Doc's
     * to be transferred individually on demand remotely, rather than all at
     * once.
     */
    public static interface MultiDocClient
	    extends Remote {

	/**
	 * Removes one <code>Doc</code> from the MultiDoc and returns a copy to
	 * the caller. Returns <code>null</code> if the MultiDoc is empty.
	 *
	 * A given invocation of this method may perform remote communications,
	 * but generally the <code>next</code> method is not expected to have {@linkplain
	 * net.jini.core.constraint remote method constraints} that can vary
	 * from invocation to invocation. Instead the set of constraints
	 * associated with the <code>next</code> method will be fixed at the
	 * time the MultiDoc was created, even if this object implements an
	 * interface like {@link
	 * RemoteMethodControl} that would otherwise allow the set of
	 * constraints associated with the <code>next</code> method to be
	 * altered.<p>
	 *
	 * @return an <code>Doc</code> from the MultiDoc, or <code>null</code>
	 * if the MultiDoc is empty
	 *
	 * @throws RemoteException if a communication error occurs. If a
	 * <code>RemoteException</code> is thrown, no <code>Doc</code> was
	 * removed from the MultiDoc because of this call
	 */
	public Doc next() throws RemoteException;

    }

}

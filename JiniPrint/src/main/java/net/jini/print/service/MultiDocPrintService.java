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
package net.jini.print.service;

import java.io.IOException;
import javax.print.MultiDoc;
import javax.print.attribute.PrintRequestAttributeSet;
import net.jini.print.job.MultiDocPrintRequest;

/**
 * <P>
 * Interface MultiDocPrintService specifies the capability for creating a Print
 * Job that prints multiple pieces of print data.
 * <P>
 * To print multiple pieces of print data, the client calls <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#createMultiDocPrintRequest()"><CODE><CODE>createMultiDocPrintRequest()</CODE></CODE></A>.
 * ("Doc" is a short, easy-to-pronounce term that means "a piece of print data."
 * A "multidoc" is a group of one or more docs.) Such a Print Request is termed
 * a "multidoc print request." The returned Print Request object implements both
 * interface <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html"><CODE>PrintRequest</CODE></A>
 * and the subinterface <A
 * HREF="../../../../net/jini/print/job/MultiDocPrintRequest.html"><CODE>MultiDocPrintRequest</CODE></A>.
 * The client can supply the multidoc to be printed and a set of printing
 * attributes for the job as arguments of the <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#createMultiDocPrintRequest()"><CODE><CODE>createMultiDocPrintRequest()</CODE></CODE></A>
 * method call. Alternatively, the client can supply the multidoc and the
 * attribute set by calling methods on the Print Request object. When it's all
 * set up, a multidoc print request consists of a set of job-level printing
 * attributes and a multidoc to be printed; the multidoc consists of one or more
 * docs; each doc consists of a doc flavor, print data representation object,
 * and a set of document-level printing attributes, as shown in this UML class
 * diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="../doc-files/PrintRequestFig2.gif" WIDTH=676 HEIGHT=218>
 * </CENTER>
 * <P>
 * Interface MultiDocPrintService represents an optional capability that a Jini
 * Print Service instance need not provide. If this capability is provided, the
 * Jini Print Service proxy object will implement interface
 * MultiDocPrintService.
 * <P>
 * A Jini Print Service instance that supports multidoc print jobs must also
 * support doc print jobs. Therefore, interface MultiDocPrintService is an
 * extension of interface <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>,
 * and a Jini Print Service proxy object that implements MultiDocPrintService
 * must also implement
 * <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>.
 * <P>
 * Like interface <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>,
 * interface MultiDocPrintService provides one <B>capability method</B>, <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#getUnsupportedSettings(net.jini.print.service.MultiDocSettings)"><CODE><CODE>getUnsupportedSettings()</CODE></CODE></A>,
 * to determine whether the Print Service can perform a multidoc print job with
 * given doc flavors, document-level attributes, and job-level attributes.
 * Unlike the <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>
 * capability methods which let you query about settings for one document at a
 * time, the MultiDocPrintService capability method lets you query about
 * settings for all the documents together. A Print Service that can support
 * printing each document with its own settings in separate print jobs may not
 * be able to support printing all the documents with their own settings in the
 * same print job.
 * <P>
 * For example, suppose we want to print 10 copies of two plain text documents,
 * document A in portrait orientation and document B in landscape orientation.
 * If done as separate print jobs, the respective settings would be:
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;A settings = Settings (flavor: text/plain,
 * attributes: (orientation: portrait, copies: 10))
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;B settings = Settings (flavor: text/plain,
 * attributes: (orientation: landscape, copies: 10))
 * <BR>
 * Let's say the Print Service can support each job individually. So when the
 * <A
 * HREF="../../../../net/jini/print/service/PrintService.html#getUnsupportedSettings(net.jini.print.service.Settings)"><CODE><CODE>PrintService.getUnsupportedSettings()</CODE></CODE></A>
 * method is called with either of the above settings objects, the method will
 * report that there are no unsupported settings. But if done as a single
 * multidoc print job, the multidoc settings would be:
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;(docSettings: Settings[ ]
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Settings (flavor:
 * text/plain, attributes: (orientation: portrait)),
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Settings
 * (flavor: text/plain, attributes: (orientation: landscape))},
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;attributes: (copies: 10))
 * <BR>
 * Although the Print Service may be able to print documents in different
 * orientations in different print jobs, let's say the Print Service is not able
 * to print documents in different orientations in the same multidoc print job.
 * So when the <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#getUnsupportedSettings(net.jini.print.service.MultiDocSettings)"><CODE><CODE>MultiDocPrintService.getUnsupportedSettings()</CODE></CODE></A>
 * method is called with the above multidoc settings object, it returns the
 * following multidoc settings object to report that the two different
 * orientation attributes conflict with each other:
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;(docSettings: Settings[ ]
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Settings (flavor: null,
 * attributes: (orientation: portrait)),
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Settings
 * (flavor: null, attributes: (orientation: landscape))},
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;attributes: null)
 * <P>
 * Note that the same Print Service will most likely be able to print documents
 * with the same orientations in the same multidoc print job. The following
 * multidoc settings will most likely be supported:
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;(docSettings: Settings[ ]
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Settings (flavor:
 * text/plain, attributes: (orientation: portrait)),
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Settings
 * (flavor: text/plain, attributes: (orientation: portrait))},
 * <BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;attributes: (copies: 10))
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Service. Therefore, all
 * implementations of interface <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>
 * and its subinterfaces must be designed to be multiple thread safe.
 * <P>
 * Interface MultiDocPrintService's methods all throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Service object's implementation
 * performs remote method calls. The Print Service object's implementation in
 * fact may or may not perform remote method calls.
 * <P>
 */
public interface MultiDocPrintService extends PrintService {

    /**
     * Create a Print Request object, bound to this Print Service object, that
     * is able to print a multidoc. The returned Print Request object implements
     * interfaces PrintRequest and MultiDocPrintRequest, and it may implement
     * additional interfaces in package net.jini.print.job depending on the
     * Print Service implementation. The returned Print Request object has
     * neither a multidoc nor a set of job-level printing attributes; these must
     * be populated by calling methods on the Print Request object.
     *
     * @return Print Request object.
     * @throws PrintServiceException Thrown if this Print Service could not
     * create a Print Request object. The detail message may provide further
     * information about the error. The exception object may be an instance of a
     * PrintServiceException subclass that implements one or more of the mixin
     * interfaces, such as NestedException, to provide further information about
     * the error.
     * @throws IOException Thrown if a remote error occurred.
     */
    public MultiDocPrintRequest createMultiDocPrintRequest()
	    throws PrintServiceException,
	    IOException;

    /**
     * Create a Print Request object, bound to this Print Service object, to
     * print the given multidoc with the given set of printing attributes. The
     * returned Print Request object implements interfaces PrintRequest and
     * MultiDocPrintRequest, and it may implement additional interfaces in
     * package net.jini.print.job depending on the Print Service implementation.
     * The returned Print Request object is populated with the given multidoc
     * and set of job-level printing attributes.
     *
     * @param theDoc Multidoc to be printed, or null to specify no multidoc (in
     * which case the multidoc must be specified later by calling a method on
     * the returned Print Request object).
     * @param theAttributes Attribute set, or null to specify no attributes.
     * @return Print Request object.
     * @throws PrintServiceException Thrown if this Print Service could not
     * create a Print Request object. The detail message may provide further
     * information about the error. The exception object may be an instance of a
     * PrintServiceException subclass that implements one or more of the mixin
     * interfaces, such as NestedException, to provide further information about
     * the error.
     * @throws IOException Thrown if a remote error occurred.
     */
    public MultiDocPrintRequest createMultiDocPrintRequest(MultiDoc theDoc,
	    PrintRequestAttributeSet theAttributes)
	    throws PrintServiceException,
	    IOException;

    /**
     * Determine the settings for a supposed multidoc print job that this Print
     * Service does not support, if any. The docSettings field of theSettings
     * contains an array of Settings objects, one for each individual doc in the
     * supposed multidoc print job, where each array element's flavor field
     * contains the print data format for the corresponding doc and each array
     * element's attributes field contains the document-level attributes for the
     * corresponding doc. The attributes field of theSettings contains the
     * job-level attributes for the supposed multidoc print job.
     *
     * If this Print Service can print a multidoc print job with all the given
     * settings (including the case where theSettings is null), this method
     * returns null indicating there are no unsupported settings.
     *
     * If this Print Service cannot print a multidoc print job with all the
     * given settings, because some settings are not supported either
     * individually or in combination, this method returns another multidoc
     * settings object containing just the settings that are not supported.
     * Specifically, the returned multidoc settings object's docSettings field
     * will be an array of settings objects of the same length as the
     * docSettings field of theSettings. For each element in the settings array,
     * the flavor field will be the same as the flavor field of the
     * corresponding array element in theSettings if that doc flavor is not
     * supported, or the flavor field will be null if that doc flavor is
     * supported. For each element in the settings array, the attributes field
     * will be an attribute set containing just the unsupported document-level
     * attributes from the attributes field of the corresponding array element
     * in theSettings, or the attributes field will be null if all the
     * document-level attributes are supported. Finally, the returned multidoc
     * settings object's attributes field will be an attribute set containing
     * just the unsupported job-level attributes from the attributes field of
     * theSettings, or the returned multidoc settings object's attributes field
     * will be null if all the job-level attributes are supported.
     *
     * This method lets a client "validate" the settings for a supposed multidoc
     * print job without actually submitting the job. A null return means the
     * settings are okay. A non-null return means the settings are not okay, and
     * the returned object tells precisely what's wrong.
     *
     * @param theSettings Settings for a supposed multidoc print job, or null.
     * @return If this Print Service supports all of theSettings, null is
     * returned, otherwise a multidoc settings object containing the unsupported
     * settings is returned.
     * @throws IOException Thrown if a remote error occurred.
     */
    public MultiDocSettings getUnsupportedSettings(MultiDocSettings theSettings)
	    throws IOException;

}

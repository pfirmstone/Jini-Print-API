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

import java.io.InputStream;
import java.lang.reflect.Method;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;
import net.jini.core.constraint.MethodConstraints;
import net.jini.core.constraint.RemoteMethodControl;
import net.jini.core.lease.Lease;
import org.apache.river.proxy.ConstrainableProxyUtil;

/**
 * Constrainable Doc, to allow constraints to be placed on 
 * {@link InputStream#read(byte[], int, int)}
 * and {@link InputStream#close() } methods.
 */
public final class ConstrainableLeasedInputStreamDoc extends LeasedInputStreamDoc implements RemoteMethodControl {

    private static final Method READ
	    = getMethod(
		    InputStream.class,
		    "read",
		    new Class[]{byte[].class, int.class, int.class}
	    );

    private static final Method CLOSE
	    = getMethod(
		    InputStream.class,
		    "close",
		    new Class[0]
	    );

    /**
     * Returns the public method for the specified <code>Class</code> type,
     * method name, and array of parameter types.
     * <p>
     * This method is typically used in place of {@link Class#getMethod
     * Class.getMethod} to get a method that should definitely be defined; thus,
     * this method throws an error instead of an exception if the given method
     * is missing.
     * <p>
     * This method is convenient for the initialization of a static variable for
     * use as the <code>mappings</code> argument to null null null null     {@link org.apache.river.proxy.ConstrainableProxyUtil#translateConstraints 
     * ConstrainableProxyUtil.translateConstraints}.
     *
     * @param type the <code>Class</code> type that defines the method of
     * interest
     * @param name           <code>String</code> containing the name of the method of
     * interest
     * @param parameterTypes the <code>Class</code> types of the parameters to
     * the method of interest
     *
     * @return a <code>Method</code> object that provides information about, and
     * access to, the method of interest
     *
     * @throws <code>NoSuchMethodError</code> if the method of interest cannot
     * be found
     * @throws <code>NullPointerException</code> if <code>type</code> or
     * <code>name</code> is <code>null</code>
     */
    private static Method getMethod(Class type, String name,
	    Class[] parameterTypes) {
	try {
	    return type.getMethod(name, parameterTypes);
	} catch (NoSuchMethodException e) {
	    throw (Error) (new NoSuchMethodError(e.getMessage()).initCause(e));
	}
    }

    /**
     * Array containing element pairs in which each pair of elements represents
     * a mapping between two methods having the following characteristics:
     * <ul>
     * <li> the first element in the pair is one of the public, remote methods
     * that may be invoked by the print service (acting as a client) through
     * <code>InputStream</code>.
     * <li> the second element in the pair is the method, implemented in the
     * backend server class, that is ultimately executed in the server's backend
     * when the client invokes the corresponding method in this proxy.
     * </ul>
     */
    private static final Method[] METHOD_MAP_ARRAY = {
	getMethod(InputStream.class, "read", new Class[]{byte[].class, int.class, int.class}),
	getMethod(RemoteInputStream.class, "read", new Class[]{int.class}),
	getMethod(InputStream.class, "close", new Class[0]),
	getMethod(RemoteInputStream.class, "close", new Class[0])
    };

    /**
     * Returns a copy of the given {@link RemoteInputStream} proxy having the
     * client method constraints that result after a specified mapping is
     * applied to the given method constraints. For details on the mapping see {@link ConstrainableProxyUtil#translateConstraints
     * ConstrainableProxyUtil.translateConstraints}.
     *
     * @param server the proxy to attach constraints to
     * @param constraints the source method constraints
     * @param mapping mapping of methods to methods
     * @throws NullPointerException if <code>server</code> is <code>null</code>.
     * @throws ClassCastException if <code>server</code> does not implement
     * <code>RemoteMethodControl</code>.
     */
    private static RemoteInputStream constrainServer(RemoteInputStream server,
	    MethodConstraints constraints, Method[] mapping) {
	final MethodConstraints serverRefConstraints
		= ConstrainableProxyUtil.translateConstraints(constraints, mapping);
	final RemoteMethodControl constrainedServer
		= ((RemoteMethodControl) server).setConstraints(serverRefConstraints);
	return (RemoteInputStream) constrainedServer;
    }

    /**
     * Client constraints placed on this proxy (may be <code>null</code>)
     *
     * @serial
     */
    private final MethodConstraints methodConstraints;

    /**
     * Create a new ConstrainableLeaseInputStreamDoc
     *
     * @param lease Lease for this Doc, or null.
     * @param flavor input stream doc flavor.
     * @param attributes document attribute set or null.
     * @param proxy the RemoteInputStream proxy
     * @param constraints client method constraints or null
     * @throws NullPointerException if proxy or flavor is null.
     */
    public ConstrainableLeasedInputStreamDoc(
	    Lease lease,
	    DocFlavor.INPUT_STREAM flavor,
	    DocAttributeSet attributes,
	    RemoteInputStream proxy,
	    MethodConstraints constraints) {
	super(lease, flavor, attributes, constrainServer(proxy, constraints, METHOD_MAP_ARRAY));
	methodConstraints = constraints;
    }

    @Override
    public ConstrainableLeasedInputStreamDoc setConstraints(MethodConstraints constraints) {
	return new ConstrainableLeasedInputStreamDoc(
		getLease(),
		(DocFlavor.INPUT_STREAM) getDocFlavor(),
		getAttributes(),
		getRemoteInputStream(),
		constraints
	);
    }

    @Override
    public MethodConstraints getConstraints() {
	return methodConstraints;
    }

}

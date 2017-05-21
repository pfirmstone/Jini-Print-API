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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.rmi.Remote;

/**
 * <P>
 * Class RemoteInputStream is an abstract base class for an input stream object
 * that can be passed to a remote object as an argument or return value of a
 * remote method call. Class RemoteInputStream extends class {@link InputStream}
 * but does not declare any additional methods. Instead, class RemoteInputStream
 * changes the contract of class {@link InputStream}
 * to allow clients to recover from remote failures while reading a stream in a
 * distributed system.
 * </P><P>
 * Class RemoteInputStream differs from class {@link InputStream}
 * in the following ways:
 * </P>
 * <UL>
 * <LI>
 * Class RemoteInputStream implements interface {@link Serializable}.
 * All concrete subclasses of class RemoteInputStream must be able to be
 * serialized.
 * 
 * <LI>
 * For the methods that throw an IOException -- namely, <CODE>read()</CODE>,
 * <CODE>skip()</CODE>, and <CODE>close()</CODE> -- the IOException may actually
 * be a RemoteException indicating that a remote error happened.
 * 
 * <LI>
 * Certain behavior is guaranteed after one of the above methods throws a
 * RemoteException.
 * </UL>
 * <P>
 * If a RemoteException occurs, as is always the case with remote errors, you
 * don't know whether the method invocation never got to the stream in the first
 * place (so the stream's state is unchanged) or the method invocation got to
 * the stream but the return got lost (so the stream did perform the operation).
 * </P><P>
 * To overcome the problem of not knowing whether the operation was performed
 * when a RemoteException is thrown, class RemoteInputStream's methods are
 * required to behave this way: If you call a method, you get a RemoteException,
 * and you call the same method again, the results you get from the second call
 * (presuming the RemoteException does not happen the second time) will be the
 * same as the results you would have gotten from the first call (had the
 * RemoteException not happened). More specifically:
 * </P>
 * <UL>
 * <LI>
 * If one of the <CODE>read()</CODE> methods throws a RemoteException, the bytes
 * that would have been read remain unread. A second <CODE>read()</CODE> call at
 * this point will re-read bytes starting from the same byte the first
 * <CODE>read()</CODE> call would have started from. A <CODE>skip()</CODE> call
 * at this point will skip bytes starting from the same byte the first
 * <CODE>read()</CODE> call would have started from.
 * 
 * <LI>
 * If the <CODE>skip()</CODE> method throws a RemoteException, the bytes that
 * would have been skipped remain unskipped-over. A <CODE>read()</CODE> call at
 * this point will read bytes starting from the same byte the
 * <CODE>skip()</CODE> call would have started from. A second
 * <CODE>skip()</CODE> call at this point will re-skip bytes starting from the
 * same byte the first <CODE>skip()</CODE> call would have started from.
 * 
 * <LI>
 * If the <CODE>close()</CODE> method throws a RemoteException, you can simply
 * call <CODE>close()</CODE> again. The <CODE>close()</CODE> method is
 * idempotent; closing an already-closed remote input stream has no effect and
 * simply leaves the stream closed.
 * </UL>
 * <P>
 * Thus, a possible strategy for recovering from a RemoteException is to assume
 * it was due to a transient network failure, wait a little while, and repeat
 * the method call; if several repeated method calls all fail with a
 * RemoteException, assume the outage is permanent and give up. Note that this
 * strategy pertains only to IOExceptions that are RemoteExceptions. Other kinds
 * of IOExceptions generally indicate nonrecoverable problems.
 * </P><P>
 * Class RemoteInputStream does not override any of the methods in class {@link InputStream}.
 * The behavior specified above must be provided by a concrete subclass of class
 * RemoteInputStream which overrides the appropriate{@link InputStream}
 * methods. Thus, class RemoteInputStream acts as a "tagging base class." A
 * client can check whether an input stream object is an instance of class
 * RemoteInputStream and, if so, employ the above strategy for recovering from
 * remote errors.
 * </P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 */
public interface RemoteInputStream extends Remote, Closeable {
    
    /**
     * 
     * @param len max length of bytes to read.
     * @return array of bytes read, zero length if end of stream has been reached.
     * @throws IOException 
     */
    byte [] read(int len) throws IOException;
	
    
}

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

import java.io.Reader;
import java.io.Serializable;

/**
 * <P>
 * Class RemoteReader is an abstract base class for a reader object that can be
 * passed to a remote object as an argument or return value of a remote method
 * call. Class RemoteReader extends class {@link Reader} but does not declare
 * any additional methods. Instead, class RemoteReader changes the contract of
 * class {@link Reader} to allow clients to recover from remote failures while
 * reading a stream in a distributed system.
 * </P><P>
 * Class RemoteReader differs from class {@link Reader} in the following ways:
 * <UL>
 * <LI>
 * Class RemoteReader implements interface {@link Serializable}. All concrete
 * subclasses of class RemoteReader must be able to be serialized.
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
 * don't know whether the method invocation never got to the reader in the first
 * place (so the reader's state is unchanged) or the method invocation got to
 * the reader but the return got lost (so the reader did perform the operation).
 * </P><P>
 * To overcome the problem of not knowing whether the operation was performed
 * when a RemoteException is thrown, class RemoteReader's methods are required
 * to behave this way: If you call a method, you get a RemoteException, and you
 * call the same method again, the results you get from the second call
 * (presuming the RemoteException does not happen the second time) will be the
 * same as the results you would have gotten from the first call (had the
 * RemoteException not happened). More specifically:
 * </P>
 * <UL>
 * <LI>
 * If one of the <CODE>read()</CODE> methods throws a RemoteException, the
 * characters that would have been read remain unread. A second
 * <CODE>read()</CODE> call at this point will re-read characters starting from
 * the same character the first <CODE>read()</CODE> call would have started
 * from. A <CODE>skip()</CODE> call at this point will skip characters starting
 * from the same character the first <CODE>read()</CODE> call would have started
 * from.
 * 
 * <LI>
 * If the <CODE>skip()</CODE> method throws a RemoteException, the characters
 * that would have been skipped remain unskipped-over. A <CODE>read()</CODE>
 * call at this point will read characters starting from the same character the
 * <CODE>skip()</CODE> call would have started from. A second
 * <CODE>skip()</CODE> call at this point will re-skip characters starting from
 * the same character the first <CODE>skip()</CODE> call would have started
 * from.
 * 
 * <LI>
 * If the <CODE>close()</CODE> method throws a RemoteException, you can simply
 * call <CODE>close()</CODE> again. The <CODE>close()</CODE> method is
 * idempotent; closing an already-closed remote reader has no effect and simply
 * leaves the reader closed.
 * </UL>
 * <P>
 * Thus, a possible strategy for recovering from a RemoteException is to assume
 * it was due to a transient network failure, wait a little while, and repeat
 * the method call; if several repeated method calls all fail with a
 * RemoteException, assume the outage is permanent and give up. Note that this
 * strategy pertains only to IOExceptions that are RemoteExceptions. Other kinds
 * of IOExceptions generally indicate nonrecoverable problems.
 * </P><P>
 * Class RemoteReader does not override any of the methods in class
 * {@link Reader}. The behavior specified above must be provided by a concrete
 * subclass of class RemoteReader which overrides the appropriate {@link Reader}
 * methods. Thus, class RemoteReader acts as a "tagging base class." A client
 * can check whether a reader object is an instance of class RemoteReader and,
 * if so, employ the above strategy for recovering from remote errors.
 * </P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 *
 */
public abstract class RemoteReader extends Reader implements Serializable {

    /**
     * Construct a new remote reader object. The operations will synchronize on
     * this remote reader object itself.
     */
    public RemoteReader() {
	super();
    }

    /**
     * Construct a new remote reader object. The operations will synchronize on
     * the given lock object.
     *
     * @param lock the lock object.
     */
    public RemoteReader(Object lock) {
	super(lock);
    }

}

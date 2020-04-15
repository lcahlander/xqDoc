/*
 * Copyright (c)2005 Elsevier, Inc.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The use of the Apache License does not indicate that this project is
 * affiliated with the Apache Software Foundation.
 */

package org.xqdoc;

/**
 * The base xqDoc runtime exception that will be used when processing a xqDoc
 * Comment block. By using a runtime exception, this enabled easier integration
 * with antlr and did not require the pollution of signatures with a 'throw'
 * clause just because of xqDoc comment processing problems. This is really
 * meant to be a short-term solution since the longer term plan is to move the
 * xqDoc Comment block processing into the antlr grammar and eliminating the
 * need for the XQDocComment class and this runtime exception.
 *
 * @author Darin McBeath
 * @version 1.0
 */
public class XQDocRuntimeException extends RuntimeException {

	/**
	 * <p>Constructor for XQDocRuntimeException.</p>
	 */
	public XQDocRuntimeException() {
	}

	/**
	 * <p>Constructor for XQDocRuntimeException.</p>
	 *
	 * @param message The message string returned with this exception
	 */
	public XQDocRuntimeException(String message) {
		super(message);
	}

	/**
	 * <p>Constructor for XQDocRuntimeException.</p>
	 *
	 * @param message The message string returned with this exception
	 * @param cause  The throwable error that has caused this exception
	 */
	public XQDocRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * <p>Constructor for XQDocRuntimeException.</p>
	 *
	 * @param cause  The throwable error that has caused this exception
	 */
	public XQDocRuntimeException(Throwable cause) {
		super(cause);
	}
}

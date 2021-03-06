/*******************************************************************************
* Waffle (http://waffle.codeplex.com)
* 
* Copyright (c) 2010 Application Security, Inc.
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Application Security, Inc.
*******************************************************************************/
package waffle.apache;

import junit.framework.TestCase;

/**
 * @author dblock[at]dblock[dot]org
 */
public class WindowsRealmTests extends TestCase {
	
	public void testProperties() {
		WindowsRealm realm = new WindowsRealm();
		assertNull(realm.getPassword(null));
		assertNull(realm.getPrincipal(null));
		assertEquals("waffle.apache.WindowsRealm/1.0", realm.getName());
	}
}

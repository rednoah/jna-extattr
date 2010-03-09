/* Copyright (c) 2007 Timothy Wall, All Rights Reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.  
 */
package com.sun.jna.contrib.win32.w32util;

import junit.framework.TestCase;

import com.sun.jna.platform.win32.Secur32.EXTENDED_NAME_FORMAT;

public class Secur32UtilTest extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(Secur32UtilTest.class);
    }
    
	public void testGetUsernameEx() {
		String usernameSamCompatible = Secur32Util.getUserNameEx(
				EXTENDED_NAME_FORMAT.NameSamCompatible); 
		assertTrue(usernameSamCompatible.length() > 1);
		assertTrue(usernameSamCompatible.indexOf('\\') > 0);
	}	
}

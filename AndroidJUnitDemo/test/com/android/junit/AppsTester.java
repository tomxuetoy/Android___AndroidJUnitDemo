package com.android.junit;

import com.android.junit.Apps;
import android.test.AndroidTestCase;

/**
 * Android JUnit������
 * 
 * @author Lupeng
 * @create 2011-08-08
 */
public class AppsTester extends AndroidTestCase {
	Apps a = null;

	protected void setUp() throws Exception {
		a = new Apps();
	}

	// methodA()���Է���
	public void testMethodA() {
		a.methodA();
	}

	// methodB()���Է���
	public void testMethodB() {
		a.methodB("Android");
	}

	// addBoth()���Է���
	public void testAddBoth() {
		assertEquals(31, a.addBoth(10, 20));
	}
}
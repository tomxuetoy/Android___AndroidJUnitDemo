package com.android.junit;

import com.android.junit.Apps;
import android.test.AndroidTestCase;

/**
 * Android JUnit测试类
 * 
 * @author Lupeng
 * @create 2011-08-08
 */
public class AppsTester extends AndroidTestCase {
	Apps a = null;

	protected void setUp() throws Exception {
		a = new Apps();
	}

	// methodA()测试方法
	public void testMethodA() {
		a.methodA();
	}

	// methodB()测试方法
	public void testMethodB() {
		a.methodB("Android");
	}

	// addBoth()测试方法
	public void testAddBoth() {
		assertEquals(31, a.addBoth(10, 20));
	}
}
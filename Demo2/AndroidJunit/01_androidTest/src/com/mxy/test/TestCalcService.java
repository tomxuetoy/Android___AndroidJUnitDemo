package com.mxy.test;

import com.mxy.service.CalcService;
import android.test.AndroidTestCase;

public class TestCalcService extends AndroidTestCase {
	public void testAdd() {
		CalcService cal = new CalcService();
		int result = cal.add(5,3);
		System.out.println(result);
		assertEquals(8, result);
	}
}

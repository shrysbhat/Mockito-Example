package com.shreyas.mockito.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import org.junit.Before;
import org.junit.Test;

import com.shreyas.mockito.Math1;

public class MathMockDivTestWithException {

	Math1 m1;
	
	@Before
	public void setUp() throws Exception {
		m1 = mock(Math1.class);
		when(m1.div(anyInt(), eq(0))).thenThrow(new ArithmeticException());
	}

	@Test(expected=ArithmeticException.class)
	public void test() {
		m1.div(3, 0);
	}

}

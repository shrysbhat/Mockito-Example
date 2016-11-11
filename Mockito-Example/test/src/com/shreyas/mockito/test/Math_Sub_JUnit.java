package com.shreyas.mockito.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shreyas.mockito.Math1;

public class Math_Sub_JUnit {

	Math1 m;
	
	@Before
	public void setUp() throws Exception {
		m = new Math1();
	}

	@Test
	public void test2(){
		assertEquals(4,m.sub(5, 1));
	}
}

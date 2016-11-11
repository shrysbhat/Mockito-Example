package com.shreyas.mockito.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shreyas.mockito.Math1;


public class Math_Add_JUnit {

	Math1 m;
	
	@Before
	public void setUp() throws Exception {
		m = new Math1();
	}

	@Test
	public void test() {
		assertEquals(3,m.add(1,2));
	}

}

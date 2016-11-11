package com.shreyas.mockito.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


import com.shreyas.mockito.Math1;

public class MathMockTestWithAnnotation {

	@Mock
	Math1 m;
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
		when(m.add(1, 2)).thenReturn(3);
	}

	@Test
	public void test() {
		assertEquals(3,m.add(1, 2));
	}

}

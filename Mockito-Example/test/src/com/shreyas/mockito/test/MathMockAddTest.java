package com.shreyas.mockito.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.shreyas.mockito.*;

public class MathMockAddTest {

	Math1 m;
	
	@Before
	public void setUp() throws Exception {
		m = mock(Math1.class);
		when(m.add(1, 2)).thenReturn(3);
	}

	@Test
	public void test() {
		assertEquals(3,m.add(1, 2));
	}

}

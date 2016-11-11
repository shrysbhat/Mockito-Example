package com.shreyas.mockito.test;

import org.junit.Before;
import org.junit.Test;

import com.shreyas.mockito.Math1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MathMockVerifyTest {

	Math1 m1;
	
	@Before
	public void setUp() throws Exception {
		m1 = mock(Math1.class);
		when(m1.add(1, 2)).thenReturn(3);
	}
	

	@Test
	public void test() {
		assertSame(m1.add(1, 2),3);

		verify(m1).add(eq(1), eq(2));
		
		verify(m1,times(1)).add(1, 2);
		
		verify(m1,times(2)).add(1,2);
	}

}

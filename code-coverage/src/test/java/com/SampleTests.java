package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SampleTests {

	Sample sample = new Sample();
	
	@Test
	public void testSumIsOK() {
		assertEquals(7, sample.sum(4, 3));
	}
	
	@Test
	public void testSumIsNotOK() {
		assertNotEquals(8, sample.sum(4, 3));
	}
}

package com.tdd.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TDDTester {

	
	protected Divider divider;

	protected void assertDivider(int input, String expected) {
		
		assertNotNull("Divider is null", divider);
		
		String result = divider.convert(input);
		assertNotNull("Result is null", result);
		assertTrue("Result has no value", result.length() > 0);
		
		assertEquals("Result does not match", expected, result);
	}
}

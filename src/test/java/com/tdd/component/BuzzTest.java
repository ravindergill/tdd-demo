package com.tdd.component;

import org.junit.Before;
import org.junit.Test;

public class BuzzTest extends TDDTester {

	@Before
	public void setUp() {
		divider = new Buzz();
	}
	
	@Test
	public void testGivesBuzz() {
		assertDivider(5, "Buzz");
	}

	@Test
	public void test1Gives1() {
		assertDivider(1, "1");
	}
	
	
	@Test
	public void test10GivesBuzz() {
		assertDivider(10, "Buzz");
	}
	
	
	@Test
	public void test7Gives7() {
		assertDivider(7, "7");
	}
	
	
}

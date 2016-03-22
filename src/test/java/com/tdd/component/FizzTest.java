package com.tdd.component;

import org.junit.Before;
import org.junit.Test;

public class FizzTest extends TDDTester {

	@Before
	public void setUp() {
		divider = new Fizz();
	}
	
	@Test
	public void testGivesFizz() {
		assertDivider(3, "Fizz");
	}

	@Test
	public void test1Gives1() {
		assertDivider(1, "1");
	}
	
	
	@Test
	public void test6GivesFizz() {
		assertDivider(6, "Fizz");
	}
	
	
	@Test
	public void test7Gives7() {
		assertDivider(7, "7");
	}
	
	
}

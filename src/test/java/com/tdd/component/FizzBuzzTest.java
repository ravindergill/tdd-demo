package com.tdd.component;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		FizzBuzzClient client = new FizzBuzzChain();
		client.addDivider(new Fizz());
		client.addDivider(new Buzz());
		
		assertNotNull("Client is null", client);
		
		String result = client.convert(3);
		
		assertEquals("Result does not match", "Fizz", result);
	}

}

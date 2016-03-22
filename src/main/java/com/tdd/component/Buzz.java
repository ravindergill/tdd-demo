package com.tdd.component;

public class Buzz implements Divider {

	@Override
	public String convert(int input) {
		return (isFactor(input) ? "Buzz" : Integer.toString(input));
	}

	private boolean isFactor(int input) {
		return input % 5 == 0;
	}

}

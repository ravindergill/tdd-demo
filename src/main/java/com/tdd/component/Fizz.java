package com.tdd.component;

public class Fizz implements Divider {

	@Override
	public String convert(int i) {
		return (isFactor(i) ? "Fizz" : Integer.toString(i));
	}

	private boolean isFactor(int i) {
		return i % 3 == 0;
	}

}

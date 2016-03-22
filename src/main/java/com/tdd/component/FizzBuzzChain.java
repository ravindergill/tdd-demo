package com.tdd.component;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzChain implements FizzBuzzClient {

	List<Divider> chain;
	
	public FizzBuzzChain() {
		chain = new ArrayList<Divider>();
	}
	
	@Override
	public String convert(int input) {
		String output = "";
		
		for (Divider divider : chain) {
			output += divider.convert(input);
		}
		
		return output;
	}

	
	@Override
	public void addDivider(Divider divider) {
		chain.add(divider);
	}
	
	
	
	

}

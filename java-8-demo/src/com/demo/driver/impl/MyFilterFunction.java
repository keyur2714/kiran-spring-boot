package com.demo.driver.impl;

import java.util.function.Predicate;

public class MyFilterFunction implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
			return t > 95;
	}

}

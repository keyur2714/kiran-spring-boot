package com.demo.driver.impl;
import java.util.function.Function;
public class MyMapFunction implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {		
		return t+100;
	}

}

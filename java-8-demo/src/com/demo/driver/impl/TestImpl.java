package com.demo.driver.impl;

import com.demo.functons.Test;

public class TestImpl implements Test<Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer t, Integer k) {
		return t+k;
	}

	

}

package com.demo.util;

import java.util.Comparator;

import com.demo.dto.TestDTO;

public class LastNameComparator implements Comparator<TestDTO> {

	@Override
	public int compare(TestDTO o1, TestDTO o2) {
		// TODO Auto-generated method stub
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

}

package com.demo.dto;

public class TestDTO implements Comparable<TestDTO>{

	private String firstName;
	private String lastName;
	private String middleName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public int compareTo(TestDTO o) {		
		return this.firstName.compareTo(o.getFirstName());
	}

}

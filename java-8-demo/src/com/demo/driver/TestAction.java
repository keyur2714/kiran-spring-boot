package com.demo.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.demo.dto.TestDTO;
import com.demo.func.TriFunction;
import com.demo.util.LastNameComparator;

public class TestAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> allTypes = new ArrayList<>();
		allTypes.add("Keyur");
		allTypes.add("Denish");
		allTypes.add("Vinit");

		allTypes.forEach(k -> System.out.println(k));

		System.out.println("New List");

		List<String> newTypes = allTypes.stream().map(k -> k.toUpperCase()).collect(Collectors.toList());

		newTypes.forEach(d -> System.out.println(d));

		BiFunction<String, String, Integer> bfobj = (x, y) -> x.length() + y.length();

		System.out.println("The sum of x and y is: " + bfobj.apply("keyur", "denish"));

		TriFunction<String, String, String, Integer> abc = (a, b, c) -> a.length() + b.length() + c.length();

		System.out.println("The sum of a,b and c is: " + abc.apply("a", "b", "abc"));

		List<TestDTO> allObs = new ArrayList<TestDTO>();

		TestDTO testDTO1 = new TestDTO();
		testDTO1.setFirstName("Keyur");
		testDTO1.setMiddleName("A");
		testDTO1.setLastName("Thakor");

		TestDTO testDTO2 = new TestDTO();
		testDTO2.setFirstName("Denish");
		testDTO2.setMiddleName("H");
		testDTO2.setLastName("Patel");

		TestDTO testDTO3 = new TestDTO();
		testDTO3.setFirstName("vinit");
		testDTO3.setMiddleName("s");
		testDTO3.setLastName("shah");

		allObs.add(testDTO1);
		allObs.add(testDTO2);
		allObs.add(testDTO3);

		System.out.println("-----------------");

		List<Integer> lenthList = allObs.stream().map(t -> {
			return abc.apply(t.getFirstName(), t.getMiddleName(), t.getLastName());
		}).collect(Collectors.toList());

		lenthList.stream().forEach(f -> System.out.println(f));

		System.out.println("Sorted");
		
		allObs.stream().sorted().forEach(k->System.out.println(k.getFirstName() + " " + k.getLastName()));
		//Collections.sort(allObs);
		System.out.println("-----------------");
		//allObs.forEach(k->System.out.println(k.getFirstName()));
		//Collections.sort(allObs,new LastNameComparator());
		
		allObs.stream().sorted(new LastNameComparator()).forEach(f->System.out.println(f.getFirstName()+" "+f.getLastName()));
		System.out.println("-----------------");
		allObs.stream().sorted((a,b)->b.getMiddleName().compareToIgnoreCase(a.getMiddleName())).forEach(y->System.out.println(y.getFirstName()+" "+y.getLastName()));
		
		//allObs.forEach(d->System.out.println(d.getFirstName()+ " " + d.getLastName()));
		
	}

}

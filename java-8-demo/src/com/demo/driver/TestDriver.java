package com.demo.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.driver.impl.TestImpl;
import com.demo.functons.Test;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krisna...!");
		
		List<String> allTypes = new ArrayList<>();
		
		allTypes.add("Keyur,Sachin");
		allTypes.add("Denish,Hiren");
		allTypes.add("Kiran,Vikash,Kevin");
		allTypes.add("Vinit,Piyush");
		System.out.println("Traditional Way");
		for(int i=0;i<allTypes.size();i++) {
			System.out.println(allTypes.get(i));
		}
		System.out.println("New ForEach Loop");
		for(Object object: allTypes) {
			System.out.println(object);
		}
		System.out.println("Java 8 Stream ForEach");
		allTypes.stream().forEach(o->{
			System.out.println(o.toLowerCase());
		});
		System.out.println("Java 8 Stream Transformation");
		List<String> newTypes = allTypes.stream().map(s->s.toUpperCase()).flatMap(k->Stream.of(k.split(","))).collect(Collectors.toList());
		newTypes.stream().forEach(k->System.out.println(k));
		
		String a="Keyur";
		String b="Kiran";
		
		Test test = (d,e) -> e.toString();
		Test test1 = (d,e) -> (d.toString()+e.toString());
		Object s=test.apply(a,b);
		System.out.println(s);
		String s1=(String) test1.apply(a,b);
		System.out.println(s1);
		Test test2 = (x,y) -> {
			Integer p=(Integer)x;
			Integer q=(Integer)y;
			return p+q;
		};
		
		Integer result = (Integer)test2.apply(11, 22);
		System.out.println(result);
		
		TestImpl o=new TestImpl();
		Integer l=o.apply(111, 22);
		System.out.println(l);
	}

}

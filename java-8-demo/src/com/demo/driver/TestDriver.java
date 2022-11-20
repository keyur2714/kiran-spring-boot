package com.demo.driver;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.driver.impl.MyFilterFunction;
import com.demo.driver.impl.MyMapFunction;
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
		for (int i = 0; i < allTypes.size(); i++) {
			System.out.println(allTypes.get(i));
		}
		System.out.println("New ForEach Loop");
		for (Object object : allTypes) {
			System.out.println(object);
		}
		System.out.println("Java 8 Stream ForEach");
		allTypes.stream().forEach(o -> {
			System.out.println(o.toLowerCase());
		});
		System.out.println("Java 8 Stream Transformation");
		List<String> newTypes = allTypes.stream().map(s -> s.toUpperCase()).flatMap(k -> Stream.of(k.split(",")))
				.collect(Collectors.toList());
		newTypes.stream().forEach(k -> System.out.println(k));

		String a = "Keyur";
		String b = "Kiran";

		Test test = (d, e) -> e.toString();
		test.show();
		Test.display();
		Test.display1();
		test.show1();
		Test test1 = (d, e) -> (d.toString() + e.toString());
		Object s = test.apply(a, b);
		System.out.println(s);
		String s1 = (String) test1.apply(a, b);
		System.out.println(s1);
		Test test2 = (x, y) -> {
			Integer p = (Integer) x;
			Integer q = (Integer) y;
			return p + q;
		};

		Integer result = (Integer) test2.apply(11, 22);
		System.out.println(result);

		TestImpl o = new TestImpl();
		Integer l = o.apply(111, 22);
		System.out.println(l);
		Integer num[] = { 11, 22, 21, 10, 33, 44, 22, 33 };
		System.out.println("====================");
		List<Integer> numbers = Arrays.asList(num);
		numbers.forEach(n -> System.out.println(n));
		System.out.println("========Un Ordered Unique Sets============");
		Set<Integer> sets = new HashSet(numbers);
		sets.forEach(s5 -> System.out.println(s5));

		System.out.println("========Ordered Unique Sets============");
		Set<Integer> newSets = new LinkedHashSet(numbers);
		newSets.forEach(ns -> System.out.println(ns));

		System.out.println("===============Date Time===============");
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate myBDate = LocalDate.of(1986, Month.DECEMBER, 27);
		System.out.println(myBDate);

		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
		System.out.println("Current Date in IST=" + todayKolkata);

		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= " + dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 365);

		System.out.println("100th day of 2014=" + hundredDay2014);

		System.out.println("=============");

		LocalTime time = LocalTime.now();
		System.out.println("Current Time=" + time);

		LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
		System.out.println("Specific Time of Day=" + specificTime);

		LocalTime timeKolkata = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println("Current Time in IST=" + timeKolkata);

		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
		System.out.println("10000th second time= " + specificSecondTime);

		LocalDateTime todayDTM = LocalDateTime.now();
		System.out.println("Current DateTime=" + todayDTM);

		LocalDateTime todayKolkataDT = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkataDT);

		System.out.println("==============");

		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = " + timestamp);

		System.out.println(new Date(System.currentTimeMillis()));

		Duration thirtyDay = Duration.ofDays(30);
		System.out.println(thirtyDay);

		LocalDate date = LocalDate.now();

		System.out.println("Default format of LocalDate=" + date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("d/MM/uuuu")));

		System.out.println("==========Streams===============");

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		Stream<Integer> sequentialStream = myList.stream();
		Stream<Integer> parallelStream = myList.parallelStream();

		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));

		myList.stream().filter(new MyFilterFunction()).map(new MyMapFunction()).forEach(k22->System.out.println(k22));
		
		
	}

}

package com.demo.functons;

@FunctionalInterface
public interface Test<T,K,R> {

	R apply(T t,K k);

	default void show()
    {
      System.out.println("Default Method Executed");
    }
	
	default void show1()
    {
      System.out.println("Default Method Executed");
    }
	
	static void display()
    {
        System.out.println("Static Method Executed");
    }
	
	static void display1()
    {
        System.out.println("Static Method Executed");
    }
}

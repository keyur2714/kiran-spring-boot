package com.demo.functons;

@FunctionalInterface
public interface Test<T,K,R> {

	R apply(T t,K k);

}

package com.dbdemo.demo.service;

import java.util.List;

public interface IService<T> {

	T save(T type);

	List<T> list();

	T get(Long id);

	void delete(Long id);

	T update(T type);
}

package com.ying.service;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T, PK extends Serializable> {
	T load(PK id);

	T get(PK id);

	List<T> findAll();

	void persist(T entity);

	String save(T entity);

	void saveOrUpdate(T entity);

	void delete(String id);

	void flush();
}

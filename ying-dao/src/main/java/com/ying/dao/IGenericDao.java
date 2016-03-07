package com.ying.dao;


import java.io.Serializable;
import java.util.List;

/**
 * 
 * @datetime 2016年2月29日
 * @author liuwei
 * @QQ 574613441
 * @param <T> 实体
 * @param <PK> ID的类型
 */
interface IGenericDao<T, PK extends Serializable> {
	
	T load(PK id);
	
	T get(PK id);
	
	List<T> findAll();
	
	void persist(T entity);
	
	PK save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(PK id);
	
	void flush();
}

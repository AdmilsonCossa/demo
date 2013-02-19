package com.keep.framework.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author 张朝峥
 */
@Repository
public interface GenericDAO {

	Serializable save(Object entity);

	boolean saveOrUpdate(Object entity);

	boolean saveOrUpdateAll(Collection<?> entities);
	
	<E> E get(Class<E> entityClass, Serializable key);
	
	<E> List<E> findAll(Class<E> entityClass);

	boolean update(Object entity);

	boolean delete(Object entity);
	
	<E> boolean delete(Class<E> entityClass, Serializable key);
	
	boolean deleteAll(Collection<?> entities);
	
	<E> boolean deleteAll(Class<E> entityClass, List<Serializable> key);
}

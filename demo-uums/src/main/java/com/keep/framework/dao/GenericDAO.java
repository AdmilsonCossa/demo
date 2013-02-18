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

	void saveOrUpdate(Object entity);

	void saveOrUpdateAll(Collection<?> entities);
	
	<E> E get(Class<E> entityClass, Serializable key);
	
	<E> List<E> findAll(Class<E> entityClass);

	void update(Object entity);

	void delete(Object entity);
	
	void deleteAll(Collection<?> entities);
}

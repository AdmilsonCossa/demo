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

	@SuppressWarnings("rawtypes")
	void saveOrUpdateAll(Collection entities);
	
	@SuppressWarnings("rawtypes")
	Object get(Class entityClass, Serializable key);
	
	@SuppressWarnings("rawtypes")
	Object load(Class entityClass, Serializable key);
	
	@SuppressWarnings("rawtypes")
	List loadAll(Class entityClass);

	void update(Object entity);

	void delete(Object entity);
	
	@SuppressWarnings("rawtypes")
	void deleteAll(Collection entities);
}

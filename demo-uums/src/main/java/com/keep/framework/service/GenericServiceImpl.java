package com.keep.framework.service;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keep.framework.dao.GenericDAO;

/**
 * @author 张朝峥
 *
 * @param <E>	实体	
 * @param <K>	主键
 */
@Service
public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K>{
	
	private Class<E> entityClass = null;
	
	@Autowired
	private GenericDAO genericDAO;

	public GenericServiceImpl() {
		this.entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public K save(E entity) {
		return (K) genericDAO.save(entity);
	}

	@Override
	public E get(K key) {
		return (E) genericDAO.get(entityClass, key);
	}

	@Override
	public void delete(E entity) {
		genericDAO.delete(entity);
	}

	@Override
	public void update(E entity) {
		genericDAO.update(entity);
	}

	public void setGenericDAO(GenericDAO genericDAO) {
		this.genericDAO = genericDAO;
	}
}

package com.keep.framework.service;


import java.io.Serializable;

import com.keep.framework.dao.GenericDAOImpl;
import com.keep.framework.service.GenericService;

/**
 * @author 张朝峥
 *
 * @param <E>	实体	
 * @param <K>	主键
 */
public class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K>{
	
	private GenericDAOImpl<E, K> dao;

	@Override
	public K save(E entity) {
		return dao.save(entity);
	}

	@Override
	public E get(K key) {
		return dao.get(key);
	}

	@Override
	public void delete(E entity) {
		dao.delete(entity);
	}

	@Override
	public void update(E entity) {
		dao.update(entity);
	}

	public void setDao(GenericDAOImpl<E, K> dao) {
		this.dao = dao;
	}
}

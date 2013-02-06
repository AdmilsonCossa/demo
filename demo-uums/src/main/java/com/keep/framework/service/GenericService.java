package com.keep.framework.service;

import java.io.Serializable;

/**
 * @author 张朝峥 
 *
 */
public interface GenericService<E, K extends Serializable> {

	K save(E entity);

	E get(K key);

	void delete(E entity);

	void update(E entity);

}

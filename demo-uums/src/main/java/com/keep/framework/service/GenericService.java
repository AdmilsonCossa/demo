package com.keep.framework.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.stereotype.Service;

/**
 * @author 张朝峥 
 *
 */

@Service
public interface GenericService<E, K extends Serializable> {

	K save(E entity);

	E get(K key);

	void delete(E entity);

	void update(E entity);

	Collection<E> listAll();
}

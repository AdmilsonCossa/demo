package com.keep.framework.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author 张朝峥
 *
 * @param <E>	实体
 * @param <K>	主键
 */
public interface GenericDAO<E, K extends Serializable> {

	K save(E entity);

	void saveOrUpdate(E entity);

	void saveOrUpdateAll(Collection<E> entities);

	E get(K key);

	E load(K key);

	List<E> loadAll();

	void update(E entity);

	void delete(E entity);

	void deleteAll(Collection<E> entities);
}

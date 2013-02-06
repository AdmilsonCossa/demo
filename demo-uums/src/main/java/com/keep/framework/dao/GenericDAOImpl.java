package com.keep.framework.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author 张朝峥
 *
 * @param <E>	实体
 * @param <K>	主键
 */
@SuppressWarnings("unchecked")
@Repository
public class GenericDAOImpl<E, K extends Serializable> extends
		HibernateDaoSupport implements GenericDAO<E, K> {
	
	private Class<E> entityClass = null;

	public GenericDAOImpl() {
		this.entityClass = (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public K save(E entity) {
		return (K) super.getHibernateTemplate().save(entity);
	}

	@Override
	public void saveOrUpdate(E entity) {
		super.getHibernateTemplate().saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<E> entities) {
		super.getHibernateTemplate().saveOrUpdateAll(entities);
	}

	@Override
	public E get(K key) {
		return super.getHibernateTemplate().get(entityClass, key);
	}

	@Override
	public E load(K key) {
		return super.getHibernateTemplate().load(entityClass, key);
	}

	@Override
	public List<E> loadAll() {
		return super.getHibernateTemplate().loadAll(entityClass);
	}

	@Override
	public void update(E entity) {
		super.getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(E entity) {
		super.getHibernateTemplate().delete(entity);
	}

	@Override
	public void deleteAll(Collection<E> entities) {
		super.getHibernateTemplate().deleteAll(entities);
	}
}

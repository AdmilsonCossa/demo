package com.keep.framework.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张朝峥
 */
@Transactional
@Repository
@Scope("prototype")
public class GenericDAOImpl implements GenericDAO {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Serializable save(Object entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdateAll(Collection<?> entities) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> E get(Class<E> entityClass, Serializable key) {
		return (E) sessionFactory.getCurrentSession()
				.createQuery("from " + entityClass + " t where t.id = :id")
				.setParameter("id", key).uniqueResult();
	}

	@Override
	public <E> List<E> findAll(Class<E> entityClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Collection<?> entities) {
		// TODO Auto-generated method stub
		
	}
}

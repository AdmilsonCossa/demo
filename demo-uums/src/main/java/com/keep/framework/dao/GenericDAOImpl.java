package com.keep.framework.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
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
//@Scope("prototype")
public class GenericDAOImpl implements GenericDAO {
	
	private Logger log = Logger.getLogger(GenericDAOImpl.class);
	
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
	public boolean saveOrUpdate(Object entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		return true;
	}

	@Override
	public boolean saveOrUpdateAll(Collection<?> entities) {
		for (Object entity : entities) {
			saveOrUpdate(entity);
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> E get(Class<E> entityClass, Serializable key) {
		return (E) sessionFactory.getCurrentSession()
				.createQuery("from " + entityClass.getName() + " t where t.id = :id")
				.setParameter("id", key).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> List<E> findAll(Class<E> entityClass) {
		return sessionFactory.getCurrentSession()
				.createQuery("from " + entityClass.getName()).list();
	}

	@Override
	public boolean update(Object entity) {
		sessionFactory.getCurrentSession().update(entity);
		return true;
	}

	@Override
	public boolean delete(Object entity) {
		sessionFactory.getCurrentSession().delete(entity);
		return true;
	}

	//TODO 批量删除
	@Override
	public boolean deleteAll(Collection<?> entities) {
		for (Object entity : entities) {
			delete(entity);
		}
		return true;
	}

	@Override
	public <E> boolean delete(Class<E> entityClass, Serializable key) {
		sessionFactory.getCurrentSession().createQuery("delete from " + entityClass.getName() + " t where t.id = :id").executeUpdate();
		return false;
	}

	//TODO 批量删除
	@Override
	public <E> boolean deleteAll(Class<E> entityClass, List<Serializable> keys) {
		for (Serializable key : keys) {
			delete(entityClass, key);
		}
		return true;
	}
}

package com.keep.framework.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 张朝峥
 *
 * @param <E>	实体
 * @param <K>	主键
 */
@SuppressWarnings("unchecked")
@Repository
public class GenericDAOImpl implements GenericDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Serializable save(Object entity) {
		return getHibernateTemplate().save(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void saveOrUpdateAll(Collection entities) {
		getHibernateTemplate().saveOrUpdateAll(entities);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object get(Class entityClass, Serializable key) {
		return getHibernateTemplate().get(entityClass, key);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object load(Class entityClass, Serializable key) {
		return getHibernateTemplate().load(entityClass, key);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List loadAll(Class entityClass) {
		return getHibernateTemplate().loadAll(entityClass);
	}

	@Override
	public void update(Object entity) {
		getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(Object entity) {
		getHibernateTemplate().delete(entity);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void deleteAll(Collection entities) {
		getHibernateTemplate().deleteAll(entities);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}

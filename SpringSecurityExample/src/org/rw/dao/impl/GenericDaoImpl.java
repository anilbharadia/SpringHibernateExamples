package org.rw.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rw.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericDaoImpl <E, PK extends Serializable> implements GenericDao<E, PK>/*, FinderExecutor*/ {
	
	
	private Class<E> entityType;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public GenericDaoImpl(Class<E> entityType) {
	    this.entityType = entityType;
	}
	
	
	@SuppressWarnings("unchecked")
	public PK create(E entity) {
	    return (PK) getSession().save(entity);
	}
	
	
	@SuppressWarnings("unchecked")
	public E read(PK id) {
	    return (E) getSession().get(entityType, id);
	}
	
	
	public void update(E entity) {
	    getSession().update(entity);
	}
	
	
	public void delete(E entity) {
	    getSession().delete(entity);
	}

	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
}
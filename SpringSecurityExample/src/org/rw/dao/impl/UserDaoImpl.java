package org.rw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.rw.dao.UserDao;
import org.rw.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @since 1.0
 * @author anil.bharadia
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}
	
	
	public User findByUsername(final String username) {
		Query query = getSession().createQuery("from User u where u.username = :username");
		
		query.setParameter("username", username);
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) query.list();
		return users.get(0);
	}
	

}

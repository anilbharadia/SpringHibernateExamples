package org.rw.service.impl;

import org.rw.dao.UserDao;
import org.rw.entity.User;
import org.rw.exception.UserNotFoundException;
import org.rw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since 1.0
 * @author anil.bharadia
 */
@Service(value="userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	@Transactional(readOnly=false)
	public Long save(User user) {
		return userDao.create(user);
	}

	
	@Override
	@Transactional(readOnly=true)
	public User findById(Long id) throws UserNotFoundException {
		if (id == null) {
			throw new UserNotFoundException(id);
		}
		User user = userDao.read(id);
		if (user == null) {
			throw new UserNotFoundException(id);
		}
		return user;
	}


	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

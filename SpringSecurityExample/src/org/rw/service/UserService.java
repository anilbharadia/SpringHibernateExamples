package org.rw.service;

import org.rw.entity.User;
import org.rw.exception.UserNotFoundException;

/**
 * @since 1.0
 * @author anil.bharadia
 */
public interface UserService {

	Long save(User user);
	
	User findById(final Long id) throws UserNotFoundException;
	
	User findByUsername(final String username);
	
}

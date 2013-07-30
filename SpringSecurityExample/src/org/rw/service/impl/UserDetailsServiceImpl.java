/**
 * 
 */
package org.rw.service.impl;

import org.rw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @since 1.0
 * @author anil.bharadia
 */
@Service(value="userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	

}

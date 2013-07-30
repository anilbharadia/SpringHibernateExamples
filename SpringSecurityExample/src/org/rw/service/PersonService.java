package org.rw.service;

import org.rw.entity.Person;
import org.rw.exception.PersonNotFoundException;

/**
 * @since 1.0
 * @author anil.bharadia
 */
public interface PersonService {

	Long save(Person person);
	
	Person findById(Long id) throws PersonNotFoundException;

}

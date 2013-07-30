package org.rw.dao;

import java.util.List;

import org.rw.entity.Person;

/**
 * @since 1.0
 * @author anil.bharadia
 */
public interface PersonDao extends GenericDao<Person, Long> {

	List<Person> findByFirstName(String firstName);
	
}

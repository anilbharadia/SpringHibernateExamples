package org.rw.dao.impl;

import java.util.List;

import org.rw.dao.PersonDao;
import org.rw.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * @since 1.0
 * @author anil.bharadia
 */
@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person, Long> implements PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}
	

	@Override
	public List<Person> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}

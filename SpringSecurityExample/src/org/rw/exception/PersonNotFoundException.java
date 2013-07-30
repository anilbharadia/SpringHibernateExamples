package org.rw.exception;

import org.rw.entity.Person;

/**
 * @since 1.0
 * @author anil.bharadia
 */
public class PersonNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = -3482002470726982327L;

	public PersonNotFoundException(Long id) {
		super(Person.class, id);
	}

}

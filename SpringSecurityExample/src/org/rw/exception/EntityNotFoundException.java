package org.rw.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1790360627045590675L;
	
	private Class<? extends Object> clazz;
	private Serializable id;
	
	
	public EntityNotFoundException(Class<? extends Object> clazz, Serializable id) {
		this.clazz = clazz;
		this.id = id;
	}
	
	
	@Override
	public String getMessage() {
		return "Entity of type[" + clazz.getName() + "] not found for given id[" + id + "]";
	}
	
	
}

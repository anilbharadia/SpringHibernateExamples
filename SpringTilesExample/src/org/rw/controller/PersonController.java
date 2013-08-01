package org.rw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/person")
public class PersonController {

	
	@RequestMapping(value="/view")
	public String view() {
		return "person/personView";
	}
	
	
	@RequestMapping(value="/add")
	public String add() {
		return "person/personAdd";
	}
	
}

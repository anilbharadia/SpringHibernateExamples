package org.rw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/person")
public class PersonController {
	
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String showAddForm(Model model) {
		return "PersonAddEditForm";
	}
	
	
	@RequestMapping(value="/view/{personId}")
	public String view(@PathVariable Long personId, ModelMap model) {
		return "PersonView";
	}
	

}

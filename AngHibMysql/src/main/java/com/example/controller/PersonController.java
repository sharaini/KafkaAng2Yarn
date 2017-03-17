package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/persons")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/persons")
	public void addApplication(@RequestBody Person p){
		personService.addPerson(p);
	}
}

package com.example.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository pr;
	
	public List<Person> getAllPersons(){
		List<Person> persons = new ArrayList<>();
		pr.findAll().forEach(persons::add);
		return persons;
	}
	
	public void addPerson(Person p){
		pr.save(p);
	}
}

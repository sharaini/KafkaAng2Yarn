package com.example.repository;

import com.example.model.Person;
import org.springframework.data.repository.*;
public interface PersonRepository extends CrudRepository<Person,Long>{
	
}

package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Person;

@RestController
@RequestMapping(value = "/users")
public class PersonResource {
	
	@GetMapping
	public ResponseEntity<Person> findALL(){
		Person u = new Person(1L, "Maria", "maria@gmail.com", "11980526523", "123456");
		return ResponseEntity.ok().body(u);
		
	}

}

package com.girish.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.girish.model.Person;
import com.girish.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@RequestMapping(value = "/personbyid/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Person> getAllUsers(@PathVariable Integer id) {
		return personService.getByPersonId(id);
	}

	@RequestMapping(value = "/personbyname/{name}", method = RequestMethod.GET)
	public List<Person> getPersoneByName(@PathVariable String name) {
		return personService.findByName(name);
	}

	@RequestMapping(value = "/getallpersons", method = RequestMethod.GET)
	public List<Person> getAll() {
		return personService.getAllPersons();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public HttpStatus deletePersnone(@PathVariable Integer id) {
		personService.deletePerson(id);
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/insertperson", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody Person person) {
		return personService.addPerson(person) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updateperson", method = RequestMethod.PUT)
	public HttpStatus updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/personbylastnameandagedesc/{name}", method = RequestMethod.GET)
	public List<Person> findByLastNameOrderByAgeDesc(@PathVariable String name) {
		return personService.findByLastNameOrderByAgeDesc(name);
	}


}

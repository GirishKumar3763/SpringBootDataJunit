package com.girish.service;

import java.util.List;
import java.util.Optional;

import com.girish.model.Person;

public interface PersonService {
	
	public List<Person> getAllPersons();
	public List<Person> findByName(String name);
	public Optional<Person> getByPersonId(Integer id);
	public void deletePerson(Integer personId);
	public boolean addPerson(Person person);
	public boolean updatePerson(Person person);
	public List<Person> findByLastNameOrderByAgeDesc(String lastName);

}

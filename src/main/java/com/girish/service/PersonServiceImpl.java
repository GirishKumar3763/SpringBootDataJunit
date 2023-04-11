package com.girish.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.girish.model.Person;
import com.girish.repository.PersonRepository;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	
	public List<Person> getAllPersons() {
		return (List<Person>) personRepository.findAll();
	}

	
	public List<Person> findByName(String name) {
		return (List<Person>)personRepository.findByFirstName(name);
	}

	public Optional<Person> getByPersonId(Integer id){
	
		return personRepository.findById(id);
	}

	
	public void deletePerson(Integer personId) {
		personRepository.deleteById(personId);
	}

	
	public boolean addPerson(Person person) {
		return personRepository.save(person) != null;
	}

	
		public boolean updatePerson(int id,Person person) {
		Optional<Person> persons = personRepository.findById(id);
		if(persons.isEmpty()) {
			return false;
		}
		else {
			Person udatedPerson=persons.get();
			udatedPerson.setAge(person.getAge());
			udatedPerson.setFirstName(person.getFirstName());
			udatedPerson.setLastName(person.getLastName());
			personRepository.save(udatedPerson);
			return true;
		}
	}


	public List<Person> findByLastNameOrderByAgeDesc(String lastName) {
		// TODO Auto-generated method stub
		return personRepository.findByLastNameOrderByAgeDesc(lastName);
	}


	
	

	
}

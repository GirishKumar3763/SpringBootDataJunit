package com.girish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girish.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	public List<Person> findByFirstName(String firstName);
	public List<Person> findByLastNameOrderByAgeDesc(String lastName);
	

}

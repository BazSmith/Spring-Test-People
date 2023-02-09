package com.uk.sky.people.service;

import com.uk.sky.people.domain.Person;

import java.util.List;

public interface PersonService {

   Person createPerson(Person p);

   Person getById(int id);

   List<Person> getAll();


   Person update(int id, String name, Integer age, String job);

   Person remove(int id);
}
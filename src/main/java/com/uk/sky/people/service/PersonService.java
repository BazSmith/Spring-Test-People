package com.uk.sky.people.service;

import com.uk.sky.people.domain.Person;

import java.util.List;

public interface PersonService {

   public abstract Person createPerson(Person p);

   Person getById(int id);

   List<Person> getAll();

   Person update(int id, String name, String job);
}

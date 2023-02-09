package com.uk.sky.people.persistence;

import com.uk.sky.people.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo  extends JpaRepository<Person, Integer> {
}
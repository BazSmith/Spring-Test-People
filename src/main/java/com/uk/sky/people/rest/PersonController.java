package com.uk.sky.people.rest;

import com.uk.sky.people.PeopleApplication;
import com.uk.sky.people.domain.Person;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {


    private List<Person> people = new ArrayList<>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Baz!";
    }

    @PostMapping("/create")
    public Person addPerson(@RequestBody Person person){ //pulls person from the body of the request
        this.people.add(person); //add a new person to the list
        return this.people.get(this.people.size() - 1); //returns last person in the list
    }


    @GetMapping("/getall")
    public List<Person> getAll(){
        return this.people;
    }


    @GetMapping("/get/{id}")
    public Person getPerson(@PathVariable int id){ //pulls id from the path (url)
        return this.people.get(id);
    }




}

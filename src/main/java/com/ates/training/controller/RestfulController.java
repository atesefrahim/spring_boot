package com.ates.training.controller;

import com.ates.training.model.Person;
import com.ates.training.model.PersonList;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/training")
public interface RestfulController {

  @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<String> get(@RequestParam("input") String input);

  @GetMapping(value = "/getperson", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<Person> getPerson();

  @PostMapping(value = "/sendinfo", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity sendInfo(@RequestBody Person person);

  @GetMapping(value = "/getpersonlist", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<PersonList> getPersonList();


}

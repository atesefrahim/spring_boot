package com.ates.training.controller.impl;

import com.ates.training.controller.RestfulController;
import com.ates.training.model.Person;
import com.ates.training.model.PersonList;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulControllerImpl implements RestfulController {

  @Override
  public ResponseEntity<String> get(String info) {
    String name = "ibrahim";
    String manipulation = "{ \"Status\" : \"OK\", \"name\" : \"" + name + "\"}";
    System.out.println(manipulation);
    return new ResponseEntity<>(manipulation, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Person> getPerson() {

    Person pers = new Person();
    pers.setName("ibrahim");
    pers.setSurname("ates");

    return new ResponseEntity<>(pers, HttpStatus.OK);
  }

  @Override
  public ResponseEntity sendInfo(Person person) {

    if (person.getName().equalsIgnoreCase("ibrahim")) {
      return new ResponseEntity(HttpStatus.OK);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<PersonList> getPersonList() {
    List<Person> list = new ArrayList<>();
    Person pers = new Person();
    pers.setName("ibrahim");
    pers.setSurname("ates");
    list.add(pers);
    pers = new Person();
    pers.setName("halil");
    pers.setSurname("ates");
    list.add(pers);

    String stringJson = "{ \"USDRON\": {\n"
        + "        \"high\": 4.0316,\n"
        + "        \"prncNumber\": -0.05211,\n"
        + "        \"fxName\": \"ROMANYA RONU\",\n"
        + "        \"prnc\": \"-0.05\",\n"
        + "        \"last\": 4.0282,\n"
        + "        \"low\": 4.0255,\n"
        + "        \"fxCode\": \"USDRON\",\n"
        + "        \"updTime\": \"08:54:26\",\n"
        + "        \"ask\": 4.0332,\n"
        + "        \"bid\": 4.0232,\n"
        + "        \"updDate\": \"21/05/21\"\n"
        + "    },\n"
        + "    \"EURUSD\": {\n"
        + "        \"high\": 1.22405,\n"
        + "        \"prncNumber\": 0.06215,\n"
        + "        \"fxName\": \"EURO/USD\",\n"
        + "        \"prnc\": \"0.06\",\n"
        + "        \"last\": 1.22348,\n"
        + "        \"low\": 1.22235,\n"
        + "        \"fxCode\": \"EURUSD\",\n"
        + "        \"updTime\": \"08:54:28\",\n"
        + "        \"ask\": 1.22353,\n"
        + "        \"bid\": 1.22343,\n"
        + "        \"updDate\": \"21/05/21\"\n"
        + "    }"
        + "}";
    JSONObject jsonObject = new JSONObject(stringJson);
    String fxCode = "EURUSD";
    String newFxCode = fxCode.substring(0, 3) + "/" + fxCode.substring(3, fxCode.length());

    return new ResponseEntity(list, HttpStatus.OK);
  }
}

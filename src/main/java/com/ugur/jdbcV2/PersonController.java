package com.ugur.jdbcV2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sql.DataSource;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String getPerson(Model model){
    int countPerson = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM PERSON",Integer.class);

    String queryAllPersons = "SELECT * FROM PERSON";
    List<Person> personList = jdbcTemplate.query(queryAllPersons, new PersonRowMapper());

    model.addAttribute("personCount",countPerson);
    model.addAttribute("personToSave",new Person());
    model.addAttribute("personList", personList);
        return "index";
    }

    @PostMapping ("/")
    public String savePerson(Model model, Person person){


        jdbcTemplate.update("INSERT INTO PERSON VALUES (?,?,?,?,?,?,?,?,?)",person.getId(),person.getFirst_name(),
              person.getLast_name(),person.getEmail(),person.getStreet(),person.getStreet_number(),person.getCip_code(),person.getCity(),person.getCountry());

        return this.getPerson(model);
    }

    @PostMapping ("/deletePerson")
    public String deletePerson(Model model, int idToDelete){
        String deleteQuery = "DELETE FROM PERSON WHERE ID = ?";
        jdbcTemplate.update(deleteQuery, idToDelete);

        return this.getPerson(model);
    }









}

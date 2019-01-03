package com.sym.wscxfdemo.service;

import com.sym.wscxfdemo.entity.Person;

public class PersenSerivceImpl implements PersonService {
    @Override
    public Person getPersonByName(String name) {
        Person person = Person.builder()
                .age(22)
                .name(name)
                .description("restful webservice")
                .build();
        return person;
    }

    @Override
    public Person findPersonByName(String name) {
        Person person = Person.builder()
                .age(22)
                .name(name)
                .description("restful webservice")
                .build();
        return person;    }
}

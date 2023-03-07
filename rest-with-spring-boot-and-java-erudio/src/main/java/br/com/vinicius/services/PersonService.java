package br.com.vinicius.services;

import br.com.vinicius.model.Person;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());


    public Person findById(UUID id) {

        logger.info("Find one person!");

        Person person = new Person();
        person.setId(UUID.randomUUID());
        person.setFirstName("Vinícius");
        person.setLastName("Loiola Cavalheiro");
        person.setAddress("Parambu - Ceará - Brasil");
        person.setGender("Male");
        logger.info(person.getId().toString());
        return person;

    }
}

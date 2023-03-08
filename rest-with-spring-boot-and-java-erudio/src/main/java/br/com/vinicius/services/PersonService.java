package br.com.vinicius.services;

import br.com.vinicius.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    List<Person> persons = new ArrayList<>();

    Person person = new Person(
            UUID.fromString("31e25490-a574-432d-855d-2330cee4647c"),
            "Vinicius",
            "Loiola Cavalheiro",
            "Parambu - Ceará - Brasil",
            "Male"
            );


    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        return persons;
    }

    public Person save(Person person) {
        persons.add(person);
        logger.info("Create one person!");
        return person;
    }

    public Optional findById(UUID id) {
        logger.info("Find one person!");
        return persons.stream().filter(person1 -> person1.getId().equals(id)).findFirst();
    }

    public Person update(Person person) {
        persons.add(person);
        logger.info("Update one person!");
        return person;
    }

    public Person delete(UUID id) {
        logger.info("Delete one person");
        return person;
    }
}

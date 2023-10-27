package ru.netology.netologe_springboot_hibernate.service;


import jakarta.transaction.Transactional;
import ru.netology.netologe_springboot_hibernate.entity.Person;
import ru.netology.netologe_springboot_hibernate.repository.PersonsRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final PersonsRepository personsDao;

    public Service(PersonsRepository personsDao) {
        this.personsDao = personsDao;
    }

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return personsDao.getPersonsByCity(city);
    }
}


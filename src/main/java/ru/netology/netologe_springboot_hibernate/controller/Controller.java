package ru.netology.netologe_springboot_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.netologe_springboot_hibernate.entity.Person;
import ru.netology.netologe_springboot_hibernate.service.Service;


import java.util.List;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("persons/by-city")
    public List<Person> fetchCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}

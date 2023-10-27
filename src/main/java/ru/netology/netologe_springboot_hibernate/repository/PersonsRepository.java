package ru.netology.netologe_springboot_hibernate.repository;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.netologe_springboot_hibernate.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createNativeQuery("select * from users where city = :city")
                .setParameter("city", city)
                .getResultList();
    }
}

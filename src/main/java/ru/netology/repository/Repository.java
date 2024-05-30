package ru.netology.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT name, surname FROM Person where cityOfLiving =:city")
                .setParameter("city", city).getResultList();
    }
}

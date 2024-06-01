package ru.netology.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.netology.entity.Person;
import ru.netology.entity.PersonId;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, PersonId> {
    @Query(value = "select p from Person p where p.cityOfLiving = :city")
    List<Person> findByCityOfLiving(@Param("city") String city);

    @Query(value = "select p from Person p where p.age < :age order by p.age")
    List<Person> findByAgeLessThanOrderByAge(@Param("age") int age);

    @Query(value = "select p from Person p where p.name = :name and p.surname = :surname")
    Optional<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}

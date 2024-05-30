package ru.netology.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persons")
public class Person implements Serializable {
    @Id
    @Column(nullable = false, length = 30)
    private String name;
    @Id
    @Column(nullable = false, length = 30)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(name = "phone_number", nullable = false, length = 12)
    private String phoneNumber;
    @Column(name = "city_of_living", nullable = false, length = 150)
    private String cityOfLiving;
}

package org.tyss.onetoone;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(
            name = "person_seq",
            sequenceName = "person_sequence",
            initialValue = 100,
            allocationSize = 1
    )
    private int personId;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id")
    private Passport passport;

    public Person() {}   // REQUIRED by Hibernate

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
}

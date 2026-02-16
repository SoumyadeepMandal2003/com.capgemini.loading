package org.tyss.onetoone;

import jakarta.persistence.*;

@Entity
@Table(name="passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_seq")
    @SequenceGenerator(name = "passport_seq", sequenceName = "passport_sequence", initialValue = 1, allocationSize = 1)
    private int passportId;
    private String passportNumber;
    private String country;

    public Passport(){}

    public Passport(String passportNumber, String country){
        this.passportNumber = passportNumber;
        this.country = country;
    }
}
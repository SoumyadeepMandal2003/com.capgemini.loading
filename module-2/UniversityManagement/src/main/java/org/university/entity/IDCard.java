package org.university.entity;

import jakarta.persistence.*;

@Entity
public class IDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cardNumber;

    @OneToOne(mappedBy = "idCard")
    private Student student;

    // getters & setters
    public int getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
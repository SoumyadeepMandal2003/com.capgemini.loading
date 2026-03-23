package com.mediconnect.doctorservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-increment ID
    private Long doctorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private Integer experience;

    @Column(nullable = false)
    private String hospitalName;

    // e.g., "Available", "Not Available", "On Leave"
    @Column(nullable = false)
    private String availability;

}

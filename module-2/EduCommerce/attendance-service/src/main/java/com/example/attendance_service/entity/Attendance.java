package com.example.attendance_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
public class Attendance {

    @Id
    @GeneratedValue
    private Long id;

    private Long studentId;
    private Long courseId;
    private LocalDate date;

    private String status;

}

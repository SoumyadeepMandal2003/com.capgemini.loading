package com.example.result_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Result {

    @Id
    @GeneratedValue
    private Long id;

    private Long studentId;
    private Long courseId;

    private String examType;
    private Double marksObtained;
    private Double maxMarks;

    private String grade;

}

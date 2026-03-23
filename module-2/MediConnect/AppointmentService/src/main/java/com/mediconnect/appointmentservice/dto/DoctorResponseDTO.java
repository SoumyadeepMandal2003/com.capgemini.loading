package com.mediconnect.appointmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponseDTO {

    private Long doctorId;
    private String name;
    private String specialization;
    private Integer experience;
    private String hospitalName;
    private String availability;

}

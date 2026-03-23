package com.mediconnect.appointmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentResponseDTO {

    private Long appointmentId;
    private String patientName;
    private Long doctorId;
    private LocalDate appointmentDate;
    private String status;

}

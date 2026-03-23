package com.mediconnect.appointmentservice.controller;

import com.mediconnect.appointmentservice.dto.AppointmentRequestDTO;
import com.mediconnect.appointmentservice.dto.AppointmentResponseDTO;
import com.mediconnect.appointmentservice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // POST /appointments
    @PostMapping
    public ResponseEntity<AppointmentResponseDTO> createAppointment(
            @RequestBody AppointmentRequestDTO requestDTO) {

        AppointmentResponseDTO responseDTO = appointmentService.createAppointment(requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    // GET /appointments
    @GetMapping
    public ResponseEntity<List<AppointmentResponseDTO>> getAllAppointments() {
        List<AppointmentResponseDTO> appointments = appointmentService.getAllAppointments();
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }

    // GET /appointments/{id}
    @GetMapping("/{id}")
    public ResponseEntity<AppointmentResponseDTO> getAppointmentById(@PathVariable Long id) {
        AppointmentResponseDTO responseDTO = appointmentService.getAppointmentById(id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    // DELETE /appointments/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelAppointment(@PathVariable Long id) {
        String message = appointmentService.cancelAppointment(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}

package com.mediconnect.doctorservice.controller;

import com.mediconnect.doctorservice.dto.DoctorRequestDTO;
import com.mediconnect.doctorservice.dto.DoctorResponseDTO;
import com.mediconnect.doctorservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @Value("${server.port}")
    private String serverPort;

    // POST /doctors
    @PostMapping
    public ResponseEntity<DoctorResponseDTO> createDoctor(@RequestBody DoctorRequestDTO requestDTO) {
        DoctorResponseDTO responseDTO = doctorService.createDoctor(requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    // GET /doctors
    @GetMapping
    public ResponseEntity<List<DoctorResponseDTO>> getAllDoctors() {
        List<DoctorResponseDTO> doctors = doctorService.getAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    // GET /doctors/{id}
    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponseDTO> getDoctorById(@PathVariable Long id) {
        DoctorResponseDTO responseDTO = doctorService.getDoctorById(id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    // PUT /doctors/{id}
    @PutMapping("/{id}")
    public ResponseEntity<DoctorResponseDTO> updateDoctor(
            @PathVariable Long id,
            @RequestBody DoctorRequestDTO requestDTO) {

        DoctorResponseDTO responseDTO = doctorService.updateDoctor(id, requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    // DELETE /doctors/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable Long id) {
        String message = doctorService.deleteDoctor(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    // GET /doctors/port
    @GetMapping("/port")
    public ResponseEntity<String> getPort() {
        return ResponseEntity.ok("Request handled by Doctor Service on port: " + serverPort);
    }

}

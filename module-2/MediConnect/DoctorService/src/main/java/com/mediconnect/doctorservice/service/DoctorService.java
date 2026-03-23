package com.mediconnect.doctorservice.service;

import com.mediconnect.doctorservice.dto.DoctorRequestDTO;
import com.mediconnect.doctorservice.dto.DoctorResponseDTO;
import com.mediconnect.doctorservice.entity.Doctor;
import com.mediconnect.doctorservice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // ==================== CREATE DOCTOR ====================
    public DoctorResponseDTO createDoctor(DoctorRequestDTO requestDTO) {
        // Step 1: Convert DTO to Entity
        Doctor doctor = new Doctor();
        doctor.setName(requestDTO.getName());
        doctor.setSpecialization(requestDTO.getSpecialization());
        doctor.setExperience(requestDTO.getExperience());
        doctor.setHospitalName(requestDTO.getHospitalName());
        doctor.setAvailability(requestDTO.getAvailability());

        // Step 2: Save to database
        Doctor savedDoctor = doctorRepository.save(doctor);

        // Step 3: Convert saved entity back to ResponseDTO and return
        return convertToResponseDTO(savedDoctor);
    }

    // ==================== GET ALL DOCTORS ====================
    public List<DoctorResponseDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();

        // Convert each Doctor entity to DoctorResponseDTO
        return doctors.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    // ==================== GET DOCTOR BY ID ====================
    public DoctorResponseDTO getDoctorById(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found with ID: " + doctorId));

        return convertToResponseDTO(doctor);
    }

    // ==================== UPDATE DOCTOR ====================
    public DoctorResponseDTO updateDoctor(Long doctorId, DoctorRequestDTO requestDTO) {
        // First check if doctor exists
        Doctor existingDoctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found with ID: " + doctorId));

        // Update fields with new values
        existingDoctor.setName(requestDTO.getName());
        existingDoctor.setSpecialization(requestDTO.getSpecialization());
        existingDoctor.setExperience(requestDTO.getExperience());
        existingDoctor.setHospitalName(requestDTO.getHospitalName());
        existingDoctor.setAvailability(requestDTO.getAvailability());

        // Save updated entity
        Doctor updatedDoctor = doctorRepository.save(existingDoctor);

        return convertToResponseDTO(updatedDoctor);
    }

    public String deleteDoctor(Long doctorId) {
        if (!doctorRepository.existsById(doctorId)) {
            throw new RuntimeException("Doctor not found with ID: " + doctorId);
        }

        doctorRepository.deleteById(doctorId);
        return "Doctor with ID " + doctorId + " has been deleted successfully.";
    }


    private DoctorResponseDTO convertToResponseDTO(Doctor doctor) {
        DoctorResponseDTO responseDTO = new DoctorResponseDTO();
        responseDTO.setDoctorId(doctor.getDoctorId());
        responseDTO.setName(doctor.getName());
        responseDTO.setSpecialization(doctor.getSpecialization());
        responseDTO.setExperience(doctor.getExperience());
        responseDTO.setHospitalName(doctor.getHospitalName());
        responseDTO.setAvailability(doctor.getAvailability());
        return responseDTO;
    }

}

package com.mediconnect.appointmentservice.service;

import com.mediconnect.appointmentservice.dto.AppointmentRequestDTO;
import com.mediconnect.appointmentservice.dto.AppointmentResponseDTO;
import com.mediconnect.appointmentservice.dto.DoctorResponseDTO;
import com.mediconnect.appointmentservice.entity.Appointment;
import com.mediconnect.appointmentservice.feign.DoctorFeignClient;
import com.mediconnect.appointmentservice.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorFeignClient doctorFeignClient;

    public AppointmentResponseDTO createAppointment(AppointmentRequestDTO requestDTO) {

        ResponseEntity<DoctorResponseDTO> doctorResponse = doctorFeignClient.getDoctorById(requestDTO.getDoctorId());

        if (doctorResponse.getBody() == null) {
            throw new RuntimeException("Doctor not found with ID: " + requestDTO.getDoctorId()
                    + ". Cannot book appointment.");
        }

        Appointment appointment = new Appointment();
        appointment.setPatientName(requestDTO.getPatientName());
        appointment.setDoctorId(requestDTO.getDoctorId());
        appointment.setAppointmentDate(requestDTO.getAppointmentDate());
        appointment.setStatus("SCHEDULED");  // default status when appointment is first created

        Appointment savedAppointment = appointmentRepository.save(appointment);

        return convertToResponseDTO(savedAppointment);
    }

    public List<AppointmentResponseDTO> getAllAppointments() {
        List<Appointment> appointments = appointmentRepository.findAll();

        return appointments.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    public AppointmentResponseDTO getAppointmentById(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found with ID: " + appointmentId));

        return convertToResponseDTO(appointment);
    }

    public String cancelAppointment(Long appointmentId) {
        if (!appointmentRepository.existsById(appointmentId)) {
            throw new RuntimeException("Appointment not found with ID: " + appointmentId);
        }

        appointmentRepository.deleteById(appointmentId);
        return "Appointment with ID " + appointmentId + " has been cancelled successfully.";
    }

    private AppointmentResponseDTO convertToResponseDTO(Appointment appointment) {
        AppointmentResponseDTO responseDTO = new AppointmentResponseDTO();
        responseDTO.setAppointmentId(appointment.getAppointmentId());
        responseDTO.setPatientName(appointment.getPatientName());
        responseDTO.setDoctorId(appointment.getDoctorId());
        responseDTO.setAppointmentDate(appointment.getAppointmentDate());
        responseDTO.setStatus(appointment.getStatus());
        return responseDTO;
    }

}

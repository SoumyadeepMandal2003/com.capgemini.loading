package com.mediconnect.appointmentservice.feign;

import com.mediconnect.appointmentservice.dto.DoctorResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "DOCTOR-SERVICE")
public interface DoctorFeignClient {

    @GetMapping("/doctors/{id}")
    ResponseEntity<DoctorResponseDTO> getDoctorById(@PathVariable("id") Long doctorId);

}

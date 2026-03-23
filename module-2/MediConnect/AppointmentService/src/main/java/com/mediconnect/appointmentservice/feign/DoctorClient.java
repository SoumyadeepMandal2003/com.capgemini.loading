package com.mediconnect.appointmentservice.feign;

import com.mediconnect.appointmentservice.dto.DoctorResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "DoctorService")
public interface DoctorClient {

    @GetMapping("/doctors/{id}")
    DoctorResponseDTO getDoctorById(@PathVariable("id") Long id);
}

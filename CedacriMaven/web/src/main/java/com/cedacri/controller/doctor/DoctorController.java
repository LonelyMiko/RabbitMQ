package com.cedacri.controller.doctor;

import com.cedacri.doctor.Doctor;
import com.cedacri.doctor.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
private DoctorServices services;

    @GetMapping("/doctors")
public List<Doctor> getDoctors()
{
    return services.getDocotors();
}
}

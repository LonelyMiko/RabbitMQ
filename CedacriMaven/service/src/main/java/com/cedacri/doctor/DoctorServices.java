package com.cedacri.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorServices {
    @Autowired
    private DoctorRepo repo;

    @PostConstruct
    public void initDoctor()
    {
        repo.saveAll(Stream.of
                (new Doctor(101,"John","Cardiac"),
                 new Doctor(102,"Adam","Ophthalmologists"))
                .collect(Collectors.toList()));
    }
    public List<Doctor> getDocotors()
    {
        return  repo.findAll();
    }
}

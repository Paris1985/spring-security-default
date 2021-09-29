package org.oklaters.controllers;

import org.oklaters.models.Patient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class HealthCenterController {
    private List<Patient> patients = new ArrayList<>();

    @PostConstruct
    public void init() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
        Patient patient = new Patient();
        patient.setPatientId(1);
        patient.setFirstName("John");
        patient.setLastName("Smith");
        patient.setAddress("#123 Street Sta. Cruz San Jose");
        patient.setGender("M");
        patient.setDateOfBirth(dateFormat.parse("10/23/1988"));
        patients.add(patient);

        patient = new Patient();
        patient.setPatientId(2);
        patient.setFirstName("Mark");
        patient.setLastName("Santos");
        patient.setAddress("#321 Street Naga City");
        patient.setGender("M");
        patient.setDateOfBirth(dateFormat.parse("01/03/1990"));
        patients.add(patient);
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> hello() throws ParseException {
        return ResponseEntity.ok(patients);
    }
}

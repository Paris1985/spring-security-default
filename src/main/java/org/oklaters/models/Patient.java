package org.oklaters.models;

import lombok.Data;

import java.util.Date;

@Data
public class Patient {
    private int patientId;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String address;
}

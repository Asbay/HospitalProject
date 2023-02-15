package com.tpe.dto;

import com.tpe.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {

    private String name;

    private Gender gender;
    private Integer dateOfBirth;

    private City city;

    private String  address;

    private boolean healthInsurance;


    public PatientDto(Patient patient){
        this.name = patient.getName();
        this.gender = patient.getGender();
        this.address= patient.getAddress();
        this.city= patient.getCity();
        this.healthInsurance = patient.isHealthInsurance();
        this.dateOfBirth = patient.getDateOfBirth();

    }

}

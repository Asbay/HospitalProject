package com.tpe.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @Setter(AccessLevel.NONE)
    private Long id;


    private String name;

    private Gender gender;
    private Integer dateOfBirth;

    private City city;

    private String  address;

    private boolean healthInsurance;

}


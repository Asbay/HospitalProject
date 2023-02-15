package com.tpe.dto;

import com.tpe.model.Department;
import com.tpe.model.Doctor;
import com.tpe.model.NamePrefix;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {

    private Long id;
    private String name;
    private NamePrefix namePrefix;
    private Department department;
    private Integer dateOfGraduate;
    private Integer dateOfStart;



    public DoctorDTO(Doctor doctor){
        this.id=doctor.getId();
        this.name=doctor.getName();
        this.namePrefix=doctor.getNamePrefix();
        this.department=doctor.getDepartment();
        this.dateOfGraduate=doctor.getDateOfGraduate();
        this.dateOfGraduate=doctor.getDateOfGraduate();
    }
}

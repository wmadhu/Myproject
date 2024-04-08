package com.college.CollegeAdmission.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="TBL_Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

@Id
@GeneratedValue
    private int rollNum;
    private String name;
    private String email;
    private int age;
    private String gender;
    private String address;
    private int mob;

}

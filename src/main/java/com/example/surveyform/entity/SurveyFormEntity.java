package com.example.surveyform.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="survey_form_info")
public class SurveyFormEntity {
    @Id

    private Integer studentId;
    private String email;
    private String name;
    private String contactNumber;
    private Integer yearOfPassing;
    private String branch;
    private String collegeName;
    private String internshipDomain;
    private String experience;


    public SurveyFormEntity() {
    }

    public SurveyFormEntity(Integer studentId,String email, String name, String contactNumber, Integer yearOfPassing, String branch, String collegeName, String internshipDomain, String experience) {
        this.studentId=studentId;
        this.email = email;
        this.name = name;
        this.contactNumber = contactNumber;
        this.yearOfPassing = yearOfPassing;
        this.branch = branch;
        this.collegeName = collegeName;
        this.internshipDomain = internshipDomain;
        this.experience = experience;
    }
}

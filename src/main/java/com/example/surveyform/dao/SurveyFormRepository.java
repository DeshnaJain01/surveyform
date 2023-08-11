package com.example.surveyform.dao;

import com.example.surveyform.entity.SurveyFormEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyFormRepository extends JpaRepository<SurveyFormEntity, Integer> {

}

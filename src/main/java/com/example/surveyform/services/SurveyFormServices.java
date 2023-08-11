package com.example.surveyform.services;

import com.example.surveyform.entity.SurveyFormEntity;

public interface SurveyFormServices{
    public SurveyFormEntity createSurveyFormEntity(SurveyFormEntity surveyFormEntity);
    public SurveyFormEntity getSurveyFormEntity(Integer studentId);
}

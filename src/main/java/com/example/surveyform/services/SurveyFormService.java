package com.example.surveyform.services;

import com.example.surveyform.dao.SurveyFormRepository;
import com.example.surveyform.entity.SurveyFormEntity;
import com.example.surveyform.exception.SurveyFormNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SurveyFormService implements SurveyFormServices {

    @Autowired
    private SurveyFormRepository surveyFormRepository;

    @Override
    @Transactional
    public SurveyFormEntity createSurveyFormEntity(SurveyFormEntity surveyFormEntity) {

        return surveyFormRepository.save(surveyFormEntity);
    }
    @Override
    public SurveyFormEntity getSurveyFormEntity(Integer studentId) {
        if(surveyFormRepository.findById(studentId).isEmpty())
            throw new SurveyFormNotFoundException("Requested Cloud Vendor does not exist.");
        return surveyFormRepository.findById(studentId).get();
    }


}

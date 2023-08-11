package com.example.surveyform.controller;
import com.example.surveyform.response.ResponseHandler;
import com.example.surveyform.entity.SurveyFormEntity;
import com.example.surveyform.services.SurveyFormService;
import com.example.surveyform.services.SurveyFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/surveyform")
public class SurveyController {
    @Autowired
    private SurveyFormService surveyFormService;

    @GetMapping("/{studentId}")
    public ResponseEntity<Object> getSurveyFormEntityDetails(@PathVariable   Integer studentId) {
        return ResponseHandler.responseBuilder("Requested Details are given here",
                HttpStatus.OK, surveyFormService.getSurveyFormEntity(studentId));

    }

//    @PostMapping("/submit-survey")
//    public ResponseEntity<Object> createSurveyFormEntity(@RequestBody SurveyFormEntity surveyFormEntity) {
//        // Process and save surveyFormEntity data to a database
//        System.out.println("Received survey data! ");
//
//
//        // Return a response indicating success (HTTP 201 Created)
//        return ResponseEntity.status(HttpStatus.CREATED).body("Survey form submitted successfully");
//    }
    @PostMapping("/submit")
    public String createSurveyFormDetails(@RequestBody SurveyFormEntity surveyFormEntity){
        surveyFormService.createSurveyFormEntity(surveyFormEntity);
        return "Created successfully";
    }


}

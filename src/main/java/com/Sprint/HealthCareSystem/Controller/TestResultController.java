package com.Sprint.HealthCareSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Sprint.HealthCareSystem.entities.Patient;
import com.Sprint.HealthCareSystem.entities.TestResult;
import com.Sprint.HealthCareSystem.exception.DataAlreadyExists;
import com.Sprint.HealthCareSystem.exception.DataNotFoundInDataBase;
import com.Sprint.HealthCareSystem.exception.ForBiddenException;
import com.Sprint.HealthCareSystem.exception.TestResultNotFoundException;
import com.Sprint.HealthCareSystem.service.ITestResultService;

@RestController
@RequestMapping("/testresult")
public class TestResultController {
    @Autowired
    ITestResultService testresultService;

    @Autowired
    LoginController logCon;


    @PostMapping("/addresult")
    public TestResult addTestResult(@RequestBody TestResult tr) throws ForBiddenException, DataAlreadyExists {
        return testresultService.addTestResult(tr);
    }


    @PutMapping("/updateresult")
    public TestResult updateResult(@RequestBody TestResult tr) throws DataNotFoundInDataBase, ForBiddenException {
        return testresultService.updateResult(tr);
    }


    @DeleteMapping("/removeresult/{id}")
    public List<TestResult> removeTestResult(@PathVariable int id) throws ForBiddenException, TestResultNotFoundException {
        return testresultService.removeTestResult(id);
    }




    @GetMapping("/viewresultsbypatient/{patientID}")
    public List<TestResult> viewResultsByPatient(@PathVariable int patientID) throws Exception {
        Patient pat = new Patient();
        try {
            pat.setPatientId(patientID);
        } catch (Exception e) {
            throw new Exception("This is Not An ID");
        }
        return testresultService.viewResultsByPatient(pat);
    }

    @GetMapping("/getAllTestResults")
    public List<TestResult> getAllTestResults(){
        return testresultService.getAll();
    }
    @GetMapping("/resultbyid/{id}")
    public TestResult getById(@PathVariable int id) throws DataNotFoundInDataBase {
        return testresultService.getById(id);
    }


}

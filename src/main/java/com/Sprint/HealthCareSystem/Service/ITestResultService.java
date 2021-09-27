package com.Sprint.HealthCareSystem.service;

import java.util.List;



import com.Sprint.HealthCareSystem.entities.Patient;
import com.Sprint.HealthCareSystem.entities.TestResult;
import com.Sprint.HealthCareSystem.exception.DataAlreadyExists;
import com.Sprint.HealthCareSystem.exception.DataNotFoundInDataBase;
import com.Sprint.HealthCareSystem.exception.TestResultNotFoundException;

public interface ITestResultService {

    public TestResult addTestResult(TestResult tr)throws DataAlreadyExists;
    public TestResult updateResult(TestResult tr) throws DataNotFoundInDataBase;
    public List<TestResult> removeTestResult(int id)throws TestResultNotFoundException;
    public List<TestResult> viewResultsByPatient(Patient patient) throws DataNotFoundInDataBase, TestResultNotFoundException;
    public List<TestResult> getAll();
    public TestResult getById(int id) throws DataNotFoundInDataBase;



}


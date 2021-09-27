package com.sprint.HealthCareSystem.service;

import java.util.List;



import com.sprint.HealthCareSystem.entities.Patient;
import com.sprint.HealthCareSystem.entities.TestResult;
import com.sprint.HealthCareSystem.exception.DataAlreadyExists;
import com.sprint.HealthCareSystem.exception.DataNotFoundInDataBase;
import com.sprint.HealthCareSystem.exception.TestResultNotFoundException;

public interface ITestResultService {

    public TestResult addTestResult(TestResult tr)throws DataAlreadyExists;
    public TestResult updateResult(TestResult tr) throws DataNotFoundInDataBase;
    public List<TestResult> removeTestResult(int id)throws TestResultNotFoundException;
    public List<TestResult> viewResultsByPatient(Patient patient) throws DataNotFoundInDataBase, TestResultNotFoundException;
    public List<TestResult> getAll();
    public TestResult getById(int id) throws DataNotFoundInDataBase;



}


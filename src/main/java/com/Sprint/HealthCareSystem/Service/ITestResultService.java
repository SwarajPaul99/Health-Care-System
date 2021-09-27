package com.Sprint.HealthCareSystem.Service;

import java.util.List;



import com.Sprint.HealthCareSystem.Entity.Patient;
import com.Sprint.HealthCareSystem.Entity.TestResult;
import com.Sprint.HealthCareSystem.Exceptions.DataAlreadyExists;
import com.Sprint.HealthCareSystem.Exceptions.DataNotFoundInDataBase;
import com.Sprint.HealthCareSystem.Exceptions.TestResultNotFoundException;

public interface ITestResultService {

    public TestResult addTestResult(TestResult tr)throws DataAlreadyExists;
    public TestResult updateResult(TestResult tr) throws DataNotFoundInDataBase;
    public List<TestResult> removeTestResult(int id)throws TestResultNotFoundException;
    public List<TestResult> viewResultsByPatient(Patient patient) throws DataNotFoundInDataBase, TestResultNotFoundException;
    public List<TestResult> getAll();
    public TestResult getById(int id) throws DataNotFoundInDataBase;



}


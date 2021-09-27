package com.Sprint.HealthCareSystem.service;


import java.util.List;
import com.Sprint.HealthCareSystem.entities.DiagnosticTest;
import com.Sprint.HealthCareSystem.exception.ConflictException;
import com.Sprint.HealthCareSystem.exception.DataNotFoundInDataBase;

public interface ITestService {

    public DiagnosticTest addTest(DiagnosticTest test) throws DataNotFoundInDataBase;
    public DiagnosticTest updateTest(DiagnosticTest test) throws DataNotFoundInDataBase;
    public DiagnosticTest removeTest(int diagnosticTestid) throws DataNotFoundInDataBase, ConflictException;
    public List<DiagnosticTest> viewAllTest();

    DiagnosticTest addTestInCenter(int testID, int centerId) throws DataNotFoundInDataBase;

}


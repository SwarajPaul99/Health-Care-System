package com.Sprint.HealthCareSystem.Service;


import java.util.List;
import com.Sprint.HealthCareSystem.Entity.DiagnosticTest;
import com.Sprint.HealthCareSystem.Exceptions.ConflictException;
import com.Sprint.HealthCareSystem.Exceptions.DataNotFoundInDataBase;

public interface ITestService {

    public DiagnosticTest addTest(DiagnosticTest test) throws DataNotFoundInDataBase;
    public DiagnosticTest updateTest(DiagnosticTest test) throws DataNotFoundInDataBase;
    public DiagnosticTest removeTest(int diagnosticTestid) throws DataNotFoundInDataBase, ConflictException;
    public List<DiagnosticTest> viewAllTest();

    DiagnosticTest addTestInCenter(int testID, int centerId) throws DataNotFoundInDataBase;

}


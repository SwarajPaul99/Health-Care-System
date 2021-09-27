package com.Sprint.HealthCareSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint.HealthCareSystem.Repository.IDiagnosticCenterRepositoryInt;
import com.Sprint.HealthCareSystem.Repository.TestRepository;
import com.Sprint.HealthCareSystem.entities.DiagnosticCenter;
import com.Sprint.HealthCareSystem.entities.DiagnosticTest;
import com.Sprint.HealthCareSystem.exception.ConflictException;
import com.Sprint.HealthCareSystem.exception.DataNotFoundInDataBase;
@Service
public class ITestServiceImpl implements ITestService {

    @Autowired
    TestRepository testrepo;

    @Autowired
    IDiagnosticCenterRepositoryInt centerRepo;



    @Override
    public DiagnosticTest addTest(DiagnosticTest test) throws DataNotFoundInDataBase {
        if(!testrepo.existsById(test.getDiagonasticTestid())) throw new DataNotFoundInDataBase("Test Already Exists");
        return testrepo.saveAndFlush(test);
    }



    @Override
    public DiagnosticTest updateTest(DiagnosticTest test) throws DataNotFoundInDataBase {
        if(!testrepo.existsById(test.getDiagonasticTestid())) throw new DataNotFoundInDataBase("Test Does Not Exist");
        return testrepo.saveAndFlush(test);
    }



    @Override
    public DiagnosticTest removeTest(int diagnosticTestid) throws ConflictException, DataNotFoundInDataBase {
        if(!testrepo.existsById(diagnosticTestid)) throw new DataNotFoundInDataBase("Test Does Not Exist");
        DiagnosticTest tes = testrepo.findById(diagnosticTestid).get();
        try {
            testrepo.delete(tes);
        }
        catch(Exception e ) {
            throw new ConflictException("This Test Is linked With Previous Other Entity So it is Preferebale Not to delete");
        }
        return tes;
    }



    @Override
    public List<DiagnosticTest> viewAllTest() {
        return testrepo.findAll();
    }



    @Override
    public DiagnosticTest addTestInCenter(int testId, int centerId) throws DataNotFoundInDataBase{
        DiagnosticTest test = testrepo.findById(testId)
                .orElseThrow(()-> new DataNotFoundInDataBase(testId+" test Not Found"));
        DiagnosticCenter center = centerRepo.findById(centerId)
                .orElseThrow(()-> new DataNotFoundInDataBase(centerId+" center Not Found"));
        test.setDiagnosticCenter(center);
        center.getTests().add(test);
        testrepo.save(test);
        return test;
    }

}


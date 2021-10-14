package com.Sprint.HealthCareSystem.Service;

import org.springframework.stereotype.Service;
import com.Sprint.HealthCareSystem.Entity.Patient;
import com.Sprint.HealthCareSystem.Entity.TestResult;
import com.Sprint.HealthCareSystem.Exceptions.DataAlreadyExists;
import com.Sprint.HealthCareSystem.Exceptions.DataNotFound;
import com.Sprint.HealthCareSystem.Exceptions.InvalidUserName;

import java.util.*;

@Service
public interface PatientService {
	Patient registerPatient(Patient patient) throws DataAlreadyExists;
	Patient updatePatientDetails(int id, Patient patient) throws DataNotFound;
	Patient viewPatientByName(String patientUserName);
	Patient viewPatient(int id) throws DataNotFound;
	List<TestResult> getAllTestResult(String patientUserName) throws DataNotFound, InvalidUserName;
	TestResult viewTestResult(int testResultId) throws DataNotFound;
	List<Patient> getAll();
}

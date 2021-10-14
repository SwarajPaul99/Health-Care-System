package com.Sprint.HealthCareSystem.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Entity.DiagnosticCenter;
import com.Sprint.HealthCareSystem.Entity.DiagnosticTest;
import com.Sprint.HealthCareSystem.Exceptions.DataAlreadyExists;
import com.Sprint.HealthCareSystem.Exceptions.DataNotFound;
import com.Sprint.HealthCareSystem.Exceptions.DiagnosticCentreNotFound;

@Service
public interface DiagnosticCenterService {
	
	List<DiagnosticCenter> getAllDiagnosticCenters();
	DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws DataAlreadyExists;
	DiagnosticCenter getDiagnosticCenterById(int diagcentreId) throws DataNotFound;
	DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws DataNotFound;
	DiagnosticTest addTest(int diagcentreId,int testId);
	//public DiagnosticCenter getDiagnosticCenter(String centername) throws DataNotFound; 
	DiagnosticCenter removeDiagnosticCenter(int id) throws DiagnosticCentreNotFound;
	List<Appointment> getListOfAppointments(String centername);
	List<DiagnosticTest> viewTestDetails(int diagcentreId) throws DataNotFound;
}


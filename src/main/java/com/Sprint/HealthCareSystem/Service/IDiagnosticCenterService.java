package com.Sprint.HealthCareSystem.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Entity.DiagnosticCenter;
import com.Sprint.HealthCareSystem.Entity.DiagnosticTest;

@Service
public class IDiagnosticCenterService implements DiagnosticCenterService{

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(int diagcentreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest viewTestDetails(int diagcentreId, String testName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest addTest(int diagcentreId, int testId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter removeDiagnosticCenter(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getListOfAppointments(String centername) {
		// TODO Auto-generated method stub
		return null;
	}

}

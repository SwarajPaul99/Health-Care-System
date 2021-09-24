package com.Sprint.HealthCareSystem.Repository.Queries;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Entity.ApprovalStatus;
import com.Sprint.HealthCareSystem.Entity.TestResult;

public class QueryClass {
	@PersistenceContext
	EntityManager eManager;
	
	public List<Appointment> getAppointmentList(int centreId, String test, ApprovalStatus status){
		TypedQuery<Appointment> gal = eManager.createQuery("select a from Appointment a join a.diagnosticTests d where"
				+ " a.diagnosticCenter.diagonasticCenterid = :id and d.testName like :test and a.approvalStatus like :status", Appointment.class);
		gal.setParameter("id", centreId);
		gal.setParameter("test",test);
		gal.setParameter("status",status);
		List<Appointment> result = gal.getResultList();
		return result;
	}
	public List<Appointment> viewAppointments( String patientName){
		TypedQuery<Appointment> vap = eManager.createQuery("select a from Appointment a where a.patient.name like :pname",Appointment.class);
		vap.setParameter("pname",patientName);
		return vap.getResultList();
	}
	public List<TestResult> getAllTestResult(String patientUserName) {
		TypedQuery<TestResult> gatr = eManager.createQuery("select t from TestResult t join t.appointment a where a.patient.name like :n",TestResult.class);
		gatr.setParameter("n", patientUserName);
		List<TestResult> tr = gatr.getResultList();
		return tr;
	}

}

package com.Sprint.HealthCareSystem.Service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Exceptions.AppointmentAlreadyProvided;
import com.Sprint.HealthCareSystem.Exceptions.AppointmentNotFound;
import com.Sprint.HealthCareSystem.Exceptions.InvalidAppointmentStatusException;

@Service
public interface AppointmentService {
	
	Appointment addAppointment(Appointment appointment) throws AppointmentAlreadyProvided;
	List<Appointment> viewAppointments(String patientName) throws AppointmentNotFound;
	Appointment viewAppointment(int appId) throws AppointmentNotFound;
	Appointment updateAppointment(int appid, Appointment appointment) throws AppointmentNotFound;
	List<Appointment> getAppointmentList(int centreId, String test, String status) throws InvalidAppointmentStatusException, AppointmentNotFound;
	Appointment removeAppointment(int appId, Appointment appointment) throws AppointmentNotFound;
	List<Appointment> getAll();

}

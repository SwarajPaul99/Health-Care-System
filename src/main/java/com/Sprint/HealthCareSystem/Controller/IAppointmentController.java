package com.Sprint.HealthCareSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Exceptions.AppointmentAlreadyProvided;
import com.Sprint.HealthCareSystem.Service.AppointmentService;


@RestController
@RequestMapping("appointmentdetails")
public class IAppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	@GetMapping("/getall")
	public List<Appointment> getAppointments(){
		return appointmentService.getAll();
	}
	@PostMapping("/create")
	public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) throws AppointmentAlreadyProvided{
		Appointment app = appointmentService.addAppointment(appointment);
		System.out.println(System.currentTimeMillis());
		return new ResponseEntity<Appointment>(app, HttpStatus.CREATED);
	}

}

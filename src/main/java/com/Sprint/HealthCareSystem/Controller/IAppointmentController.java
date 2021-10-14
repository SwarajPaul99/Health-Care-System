package com.Sprint.HealthCareSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Sprint.HealthCareSystem.Entity.Appointment;
import com.Sprint.HealthCareSystem.Exceptions.AppointmentAlreadyProvided;
import com.Sprint.HealthCareSystem.Exceptions.AppointmentNotFound;
import com.Sprint.HealthCareSystem.Exceptions.InvalidAppointmentStatusException;
import com.Sprint.HealthCareSystem.Service.AppointmentService;
import com.Sprint.HealthCareSystem.Service.IAppointmentService;


@RestController
@RequestMapping("appointmentDetails")
public class IAppointmentController {
	
	@Autowired
	private IAppointmentService appointmentService;
	@GetMapping("/getAll")
	public List<Appointment> getAppointments(){
		return appointmentService.getAll();
	}
	@PostMapping("/create")
	public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) throws AppointmentAlreadyProvided{
		System.out.println("Appointment:"+appointment);
		Appointment app = appointmentService.addAppointment(appointment);
		System.out.println(System.currentTimeMillis());
		return new ResponseEntity<Appointment>(app, HttpStatus.CREATED);
	}
	@GetMapping("/viewById/{appId}")
	public ResponseEntity<Appointment> viewAppointment(@PathVariable int appId) throws AppointmentNotFound {
		Appointment app = appointmentService.viewAppointment(appId);
		System.out.println(System.currentTimeMillis());
		return new ResponseEntity<Appointment>(app, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Appointment> updateAppointment(@RequestBody int appid, @RequestBody Appointment appointment) throws AppointmentNotFound{
		Appointment app = appointmentService.updateAppointment(appid, appointment);
		System.out.println("Appointment Details Updated Successfully....");
		return new ResponseEntity<Appointment>(app, HttpStatus.CREATED);
	}
	@GetMapping("/getList")
	public ResponseEntity<List<Appointment>> getAppointmentList(@RequestBody int centreId, @RequestBody String test, @RequestBody String status) throws InvalidAppointmentStatusException, AppointmentNotFound{
		List<Appointment> app = appointmentService.getAppointmentList(centreId, test, status);
		System.out.println(System.currentTimeMillis());
		return new ResponseEntity<List<Appointment>>(app, HttpStatus.CREATED);
	}
	@GetMapping("/viewByName/{patientName}")
	public List<Appointment> viewAppointments(@PathVariable String patientName) throws AppointmentNotFound{
		return appointmentService.viewAppointments(patientName);
	}
	@DeleteMapping("/delete/{appid}")
	public ResponseEntity<Appointment> removeAppointment(@PathVariable int appid, @RequestBody Appointment appointment) throws AppointmentNotFound{
		Appointment app = appointmentService.removeAppointment(appid, appointment);
		System.out.println("Appointment Details Deleted Successfully....");
		System.out.println(System.currentTimeMillis());
		return new ResponseEntity<Appointment>(app, HttpStatus.CREATED);
	}

}

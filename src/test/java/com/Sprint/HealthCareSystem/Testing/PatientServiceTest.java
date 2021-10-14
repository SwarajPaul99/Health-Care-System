package com.Sprint.HealthCareSystem.Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Sprint.HealthCareSystem.Entity.Patient;
import com.Sprint.HealthCareSystem.Exceptions.DataAlreadyExists;
import com.Sprint.HealthCareSystem.Exceptions.DataNotFound;
import com.Sprint.HealthCareSystem.Service.IPatientService;
import com.Sprint.HealthCareSystem.Service.PatientService;

@SpringBootTest
public class PatientServiceTest {
	
	@Autowired
	private PatientService patientService; 
	
	@Test
	@DisplayName("Data Enter Successful")
	public void registerTestPass() throws DataAlreadyExists {
		Patient pat = new Patient(20, "Ram Yav", "9888248910", 30, "M");
		Patient pat1 = new Patient(21, "Sam Kuar", "9890058910", 27, "M");
		assertEquals(pat ,patientService.registerPatient(pat));
		assertEquals(pat1 ,patientService.registerPatient(pat1));

	}
	
	@Test
	@DisplayName("Must throw exception if Id is not available")
	public void viewPatient() {
		//PatientService patservice = new IPatientService();
		DataNotFound exception = assertThrows(DataNotFound.class,() ->{ patientService.viewPatient(19);});
		assertTrue(exception.getMessage().contains("Data is not found!! Please register your name."));
		
	}
	

}

package com.Sprint.HealthCareSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Sprint.HealthCareSystem.Entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer>{
	Patient findByName(String name);

	@Query("select p from Patient p where p.name=:name")
	Patient viewPatientByName(@Param("name") String patientUserName);

}

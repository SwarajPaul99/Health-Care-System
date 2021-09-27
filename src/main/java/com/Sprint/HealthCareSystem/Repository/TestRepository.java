package com.Sprint.HealthCareSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Sprint.HealthCareSystem.entities.DiagnosticTest;

@Repository
public interface TestRepository extends JpaRepository<DiagnosticTest, Integer>{

}

package com.Sprint.HealthCareSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Sprint.HealthCareSystem.Entity.DiagnosticCenter;

@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer>{

}

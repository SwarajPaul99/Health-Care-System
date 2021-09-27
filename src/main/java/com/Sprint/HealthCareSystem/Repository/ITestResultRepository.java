package com.Sprint.HealthCareSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Sprint.HealthCareSystem.entities.TestResult;

@Repository
public interface ITestResultRepository extends JpaRepository<TestResult, Integer> {

}

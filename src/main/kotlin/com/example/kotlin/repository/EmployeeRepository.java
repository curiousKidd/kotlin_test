package com.example.kotlin.repository;

import com.example.kotlin.model.entity.Employee;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query(nativeQuery = true, value = "SELECT e.* " +
            "FROM Employees e " +
            "ORDER BY e.emp_no DESC " +
            "LIMIT :limit "
    )
    List<Employee> getEmployees(@Param("limit") int limit);
}

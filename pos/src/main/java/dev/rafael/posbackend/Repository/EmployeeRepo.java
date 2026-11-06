package dev.rafael.posbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.rafael.posbackend.Model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
 Optional<Employee> findByName(String name); 
}

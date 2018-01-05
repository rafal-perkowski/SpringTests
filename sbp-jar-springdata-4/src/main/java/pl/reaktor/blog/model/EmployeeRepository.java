package pl.reaktor.blog.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	List<Employee> findAll();
	List<Employee> findByLastNameAndSalaryGreaterThanEqualOrderBySalaryAsc(String lastName, double salary);
	
	@Query("SELECT e FROM Employee e WHERE e.lastName=?1 AND e.salary>=?2")
	List<Employee> findByLastNameAndSalary(String lastName, double salary);

}
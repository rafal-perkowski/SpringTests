package pl.reaktor.blog.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	List<Employee> findAll();
	List<Employee> findByLastNameAndSalaryGreaterThanEqualOrderBySalaryAsc(String lastName, double salary);

	@Query(name = "Employee.findByLastNameAndSalary")
	List<Employee> findByLastNameAndSalary(@Param("lastName") String lastName, @Param("salary") double salary);
}
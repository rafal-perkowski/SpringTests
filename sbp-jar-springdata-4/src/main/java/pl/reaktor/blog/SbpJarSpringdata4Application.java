package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.reaktor.blog.controller.TestController;
import pl.reaktor.blog.model.Employee;
import pl.reaktor.blog.model.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
@ComponentScan
public class SbpJarSpringdata4Application {
	
	private void printEmployeeList(List<Employee> employeeList){
		
		for(int i=0; i<employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		/*
		CRUD METHODS
		count() – zlicza ilość rekordów w danym repozytorium (ilość rekordów w bazie danych)
		delete(id) - usuwa rekord o wskazanym id
		delete(Iterable) - usuwa z bazy danych encje zapisane w kolekcji przekazanej jako argument metody. Kolekcja powinna implementować interfejs Iterable.
		delete(entity) - usuwa z repozytorium encję przekazaną jako argument
		deleteAll() - usuwa z repozytorium wszystkie rekordy
		exists(id) - sprawdza istnieje rekordu o wskazanym id w repozytorium
		findAll() - zwraca kolekcję wszystkich obiektów w repozytorium
		findAll(ids) - zwraca kolekcję obiektów, których id znalazło się w kolekcji przekazanej jako argument
		findOne(id) - zwraca z repozytorium obiekt o wskazanym id
		save(Iterable) - zapisuje w repozytorium wszystkie rekordy z kolekcji przekazanej jako argument
		save(entity) - zapisuje w repozytorium pojedynczy obiekt
		*/
		
		TestController.traceCounter(" IN: SbpJarSpringDataApplication main(" + args + ")");
		
		SbpJarSpringdata4Application tmpApp = new SbpJarSpringdata4Application();
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SbpJarSpringdata4Application.class, args);

		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Jan", "Kowalski", 5000.0));
		employeeList.add(new Employee("Robert", "Kowalski", 5500.0));
		employeeList.add(new Employee("Robert", "Nowak", 6000.0));
		employeeList.add(new Employee("Jan", "Nowak", 6500.0));
		employeeList.add(new Employee("Janina", "Kowalska", 2000.0));
		employeeList.add(new Employee("Katarzyna", "Kowalska", 2500.0));
		employeeList.add(new Employee("Wojciech", "Kruk", 4000.0));
		employeeList.add(new Employee("Norbert", "Kruk", 4500.0));
		employeeList.add(new Employee("Anna", "Kantor", 3000.0));
		employeeList.add(new Employee("Anita", "Kantor", 3500.0));
		employeeList.add(new Employee("Halina", "Kisiel", 7000.0));
		employeeList.add(new Employee("Hanna", "Kisiel", 7500.0));
		employeeList.add(new Employee("Cookie", "Monster", 10000.0));
		employeeList.add(new Employee("Candy", "Monster", 20000.0));
		employeeList.add(new Employee("Mis", "Coralgol", 9000.0));
		employeeList.add(new Employee("Misko", "Coralgol", 9999.0));
		employeeList.add(new Employee("Kubus", "Puchatek", 8000.0));
		employeeList.add(new Employee("Kubatek", "Puchatek", 8888.0));
		employeeList.add(new Employee("Ferdynand", "Kiepski", 1000.0));
		employeeList.add(new Employee("Marian", "Kiepski", 1111.0));
		
		EmployeeRepository employeeRepo = ctx.getBean(EmployeeRepository.class);
		employeeRepo.save(employeeList);
		
		List<Employee> employeeResults;
		
		employeeResults = employeeRepo.findAll();
		tmpApp.printEmployeeList(employeeResults);
		
		employeeResults = employeeRepo.findByLastNameAndSalaryGreaterThanEqualOrderBySalaryAsc("Kowalski", 4000.0);
		tmpApp.printEmployeeList(employeeResults);
		
		employeeResults = employeeRepo.findByLastNameAndSalary("Kowalski", 4000.0);
		tmpApp.printEmployeeList(employeeResults);

		ctx.close();
		
		TestController.traceCounter("OUT: SbpJarSpringDataApplication main(" + args + ")");
	}
}

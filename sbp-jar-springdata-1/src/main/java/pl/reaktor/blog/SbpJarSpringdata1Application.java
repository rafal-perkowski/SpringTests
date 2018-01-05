package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.reaktor.blog.controller.TestController;
import pl.reaktor.blog.model.Car;
import pl.reaktor.blog.model.CarRepository;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
@ComponentScan
public class SbpJarSpringdata1Application {
	
	private void printList(List<Car> carList){
		
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
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
		
		SbpJarSpringdata1Application tmpApp = new SbpJarSpringdata1Application();
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SbpJarSpringdata1Application.class, args);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("A4", "Audi", 49000.0));
		cars.add(new Car("Auris", "Toyota", 35000.0));
		cars.add(new Car("Insignia", "Opel", 29500.0));
		
		CarRepository carRepo = ctx.getBean(CarRepository.class);
		carRepo.save(cars);
		
		List<Car> carResults;
		carResults = carRepo.findAll();
		tmpApp.printList(carResults);

//		int carInt;
//		carInt = (int)carRepo.count();
//		System.out.println(carInt);
		
//		carRepo.delete((long)1);
//		carResults = carRepo.findAll();
//		tmpApp.printList(carResults);
		
//		boolean flagBoolean;
//		flagBoolean = carRepo.exists((long)3);
//		System.out.println(flagBoolean);
//		flagBoolean = carRepo.exists((long)300);
//		System.out.println(flagBoolean);
		
		ctx.close();
		
		TestController.traceCounter("OUT: SbpJarSpringDataApplication main(" + args + ")");
	}
}




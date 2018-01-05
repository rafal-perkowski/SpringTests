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
public class SbpJarSpringdata3Application {
	
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
		
		SbpJarSpringdata3Application tmpApp = new SbpJarSpringdata3Application();
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SbpJarSpringdata3Application.class, args);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("A4", "Audi", 49000.0));
		cars.add(new Car("Auris", "Toyota", 35000.0));
		cars.add(new Car("Insignia", "Opel", 29500.0));
		
		CarRepository carRepo = ctx.getBean(CarRepository.class);
		carRepo.save(cars);
		
		List<Car> carResults;
		carResults = carRepo.findAll();
		System.out.println("List #1:");
		tmpApp.printList(carResults);
		
		carResults = carRepo.findAllByBrandLike("T%");
		System.out.println("List #2:");
		tmpApp.printList(carResults);
		
		carResults = carRepo.findAllByPriceLessThan(40000);
		System.out.println("List #3:");
		tmpApp.printList(carResults);
		
		carResults = carRepo.findAllByOrderByPriceAsc();
		System.out.println("List #4:");
		tmpApp.printList(carResults);
		
		Car carResult;
		carResult = carRepo.findFirstByBrand("Audi");
		System.out.println("Car #1:");
		System.out.println(carResult);
		
		carResult = carRepo.findFirstByPrice(29500);
		System.out.println("Car #2:");
		System.out.println(carResult);

		
		ctx.close();
		
		TestController.traceCounter("OUT: SbpJarSpringDataApplication main(" + args + ")");
	}
}

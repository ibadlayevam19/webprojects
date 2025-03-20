package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Person person = new Person("John", 25, "123 Street, City");
		System.out.println(person);


		Student student = new Student("Alice", 22, "456 Avenue, City", "STU98765");
		System.out.println(student);

		// Using Factory class
		Person defaultPerson = PersonFactory.createDefaultPerson();
		System.out.println(defaultPerson);

		Student defaultStudent = PersonFactory.createDefaultStudent();
		System.out.println(defaultStudent);

		// Using Generic Class
		ObjectContainer<Person> personContainer = new ObjectContainer<>();
		personContainer.setObject(person);
		System.out.println("Stored Person: " + personContainer.getObject());

		ObjectContainer<Student> studentContainer = new ObjectContainer<>();
		studentContainer.setObject(student);
		System.out.println("Stored Student: " + studentContainer.getObject());
	}
}

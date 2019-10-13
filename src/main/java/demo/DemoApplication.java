package demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import demo.repository.*;
import demo.entity.*;

import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean
	// ApplicationRunner init(PersonRepository repository) {
	// 	String[][] data = {
	// 		{"1", "Forest"},
	// 		{"2", "John"},
	// 		{"3", "Steven"}
	// 	};

	// 	return args -> {
	// 		Stream.of(data).forEach(array -> {
	// 			Person person = new Person(array[0], array[1]);
	// 		});
	// 		repository.findAll().forEach(System.out::println);
	// 	};
	// }

}

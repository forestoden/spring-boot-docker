package demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import demo.repository.*;
import demo.entity.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean
	// ApplicationRunner init(PersonRepository repository) {

	// 	HashMap<Integer, String> data = new HashMap<>();
	// 	data.put(1, "Forest");
	// 	data.put(2, "John");

	// 	return args -> {
	// 		data.forEach((k,v) -> {
	// 			Person person = new Person(k,v);
	// 		});
	// 		repository.findAll().forEach(System.out::println);
	// 	};
	// }

}

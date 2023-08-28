package dev.ishwar.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	Just the example for api configuration
//	@GetMapping("/root")
//	public String apiRoot(){
//		return "Hello World!";
//	}
}

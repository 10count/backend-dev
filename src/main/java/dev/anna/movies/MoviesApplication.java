// YOUTUBE: https://www.youtube.com/watch?v=5PdEmeopJVQ

package dev.anna.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController //test
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	/* test. localhost:8080/root
	@GetMapping("/root")
	public String apiRoot() {
		return "Hello World!";
	}
	 */

}

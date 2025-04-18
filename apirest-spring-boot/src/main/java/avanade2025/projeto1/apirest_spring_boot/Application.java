package avanade2025.projeto1.apirest_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

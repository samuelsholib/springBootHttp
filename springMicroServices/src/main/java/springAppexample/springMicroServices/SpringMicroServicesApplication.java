package springAppexample.springMicroServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springAppexample.springMicroServices.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
@RestController
public class SpringMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServicesApplication.class, args);
	}
	@GetMapping
	public List <Student> greeting() {
		return List.of(
				new Student (10L,
						"mariah",
						"mariah.cantwell@gmail.com",
						LocalDate.of(2001,Month.JANUARY, 23),
						20

				)
				);
	}

}

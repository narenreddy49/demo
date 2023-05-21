package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> hello()
	{
		return List.of
				(
				new Student
						(
								10L,
						"Naren123",
						"naren@mail.com",
						LocalDate.of(95, Month.AUGUST,19),
								27
						)

				);
	}
}

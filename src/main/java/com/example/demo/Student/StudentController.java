package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {
    @GetMapping

    public List<Student> getStudents()
    {
        return List.of
                (
                        new Student
                                (
                                        10L,
                                        "Naren Reddy",
                                        "naren@mail.com",
                                        LocalDate.of(95, Month.AUGUST,19),
                                        27
                                )

                );
    }
}

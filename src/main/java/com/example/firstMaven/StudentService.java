package com.example.firstMaven;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1,
                "Le Anh Tu",
                "letuss004@gmail.com",
                LocalDate.of(2000, 8, 13),
                21
        ));

    }
}

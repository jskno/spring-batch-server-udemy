package com.jskno.springbatchserverudemy.controller

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/students")
class StudentsController {

    //http://localhost:8089/api/v1/students
    @GetMapping
    fun getStudents(): List<StudentResponse> {
        return listOf(
            StudentResponse(1L, "John", "Smith", "john@gmail.com"),
            StudentResponse(2L, "Sachin", "Dave", "sachin@gmail.com"),
            StudentResponse(3L, "Peter", "Mark", "peter@gmail.com"),
            StudentResponse(4L, "Martin", "Smith", "martin@gmail.com"),
            StudentResponse(5L, "Raj", "Patel", "raj@gmail.com"),
            StudentResponse(6L, "Virat", "Yadav", "virat@gmail.com"),
            StudentResponse(7L, "Prabhas", "Shirke", "prabhas@gmail.com"),
            StudentResponse(8L, "Tina", "Kapoor", "tina@gmail.com"),
            StudentResponse(9L, "Mona", "Sharma", "mona@gmail.com"),
            StudentResponse(10L, "Rahul", "Varma", "rahul@gmail.com")
        )
    }

    @PostMapping
    fun createStudent(@RequestBody newStudent: StudentRequest): StudentResponse {
        println("Student created ${newStudent.id}!")
        return StudentResponse(
            newStudent.id,
            newStudent.firstName,
            newStudent.lastName,
            newStudent.email
        )
    }
}
/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import com.example.university.model.Student;

@RestController
public class StudentController {

    @Autowired
    private StudentJpaService StudentJpaService;

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return StudentJpaService.getStudents();
    }

    @PostMapping("/students")
    public Student addSingleStudent(@RequestBody Student student) {
        return StudentJpaService.addSingleStudent(student);
    }



    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return StudentJpaService.updateStudent(studentId, student);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        StudentJpaService.deleteStudent(studentId);
    }
    
    @GetMapping("/students/{studentId}/courses")
    public Student getProfessorstById(@PathVariable("studentId") int professorId) {
        return StudentJpaService.getStudentById(professorId);
    }

}

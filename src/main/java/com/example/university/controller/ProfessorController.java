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

import org.hibernate.service.internal.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import com.example.university.model.Professor;

@RestController
public class ProfessorController {

    @Autowired
    private ProvidedService ProfessorJpaService;

    @GetMapping("/professors")
    public ArrayList<Professor> getStudents() {
        return ((Object) ProfessorJpaService).getProfessors();
    }

    @GetMapping("/professors/{professorId}")
    public Professor getProfessorstById(@PathVariable("professorId") int professorId) {
        return ProfessorJpaService.getStudentById(professorId);
    }

    @PostMapping("/professors")
    public Student addSingleProfessor(@RequestBody Professor professor) {
        return ProfessorJpaService.addSingleStudent(student);
    }

    @PutMapping("/professors/{professorId}")
    public Professor updateProfessor(@PathVariable("professorId") int studentId, @RequestBody Professor professor) {
        return ProfessorJpaService.updateStudent(professorId, professor);
    }

    @DeleteMapping("/professors/{professorId}")
    public void deleteProfessor(@PathVariable int professorId) {
        ProfessorJpaService.deleteProfessor(professorId);
    }

}

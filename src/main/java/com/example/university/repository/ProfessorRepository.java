
/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.university.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.example.university.model.Professor;

@Repository
public interface ProfessorRepository {
    ArrayList<Professor> getProfessors();

    Professor getStudentById(int professorId);

    Professor addSingleProfessor(Professor professor);

    String addMultipleProfessors(ArrayList<Professor> ProfessorsList);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

}
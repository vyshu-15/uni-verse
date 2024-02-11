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

import com.example.university.model.Student;

@Repository
public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addSingleStudent(Student student);

    String addMultipleStudents(ArrayList<Student> studentsList);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

}
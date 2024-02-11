/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.university.model.course;
import com.example.school.model.StudentRowMapper;
import com.example.school.repository.StudentRepository;

import java.util.ArrayList;

@Service
public class StudentH2Service implements StudentRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) db.query("select * from student", new StudentRowMapper());
    }

    @Override
    public Student getCourseById(int courseId) {
        try {
            return db.queryForObject("select * from student where courseId = ?", new StudentRowMapper(), studentId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Student addSingleStudent(Student course) {
        db.update("insert into course(studentName,gender,standard) values (?,?,?)", course.getStudentName(),
                course.getGender(), student.getStandard());
        return db.queryForObject("select * from student where studentName = ? and gender = ? and standard = ?",
                new StudentRowMapper(), course.getStudentName(), course.getGender(), course.getStandard());
    }

    @Override
    public String addMultipleStudents(ArrayList<Student> studentsList) {
        for (Student eachStudent : studentsList) {
            db.update("insert into course(studentName,gender,standard) values (?,?,?)", eachStudent.getStudentName(),
                    eachStudent.getGender(), eachStudent.getStandard());
        }

        String responseMessage = String.format("Successfully added %d courses", studentsList.size());

        return responseMessage;
    }

    @Override
    public Course updateStudent(int studentId, Course coursecourse) {
        if (course.getStudentName() != null) {
            db.update("update course set studentName = ? where courseId = ?", student.getStudentName(), courseId);
        }
        if (course.getGender() != null) {
            db.update("update course set gender = ? where courseId = ?", student.getGender(), courseId);
        }
        if (course.getStandard() != 0) {
            db.update("update course set standard = ? where courseId = ?", student.getStandard(), courseId);
        }
        return getStudentById(studentId);
    }

    @Override
    public void deletecourse(int courseId) {
        db.update("delete from course where courseId = ?", courseId);
    }
}

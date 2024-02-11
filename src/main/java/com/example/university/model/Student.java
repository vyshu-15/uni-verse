/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.university.model;

public class Student {

    private int studentId;
    private String studentName;
    private String email;
    private String courses;

    public Student(int studentId, String studentName, String email, String courses {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String geteEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

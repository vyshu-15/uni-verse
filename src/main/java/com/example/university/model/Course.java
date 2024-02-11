/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.university.model;

public class Course {

    private int courseId;
    private String CourseName;
    private String credits;
    private int professor;
    private int students;

    public Course(int courseId, String CourseName, String credits, int professor ,int students) {
        this.courseId = courseId;
        this.CourseName = CourseName;
        this.credits = credits;
        this.professor = professor;
    }

    public int geCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getcredits() {
        return credits;
    }

    public void setcredits(String credits) {
        this.credits = credits;
    }

    public int getprofessor() {
        return professor;
    }

    public void setprofessor(int professor) {
        this.professor = professor;
    }
        public int getstudents() {
        return students;
    }

    public void setstudentsr(int students) {
        this.students = students;
    }
}

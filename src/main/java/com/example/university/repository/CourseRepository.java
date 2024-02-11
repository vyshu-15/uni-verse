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

import com.example.university.model.Course;

@Repository
public interface CourseRepository {
    ArrayList<Course> getCourses();

    Course getCourseById(int courseId);

    Course addSingleCourse(Course course);

    String addMultipleCourses(ArrayList<Course> coursesList);

    Course updateCourse(int courseId, Course Course);

    void deleteCourse(int courseId);

}
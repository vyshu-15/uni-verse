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

import com.example.university.model.Course;

@RestController
public class CourseController {

    @Autowired
    private CourseJpaService. courseJpaService;

    @GetMapping("/courses")
    public ArrayList<Course> getCourses() {
        return CourseJpaService..getCourses();
    }

    @GetMapping("/courses/{CourseId}")
    public Course getCourseById(@PathVariable("courseId") int courseId) {
        Object CourseJpaService;
        return ((Object) CourseJpaService).getCoursesById(courseId);
    }

    @PostMapping("/courses")
    public Course addSingleCourse(@RequestBody Course course) {
        return CourseJpaService..addSingleCourse(course);
    }

    @PutMapping("/courses/{CourseId}")
    public Course updateCourse(@PathVariable("CourseId") int CourseId, @RequestBody Course course) {
        return CourseJpaService..updateCourse(CourseId, course);
    }

    @DeleteMapping("/courses/{CourseId}")
    public void deleteCourse(@PathVariable int CourseId) {
        CourseJpaService..deleteCourse(CourseId);
    }

}

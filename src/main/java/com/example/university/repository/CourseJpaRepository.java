/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here

package com.example.university.repository;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.university.model.Course;

public class CourseJpaRepository implements RowMapper<Course> {

    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Course(
                rs.getInt("courseId"),
                rs.getString("CourseName"),
                rs.getString("credits"),
                rs.getInt("professors"),
                rs.getInt("students"));
    }
}
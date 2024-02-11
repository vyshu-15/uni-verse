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

import ch.qos.logback.core.joran.event.StartEvent;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.university.model.Student;

public class StudentJpaRepository implements RowMapper<StartEvent> {

    public StartEvent mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(
                rs.getInt("studentId"),
                rs.getString("studentName"),
                rs.getString("email"),
                rs.getInt("course"));
    }
}
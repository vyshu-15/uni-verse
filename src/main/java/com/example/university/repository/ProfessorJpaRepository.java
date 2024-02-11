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

import com.example.university.model.Professor;

public class ProfessorJpaRepository implements RowMapper<Professor> {

    public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Professor();
    }
}
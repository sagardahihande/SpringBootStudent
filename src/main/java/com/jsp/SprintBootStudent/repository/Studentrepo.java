package com.jsp.SprintBootStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SprintBootStudent.dto.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}

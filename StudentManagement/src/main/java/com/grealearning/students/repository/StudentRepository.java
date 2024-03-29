package com.grealearning.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grealearning.students.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

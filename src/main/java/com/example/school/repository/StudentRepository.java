package com.example.school.repository;

import java.util.*;

import com.example.school.model.Student;
import com.example.school.model.StudentRowMapper;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    Student updateStudent(int studentId, Student student);
    public void deleteStudent(int studentId);
}
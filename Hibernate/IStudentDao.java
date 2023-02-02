package com.assignment.dao;

import java.util.List;

import com.assignment.model.Student;

public interface IStudentDao {
	void saveStudent(Student student);

	 void updateStudent(Student student);

	 Student getStudentById(long id);

	 List<Student> getAllStudents();

	 void deleteStudent(long id);
}

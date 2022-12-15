package org.hitech.service;

import java.util.HashMap;
import java.util.Map;

import org.hitech.dao.Student_Course_DAO;
import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_Service {
	
	Student_Course_DAO sc = new Student_Course_DAO();
	
	public void addStudentCourseDetails(Student st, Course cs)
	{
		sc.addStudentCourseDetails(st,cs);
	}
	
	public HashMap<Student, Course> getStudentCourseDetails()
	{
		HashMap<Student, Course> hs = sc.getStudentCourseDetails();
		return hs;
	}
	
	public void deleteStudentCourseDetails(Student sm)
	{
		sc.deleteStudentCourseDetails(sm);
	}
}

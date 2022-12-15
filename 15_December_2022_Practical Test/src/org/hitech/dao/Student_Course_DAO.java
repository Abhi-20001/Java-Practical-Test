package org.hitech.dao;

import java.util.HashMap;
import java.util.Map;

import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_DAO {
	
	public static HashMap<Student, Course> hm = new HashMap<Student, Course>();
	Student st = new Student();
	Course cs = new Course();
	
	public void addStudentCourseDetails(Student st, Course cs)
	{
		hm.put(st, cs);
	}
	
	public HashMap<Student, Course> getStudentCourseDetails()
	{
		return hm;
	}
	
	public void deleteStudentCourseDetails(Student sm)
	{
		if(st.equals(sm))
		{
			hm.remove(st);
		}
	}
}

package org.hitech.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.hitech.model.Course;
import org.hitech.model.Student;
import org.hitech.service.Student_Course_Service;

public class Student_Course_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Course_Service sc = new Student_Course_Service(); 
		Scanner s = new Scanner(System.in);
		
		
		int choice;
		
		do {
			System.out.println("1. Add Values");
			System.out.println("2. View Values");
			System.out.println("3. Delete Values");
			System.out.println("0. Exit");
			
			System.out.println("Enter Your Choice");
			choice = s.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println("Enter ID");
					int id = s.nextInt();
					System.out.println("Enter Name");
					String name = s.next();
					System.out.println("Enter Qualification");
					String qualification = s.next();
					
					System.out.println("Enter Course ID");
					int cId = s.nextInt();
					System.out.println("Enter Course Name");
					String cName = s.next();
					System.out.println("Enter Course Price");
					double cPrice = s.nextDouble();
					
					Student st = new Student(id,name,qualification);
					Course cs = new Course(cId,cName,cPrice);
					sc.addStudentCourseDetails(st, cs);
					break;
					
			case 2:HashMap<Student, Course> hm = sc.getStudentCourseDetails();
					
					for(Map.Entry<Student, Course> entry : hm.entrySet())
						System.out.println(entry.getKey() + " " + entry.getValue());
					
					break;
			case 3:System.out.println("Enter ID");
					int dId = s.nextInt();
					System.out.println("Enter Name");
					String dName = s.next();
					System.out.println("Enter Qualification");
					String dQualification = s.next();
					
					Student sm = new Student(dId,dName,dQualification);
					
					sc.deleteStudentCourseDetails(sm);
					break;
			}
		}while(choice != 0);
	}

}

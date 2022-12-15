package org.hitech.model;

import java.util.Objects;

public class Course {
	
	private int courseID;
	private String courseName;
	private double coursePrice;
	
	public Course()
	{
		
	}
	
	public Course(int courseID, String courseName, double coursePrice) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseID, courseName, coursePrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseID == other.courseID && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(coursePrice) == Double.doubleToLongBits(other.coursePrice);
	}
	
	
}

package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;
public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	public Course(){
	}
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major){
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}
	public void setCourseID(UUID crsID) {
		this.CourseID = crsID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int GrPts) {
		this.GradePoints = GrPts;
	}
	public eMajor geteMajor(){
		return Major;
	}
	public void seteMajor(eMajor Major){
		this.Major = Major;
	}

}

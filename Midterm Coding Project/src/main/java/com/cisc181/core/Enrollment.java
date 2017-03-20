package com.cisc181.core;

import java.util.UUID;
public class Enrollment {

 

	private UUID SectionID;

	private UUID StudentID;

	private UUID EnrollmentID;

	private double Grade;
	private Enrollment(){
	}
	public Enrollment(UUID SectionID, UUID StudentID){

		this.SectionID = SectionID;

		this.StudentID = StudentID;

		this.EnrollmentID = UUID .randomUUID();
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID secID) {

		this.SectionID = secID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID stuID) {
		this.StudentID = stuID;
	}
	public UUID getEnrollmentID() {

		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollID) {

		this.EnrollmentID = enrollID;

	}
	public double getGrade() {

		return Grade;
	}
	public void setGrade(double Grade) {

		this.Grade = Grade;

	}



}
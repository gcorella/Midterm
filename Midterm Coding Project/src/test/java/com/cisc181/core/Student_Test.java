package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

		static ArrayList<Enrollment> science = new ArrayList<Enrollment>();
		static ArrayList<Enrollment> bio = new ArrayList<Enrollment>();
		static ArrayList<Enrollment> phys1 = new ArrayList<Enrollment>();
		static ArrayList<Enrollment> phys2 = new ArrayList<Enrollment>();
		static ArrayList<Enrollment> chem1 = new ArrayList<Enrollment>();
		static ArrayList<Enrollment> chem2 = new ArrayList<Enrollment>();

	//ArrayLists 

	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);

		return cal2.getTime();
	}

	@BeforeClass

	public static void setup() throws PersonException {

		// Courses
		Course bio = new Course(UUID.randomUUID(), "Human Reproduction", 100, eMajor.BUSINESS);
		Course crju = new Course(UUID.randomUUID(), "Atomic Bombs", 100, eMajor.CHEM);
		Course chem = new Course(UUID.randomUUID(), "Gravity", 100, eMajor.PHYSICS);

		courses.add(bio);
		courses.add(crju);
		courses.add(chem);

	// Semester

		Semester fall16 = new Semester(UUID.randomUUID(), newDate(2016, 8, 30), newDate(2016, 12, 9));
		Semester spring17 = new Semester(UUID.randomUUID(), newDate(2017, 2, 10), newDate(2017, 5, 26));

		semesters.add(spring17);
		semesters.add(fall16);
	// Sections 

		Section fallBio = new Section(bio.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 234);

		Section fallCrju = new Section(crju.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 213);

		Section fallChem = new Section(chem.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 423);

		Section springBio = new Section(bio.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 412);

		Section springCrju = new Section(crju.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 241);

		Section springChem = new Section(chem.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 100);

		sections.add(fallBio);
		sections.add(fallCrju);
		sections.add(fallChem);
		sections.add(springBio);
		sections.add(springCrju);
		sections.add(springChem);

	// Student Records

		Student student1 = new Student("Nicole", "Davis", "Dylan", newDate(1995, 6, 9), eMajor.COMPSI, "10 Senix Creek ln",
				"(234)-993-7676", "nharris@yahoo.com", UUID.randomUUID());

		Student student2 = new Student("Leary", "Christopher", "David", newDate(1995, 2, 9), eMajor.COMPSI,
				"36 bellview dr", "(939)-882-9393", "leary@udel.edu", UUID.randomUUID());

		Student student3 = new Student("Desi", "anthony", "Pilla", newDate(1999, 9, 3), eMajor.CHEM,
				"", "(903)-225-8989", "willi@udel.edu", UUID.randomUUID());

		Student student4 = new Student("Rakowski", "Grace", "Kaitlin", newDate(1994, 5, 5), eMajor.PHYSED, "3 Old Neck rd",
				"(631)-949-9553", "krak@udel.edu", UUID.randomUUID());

		Student student5 = new Student("Gucci", "Antonio", "Mane", newDate(1997, 12, 7), eMajor.PHYSICS,
				"113 Black duck Dr", "(302)-949-3939", "san@aol.com", UUID.randomUUID());

		Student student6 = new Student("Brandon", "Kevin", "Impastato", newDate(1999, 3, 12), eMajor.PHYSED,
				"34 Malard ln", "(631)-804-1200", "bimp@udel.edu", UUID.randomUUID());

		Student student7 = new Student("Vollkommer", "Lynn", "Jenna", newDate(1997, 11, 13), eMajor.PHYSICS, "120 Lovett",
				"(631)-680-5299", "jvulk@yahoo.com", UUID.randomUUID());

		Student student8 = new Student("Byrne", "James", "Carlin", newDate(1995, 11, 23), eMajor.BUSINESS, "30 Private Rd Southampton",
				"(631)-302-8484", "Carlinb@aol.com", UUID.randomUUID());

		Student student9 = new Student("Stone", "Kim", "Emma", newDate(1986, 2, 28), eMajor.COMPSI,
				"118 P.Sherman 42 Wallabay Way Sydney", "(503)-206-", "actress@udel.edu", UUID.randomUUID());

		Student student10 = new Student("Ali", "ann", "Davis", newDate(1998, 1, 4), eMajor.CHEM, "60 Meadow lane",
				"(702)-234-8393", "softball@optoline.net", UUID.randomUUID());

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);

	//List

		ArrayList<Integer> gs1 = new ArrayList<Integer>(Arrays.asList(95, 71, 32, 97, 79, 92, 67, 63, 85, 73));
		ArrayList<Integer> gs2 = new ArrayList<Integer>(Arrays.asList(95, 76, 43, 97, 60, 78, 85, 67, 83, 83));
		ArrayList<Integer> gs3 = new ArrayList<Integer>(Arrays.asList(96, 75, 65, 87, 74, 97, 73, 69, 80, 36));

		// Enrolls for courses...

		for (int k = 0; k < students.size(); k++) {

			science.add(new Enrollment(sections.get(0).getSectionID(), students.get(k).getStudentID()));
			science.get(k).setGrade(gs1.get(k));
			
			bio.add(new Enrollment(sections.get(1).getSectionID(), students.get(k).getStudentID()));\
			bio.get(k).setGrade(gs2.get(k));
			
			phys1.add(new Enrollment(sections.get(2).getSectionID(), students.get(k).getStudentID()));
			phys1.get(k).setGrade(gs3.get(k));
			
			phys2.add(new Enrollment(sections.get(3).getSectionID(), students.get(k).getStudentID()));
			phys2.get(k).setGrade(gs1.get(k));
			chem1.add(new Enrollment(sections.get(4).getSectionID(), students.get(k).getStudentID()));
			chem1.get(k).setGrade(gs2.get(k));
			
			chem2.add(new Enrollment(sections.get(5).getSectionID(), students.get(k).getStudentID()));
			chem2.get(k).setGrade(gs3.get(k));

		}
	}

	public double calcStudentGPA(ArrayList<Enrollment> science, ArrayList<Enrollment> bio, ArrayList<Enrollment> phys1,

			ArrayList<Enrollment> phys2, ArrayList<Enrollment> chem1, ArrayList<Enrollment> chem2, int Student) {

		final int COURSENUM = 6;
		double GPAAVG = 0;

		if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 95) {

			GPAAVG = 4.0;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 90) {

			GPAAVG = 3.75;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 85) {

			
			
			GPAAVG = 3.50;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 80) {

			GPAAVG = 3.00;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 75) {

			GPAAVG = 2.50;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 70) {

			GPAAVG = 2.00;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 65) {

			GPAAVG = 1.50;

		} else if ((science.get(Student).getGrade() + bio.get(Student).getGrade() + phys1.get(Student).getGrade()

				+ phys2.get(Student).getGrade() + chem1.get(Student).getGrade() + chem2.get(Student).getGrade())

				/ COURSENUM >= 60) {

			GPAAVG = 1.00;

		} else {

			GPAAVG = 0.00;

		}

		return GPAAVG;

	}
	// Tests for the Student GPA's

	@Test

	public void StudentGPATest() {

		assertEquals(4.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 0), .001);
		assertEquals(2.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 1), .001);
		assertEquals(0.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 2), .001);
		assertEquals(3.75, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 3), .001);
		assertEquals(2.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 4), .001);
		assertEquals(3.5, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 5), .001);
		assertEquals(2.5, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 6), .001);
		assertEquals(1.5, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 7), .001);
		assertEquals(3.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 8), .001);
		assertEquals(1.0, calcStudentGPA(science, bio, phys1, phys2, chem1, chem2, 9), .001);

	}

	public static double CourseGr(ArrayList<Enrollment> courses) {

		double avg = 0;
		double courseAvg = 0;

		for (int y = 0; y < students.size(); y++) {
			avg += courses.get(y).getGrade();
			courseAvg = (avg / students.size());
		}
		return courseAvg;
	}

	@Test

	public void testCourseGr() {
		assertEquals(75.4, CourseGr(science), .01);
		assertEquals(76.7, CourseGr(bio), 01);
		assertEquals(75.2, CourseGr(phys1), .01);
		assertEquals(75.4, CourseGr(phys2), .01);
		assertEquals(76.7, CourseGr(chem1), 01);
		assertEquals(75.2, CourseGr(chem2), .01);

	}
	
// **********************************************************
	public static void ChangeOfMajor(eMajor maj, Student stu) {

		stu.seteMajor(maj);

	}

	@Test

	public void testMajorChangeStudent() {

		ChangeOfMajor(eMajor.CHEM, students.get(5));

		assertEquals(eMajor.CHEM, students.get(5).geteMajor());

	}

// *********************************************************

}
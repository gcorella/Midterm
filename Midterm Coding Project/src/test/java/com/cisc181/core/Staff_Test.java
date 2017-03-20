package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> stafflist = new ArrayList<Staff>();
	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		// Testing 
		 stafflist.add(new Staff("Corella", "Paul", "Corella", newDate(1998, 7, 12), "Holiday Blvd",
				"(631)-506-9127", "gcorella@udel.edu",
				"MWF 10:00 AM", 1, 54000, newDate(2013, 4, 20), eTitle.MR ));
		 stafflist.add(new Staff("Graupmen", "Elizabeth", "Lauren", newDate(1997,12,30), "55 Christiana Dr",
				"(443) 949-5222", "lgraup@udel.edu",
				"T 11:00AM", 2, 38000, newDate(2014, 5, 8), eTitle.MRS));
		 stafflist.add(new Staff ("McCardell", "Christian", "Noah", newDate(1997,7,8), "12 West Dune Rd", 
				"(631)-909-2026", "noahmccardell@udel.edu", "W 9:00 AM", 3, 53500, newDate(2012, 7, 12), eTitle.MR));
		 stafflist.add(new Staff ("Jones", "Claire", "Sasha", newDate (1998, 5, 22), "12 Blackberry Lane", 
				"(302)802-5678", "sajones@udel.edu", "TH 6:00 PM", 4, 62300, newDate(2011, 11, 18), eTitle.MRS));
		 stafflist.add(new Staff ("Corella", "Grace", "Sofia", newDate(1995, 3,15), "202 Chester Rd", 
				"(631)566-8427", "sgcorella@unc.edu", "F 12:00 PM", 5, 49300, newDate(2010,8,12),eTitle.MRS));
		
	}
	
	@Test
	public void testStaffSalary() throws PersonException {
		double sum = 0;
		for (Staff avgStaff : stafflist) {
			sum += avgStaff.getSalary();
		}
		double average = sum / stafflist.size();
		assertEquals(average, 51420, .01);

	}
	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("Collin", "Anne", "Julia", newDate(1989, 2, 9), "Meadow Street", "(302)-636-6436",
				"eddie@hotmail.com", "T 8:15-10:15am", 4, 49300, newDate(2000, 5, 12), eTitle.MR);

	}
	@Test(expected = PersonException.class)

	public void testPhoneNumException() throws PersonException {
		new Staff("Collin", "Anne", "Julia", newDate(1944, 3, 29), "Meadow Street", "302-636-6436",
				"soccerluver@gmail.com", "T 8:15-10:15am", 4, 49300, newDate(2000, 5, 12), eTitle.MR);

	}

	


}

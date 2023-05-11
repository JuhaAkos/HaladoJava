package hu.me.converteragain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;


import model.Calendar;
import model.Job;

public class CalendarConverterTest {
	
	CalendarConverter CalendarConverter = new CalendarConverter();
	
	@Test
	public void testCalendarNull(){
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(null);
		assertEquals(0, jobList.size());
	}
	
	@Test
	public void testCalendarOne(){
		LocalDate date1 = LocalDate.parse("2023-04-25");
		Calendar calendarDayOne = new Calendar(date1, "id1", true, "testData", 1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();
		calendarList.add(calendarDayOne);
		System.out.println(calendarList.get(0));
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(1, jobList.size());
	}
	
	@Test
	public void testCalendarTwo(){
		Calendar calendarDayOne = new Calendar(null, "id1", true, null, 0);
		Calendar calendarDayTwo = new Calendar(null, "id2", true, null, 0);
		List<Calendar> calendarList = new ArrayList<Calendar>();
		calendarList.add(calendarDayOne);
		calendarList.add(calendarDayTwo);
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(2, jobList.size());
	}
	
	@Test
	public void testCalendarTwoJobOne(){		
		Calendar calendarDayOne = new Calendar(null, "id1", true, null, 0);
		Calendar calendarDayTwo = new Calendar(null, "id2", false, null, 0);
		List<Calendar> calendarList = new ArrayList<Calendar>();
		calendarList.add(calendarDayOne);
		calendarList.add(calendarDayTwo);
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(1, jobList.size());
	}
	
	@Test
	public void testCalendarTwoSameJob(){
		Calendar calendarDayOne = new Calendar(null, "id1", true, null, 0);
		Calendar calendarDayTwo = new Calendar(null, "id1", true, null, 0);
		List<Calendar> calendarList = new ArrayList<Calendar>();
		calendarList.add(calendarDayOne);
		calendarList.add(calendarDayTwo);
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(1, jobList.size());
	}
	
	@Test
	public void testCalendarOneCorrect(){
		LocalDate date1 = LocalDate.parse("2023-04-25");
		Calendar calendarDayOne = new Calendar(date1, "id1", true, "testData", 3);
		List<Calendar> calendarList = new ArrayList<Calendar>();
		
		Job jobOne = new Job("id1", "testData", date1, date1);
		calendarList.add(calendarDayOne);
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(jobOne, jobList.get(0));
	}
	
	@Test
	public void testCalendarTwoCorrect(){
		LocalDate date1 = LocalDate.parse("2023-04-24");
		LocalDate date2 = LocalDate.parse("2023-04-25");
		Calendar calendarDayOne = new Calendar(date1, "id1", true, "testData", 3);
		Calendar calendarDayTwo = new Calendar(date2, "id1", true, "testData", 4);
		List<Calendar> calendarList = new ArrayList<Calendar>();
		
		Job jobOne = new Job("id1", "testData", date1, date2);
		calendarList.add(calendarDayOne);
		calendarList.add(calendarDayTwo);
		
		List<Job> jobList = new ArrayList<Job>();
		jobList = CalendarConverter.from(calendarList);
		assertEquals(jobOne, jobList.get(0));
	}
	
}

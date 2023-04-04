package hu.me.java;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import hu.me.java.model.Calendar;
import hu.me.java.model.Job;

public class AppTest 
{
 
	JobConverterImpl jobConverterImpl = new JobConverterImpl();
	
	@Test
	void testConvertNull(){

	    // WHEN
		List<Job> jobList = jobConverterImpl.from(null);

		//THEN
	    assertEquals(0, jobList.size());
	}
		
	@Test
    public void testConversionOneDayOneJob()
    {
    	//GIVEN    	
    	Date atmenDate = new Date (123,0,1);

		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		List<Job> jobList = new ArrayList<Job>();		
		
		
		//WHEN
		jobList = jobConverterImpl.from(calendarList);		

		//THEN
		Job correctResultJob = new Job("id1","nev1",atmenDate,atmenDate);
		assertEquals(correctResultJob,jobList.get(0));     
    }
	
    @Test
    public void testConversionTwoDayOneJob()
    {
    	//GIVEN    	
    	Date atmenDate = new Date (123,0,1);
		Date atmenDate2 = new Date (123,1,2);

		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		Calendar C2 = new Calendar(atmenDate2,"id1",true, "nev2",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		calendarList.add(C2);
		List<Job> jobList = new ArrayList<Job>();		
		
		
		//WHEN
		jobList = jobConverterImpl.from(calendarList);		

		//THEN
		Job correctResultJob = new Job("id1","nev1",atmenDate,atmenDate2);
		assertEquals(correctResultJob,jobList.get(0));     
    }
    
    @Test
    public void testConversionTwoDayTwoJob()
    {
    	//GIVEN    	
    	Date atmenDate = new Date (123,0,1);
		Date atmenDate2 = new Date (123,1,2);

		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		Calendar C2 = new Calendar(atmenDate2,"id2",true, "nev2",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		calendarList.add(C2);
		List<Job> jobList = new ArrayList<Job>();		
		
		
		//WHEN
		jobList = jobConverterImpl.from(calendarList);		

		//THEN
		assertEquals(2,jobList.size());     
    }
    
    @Test
    public void testConvertThreeDayOneJob()
    {
    	//GIVEN
    	Date atmenDate = new Date (123,0,1);
		Date atmenDate2 = new Date (123,1,2);
		Date atmenDate3 = new Date (1,1,1);

		//one day out of the four is unoccupied so it must be ignored
		//and two days share the id so they must not be counted as separate jobs
		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		Calendar C1 = new Calendar(atmenDate2,"id1",true, "nev2",1);
		Calendar C2 = new Calendar(atmenDate3,"id1",true, "nev3",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		calendarList.add(C1);
		calendarList.add(C2);

		List<Job> jobList = new ArrayList<Job>();
		//WHEN
		jobList = jobConverterImpl.from(calendarList);	
		
		//THEN
		assertEquals(1,jobList.size()); 
    }
    
    
    @Test
    public void testConvertNonJobDayIgnore()
    {
    	//GIVEN
    	Date atmenDate = new Date (123,0,1);
		Date atmenDate2 = new Date (123,1,2);
		
		Date wrongDate = new Date (1,1,1);

		//one day isn't occupied and thus must be ignored
		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		Calendar C2 = new Calendar(atmenDate2,"id1",true, "nev2",1);
		Calendar C3 = new Calendar(wrongDate,"id1",false, "rosszvalasz",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		calendarList.add(C2);
		calendarList.add(C3);
		List<Job> jobList = new ArrayList<Job>();		
		
		//WHEN
		jobList = jobConverterImpl.from(calendarList);		

		//THEN
		//result must be the second calendar's date not the third one
		Job correctResultJob = new Job("id1","nev1",atmenDate,atmenDate2);
		assertEquals(correctResultJob,jobList.get(0)); 
    }
    
   
    @Test
    public void testConvertIgnoreUnoccupied()
    {
    	//GIVEN
    	Date atmenDate = new Date (123,0,1);
		Date atmenDate2 = new Date (123,1,2);

		//one day out of the four is unoccupied so it must be ignored
		//and two days share the id so they must not be counted as separate jobs
		Calendar C = new Calendar(atmenDate,"id1",true, "nev1",1);
		Calendar C2 = new Calendar(atmenDate2,"id2",false, "nev3",1);
		
		List<Calendar> calendarList = new ArrayList<Calendar>();		
		calendarList.add(C);
		calendarList.add(C2);
		
		List<Job> jobList = new ArrayList<Job>();		
		//WHEN
		jobList = jobConverterImpl.from(calendarList);	
		
		//THEN
		assertEquals(1,jobList.size()); 
    }  
    
}

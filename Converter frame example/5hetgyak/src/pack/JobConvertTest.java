package pack;

public class JobConvertTest {
	
	void conversionTest_null(){
		//WHEN
		List<JobItem> jobItemList = jobConverter.from(null);
		
		//THEN
		assertEquals(0, jobItemList.size());
	}
	
	void conversionTest_empty(){
		//WHEN
		List<JobItem> jobItemList = jobConverter.from(new Arraylist<>());
		
		//THEN
		assertEquals(0, jobItemList.size());
	}	
	
	void conversionTest_OneDayJob(){
		//csak egy napos
	}
	
	void conversionTest_TwoDaysJob(){
		//GIVEN
		
		//variables
		//lists
		calendarItemList.add(
		new CalenderItemBuilder()
			.setComment(JobName)
				.setDatum(start)
					.setJobId(jobId)
						//rest...
							.build());	
		
		//WHEN
		
		//converter call
		
		//THEN
		
		//assertequals
	}
	
	void conversasionTest_MiscDayJobs() {
		
	}
}

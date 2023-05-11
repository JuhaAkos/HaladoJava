package hu.me.converteragain;

import java.util.ArrayList;
import java.util.List;

import model.Calendar;
import model.Job;

public class CalendarConverter {
	
	public List<Job> from(List<Calendar> calendarList) {
		Job job = new Job(null, null, null, null);
		List<Job> JobList = new ArrayList<Job>();
		String atmenId = "";
		
		if (calendarList!=null) {
			
			for (int a=0; a<calendarList.size(); a++) {
				
				if (calendarList.get(a).isOccupied()) {
					
					if (!calendarList.get(a).getJobId().equals(atmenId)) {
						if (job.getId() != null){
							JobList.add(new Job(
									job.getId(),
									job.getName(),
									job.getStart(),
									job.getEnd()
									));
						}
						
						job.setId(calendarList.get(a).getJobId());
						job.setName(calendarList.get(a).getComment());
						job.setStart(calendarList.get(a).getDate());
						job.setEnd(calendarList.get(a).getDate());
						
						atmenId = calendarList.get(a).getJobId();
					}
					
					else {
						job.setEnd(calendarList.get(a).getDate());
					}
					
				}	
			}
			
			JobList.add(new Job(
					job.getId(),
					job.getName(),
					job.getStart(),
					job.getEnd()
					));
		}
		
		return JobList;		
	}
	
}

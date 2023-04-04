package hu.me.java;

import java.util.ArrayList;
import java.util.List;

import hu.me.java.model.Calendar;
import hu.me.java.model.Job;



public class JobConverterImpl implements JobConverter{
		
	@Override
	public List<Job> from(List<Calendar> cList) {
		
		Job job = new Job(null,null,null,null);
		List<Job> jList = new ArrayList<Job>();
		String atmenId = "";
		
		if (cList != null) {
			for (int i=0; i < cList.size();i++) {
				
				if (cList.get(i).isOccupied()) {
					if (!atmenId.equals(cList.get(i).getJobId())) {	
						
						//add existing job to list
						//jacoco coverage doesn't like it, but it cannot be tested
						if (job.getId() != null){
							jList.add(new Job(
									job.getId(),
									job.getName(),
									job.getStart(),
									job.getEnd()));
						}				
						
						job.setId(cList.get(i).getJobId());
						job.setName(cList.get(i).getComment());
						job.setStart(cList.get(i).getDate());
						job.setEnd(cList.get(i).getDate());
						
						atmenId=cList.get(i).getJobId();
					}
					else {
						job.setEnd(cList.get(i).getDate());
					}				
				}
			}	
			
			jList.add(new Job(
					job.getId(),
					job.getName(),
					job.getStart(),
					job.getEnd()));
			
			
		}	
		return jList;
	}
}

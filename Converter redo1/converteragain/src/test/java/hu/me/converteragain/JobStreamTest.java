package hu.me.converteragain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

//import org.junit.jupiter.api.Test;


import model.Job;

public class JobStreamTest {	

	/*
	@Test
	public void streamTest(){		
		
		List<Job> jobList = new ArrayList<>();
		
		List<String> jobIdList = new ArrayList<>();
		
		for (Job job: jobList) {
			if (job.getId() != null && job.getId().length() > 0) {
				jobIdList.add(job.getId());
			}		
		}
		
		Predicate<Job> isValidJob = job -> job.getId() != null && job.getId().length() > 0;
		
		List<String> jobIdList2 = jobList
				.stream()
				.filter(isValidJob)
				.map(item -> item.getId())
				.collect(Collectors.toList());			
		
		
		Stream<Integer> stream = Stream.empty();
		Stream<Integer> stream2 = Stream.of(2,3,5);
		Stream<Integer> stream3 = Stream.builder().add(56).build();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		stream = list.stream();
		
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(4);
		
		stream = set.stream();				
			
		Stream resultStream = stream.map(item -> item.toString()) Stream<String>
			.map(strItem -> strItem.length()) Stream<integer>
				.filter( runItem -> runItem < 23)
					.skip(3);			
			
		List<Integer> collect = stream.collect(Collectors.toList())
		Long size = stream.count();
		stream.toArray();
		
		resultStream.forEach(item -> System.out.println(item);
	}	
	
	
	@Test
	public void streamTest2(){		
		
		List<Job> jobList = new ArrayList<>();
		
		List<String> jobIdList = new ArrayList<>();
		
		for (Job job: jobList) {
			if (job.getId() != null && job.getId().length() > 0) {
				jobIdList.add(job.getId());
			}		
		}
		
		Predicate<Job> isValidJob = job -> job.getId() != null && job.getId().length() > 0;
		//Predicate<Job> isValidJob = job -> job != null;
		
		Optional<String> jobIdList2 = jobList
				.stream()
				.filter(isValidJob)
				.map(item -> item.getId())
				.findFirst());			
		
		first.isPresent();
		
		Stream<Integer> stream = Stream.empty();
		Stream<Integer> stream2 = Stream.of(2,3,5);
		Stream<Integer> stream3 = Stream.builder().add(56).build();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		stream = list.stream();
		
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(4);
		
		stream = set.stream();				
			
		Stream resultStream = stream.map(item -> item.toString()) Stream<String>
			.map(strItem -> strItem.length()) Stream<integer>
				.filter( runItem -> runItem < 23)
					.skip(3);			
			
		List<Integer> collect = stream.collect(Collectors.toList())
		Long size = stream.count();
		stream.toArray();
		
		resultStream.forEach(item -> System.out.println(item);
	}	

	*/
}

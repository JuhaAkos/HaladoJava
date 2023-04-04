package hu.me.java.model;

import java.util.Date;
import java.util.Objects;

public class Job {
	String id;
	String name;
	Date start;
	Date end;
	
	public Job(String id, String name, Date start, Date end) {
		super();
		this.id = id;
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public int hashCode() {
		return Objects.hash(end, id, name, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(end, other.end) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(start, other.start);
	}	
	
	
	
	

}

package hu.me.java.model;

import java.util.Date;
import java.util.Objects;

public class Calendar {
	Date date;
	String jobId;
boolean occupied;
	String comment;
	int dayOfWeek;
	
	public Calendar(Date date, String jobId, boolean occupied, String comment, int dayOfWeek) {
		super();
		this.date = date;
		this.jobId = jobId;
		this.occupied = occupied;
		this.comment = comment;
		this.dayOfWeek = dayOfWeek;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, date, dayOfWeek, jobId, occupied);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(date, other.date)
				&& dayOfWeek == other.dayOfWeek && Objects.equals(jobId, other.jobId) && occupied == other.occupied;
	}	
	
	
	
	

}

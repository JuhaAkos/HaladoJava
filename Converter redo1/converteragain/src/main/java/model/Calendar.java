package model;

import java.time.LocalDate;

public class Calendar {	
	LocalDate date;
	String jobId;
	boolean occupied;
	String comment;
	int dayOfWeek;	


	public Calendar(LocalDate date, String jobId, boolean occupied, String comment, int dayOfWeek) {
		super();
		this.date = date;
		this.jobId = jobId;
		this.occupied = occupied;
		this.comment = comment;
		this.dayOfWeek = dayOfWeek;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + dayOfWeek;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + (occupied ? 1231 : 1237);
		return result;
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
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (occupied != other.occupied)
			return false;
		return true;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
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
}

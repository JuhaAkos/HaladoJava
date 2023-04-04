package hu.me.java;

import java.util.List;

import hu.me.java.model.Calendar;
import hu.me.java.model.Job;

public interface JobConverter {

    List<Job> from(List<Calendar> ci);

}
package hu.me.java.output;

import hu.me.java.model.Job;

import java.util.List;

public interface Printer {
    void print(List<Job> jobList);
}

package hu.me.java.input;

import hu.me.java.model.Calendar;

import java.util.List;

public interface CsvReader {
    List<Calendar> load(String fileName);
}

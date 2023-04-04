package hu.me.java;


import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import hu.me.java.input.CsvReader;
import hu.me.java.model.Calendar;
import hu.me.java.model.Job;
import hu.me.java.output.Printer;

public class CalendarEngineImplTest {

    @Test
    void process(){

        String fileName = "filename_2";

        CsvReader csvReader = mock(CsvReader.class);
        List<Calendar> calendarList = new ArrayList<>();
        when(csvReader.load(eq(fileName))).thenReturn(calendarList);

        JobConverter jobConverter = mock(JobConverter.class);
        List<Job> jobList = new ArrayList<>();
        when(jobConverter.from(same(calendarList))).thenReturn(jobList);

        Printer printer = mock(Printer.class);

        CalendarEngineImpl subject = new CalendarEngineImpl(
                csvReader, printer, jobConverter
        );

        // WHEN
        subject.process(fileName);

        // THEN

        verify(csvReader, times(1)).load(anyString());
        //hiba mert object osztályt vár
        //verify(jobConverter, times(1)).(any());
        //verify(printer, times(1)).print(any());
        verify(jobConverter, times(1)).from((List<Calendar>) any());
        verify(printer, times(1)).print((List<Job>) any());


    }

}
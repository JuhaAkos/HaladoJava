package hu.me.java;

import hu.me.java.input.CsvReader;
import hu.me.java.output.Printer;

public class CalendarEngineImpl implements CalendarEngine {

	private final CsvReader csvReader;
	private final Printer printer;
	private final JobConverter jobConverter;
	
	public CalendarEngineImpl(CsvReader csvReader, Printer printer, JobConverter jobConverter) {
	  this.csvReader = csvReader;
	  this.printer = printer;
	  this.jobConverter = jobConverter;
	}
	
	@Override
	public void process(String fileName) {
	  printer.print(
	    jobConverter.from(
	      csvReader.load(fileName)
	    )
	  );
	}
}

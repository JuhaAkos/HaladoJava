package pack;
import input.CsvReader;
import output.Printer;

public class CalendarEngineImpl implements CalendarEngine {

	private final CsvReader csvReader;
	
	public CalendarEngineImpl(CsvReader csvReader, Printer printer){
		this.csvReader = csvReader;
		this.printer = printer;
	}
	
	@Override
	public void process(String fileName) {		
		List<Calendar> load = csvReader.load(fileName);
		jobConverter.
	}
	
}

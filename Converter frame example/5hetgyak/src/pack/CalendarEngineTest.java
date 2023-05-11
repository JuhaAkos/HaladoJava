package pack;

import input.CsvReader;

public class CalendarEngineTest {
	
	@Test
	void process() {
		String fileName = "fileeeeeeeeeeeeeeeeeeeeee";
		
		//GIVEN
		//1 l�p�s mock - mock oszt�ly/obj
		CsvReader csvReader = mock(CsvReader.class);
		//2. l�p�s when? - betan�t�s
		//when(csvReader.load().thenReturn(null));
		//when(csvReader.load(any()).thenReturn(null));
		
		List<Calendar> calendarList = new ArrayList<>();
		when(csvReader.load(anyString()).thenReturn(calendarList));		
		
		//mert nincs visszat�r�si �rt�ke
		Printer printer = mock(Printer.class);
		
		JobConverter jobConverter = mock(jobConverter.class);
		List<Job> jobList = new ArrayList<>();
		when(csvReader.load(eq(filename)).thenReturn(JobList));		
		
		
		CalendarEngineImpl subject = new CalendarEngineImpl(
				csvReader, printer, jobConverter
		);		
		
		//WHEN
		subject.process(fileName);
		
		//THEN
		//3. l�p�s verify - ellen�rz�s
		verify(csvReader, times(1)).load(anySring());
		verify(jobConverter, times(1)).from(same(calendarList)));		
		verify(printer, times(1)).from(same(jobList)));	
		
	}
}

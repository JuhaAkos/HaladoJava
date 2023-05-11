package pack;

import input.CsvReader;

public class CalendarEngineTest {
	
	@Test
	void process() {
		String fileName = "fileeeeeeeeeeeeeeeeeeeeee";
		
		//GIVEN
		//1 lépés mock - mock osztály/obj
		CsvReader csvReader = mock(CsvReader.class);
		//2. lépés when? - betanítás
		//when(csvReader.load().thenReturn(null));
		//when(csvReader.load(any()).thenReturn(null));
		
		List<Calendar> calendarList = new ArrayList<>();
		when(csvReader.load(anyString()).thenReturn(calendarList));		
		
		//mert nincs visszatérési értéke
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
		//3. lépés verify - ellenõrzés
		verify(csvReader, times(1)).load(anySring());
		verify(jobConverter, times(1)).from(same(calendarList)));		
		verify(printer, times(1)).from(same(jobList)));	
		
	}
}

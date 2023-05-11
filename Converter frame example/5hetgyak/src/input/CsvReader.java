package input;

import java.util.List;

public interface CsvReader {
	List<Calendar> load(String fileName);
}

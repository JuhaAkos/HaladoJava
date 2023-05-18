package unim.carFactory2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

public class StorageImplTest {
	@Test
	void getMethodTest() {		
	}
	
	@Test
	void getMethodTestStorageEmpty() {		
		String colour = "blue";
		String type = "SUV";
		
		String queryString = "colour " + colour + ", type " +type;
		
		StorageConsumer storage = mock(StorageConsumer.class);		
		
		assertThrows(
				StorageEmptyException.class, 
				() -> storage.get(queryString));		
	}
	
	@Test
	void putTestStorageFull() {
		
	}
	
	@Test
	void findTest() {
		
	}
}

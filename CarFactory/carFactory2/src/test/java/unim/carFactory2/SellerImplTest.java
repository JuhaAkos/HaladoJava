package unim.carFactory2;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SellerImplTest {
	@Test
	 void requestNotFound() {
		//GIVEN		
		String colour = "blue";
		String type = "SUV";
		
		StorageConsumer storage = mock(StorageConsumer.class);
		
		
		when(storage.find(colour, type)).thenReturn(null);
		Seller seller = new SellerImpl(storage);		
		//WHEN
		Car foundCar = seller.request(colour,  type);
		
		//THEN
		assertNull(foundCar);
	 }
	
	 @Test
	 void requestFound() {
		 	//GIVEN		
			String colour = "blue";
			String type = "SUV";
			String foundCarId = "124";
			
			StorageConsumer storage = mock(StorageConsumer.class);
			
			
			when(storage.find(colour, type)).thenReturn(foundCarId);
			Car car = new Car("asdasd", "typeasdasd", "colourasdasd", "brandasd");
			when(storage.get(foundCarId)).thenReturn(car);
			Seller seller = new SellerImpl(storage);	
			
			//WHEN
			Car foundCar = seller.request(colour,  type);
			
			//THEN
			assertSame(car, foundCar);
			verify(storage, times(1)).find(colour, type);
			verify(storage, times(1)).get(foundCarId);
	 }
}

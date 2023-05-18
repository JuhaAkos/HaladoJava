package unim.carFactory2;

public class SellerImpl implements Seller {
	private final StorageConsumer storage;
	
	public SellerImpl(StorageConsumer storage){
		this.storage = storage;
	}

	public Car request(String colour, String type) {
		String queryString = "colour " + colour + ", type " +type;
		String foundCarId = storage.find(queryString);
		
		Car foundCar = null;
		if (foundCarId != null) {
			foundCar = storage.get(foundCarId);
		}
		
		return foundCar;
	}
	
}

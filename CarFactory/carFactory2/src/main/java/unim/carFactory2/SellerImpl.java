package unim.carFactory2;

public class SellerImpl implements Seller {
	private final StorageConsumer storage;
	
	public SellerImpl(StorageConsumer storage){
		this.storage = storage;
	}

	public Car request(String colour, String type) {
		String foundCarId = storage.find(colour, type);
		
		Car foundCar = null;
		if (foundCarId != null) {
			foundCar = storage.get(foundCarId);
		}
		
		return foundCar;
	}
	
}

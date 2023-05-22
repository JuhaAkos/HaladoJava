package unim.carFactory2;

public class FactoryImpl implements Factory {
	
	private static String brand = "Ford";
	private static int maxID = 0;

    private final StorageProducer storage;

    public FactoryImpl(StorageProducer storage) {
        this.storage = storage;
    }

    @Override
    public void assemble(String type, String color) throws StorageFullException {
    	getNewID();
        Car assembledCar = new Car(String.valueOf(maxID), brand, type, color);

        if (Storage.carList.size() < 300) {
            storage.put(assembledCar);
        } else {
             throw new StorageFullException("Cannot add to torage, it is full");
        }
    }
    
    public void getNewID() {
    	maxID = maxID +1;
    }

}
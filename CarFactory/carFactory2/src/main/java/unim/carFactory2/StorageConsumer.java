package unim.carFactory2;

public interface StorageConsumer {
	Car get(String id);
	//Car find(String query);
	//return car id:
	String find(String colour, String type);
}

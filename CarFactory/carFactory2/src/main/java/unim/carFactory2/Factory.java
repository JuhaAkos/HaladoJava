package unim.carFactory2;

public interface Factory {
	void assemble(String colour, String type) throws StorageFullException;
}

package unim.carFactory2;

public class Car {
	private String id;
	private String type;
	private String colour;
	private String brand;
	
	public Car(String id, String type, String colour, String brand) {
		this.id = id;
		this.type = type;
		this.colour = colour;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", type=" + type + ", colour=" + colour + ", brand=" + brand + "]";
	}
	
}

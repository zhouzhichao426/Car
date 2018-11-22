package car;

public class Car {
	private String brand;
	private String type;
	private String carID;
	public Car() {
		super();
		
	}
	public Car(String brand, String type, String carID) {
		super();
		this.brand = brand;
		this.type = type;
		this.carID = carID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	
}

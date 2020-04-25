public class Car extends Generics {
	public static final String type = "Car";

	public enum KeyType {
		combo, make, model, year, color
	};

	public static KeyType key = KeyType.combo;
	private String make;
	private String model;
	private int year;
	private String color;

	/*
	 * constructor
	 */
	public Car(String make, String model, int year, String color) {
		this.setType(type);
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	/*
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() {
		String output = "";
		switch (key) {
		case make:
			output += this.make;
			break;
		case model:
			output += this.model;
			break;
		case year:
			output += this.year;
			output = output.substring(output.length() - 3);
			break;
		case color:
			output += this.color;
			break;
		case combo:
		default:
			output += type + ": " + this.color + ", " + this.make + ", " + this.model + ", " 
					+ this.year;
		}
		return output;

	}

	public static Generics[] carData() {
		Generics[] ad = { new Car("Audi", "S5 Coupe", 2020, "White"), new Car("Ford", "Fusion", 2017, "Silver"), 
				new Car("Land Rover", "Range Rover", 2019, "Black"), new Car("Jeep", "Wrangler", 2019, "Red"), 
				new Car("Tesla", "Model X", 2016, "Navy"), new Car("BMW", "M850 Gran Coupe", 2020, "Black") };
		return ad;
	}

	/*
	 * main to test Animal class
	 * 
	 */
	public static void main(String[] args) {
		Generics[] ad = carData();
		for (Generics a : ad)
			System.out.println(a);
	}
}

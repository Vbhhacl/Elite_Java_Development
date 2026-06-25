package Elite_b;

public class Car {
	private String model;
	private String[] features;
	
	//public Car(String model, String[] features) {
	public Car(String model, String...features) {	 //CAN ONLY BE LAST ARG IN METHOD
		this.model = model ;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println(f);
	}
	
	public static void main(String[] args) {
	    //String[] features = {"Airbags", "ABS", "Sunroof", "Touchscreen"};
        //Car car = new Car("Honda City", features);
		Car car = new Car("MG astor", "keyless","ABS","ADAS");
        car.specs();
	}
}


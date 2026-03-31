package ooptema;

public class Car extends Vehicle{
	public Car(String name, String color) {
		super(name, color, "the car is starting");
	}
	
	public void honk() {
		System.out.println("car honk sound!"); 
	}

	
	@Override
	public void stop() {
		super.stop();
		System.out.println("The car is stopped");
	}

}

package ooptema;

public class Bike extends Vehicle {
	public Bike(String name, String color) {
		super(name, color, "the bike is starting");
	}
	
	public void honk() {
		System.out.println("bike honk sound!"); 
	}
	

	
	@Override
	public void stop() {
		super.stop();
		System.out.println("The bike is stopped");
	}


}

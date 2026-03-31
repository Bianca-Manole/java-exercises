package ooptema;

public class Vehicle {
	private String name;
	private String color;
	protected String sunetStart;
	
	public Vehicle(String name, String color, String sunetStart) {
		this.name = name;
		this.color = color;
		this.sunetStart = sunetStart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void start() {
		System.out.println(this.sunetStart);
	}
	public void stop() {
		System.out.println("Stop");
	}
}

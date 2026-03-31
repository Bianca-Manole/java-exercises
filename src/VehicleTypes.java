package ooptema;

public class VehicleTypes {

	public static void main(String[] args) {
		Car car = new Car("Toyota", "rosu");
		Bike bike = new Bike("Pegasus", "albastru");
		System.out.println(car.getName() + " " + car.getColor());
		car.start();
		car.stop();
		System.out.println(bike.getName() + " " + bike.getColor());
		bike.start();
		bike.stop();
		car.honk();
		bike.honk();
	}

}

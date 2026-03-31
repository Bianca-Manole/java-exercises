package oop;

public class Forms {

	
	//access modifiers
	// public - este vizibil peste tot
	//private - este vizibila doar in interiorul clase in care am definit-o
	//protected - este vizibila doar in interiorul pachetului si in subclasele altui pachet
	public static void main(String[] args) {
		// define an object of class square
		Square square = new Square();
		square.setSide(4);
		System.out.println(square.getPerimeter());
		System.out.println(square.getAria());
		
		Square patrat = new Square();
		patrat.setSide(10);
		System.out.println(patrat.getPerimeter());
		
		Rectangle rectangle = new Rectangle(3, 2);
		System.out.println(rectangle.getPerimeter());
		rectangle.setLength(4);
		rectangle.setWidth(3);
		System.out.println(rectangle.getLength());
	}

}

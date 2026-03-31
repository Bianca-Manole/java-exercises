package oop;

public class Rectangle {
	
	int length;
	int width;
	
	//constructor are acelasi nume ca si clasa si se foloseste pentru a initializa proprietatile obiectului
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getPerimeter() {
		return 2*(length + width);
	}
	
	protected int getArea() {
		return length * width;
	}

	//set - seteaza valoarea proprietatilor
	//get arata valoarea curenta a proprietatilor
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

	
	

}

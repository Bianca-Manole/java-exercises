package oop;

public class Square {
	//property
	int side; // latura patratului
	
	// behavior
	public int getPerimeter() {
		return 4 * side;
	}
	
	public int getAria() {
		return side*side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}

}

package oop;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void bark() {
		System.out.println("Cainele latra");
	}
	
	@Override //total
	public void eat() {
		System.out.println("Cainele mananca mult");
	}
	
	@Override //partial- am adaugat la comportamentul parinte 
	public void walk() {
		
		System.out.println("Tata ziua");
		super.walk();
	}
	

}

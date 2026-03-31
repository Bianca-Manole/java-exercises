package oop;

public class Animal {
	private String name;
	private int age;
	
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sleep () { 
		System.out.println("sleeep: zzz");
	}
	
	public void eat() {
		System.out.println("i'm eating. Yammy!");
	}
	
	public void walk() {
		System.out.println("walking...1-2-3!");
	}

}

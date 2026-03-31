package oop;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age); //face referire la metodele sau variabilele din clasa parinte
	}
	
	public void toarce() {
		System.out.println("Torc!");
	}
	
	public void toarce(int time) { // OVERLOADING: putem avea mai multe metode cu acelasi nume doar ca numarul sau tipul  parametrilor trebuie sa fie diferit
		System.out.println("Torc!" +time+" minute pe zi");
	}
	
	public void toarce(String noize) {
		System.out.println("Torc!" + noize);
	}
	
	//OVERRIDE: TOTAL AL METODEI SLEEP - Inseamna ca se suprascrie comportamentul metodei din clasa parinte
	@Override
	public void sleep() {
		System.out.println("Dorm 3 ore");
	}
	
	//OVERRRIDE cand preiau de la parinte tot comportamentul dar adaug ceva in plus al meu(specific clasa copil
	@Override
	public void walk() {
		super.walk(); // preia automat tot codul care se afla la metoda din clasa parinte si o va pune in metoda din clasa copil
		System.out.println("Tiptil tiptil");
	}
	

}

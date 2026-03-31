package oop;

public class AnimalActivity {
	public static void main(String[] args) {
		
		Cat cat  = new Cat("Tom", 2);
		cat.eat();
		cat.sleep();
		cat.walk();
		cat.toarce();
		cat.toarce(2);
		cat.toarce("purr");
		Dog dog = new Dog("Hana", 3);
		dog.bark();
		dog.eat();
		dog.walk();
		
	}

}

//definiti o noua clasa pt un animal
//creati un behavior nou pt animal
//suprascrieti total un behavior din clasa Animal
//suprasrieti partial un behavior de la clasa animal

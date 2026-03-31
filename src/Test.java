package intro;

import methods.Methods;
import oop.Cat;

public class Test {
	public static void main(String[] arg) {
		Cat cat = new Cat("motanel", 1);
		
		cat.eat();
		System.out.println(Methods.isLetter('v'));
		System.out.println(Methods.word);
		
		System.out.println(Constants.HOME_PAGE_URL);
		
	}

}

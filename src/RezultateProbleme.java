package recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RezultateProbleme {

	public static void main(String[] args) {
		int[] elements = {2, 3, 4};
		
		int[] rezultat = RezolvareProbleme.calculateDoubleOfElements(elements);
		
		for(int element : rezultat) {
			System.out.println(element);
		}
		
		int[] numbers = {1, 2, 3};
		System.out.println(RezolvareProbleme.calculateSumOfEvenNumbers(numbers));
		
		List<String> words = new ArrayList<String>();
		words.add("soare");
		words.add("zapada");
		words.add("armonie");
		
		System.out.println(RezolvareProbleme.wordWithMostVowels(words));
		
		List<String> cuvinte = new ArrayList<String>();
		cuvinte.add("anapoda");
		cuvinte.add("aleluia");
		cuvinte.add("caine");
		
		System.out.println(RezolvareProbleme.wordsStartingAndEndingWithSameChar(cuvinte));
		
		System.out.println(RezolvareProbleme.howManyUpperCaseLetters("AnApOdA"));
		
		List<String> listOne = new ArrayList<String>();
		
		listOne.add("ana");
		listOne.add("bianca");
		listOne.add("ciprian");
		
		
		List<String> listTwo = new ArrayList<String>();
		
		listTwo.add("adriana");
		listTwo.add("bianca");
		listTwo.add("ciprian");
		listTwo.add("bogdan");
		
		System.out.println(RezolvareProbleme.wordExistingInOneListButNotTheOther(listOne, listTwo));
		
		System.out.println(RezolvareProbleme.reverseWord("maria"));
		System.out.println(RezolvareProbleme.isPalindrom("ana"));
		
		HashMap<String, Integer> produse = new HashMap<String, Integer>();
		
		produse.put("apa", 2);
		produse.put("ulei", 3);
		produse.put("prajitura", 10);
		produse.put("paine", 1);
		
		RezolvareProbleme.maxQuantity(produse);
		RezolvareProbleme.longestKey(produse);
		RezolvareProbleme.totalNumberOfProducts(produse);
		
		produse.remove("paine"); // am scos paine
		System.out.println(produse);
		
		produse.put("suc", 5);
		System.out.println(produse); // am adaugat in locul painii
		
		
		Student student = new Student("Bianca", 32, 10);
		Teacher teacher = new Teacher("Ciprian", 29, "Programare");
		
		student.introduce();
		teacher.introduce();
		
		Customer customer = new Customer("Bianca", "bianca@email");
		Order order = new Order("paine", 2, customer);
		
		System.out.println("Order for " + order.getProductName() + " cu cantitatea de: " + order.getQuantity() + " placed by " + order.customer.name);
	}
	
	

}

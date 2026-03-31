package recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RezolvareProbleme {

	public static int[] calculateDoubleOfElements(int[] elements) {
		int[] doubleOfElements = new int[elements.length];

		int index = 0; // am creat eu index-ul array-ului deoarece foreach foloseste valoarea
		for (int element : elements) {
			doubleOfElements[index] = element * 2;
			index++; // cresc indexul pentru fiecare iteratie
		}
		return doubleOfElements;
	}

	public static int calculateSumOfEvenNumbers(int[] numbers) {

		int sum = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				sum += number;
			}
		}
		return sum;
	}

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static String wordWithMostVowels(List<String> words) {

		String newWord = "";
		int maxVowels = 0;
		for (String word : words) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (isVowel(word.charAt(i))) {
					count++;
				}
			}
			if (count > maxVowels) { // daca count de vocale dintr-un cuvant este mai mare decat nr maxim de
				maxVowels = count; // vocale gasite -> atunci count se opreste la nr maxim si devine maxVowels
				newWord = word;// dupa care cuvantul respectiv gasit cu cele mai multe vocale, devine newWord
			}
		}
		return newWord;
	}

	public static List<String> wordsStartingAndEndingWithSameChar(List<String> cuvinte) {
		List<String> result = new ArrayList<String>();

		for (String cuvant : cuvinte) {
			if (cuvant.charAt(0) == cuvant.charAt(cuvant.length() - 1)) {
				result.add(cuvant);
			}
		}
		return result;
	}

	public static int howManyUpperCaseLetters(String cuvant) {

		int count = 0;
		for (int i = 0; i < cuvant.length(); i++) {
			if (Character.isUpperCase(cuvant.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static <T> List<T> wordExistingInOneListButNotTheOther(List<T> listOne, List<T> listTwo) {
		List<T> result = new ArrayList<T>();

		for (T element : listOne) {
			if (!listTwo.contains(element)) {
				result.add(element);
			}
		}
		return result;
	}

	public static String reverseWord(String cuvant) {
		String reverse = "";
		for (int i = cuvant.length() - 1; i >= 0; i--) {
			reverse = reverse + cuvant.charAt(i);
		}
		return reverse;

	}
	
	public static boolean isPalindrom(String cuvant) {
			return reverseWord(cuvant).equals(cuvant);

	}
	
	public static void maxQuantity(HashMap<String, Integer> produse) {
		
		int maxQuantity = 0;
		String produs = "";
		for(String key:produse.keySet()) {
			if(produse.get(key) > maxQuantity) {
				maxQuantity = produse.get(key);
				produs = key;
			} 
		}
		System.out.println("Produsul cu cea mai mare cantitate este: " + produs + " cu " + maxQuantity);
		
	}
	
	public static void longestKey(HashMap<String, Integer> produse) {
		
		int size = 0;
		String produs = "";
		for(String key:produse.keySet()) {
			for(int i = 0; i< key.length(); i++) {
				if(key.length()> size) {
					size = key.length();
					produs = key;
				}
			}
		}
		System.out.println("Produsul cu cea mai lunga denumire este: " + produs + " cu " + size);
	}
	
	public static void totalNumberOfProducts(HashMap<String, Integer> produse) {
		
		int total = 0;
		for(String key:produse.keySet()) {
			total += produse.get(key);
		}
		System.out.println("Numarul total de produse din lista este de: " + total);
	}
}

package colectii;

public class Arrays {

	public static void main(String[] args) {
		
		
		/* int[] numbers = { 3, 8, 6, 1, 4, 2 };
		// i - index sau pozitie unui element in array
		// numbers[i] - returnez valoarea din array de pe pozitia i
		System.out.println(numbers[2]);
		// lungimea unui array
		System.out.println(numbers.length);
		
		// modificare valori din array
		numbers[0] = 8;
		
		// printam un array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
		System.out.println();
		//for each - pentru fiecare element din array - fa ceva - doar pentru array
		for(int number:numbers) {
			System.out.print(number);
		}
		
		System.out.println();
		System.out.println();
		//declararea unui array obiectual, cu alocare de memorie
		int[] cifre = new int[3]; // array-ul va avea lungimea 3
		cifre[0] = 7;
		cifre[1] = 2;
		cifre[2] = 9;
		for(int cifra:cifre) {
			System.out.print(cifra);
		}
		
		System.out.println();
		System.out.println();
		
		String[] colors = {"red", "blue", "violet"};
		colors[1] = "pink";
		for (String color:colors) {
			System.out.println(color);
		} */
		
		//pentru fiecare nr din array, creste-l cu 2 - combinatie cu for si for each
		
		int[] numbers = {4, 3, 8, 5, 1};
		//increaseOperation(numbers);
		//for(int number:numbers) {
			//System.out.println(number);
		//}
		// avem un array de numere, daca nr e par, inlocuieste-l cu alt numar
				//{3, 5, 1, 2} , 7 -> {3,5,1,2, 7}
		//replaceEvenNumbers(numbers, 7);
		//for(int number:numbers) {
			//System.out.println(number);
		//}
		//System.out.println(getMax(numbers));
		String[] words = {"ana", "are", "mere"};
		System.out.println(getInclusion(words, "ana"));

	}
	//pentru fiecare nr din array, creste-l cu 2 - combinatie cu for si for each
		public static int[] increaseOperation(int[] numbers) {
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers[1] + 2;
			}
			return numbers;
		}
		
		// avem un array de numere, daca nr e par, inlocuieste-l cu alt numar
		//{3, 5, 1, 2} , 7 -> {3,5,1,2, 7}
		
			public static int[] replaceEvenNumbers(int[] numbers, int nr) {
				for ( int i = 0; i<numbers.length; i++) {
					if(numbers[i] % 2 == 0) {
						numbers[i] = nr;
					}
				}
				return numbers;
			}
			
			//calculati maximul dintr-un sir de numere
			//{3,5,7,8,1} - > 8
			public static int getMax(int[] numbers) {
				int max = numbers[0];
				for(int i = 1; i <numbers.length; i++) {
					if(numbers[i]> max) {
						max = numbers[i];
					}
				}
				return max;
			}
			
			//am un array de stringuri
			//printeaza un string care zice daca un cuvant e in array sau nu SI 
			//specifica care este indexul primei aparitii a cuvantului in array
			//{"ana", "are", "mere","ana"} - "ana" - > "da, pe pozitia 0"
			//{"ana", "are", "mere","ana"} - "maria" - > "nu exista"
			
			public static String getInclusion(String[] words, String searchWord) {
				String result = "";
				for(int i = 0; i <words.length; i++) {
					if(words[i].equals(searchWord)) {
						result = "da, pe pozitia" + i;
						break;
					}
					else {
						result = "nu exista";
					}
				}
				return result;
			}
		}


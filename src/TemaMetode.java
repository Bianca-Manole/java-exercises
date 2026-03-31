package methods;

public class TemaMetode {

	public static void main(String[] args) {
		System.out.println("ex1: Calculate the sum of the first 20 numbers, higher than 11.\n");
		System.out.println(getSum(12, 32));
		System.out.println("\nex2: Calculate the cube of each number <=5\n");
		printCubes();
		System.out.println(
				"\nex3: I take into consideration the numbers from 1 to 6. For odd numbers, compute their sum, for even numbers , compute their product.\n");
		computeResult();
		System.out.println("\nex4: Write a program that prints the same message backwards, one character per line,\n");
		String mesaj = "caracopercanita";
	    printBackwards(mesaj);
	    System.out.println("\nex5: Write a program that prints every 3rd character from a word\n");
	    String cuvant = "muncitor";
	    printEveryThirdChar(cuvant);
	    System.out.println("\nex6: Compute how many times a letter is present in a word.\n");
	    
	    String cuvant1 = "acidacetilicsalicilic";
	    char litera1 = 'c';

	    System.out.println(countLetter(cuvant1, litera1));
		System.out.println(
				"\nex7: Am un string \"Java is wonderful!!\" . Calculati nr de vocale si de consoane din string.\n");
		String text = "Java is wonderful!!";
		countLetters(text);
		System.out.println(
				"\nex8: Scrie un program care valideaza o parola. Parola trebuie sa aiba lungimea minima de 8 caractere, sa aibe numai litere si cifre si sa contina cel putin 2 cifre.\n");
		validatePassword("Java1234!");
		System.out.println("\nex9:Am un cuvant. Daca un cuvant are mai mult de 5 litere, returneaza cuvantul fara vocale. Daca are mai putin de 5 litere, returneaza cuvantu fara consoane. Daca are exact 5 litere, returneaza cuvantul initial.\n");
		System.out.println(processWord("acidacetilicsalicilic"));
        System.out.println(processWord("java"));
        System.out.println(processWord("acasa"));
        System.out.println("\nex:10:Genereaza random un nr intreg, maxim pana la 100\n");
        System.out.println(generateRandomNumber());
        System.out.println("\nex:11:Scrie o metoda java care calculeaza cate cuvinte sunt intr-un string.(delimitare cu \" \" si sa nu aibe spatii pe margine)\n");
        String textDoi = "Ana are multe mere si pere";
        System.out.println(countWords(textDoi));
	}

	// ex1: Calculate the sum of the first 20 numbers, higher than 11
	public static int getSum(int nrOne, int nrTwo) {
		int suma = 0;
		for (int i = nrOne; i <= nrTwo; i++) {
			suma = suma + i;
		}
		return suma;
	}

	// ex2: Calculate the cube of each number <=5
	public static int getCube(int nr) {
		return nr * nr * nr;
	}

	public static void printCubes() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getCube(i));
		}
	}

	// ex3: I take into consideration the numbers from 1 to 6. For odd numbers,
	// compute their sum, for even numbers , compute their product

	public static boolean isPar(int nr) {
		return nr % 2 == 0;
	}

	public static void computeResult() {
		int sumForOddNumbers = 0;
		int productForEvenNumbers = 1;
		for (int i = 1; i <= 6; i++) {
			if (isPar(i)) {
				productForEvenNumbers = productForEvenNumbers * i;

			} else {
				sumForOddNumbers = sumForOddNumbers + i;
			}
		}
		System.out.println(productForEvenNumbers);
		System.out.println(sumForOddNumbers);

	}
	
	//ex4: Write a program that prints the same message backwards, one character per line
	
	public static void printBackwards(String mesaj) {

	    for (int i = mesaj.length() - 1; i >= 0; i--) {
	        System.out.println(mesaj.charAt(i));
	    }

	}
	
	//ex5: Write a program that prints every 3rd character from a word
	
	public static void printEveryThirdChar(String cuvant) {

	    for (int i = 2; i <= cuvant.length() - 1; i += 3) {
	        System.out.println(cuvant.charAt(i));
	    }

	}
	
	//ex6: Compute how many times a letter is present in a word
	public static int countLetter(String cuvant, char litera) {

	    int countAparitii = 0;

	    for (int i = 0; i <= cuvant.length() - 1; i++) {
	        if (cuvant.charAt(i) == litera) {
	            countAparitii++;
	        }
	    }

	    return countAparitii;
	}

	// ex7: Am un string "Java is wonderful!!" . Calculati nr de vocale si de
	// consoane din string

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void countLetters(String text) {

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < text.length(); i++) {

			char c = text.charAt(i);

			if (Character.isLetter(c)) {

				if (isVowel(c)) {
					vowels++;
				} else {
					consonants++;
				}

			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

	// ex8:Scrie un program care valideaza o parola. Parola trebuie sa aiba lungimea
	// minima de 8 caractere, sa aibe numai litere si cifre si sa contina cel putin
	// 2 cifre.
	public static boolean isValidPassword(String password) {

		if (password.length() < 8) {
			return false;
		}

		int digitCount = 0;

		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);

			if (!Character.isLetterOrDigit(c)) {
				return false;
			}

			if (Character.isDigit(c)) {
				digitCount++;
			}
		}

		return digitCount >= 2;
	}

	public static void validatePassword(String password) {

		if (isValidPassword(password)) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}

	}
	//ex:9Am un cuvant. Daca un cuvant are mai mult de 5 litere, returneaza cuvantul fara vocale. Daca are mai putin de 5 litere, returneaza cuvantu fara consoane. Daca are exact 5 litere, returneaza cuvantul initial.
	public static boolean isVowel2(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String processWord(String word) {

        if (word.length() == 5) {
            return word;
        }

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (word.length() > 5) {
                if (!isVowel2(c)) {
                    result += c;
                }
            } else {
                if (isVowel2(c)) {
                    result += c;
                }
            }
        }

        return result;
    }
    
    //ex:10:Genereaza random un nr intreg, maxim pana la 100
    public static int generateRandomNumber() {
        return (int)(Math.random() * 101);
    }
    
    
  //ex:11:Scrie o metoda java care calculeaza cate cuvinte sunt intr-un string.(delimitare cu \" \" si sa nu aibe spatii pe margine)
    public static int countWords(String textDoi) {

        int count = 1;

        for (int i = 0; i < textDoi.length(); i++) {

            if (textDoi.charAt(i) == ' ') {
                count++;
            }

        }

        return count;
    }

}

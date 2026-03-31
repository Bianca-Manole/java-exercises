package methods;

public class Methods {
	public static String word = "text"; //variabila globala
	
	public static void main(String[] args) {
		//writeText();
		//writeTextWithOneParam(9);
		//writeTextWithTwoParams("Bianca", 10);
		//printSum(2, 5);
		//System.out.println(printSumSecond(2, 4));
		//int suma = printSumSecond(2,4);
		//System.out.println(suma);
		//System.out.println(isPar(10));
		//System.out.println(computeResult(8));
		//System.out.println(getSumOfNumbers(5));
		//System.out.println(reverseWord("bianca"));
		//System.out.println(createNewWord("soare"));
		System.out.println(isLetter('!'));
	}
	
	//identify if a character is a letter
	
	public static boolean isLetter(char c) {
		if(c >= 'a' && c <= 'z') {
			return true;
		}
		else {
			return false;
		}
	}
	
	//am un cuvant
	//creeaza alt cuvant in care dupa fiecare vocala de la primul cuvant adaug un !
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u') {
			return true;
		}
		else {
			return false;
		}
	}
	public static String createNewWord(String word) {
		String newWord="";
		for(int i = 0; i <word.length(); i++) {
			if(isVowel(word.charAt(i))) {
				newWord = newWord + word.charAt(i) + "!";
			}
			else {
				newWord = newWord + word.charAt(i);
			}
		}
		return newWord;
	}
	
	
	public static int printSumSecond(int a, int b) {
		return a + b;
	}
	
	public static void printSum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void writeTextWithTwoParams(String name, int nota) {
		String text = "text2"; // variabila locala, vizibile doar in interiorul metodei in care e folosita, aceeasi variabila poate avea acelasi nume in alta metoda
		
		System.out.println("vrem tema mai grea!");
		System.out.println(name + " a primit nota "+nota+" la ultima tema");
	}
	
	
	public static void writeTextWithOneParam(int nota) {
		System.out.println("vrem tema mai grea!");
		System.out.println("am primit nota "+nota+" la ultima tema");
	}
	
	public static void writeText() {
		String text = "text2"; // variabila locala, vizibile doar in interiorul metodei in care e folosita, aceeasi variabila poate avea acelasi nume in alta metoda
		
		System.out.println("vrem tema mai grea!");
		System.out.println("am primit nota 9 la ultima tema");
	}
	
	//returneaza daca un nr e par sau nu
	public static boolean isPar(int nr) {
		if(nr % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//returneaza daca un nr e par sau nu - mai eficient scrisa
	public static boolean isPar2(int nr) {
		return (nr % 2 == 0);
	}
	
	//ne folosim de metoda isPar 
	//am un nr.. daca nr e par returneaza cubul lui
	//daca e impar, returneaza patratul lui
	public static int computeResult(int nr) {
		if(isPar(nr)) {
			return getCube(nr);
		}
		else {
			return getSquare(nr);
		}
	}
	
	public static int getCube(int nr) {
		return nr * nr * nr;
	}
	
	public static int getSquare(int nr) {
		return nr * nr;
	}
	
	//write a method to calculate the sum of all numbers till a given nr
	public static int getSumOfNumbers(int number) {
		int suma = 0;
		for (int i = 1; i <= number; i++) {
			suma = suma+ i;
		}
		return suma;
	}
	
	//scrie o metoda care inverseaza un string
	
	public static String reverseWord(String cuvant) {
		String reverse = "";
		for (int i = cuvant.length() - 1; i >= 0; i--) {
			reverse = reverse + cuvant.charAt(i);
		}
		return reverse;
	}
	
	public static int getSum(int nrOne, int nrTwo) {
		int suma = 0;
		for (int i = nrOne; i <= nrTwo; i++) {
			suma = suma + i;
		}
		return suma;
	}
	

}

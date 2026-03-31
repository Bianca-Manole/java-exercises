package intro;

public class Tema {

	public static void main(String[] args) {

		System.out.println("ex1: Calculate the sum of the first 20 numbers, higher than 11.\n");
		int suma = 0;
		for (int i = 12; i <= 32; i++) {
			suma = suma + i;
		}
		System.out.println(suma + "\n");

		System.out.println("ex2: Calculate the cube of each number <=5\n");

		for (int i = 1; i <= 5; i++) {
			int cub = i * i * i;
			System.out.println(cub);
		}

		System.out.println(
				"\nex3: I take into consideration the numbers from 1 to 6. For odd numbers, compute their sum, for even numbers , compute their product.\n");
		int sumaNrImpare = 0;
		int produsNrPare = 1;
		for (int i = 1; i <= 6; i++) {
			if (i % 2 == 0) {
				produsNrPare = produsNrPare * i;
			} else {
				sumaNrImpare = sumaNrImpare + i;
			}
		}
		System.out.println(produsNrPare);
		System.out.println(sumaNrImpare + "\n");

		System.out.println("ex4: Write a program that prints the same message backwards, one character per line,\n");

		String mesaj = "caracopercanita";

		for (int i = mesaj.length() - 1; i >= 0; i--) {
			System.out.println(mesaj.charAt(i));
		}

		System.out.println("\nex5: Write a program that prints every 3rd character from a word\n");
		String cuvant = "muncitor";

		for (int i = 2; i <= cuvant.length() - 1; i += 3) {
			System.out.println(cuvant.charAt(i));
		}

		System.out.println("\nex6: Compute how many times a letter is present in a word.\n");
		String cuvant1 = "acidacetilicsalicilic";
		char litera1 = 'c';
		int countAparitii = 0;

		for (int i = 0; i <= cuvant1.length() - 1; i++) {
			if (cuvant1.charAt(i) == litera1) {
				countAparitii++;
			}
		}
		System.out.println(countAparitii);
	}

}

package ExercitiiCuArrays;

public class cautaUnNumar {

	public static void main(String[] args) {
		int[] numbers = { 3, 7, 1, 9, 5 };
		searchForNumber(numbers, 10);

	}

	public static void searchForNumber(int[] numbers, int nr) {
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == nr) {
				System.out.println("found");
				return; // return in if pentru a opri metoda cand conditia este indeplinita
			}

		}

		System.out.println("not found");
	}
}

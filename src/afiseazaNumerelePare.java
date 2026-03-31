package ExercitiiCuArrays;

public class afiseazaNumerelePare {

	public static void main(String[] args) {
		int[] numbers = {2, 6, 5, 7, 3, 1,4};
		showEvenNumbers(numbers);

		}
	public static void showEvenNumbers(int[] numbers) {
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}

	}

}

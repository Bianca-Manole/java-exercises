package ExercitiiCuArrays;

public class numaraNumereleMaiMariDecatZece {

	public static void main(String[] args) {
		int[] numbers = {5, 12, 7, 20, 3, 15};
		System.out.println(countMaxNumbers(numbers));

	}
	
	public static int countMaxNumbers(int[] numbers) {
		int count = 0;
		int max = 10;
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i] > max) {
				count++;
			}
		}
		return count;
	}

}

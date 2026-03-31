package ExercitiiCuArrays;

public class sumaNumerelorPare {

	public static void main(String[] args) {
		int[] numbers = {2, 5, 8, 11, 6};
		System.out.println(sumOfEvenNumbers(numbers));

	}
	
	public static int sumOfEvenNumbers (int[] numbers) {
		int sum = 0;
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum = sum + numbers[i];
			}
		}
		return sum;
	}

}

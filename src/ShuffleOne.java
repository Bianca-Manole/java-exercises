package headFirstJava;

public class ShuffleOne {

	public static void main(String[] args) {
		int x = 3;
		while (x > 0) { 
			if (x > 2) { // x = 3
				System.out.print("a");
			}
			x = x -1; // x sa devina 2
			System.out.print("-");
			if(x == 2) { // x devina 2
				System.out.print("b c");
			}
			if (x == 1) { // devine 1 
				System.out.print("d");
				x = x - 1; // asta e ca sa devina x 0 si sa nu mai intre pe while
			}
		}

	}

}

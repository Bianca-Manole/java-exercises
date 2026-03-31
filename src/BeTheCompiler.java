package headFirstJava;

public class BeTheCompiler {

	public static void main(String[] args) {

		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
				System.out.println("small x");
			}
		}

		int y = 1;
		while (y < 10) {
			y = y + 1;
			if (y > 3) {
				System.out.println("big y");
			}
		}

		int z = 5;
		while (z > 1) {
			z = z - 1;
			if (z < 3) {
				System.out.println("small z");
			}
		}

	}

}

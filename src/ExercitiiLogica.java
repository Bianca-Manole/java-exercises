package headFirstJava;

public class ExercitiiLogica {

	public static void main(String[] args) {
		/*
		 * int x = 1; int y = 1;
		 * 
		 * while (y <= 3) { if (x == y) { // System.out.println("x=" + x + " y=" + y); }
		 * y++; } x++;
		 * 
		 * int a = 1;
		 * 
		 * while (a <= 4) { int b = 1; while (b <= 4) { if (b == 2) { b++; continue; }
		 * // System.out.println("a=" + a + " b=" + b); b++; } a++;
		 * 
		 * }
		 * 
		 * int x = 1;
		 * 
		 * while (x <= 4) { int y = 1;
		 * 
		 * while(y <= 5) { if(y == 3) { y++; continue; } if(x + y == 6) {
		 * System.out.println("x=" + x + " y=" + y); break; } y++; } x++; }
		 * 
		 * 
		 * int x = 1;
		 * 
		 * while (x <= 4) { int y = 1;
		 * 
		 * while (y <= 5) {
		 * 
		 * if (x == 2 && y == 2) { y++; continue; } if (x * y > 6) {
		 * System.out.println("x=" + x + " y=" + y); break; } y++; } x++; }
		 * 
		 * int x = 1;
		 * 
		 * while (x <= 4) { int y = 1;
		 * 
		 * while (y <= 5) { if (y == 4) { break; } if (x + y == 5) {
		 * System.out.println("x=" + x + " y=" + y); }
		 * 
		 * if (y == 2) { y++; continue; } y++; } x++; }
		 */

		int x = 1;

		while (x <= 4) {
			int y = 1;

			while (y <= 5) {
				if (y == 3) {
					y++;
					continue;
				}
				if (x * y == 8) {
					System.out.println("x=" + x + " y=" + y);
				}
				if (y == 4) {
					break;
				}
				y++;
			}
			x++;
		}
	}
}

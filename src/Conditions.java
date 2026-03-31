package intro;

public class Conditions {

	public static void main(String[] args) {
		String vreme = "ninsoare";
		
		if (vreme == "ninsoare") {
			System.out.println("Iau caciula");
			System.out.println("Iau bocanci");
			System.out.println("Iau geaca");
		}
		else {
			System.out.println("Iau pantofii");
			System.out.println("Arunc manusile");
		}
		
		int a = 5;
		int b = 10;
		
		if (a>b) {
			System.out.println("Numarul mai mare este: " + a);
		}
		else {
			System.out.println("Numarul mai mare este: " + b);
		}
		
		//identificam care e mai mare si salvam valoarea pr a o refolosi
		
		int max = 0; // salvam valoarea prin a o defini cu o variabila setata cu 0
		if (a>b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println(max);
		
		if (a>b) {
			System.out.println(a);
		}
		else if (a == b) {
			System.out.println("Sunt egale");
		}
		else {
			System.out.println(b);
		}
		
		
		int nb = 4;
		boolean isPar = false;
		
		if (nb % 2 == 0) {
			isPar = true;
		}
		else {
			isPar = false;
		}
		System.out.println(isPar);
		
		int medie = 5;
		
		if (medie > 9) {
			System.out.println("Vei lua bursa");
		}
		else if (medie > 6) {
			System.out.println("Ai trecut");
		}
		else {
			System.out.println("repeta anul");
		}
	}
	

}

package intro;

public class Loops {

	public static void main(String[] args) {
		// for
		// for (unde incep; unde ma opresc; pattern) {
		// in interiorul acoladei e blocul de cod
		// inchidem acolada }

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// printez toate numerele de la 10 la 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// calculati suma tuturor numerelor de la 1 la 10
		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
		}
		System.out.println(suma);

		// calculati suma numerelor de la 0 la 10 care sunt pare
		int sumaPare = 0;
		for (int i = 2; i <= 10; i = i + 2) {
			sumaPare = sumaPare + i;
		}
		System.out.println(sumaPare);

		// for cu if
		int sumaPare2 = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			if (i % 2 == 0) {
				sumaPare2 = sumaPare2 + i;
			}
			System.out.println(sumaPare2);

		}
		int sumaPareFara6 = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			if (i != 6) {
				sumaPareFara6 = sumaPareFara6 + i;
			}
			System.out.println(sumaPareFara6);
		}

		// printeaza toate caracterele dintr-un string
		String cuvant = "imediat scapam";
		// cuvant.chartAt(0)

		for (int i = 0; i <= cuvant.length() - 1; i++) {
			// i - indexul sau pozitia pe care se afla un caracter in curand, incepe de la 0
			// lungimea pana unde se duce i(valoarea maxima) - cuvant.length()-1
			// valoarea i-ului = cuvant.charAt(i)
			System.out.println(cuvant.charAt(i));
		}
	}
}

package intro;

public class Exercises {

	public static void main(String[] args) {
		// afiseaza table inmultirii pana la 10 pentru un anumit numar
		int numar = 2;
		for (int i = 0; i <= 10; i++) {
			int produs = numar * i;
			System.out.println(numar + "*" + i + "=" + produs);
		}

		// calculeaza factorialul unui numar
		// 1! = 1
		// 2! = 2*1
		// 3! = 3*2*1
		// 4! = 4*3*2*1

		int nr = 4;
		int factorial = 1;
		for (int i = nr; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);

		// am un string cu spatii intre caractere: "P o v e s t e"
		// returneaza cuvantul fara spatii

		String cuvant = "P o v e s t e";
		String cuvantFaraSpatii = "";
		for (int i = 0; i < cuvant.length(); i++) {
			if (cuvant.charAt(i) != ' ') {
				cuvantFaraSpatii = cuvantFaraSpatii + cuvant.charAt(i);
			}
		}
		System.out.println(cuvantFaraSpatii);

		// verifica daca un nr este intre 20 si 30
		int number = 21;
		if (number >= 20 && number <= 30) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// verifica daca un nr este par sau multiplu de 5

		int cifra = 7;
		if (cifra % 2 == 0 || cifra % 5 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		//display la mesaj "poti sa iei credit" daca ai peste 20 de ani si ai un venit mai mare de 5000 lei
		//daca nu, faci display la mesaj "poti lua credit cu garantie daca ai peste 18 ani sau ai venit mai mare de 3000 lei
		//daca niciuna nu e adevarat, atunci faci display la "nu esti eligibil
		
		int age = 30;
		int venit = 4500;
		if(age >= 20 && venit > 5000) {
			System.out.println("Poti lua credit");
		}
		else if ( age >= 20 || venit > 3000) {
			System.out.println("Poti lua credit cu garantie");
		}
		else {
			System.out.println("Nu esti eligibil pentru credit");
		}
		
		//verifica daca un caracter este vocala
		char caracter = 'O';
		caracter = Character.toLowerCase(caracter);
		if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' ||caracter == 'u') {
			System.out.println("Litera " + caracter + " este vocala"); 
		}
		else {
			System.out.println("Litera " + caracter + " nu este vocala") ;
		}
	}

}

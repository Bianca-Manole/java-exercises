package intro;

public class Intro {

	public static void main(String [] args) {
		/*
		//variabila de tip string cu numele ei status
		String status  = "vine primavara !";
		System.out.println(status);
		
		String today = "duminica";
		today = "luni";
		System.out.println(today);
		//concatenare stringuri
		System.out.println(status + " --> " + today);
		String nimic = null;
		System.out.println(nimic);
		
		//.length -calculeaza lungimea stringului
		System.out.println(status.length());
		//toUpperCase - face stringul upper case
		System.out.println(status.toUpperCase());
		//charAt - ne arata caracterul de la o anumita pozitie specificata
		System.out.println(status.charAt(3));
		//.indexOf - ne arata pozitia unui caracter din string - de pus single ghilimele
		System.out.println(status.indexOf('e'));
		//(status.charAt(status.length()-1)); - ne arata caracterul de pe ultima pozitie din string
		System.out.println(status.charAt(status.length()-1));
		*/
		
		int numberOne = 10;
		int numberTwo = 20;
		int suma = numberOne + numberTwo;
		System.out.println(suma);
		numberOne++; // incrementeaza cu 1
		System.out.println(numberOne);
		numberOne+=3; // numberOne + 3
		System.out.println(numberOne);
		
		System.out.println(numberOne % 2); // % returneaza restul impartirii numarului la un numar
		
		int nr = 10;
		String word = "2";
		System.out.println(nr + word);
		System.out.println(nr + Integer.valueOf(word)); // transforma word din string in int si face calculul
		
		String cuvant = "seara";
		char litera = 's';
		System.out.println(cuvant + litera);
		litera = 'a';
		litera = cuvant.charAt(1); // inlocuieste valoarea variabilei cu caracterul de pe o pozitie specificata a valorii variabilei cuvant
		System.out.println(cuvant + litera);
		
		boolean raspuns = true; // false
		
		String nume = "Bianca";
		int varsta = 32;
		String oras = "Bucuresti";
		System.out.println("Ma numesc " + nume + ", am " + varsta + " si locuiesc in " + oras);
		
		String parola = "ILoveJava2026";
		System.out.println(parola.length());
		System.out.println(parola.charAt(0));
		System.out.println(parola.charAt(parola.length()-1));
		System.out.println(parola.toUpperCase());
		System.out.println(parola.indexOf('a'));
		
		
	
	}
}

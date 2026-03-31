package colectii;

public class Exceptii {

	public static void main(String[] args) {
		
		//System.out.println(aria(-2));
		
		//System.out.println(10/0); // exceptie- nu poti imparti la 0 in programare
		
		int[] a = {1, 2, 3};
		
		try {
			System.out.println(a[3]);
			//int v = a[0];
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index invalid");
			System.out.println(e.getMessage());// mesajul de la exceptie
			System.out.println(e); // exceptia
			e.printStackTrace(); // tot stacktrace-ul mesajul // BEST PRACTICE
		}
		finally {
			System.out.println(a[0]);
			
		}
		//ageCheck(18);
		
		System.out.println(stringToInt("doi"));

	}
	
	//scrie o metoda care calculeaza aria unui cerc pi*r*r
	
	public static double aria(int raza) {
		
		if(raza < 0 ) {
			throw new IllegalArgumentException("Raza e mai < decat 0"); //scriu conditie- dupa care ii zic ca e exceptie ca sa imi arate de ce a picat
		}
		return 3.14*raza*raza;
		
	}
	
	//vreau sa creez un cont si am restrictii de varsta
	//daca varsta < 18 -> access denied!
	//daca varsta e negativa sau > 80 -> invalid age value
	//daca varsta e intre 18 si 80 - > access granted
	
	public static void ageCheck(int age) {
		if(age < 18 && age >= 0) {
			throw new IllegalArgumentException("Access denied!");
		} else if (age < 0 || age > 80) {
			throw new IllegalArgumentException("Invalid age value");
		} else {
			System.out.println("Access granted");
		}
	}
	
	//write a method to change a value from String to int
	
	public static int stringToInt(String a) {
		int rez= 0;
		try {
			
			rez = Integer.parseInt(a); // transforma string in int
			
		}
		catch (NumberFormatException e) {
			System.out.println("Valoarea trebuie sa fie numar!");
			e.printStackTrace();
		}
		finally {
			System.out.println(a);
		}
		return rez;
	}

}

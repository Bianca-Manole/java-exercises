package colectii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		/*
		 * //definim o lista List<String> culori = new ArrayList<String>();
		 * 
		 * culori.add("fuxia");//adaugi la array culori.add("blue");
		 * 
		 * culori.add("violet"); culori.add("roz"); culori.add("galben");
		 * culori.add("roz"); culori.add("verde");
		 * 
		 * //print la lista 
		 * System.out.println(culori); 
		 * //get an element from the list
		 * System.out.println(culori.get(0)); 
		 * //get list size
		 * System.out.println(culori.size()); 
		 * //get element index
		 * System.out.println(culori.indexOf("roz")); 
		 * //get ultima pozitie pe care se
		 * afla un element anume System.out.println(culori.lastIndexOf("roz")); 
		 * //check
		 * if the list contains a specific value
		 * System.out.println(culori.contains("galben"));
		 * System.out.println(culori.contains("mov")); 
		 * //modify the value of an element
		 * culori.set(6, "rosu");
		 *  // indexul elementului pe care vrem sa il modificam si
		 * elementul cu care vrem sa il modificam System.out.println(culori); 
		 * //remove
		 * an element from the list culori.remove(0);
		 *  //remove cu index
		 * System.out.println(culori); culori.remove("galben"); 
		 * // remove cu obiect
		 * adica cu valoarea System.out.println(culori); 
		 * //for de parcurs 
		 * for (int i=0; i<culori.size();i++) { 
		 * System.out.println(culori.get(i)); } 
		 * // for each
		 * for(String culoare:culori) {
		 *  System.out.println(culoare); } 
		 *  //sortarea unei
		 * liste in ordine alfabetica 
		 * Collections.sort(culori);
		 * System.out.println(culori);
		 * 
		 * List<String> curcubeu = new ArrayList<String>();
		 *  curcubeu.add("magenta");
		 * curcubeu.add("negru"); 
		 * //fuzionarea listelor: curcubeu sa fie merged in culori
		 *  culori.addAll(curcubeu); 
		 * System.out.println(culori);
		 */

		// avem o lista cu 4 masini
		// afiseaza prima masina
		// modifica a doua
		// sterge a treia
		// afiseaza lungimea listei
		// verifica daca "audi" este in lista

		List<String> masini = new ArrayList<String>();
		masini.add("toyota");
		masini.add("dacia");
		masini.add("jaguar");
		masini.add("mazda");

		System.out.println(masini.get(0));
		masini.set(1, "nisan");
		System.out.println(masini);
		masini.remove(2);
		System.out.println(masini);
		System.out.println(masini.size());
		System.out.println(masini.contains("audi"));

		// problema 2
		System.out.println("-------2-------");
		// am o lista de stringuri
		// daca lista e mai lunga de 5 elemente, afiseaza "too long"
		// daca un element din lista are mai mult de 5 caractere, adauga-l in alta lista
		// si inlocuieste cu "ups" in lista initiala
		// daca elementul este <= 4 caractere, adauga-i un "!" la sfarsit

		List<String> fructe = new ArrayList<String>();
		List<String> fructeLungi = new ArrayList<String>();
		fructe.add("mere");
		fructe.add("pere");
		fructe.add("portocale");
		fructe.add("banane");
		fructe.add("cirese");
		if (fructe.size() > 5) {
			System.out.println("too long");
		}
		for (String fruct : fructe) {
			if (fruct.length() > 5) {
				fructeLungi.add(fruct);
				int i = fructe.indexOf(fruct);
				fructe.set(i, "ups");
			}
			if (fruct.length() <= 4) {
				int i = fructe.indexOf(fruct);
				fructe.set(i, fruct + "!");
			}
		}
		System.out.println(fructe);
		System.out.println(fructeLungi);
		System.out.println("-----3---------");
		//am o lista de stringuri
		//returneaza valoarea cu lungimea cea mai mare
		//[apa, soare, portocale, plaja] - portocale
		List<String> words = new ArrayList<String>();
		words.add("apa");
		words.add("soare");
		words.add("portocale");
		words.add("plaja");
		
		String longest = words.get(0);
		for(String word:words) {
			if(longest.length()<word.length()) {
				longest = word;
			}
		}
		System.out.println(longest);
		
		//4
		System.out.println("---------4----------");
		//am o lista de numere
		//returneaza indexul primului element par din lista
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);
		
		int index = 0; // initializez indexul 
		for(int i = 0; i < numbers.size(); i++) {
			if( numbers.get(i) % 2 == 0) { // numbers.get(i) - ca sa gasesc indexul lui i(elementul)
				index = i; // atunci index ia valoarea lui i( indexul elementului)
				break;
			}
		}
		System.out.println(index);
		
		System.out.println("------5--------");
		//5
		//am 2 liste de numere
		//gasiti elementele comune celor 2 liste si puneti-le in a 3-a lista
		//[1,2,3] - [0,2,4,3] - [2,3]
		List<Integer> nrOne = new ArrayList<Integer>();
		List<Integer> nrTwo = new ArrayList<Integer>();
		//List<Integer> nrComune = new ArrayList<Integer>();
		
		nrOne.add(1);
		nrOne.add(2);
		nrOne.add(3);
		
		nrTwo.add(0);
		nrTwo.add(2);
		nrTwo.add(4);
		nrTwo.add(3);
		
		List<Integer> nrComune = findCommonElements(nrOne, nrTwo);
		System.out.println(nrComune);
		
		/*for(int nr: nrOne) {
			if(nrTwo.contains(nr)) {
				nrComune.add(nr);
			}
		}
		System.out.println(nrComune); */
	}
	
	public static List<Integer> findCommonElements(List<Integer> nrOne, List<Integer> nrTwo){
		List<Integer> nrComune = new ArrayList<Integer>();{
		for(int nr: nrOne) {
			if(nrTwo.contains(nr)) {
				nrComune.add(nr);
			}
		}
		return nrComune;
	}
	}
}




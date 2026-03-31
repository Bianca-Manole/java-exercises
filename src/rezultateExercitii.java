package colectiiTema;

import java.util.ArrayList;
import java.util.List;

public class rezultateExercitii {

	public static void main(String[] args) {
		System.out.println("----1----");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		List<Integer> newListWithFactorial = RezolvareExercitii.exercitiuUnu(list);
		System.out.println(newListWithFactorial);
		
		System.out.println();
		System.out.println("----2----");


		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		List<Integer> elementeLaPutereaA = RezolvareExercitii.exercitiuDoi(a);
		System.out.println(elementeLaPutereaA);
		
		System.out.println();
		System.out.println("----3----");
		
		List<String> words = new ArrayList<String>();
		words.add("ana");
		words.add("are");
		words.add("mere");
		
		System.out.println(RezolvareExercitii.exercitiuTrei(words));
		
		System.out.println();
		System.out.println("----4----");
		
		List<String> cuvinte = new ArrayList<String>();
		cuvinte.add("apa");
		cuvinte.add("soare");
		cuvinte.add("mare");
		cuvinte.add("zapada");
		
		List<String> cuvinteCuVocale = RezolvareExercitii.exercitiuPatru(cuvinte);
		System.out.println(cuvinteCuVocale);
		
		System.out.println();
		System.out.println("----5----");
		
		List<String> stringuri = new ArrayList<String>();
		stringuri.add("apa");
		stringuri.add("sare");
		stringuri.add("suc");
		
		stringuri = RezolvareExercitii.exercitiuCinci(stringuri);
		System.out.println(stringuri);
		
		System.out.println();
		System.out.println("----6----");
		
		List<Integer> listaNumereUnu = new ArrayList<Integer>();
		listaNumereUnu.add(4);
		listaNumereUnu.add(5);
		listaNumereUnu.add(7);
		listaNumereUnu.add(2);
		
		List<Integer> listaNumereDoi = new ArrayList<Integer>();
		listaNumereDoi.add(5);
		listaNumereDoi.add(2);
		listaNumereDoi.add(9);
		listaNumereDoi.add(3);
		
		List<Integer> sumaNumerelor = RezolvareExercitii.exercitiuSase(listaNumereUnu, listaNumereDoi);
		System.out.println(sumaNumerelor);

	}

}

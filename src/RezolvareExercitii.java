package colectiiTema;

import java.util.ArrayList;
import java.util.List;

public class RezolvareExercitii {

	public static List<Integer> exercitiuUnu(List<Integer> list) {
		List<Integer> newListWithFactorial = new ArrayList<Integer>();

		for (int item : list) {
			int factorial = 1;
			for (int i = 1; i <= item; i++) {
				factorial = factorial * i;
			}
			newListWithFactorial.add(factorial);
		}
		return newListWithFactorial;
	}

	public static List<Integer> exercitiuDoi(List<Integer> a) {
		List<Integer> elementeLaPutereaA = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			elementeLaPutereaA.add((int) Math.pow(a.get(i), i));
		}

		return elementeLaPutereaA;
	}

	public static String exercitiuTrei(List<String> words) {

		String newWord = "";
		for (String word : words) {

			newWord += word.charAt(0);
		}
		return newWord;
	}

	public static List<String> exercitiuPatru(List<String> cuvinte) {
		List<String> cuvinteCuVocale = new ArrayList<String>();

		for (String cuvant : cuvinte) {
			int count = 0;

			for (int i = 0; i < cuvant.length(); i++) {
				char litera = Character.toLowerCase(cuvant.charAt(i));
				if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
					count++;
				}
			}
			if (count >= 3) {
				cuvinteCuVocale.add(cuvant);
			}
		}

		return cuvinteCuVocale;
	}

	public static List<String> exercitiuCinci(List<String> stringuri) {

		for (int j = 0; j < stringuri.size(); j++) {
			String string = stringuri.get(j);

			int countVocale = 0;
			int countConsoane = 0;

			for (int i = 0; i < string.length(); i++) {
				char litera = Character.toLowerCase(string.charAt(i));
				if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
					countVocale++;
				} else {
					countConsoane++;
				}

			}

			if (j % 2 == 0) {
				stringuri.set(j, countVocale + "");
			} else {
				stringuri.set(j, countConsoane + "");
			}
		}

		return stringuri;
	}

	public static List<Integer> exercitiuSase(List<Integer> listaNumereUnu, List<Integer> listaNumbereDoi) {
		List<Integer> sumaNumerelor = new ArrayList<Integer>();

		for (int i = 0; i < listaNumereUnu.size(); i++) {
			int numarListaUnu = listaNumereUnu.get(i);
			int numarListDoi = listaNumbereDoi.get(i);

			int suma = numarListaUnu + numarListDoi;

			sumaNumerelor.add(suma);
		}
		return sumaNumerelor;

	}

}

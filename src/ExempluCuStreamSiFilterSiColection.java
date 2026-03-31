package colectiiTema;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExempluCuStreamSiFilterSiColection {

	public static void main(String[] args) {
		List<String> cuvinte = new ArrayList<String>();
		
		cuvinte.add("apa");
		cuvinte.add("soare");
		cuvinte.add("mare");
		cuvinte.add("zapada");
		
		List<String> cuvinteCuVocale = new ArrayList<String>();
		
		Predicate<String> streamsPredicate = name -> nrVocale(name) >= 3;
		
		cuvinteCuVocale = cuvinte.stream().filter(streamsPredicate).collect(Collectors.toList());
		
		System.out.println(cuvinteCuVocale);

	}
	
	public static int nrVocale(String cuvant)
	{
		int nrVocale = 0;
		String vocale = "aeiou";
		
		for(int i = 0; i < cuvant.length(); i++) {
			char litera = cuvant.charAt(i);
			if(vocale.indexOf(litera) >= 0) {
				nrVocale++;
			}
			
		}
		
		return nrVocale;
	}

}

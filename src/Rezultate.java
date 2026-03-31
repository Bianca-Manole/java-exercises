import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Rezultate {
    public static void main(String[] args){
        List<String> listaDeCuvinte = new ArrayList<>();
        listaDeCuvinte.add("ana");
        listaDeCuvinte.add("maria");
        listaDeCuvinte.add("maram");
        System.out.println(ExercitiiCuLoops.reversedWord(listaDeCuvinte));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(ExercitiiCuLoops.evenNumbers(numbers));

         /*List<String> listOne = new ArrayList<>();
         listOne.add("ana");
         listOne.add("maria");
         listOne.add("bianca");

         List<String> listTwo = new ArrayList<>();
         listTwo.add("maria");
         listTwo.add("ciprian");
         listTwo.add("ana");*/

        List<Integer> listOne = new ArrayList<>();
        listOne.add(5);
        listOne.add(7);
        listOne.add(9);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(7);
        listTwo.add(9);
        listTwo.add(3);

         System.out.println(ExercitiiCuLoops.commonElements(listOne,listTwo));

        List<String> cuvinte = new ArrayList<>();
        cuvinte.add("ana");
        cuvinte.add("bianca");
        cuvinte.add("adriana");

        System.out.println(ExercitiiCuLoops.showMap(cuvinte));

        List<Integer> numere = new ArrayList<>();
        numere.add(2);
        numere.add(-2);
        numere.add(-100);
        System.out.println(ExercitiiCuLoops.isPositive(numere));

        List<String> cuvinteLungi = new ArrayList<>();

        cuvinteLungi.add("ana");
        cuvinteLungi.add("maria");
        cuvinteLungi.add("radulescu");

        System.out.println(ExercitiiCuLoops.longestWord(cuvinteLungi));

        List<String> lista = new ArrayList<>();
        lista.add("ana ");
        lista.add(" ");
        lista.add("");

        System.out.println(ExercitiiCuLoops.removeSpaces(lista));

        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(ExercitiiCuLoops.inversareArray(array)));

        List<Integer> listaCuNumere = new ArrayList<>();
        listaCuNumere.add(2);
        listaCuNumere.add(2);
        listaCuNumere.add(3);

        System.out.println(ExercitiiCuLoops.removeDuplicateWithStream(listaCuNumere));
        List<Integer> listaCuNumereDoi = new ArrayList<>();

        listaCuNumereDoi.add(2);
        listaCuNumereDoi.add(2);
        listaCuNumereDoi.add(3);
        System.out.println(ExercitiiCuLoops.removeDuplicate(listaCuNumereDoi));

        List<String> wordsList = new ArrayList<>();

        wordsList.add("Ana");
        wordsList.add("mAria");
        wordsList.add("Maria");

        System.out.println(ExercitiiCuLoops.numberOfWordsWithCaps(wordsList));
    }
}

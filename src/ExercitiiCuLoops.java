import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ExercitiiCuLoops {


    public static List<String> reversedWord(List<String> listaDeCuvinte) {
        List<String> listaCuReversedWords = new ArrayList<>();

        for (String cuvant : listaDeCuvinte) {
            String reversed = "";
            for (int i = cuvant.length() - 1; i >= 0; i--) {
                reversed = reversed + cuvant.charAt(i);
            }
            if (cuvant.equals(reversed)) {
                listaCuReversedWords.add(reversed);
            }
        }
        return listaCuReversedWords;
    }

    public static List<Integer> evenNumbers(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }

    public static <T> List<T> commonElements(List<T> listOne, List<T> listTwo) {
        List<T> listaComune = new ArrayList<>();

        for (T element : listOne) {
            if (listTwo.contains(element)) {
                listaComune.add(element);
            }
        }
        return listaComune;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static HashMap<String, Integer> showMap(List<String> cuvinte) {
        HashMap<String, Integer> mapa = new HashMap<>();


        for (String cuvant : cuvinte) {
            int vowels = 0;
            for (int i = 0; i < cuvant.length(); i++) {
                if (isVowel(cuvant.charAt(i))) {
                    vowels++;
                }
            }
            mapa.put(cuvant, vowels);

        }
        return mapa;
    }

    public static boolean isPositive(List<Integer> numere) {
        return numere.stream().anyMatch(n -> n > 0);
    }

    public static int longestWord(List<String> cuvinteLungi) {


        int maxChars = 0;
        for (String cuvant : cuvinteLungi) {
            int chars = 0;

            if ((chars = cuvant.length()) > maxChars) {
                maxChars = chars;
            }
        }
        return maxChars;
    }

    public static List<String> removeSpaces(List<String> lista) {
        List<String> cuvinteFaraSpatii = new ArrayList<>();


            cuvinteFaraSpatii = lista.stream() // stream are foreach incorporat
                    .filter(Objects::nonNull) // elimina obiectele null
                    .map(String::trim) //elimina spatiile de la inceput si de la final de cuvant
                    .filter((s -> !s.isEmpty()))//elimina stringurile goale ""
                    .map(String::toLowerCase)//transforma stringul in lowercase
                    .collect(Collectors.toList());//transforma stream-ul inapoi in lista


        return cuvinteFaraSpatii;
    }

    public static int[] inversareArray(int[] array){


        for(int i =0; i < array.length / 2 ; i++){ // parcurge array pana la jumatate ca sa inversam in perechi
            int temp = array[i]; // salvam valoarea din stanga
            array[i] = array[array.length - 1 - i]; // punem valoarea in dreapta
            array[array.length -1 - i] = temp; // punem valoarea salvata in dreapta
        }
        return array;
    }

    public static <T> List<T> removeDuplicateWithStream (List<T> listaCuNumere) {

        listaCuNumere = listaCuNumere.stream().distinct().toList();
        return listaCuNumere;
    }

    public static  List<Integer> removeDuplicate (List<Integer> listaCuNumereDoi){
        List<Integer> notDuplicate = new ArrayList<>();

        for(int element: listaCuNumereDoi){
            if(!notDuplicate.contains(element)) {
                notDuplicate.add(element);
            }
        }
        return notDuplicate;
    }

    public static int numberOfWordsWithCaps(List<String> wordsList){

        int count = 0;
        for(String word:wordsList){
            if(Character.isUpperCase(word.charAt(0))){
                count++;
            }
        }
        return count;
    }

}



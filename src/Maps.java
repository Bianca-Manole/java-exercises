package colectii;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// key: value
		// name: maria
		// age: 20
		// city: cluj
		          // tot timpul String ca tip de data pentru Key
		HashMap<String, String> contacts = new HashMap<String, String>();
		
		//add elements to HashMap
		contacts.put("name", "Maria");
		contacts.put("age", "20");
		contacts.put("city", "cluj");
		
		//print map
		System.out.println(contacts);
		
		// get o valoare a unei cheie din map
		System.out.println(contacts.get("name"));
		
		//map size
		System.out.println(contacts.size());
		
		// remove a key
		contacts.remove("city");
		System.out.println(contacts);
		
		//get all keys -  va printa o lista pe care se pot face toate operatiile unei liste
		System.out.println(contacts.keySet());
		
		//get all values - va printa o lista pe care se pot face toate operatiile unei liste
		System.out.println(contacts.values());
		
		//for la nivel de key din map
		for (String key: contacts.keySet()) {
			System.out.println(key);
		}
		
		// for la nivel de values din map
		for(String value: contacts.values()) {
			System.out.println(value);
		}
		
		//am un map care contine notele de la bac
		//keys: romana, mate, info
		//to-do: 
		//printeaza map-ul
		//daca a dat examen la mate, returneaza nota
		//calculeaza media generala de la bac
		//printeaza toate materiile de la bac in care nota e mai mare decat 6
		
		HashMap<String, Integer> note = new HashMap<String, Integer>();
		note.put("romana", 5);
		note.put("mate", 8);
		note.put("info", 10);
		
		System.out.println(note);
		
		if(note.containsKey("mate")) {
			System.out.println(note.get("mate"));
		}
		//media generala
		int sum = 0;
		for(Integer nota:note.values()) {
			sum += nota;
		}
		System.out.println(sum);
		double media = (double) sum / note.size();
		System.out.println(media);
		
		// materiile cu nota >6
		for(String key:note.keySet()) {
			if(note.get(key) > 6) {
				System.out.println(key);
				System.out.println("materia: " + key + " are nota: " + note.get(key));
			}
		}
		
	}

}

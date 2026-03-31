package oop;

public class Education {

	public static void main(String[] args) {
		//Am o clasa Course ca are name and price
		//Am o clasa Student care are: name, surname, si cursul la care
		//va vrea sa participe dintre cursurile existente
		//trebuie sa afisam:
		//Cursantul <name + surname> participa la cursul <course name>
		//care costa <price> RON
		
		Course course = new Course("testare automata", 1000);
		Course manualCourse = new Course("testare manuala", 900);
		Student student = new Student("Bianca", "Manole", course);
		student.setCourse(manualCourse);
		System.out.println("Cursantul "+ student.getName() + " " + student.getSurname() + " participa la cursul " + student.getCourse().getName() + " " + student.getCourse().getPrice() + " RON");

	}

}

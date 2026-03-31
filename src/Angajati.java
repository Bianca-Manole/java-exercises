package ooptema;

public class Angajati {

	public static void main(String[] args) {
		Manager manager = new Manager("Bianca", "manager", 6);
		Dev dev = new Dev("Ciprian", "dev", 6);
		System.out.println(dev.getName() + " este angajat pe pozitia " + dev.getPosition() + " are vechimea de: "
				+ dev.getTenure() + " cu un salariu de: " + dev.getSalary() + " din care 5% este bonus de vechime");
		System.out.println(manager.getName() + " este angajat pe pozitia " + manager.getPosition()
				+ " are vechimea de: " + manager.getTenure() + " cu un salariu de: " + manager.getSalary()
				+ " din care 10% este bonus de vechime");
	}

}

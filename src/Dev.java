package ooptema;

public class Dev extends Employee {
	public Dev(String name, String position, double tenure, double salary) {
		super(name, position, tenure, salary);
		
		this.tenureBonusThreshold = 5.0;
		this.tenureBonusFactor = 1.05;
		
		this.computeSalaryByTenure();
	}

	public Dev(String name, String position, double tenure) {
		this(name, position, tenure, 2500);
	}
}

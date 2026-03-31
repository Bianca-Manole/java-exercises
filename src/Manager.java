package ooptema;

public class Manager extends Employee {
	public Manager(String name, String position, double tenure, double salary) {
		super(name, position, tenure, salary);
		
		this.tenureBonusThreshold = 5.0;
		this.tenureBonusFactor = 1.1;
		
		this.computeSalaryByTenure();
	}

	public Manager(String name, String position, double tenure) {
		this(name, position, tenure, 3000);
	}
}

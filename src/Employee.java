package ooptema;

public class Employee {
	private String name;
	private String position;
	private double tenure;
	private double salary;
	protected double tenureBonusThreshold = 0.0;
	protected double tenureBonusFactor = 0.0;

	public Employee(String name, String position, double tenure, double salary) {
		this.name = name;
		this.position = position;
		this.tenure = tenure;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getSalary() {
		return salary; 
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void computeSalaryByTenure() {
		if (this.tenure > this.tenureBonusThreshold) {
			this.salary *= this.tenureBonusFactor;
		}
	}
}

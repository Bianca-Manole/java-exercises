package recap;

public class Teacher extends Person {
	
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	
	@Override
	public void introduce() {
		System.out.println("Hello, my name is " + this.name + " and I am a teacher");
	}

}

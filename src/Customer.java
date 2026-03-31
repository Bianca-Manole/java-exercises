package recap;

public class Customer {

	protected String name;
	protected String email;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}

package recap;

public class Order {
	
	protected String productName;
	protected int quantity;
	protected Customer customer;
	
	public Order(String productName, int quantity, Customer customer) {
		this.productName = productName;
		this.quantity = quantity;
		this.customer = customer;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	

}

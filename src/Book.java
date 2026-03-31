package ooptema;

public class Book {
	private String name;
	private int year;
	private double price;
	private Author author;
	
	public Book (String name, int year, double price, Author author) {
		this.name = name;
		this.year = year;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String toString() {
		return "Book name: " + getName() +
				", Published in: " + getYear() +
				", with the price of: " + getPrice() + " RON" +
				", written by: " + getAuthor().getName() +
				", who can be contacted at: " + getAuthor().getEmail();
	}

}

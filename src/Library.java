package ooptema;

public class Library {

	public static void main(String[] args) {
		Author author = new Author("Bianca", "bianca@gmail.com");
		Book book = new Book("QA Complete", 2026, 100, author);
		System.out.println(book.getName());

	}

}

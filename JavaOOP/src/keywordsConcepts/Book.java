package keywordsConcepts;

public class Book {

	// Constructor Chaining

	private String title;
	private String author;

	public Book(String title) {
		this(title, "Unknown Author"); // Calls the constructor with two parameters
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void displayInfo() {
		System.out.println("Title: " + this.title + ", Author: " + this.author);
	}

	public static void main(String[] args) {
		Book book = new Book("1984");
		book.displayInfo(); // Outputs: Title: 1984, Author: Unknown Author
	}
}

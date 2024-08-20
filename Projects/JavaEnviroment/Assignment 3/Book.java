public class Book {
	// setting private variables initially
	private String author;
	private String title;
	private String content;
	private int edition;

	// Constructor Method
	public Book(String t, String a, String c, int e) {
		author = a;
		title = t;
		content = c;
		edition = e;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public int getEdition() {
		return edition;
	}

	public int getPages() {
		int length = content.length();
		return length / 750;
	}

	public String toString() {
		return "Title: "+title+"\n"+"Author: "+author+"\n"+"Edition: "+edition;
		
	}

	public static void main(String[] args) {
		// For Debugging
	}

}
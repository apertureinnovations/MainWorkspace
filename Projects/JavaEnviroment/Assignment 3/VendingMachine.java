import java.util.*;

public class VendingMachine {

	// Attribute / variable init
	private List<Book> shelf;
	private double locationFactor;
	private int cassette;
	private int safe;
	private String password;
	private int shelfSize = 100;
	private List<Integer> denominations = Arrays.asList(1,2,5,10,20,50,100,200);

	// Constructor Method
	public VendingMachine(double locFactor, String pword) {
		locationFactor = locFactor;
		password = pword;
		cassette = 0;
		safe = 0;
		shelf = new ArrayList<>(shelfSize);
	}

	public int getCassette() {
		return cassette;
	}

	public void insertCoin(int coin) {
		if (denominations.contains(coin)) {
			
			cassette += coin;
			
		} else {
			
			throw new IllegalArgumentException("Not an accepted Denomination");
			
		}
	}

	public int cancel() {
		int temp = cassette;
		cassette = 0;
		return temp;
	}

	public void restock(List<Book> books, String pword) {
		if (Objects.equals(pword, password)) {

			shelf.addAll(books);

		} else {
			
			throw new InvalidPasswordException("Invalid Password");
		}
	}

	public int emptySafe(String pword) {
		if (Objects.equals(pword, password)) {

			int temp = safe;
			safe = 0;
			return temp;

		} else {
			
			throw new InvalidPasswordException("Invalid Password");
		}
	}

	public List<String> getCatalogue() {
		List<String> catalogue = new ArrayList<>(shelf.size());
		for (Book book : shelf) {
			catalogue.add(book.toString());
		}
		return catalogue;
	}
	
	public int getPrice(int index) {
		if (index < shelfSize && index >= 0) {

			double price = (shelf.get(index)).getPages() * locationFactor;
			return (int) price;

		} else {

			throw new IndexOutOfBoundsException("Index Error: Not in range.");

		}
	}

	public Book buyBook(int index) {
		if (index < shelfSize && index >= 0) {
			if (getPrice(index) > cassette) {
				throw new CassetteException("Not enough money in the cassette!");
			} else {
				safe += getPrice(index);
				cassette -= getPrice(index);
				return shelf.get(index);
			}	
		} else {
			throw new IndexOutOfBoundsException("Index Error: Not in range.");
		}
	}

	public static void main(String[] args) {
		// For Debugging
	}

}
/**
 * Book class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */
public class Book extends Item implements Rentable {
	//initialize vars
	private String genre;
	private int numberOfPages;
	private final static double RENTAL_PRICE = .99;

	//full constructor
	public Book(String name, double price, double rating, int quantity, String genre, int numberOfPages) {
		super();
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}
	
	//accessors and mutators
	public String getGenre() {
		return genre;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public double getRENTAL_PRICE() {
		return RENTAL_PRICE;
	}

	@Override
	public String toString() {
		return "Book [genre = " + genre + ", numberOfPages = " + numberOfPages + ", getGenre() = " + getGenre() + ", getNumberOfPages() = " + getNumberOfPages() + ", getRENTAL_PRICE() = " + getRENTAL_PRICE() + ", getQuantity() = " + getQuantity() + ", getRating() = " + getRating() + ", getName() = " + getName() + ", getPrice() = " + getPrice() + ", toString() = " + super.toString() + ", getClass() = " + getClass() + ", hashCode() = " + hashCode() + "]";
	}

	public static double getRentalPrice() {
		return RENTAL_PRICE;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
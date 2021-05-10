/**
 * Video class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */

public class Video extends StreamableProduct implements Rentable {
	//initialize vars
	private Genre genres;
	
	//full constructor
	public Video(String name, double price, double rating, double duration, boolean isIncludedWithPrime, int releaseYear, Genre genres) {
		super();
		this.genres = genres;
	}
	
	//accessors and mutators
	public Genre getGenres() {
		return genres;
	}
	public void setGenres(Genre genres) {
		this.genres = genres;
	}
	
	@Override
	public String toString() {
		return "Vide o [genres = " + genres + ", getGenres() = " + getGenres() + ", getDuration() = " + getDuration() + ", isIncludedWithPrime() = " + isIncludedWithPrime() + ", getReleaseYear() = " + getReleaseYear() + ", toString() = " + super.toString() + ", getRating() = " + getRating() + ", getName() = " + getName() + ", getPrice() = " + getPrice() + ", getClass() = " + getClass() + ", hashCode() = " + hashCode() + "]";
	}
	
	public double getRentalPrice() {
		if (isIncludedWithPrime()) {
			return 0;
		}
		return getPrice()/3;
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
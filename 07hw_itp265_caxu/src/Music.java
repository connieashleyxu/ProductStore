/**
 * Music class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */

public class Music extends StreamableProduct {
	//initialize vars
	private MusicGenre genres;
	
	//full constructor
	public Music(String name, double price, double rating, double duration, boolean isIncludedWithPrime, int releaseYear, MusicGenre genres) {
		super();
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Music [genres = " + genres + ", getDuration() = " + getDuration() + ", isIncludedWithPrime() = " + isIncludedWithPrime() + ", getReleaseYear() = " + getReleaseYear() + ", toString() = " + super.toString() + ", getRating() = " + getRating() + ", getName() = " + getName() + ", getPrice() = " + getPrice() + ", getClass() = " + getClass() + ", hashCode() = " + hashCode() + "]";
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
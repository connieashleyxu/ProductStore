/**
 * Stream the product class (src)
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */
public abstract class StreamableProduct extends Product {
	//initialize vars
	private double duration;
	private boolean isIncludedWithPrime;
	private int releaseYear;
	
	//accessors and mutators
	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public boolean isIncludedWithPrime() {
		return isIncludedWithPrime;
	}

	public void setIncludedWithPrime(boolean isIncludedWithPrime) {
		this.isIncludedWithPrime = isIncludedWithPrime;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "StreamableProduct [duration = " + duration + ", isIncludedWithPrime = " + isIncludedWithPrime
				+ ", releaseYear = " + releaseYear + "]";
	}
}
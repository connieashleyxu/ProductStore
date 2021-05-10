/**
 * Electronics class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */
public class Electronics extends Item {
	//initialize vars
	private String size;
	private String weight;

	//full constructor
	public Electronics(String name, double price, double rating, int quantity, String size, String weight) {
		super();
		this.size = size;
		this.weight = weight;
	}
	
	//accessors and mutators
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Electronics [size = " + size + ", weight = " + weight + "]";
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
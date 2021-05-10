/**
 * Games class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */
public class Games extends Item {
	//initialize vars
	private String description;
	
	//full constructor
	public Games(String name, double price, double rating, int quantity, String description) {
		super();
		this.description = description;
	}
	
	//getter and setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Games [description = " + description + "]";
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
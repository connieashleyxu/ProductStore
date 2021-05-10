/**
 * Item class
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */

public abstract class Item extends Product {
	//initialize vars
	private int quantity;
	
	//accessors and mutators
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}


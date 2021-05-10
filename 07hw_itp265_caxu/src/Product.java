import java.lang.Comparable;
/**
 * Product class (src)
 *
 * @author Connie Xu
 * @version Mar 30, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework 07
 *
 */

public abstract class Product implements Comparable<Object> { 
	//initialize vars
	private String name;
	private double price;
	private double rating;
	
	//accessors and mutators
	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}

	public double getPrice() {
		return price;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + price + ", rating = " + rating + "]";
	}
		
	public int compareTo(Product x) {
		double diff = this.getPrice() - x.getPrice();
		if (Math.abs(diff) <= .0001) {
			return 0;
		}
		else if (diff > 1) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	 public boolean equals(Object obj) {
		          
		 //check if object references --> same obj
		 if(this == obj)
			 return true;
		          
		 if(obj == null || obj.getClass()!= this.getClass())
			 return false; 
		          
		 Product product = (Product) obj;
		 
		 return (product.name == this.name && product.price == this.price && product.rating == this.rating);
	} 
}


package com.module4;

/**
 * The Shoe class is subclass for Product
 * @author Chaitanya
 *
 */
public class Shoe extends Product{

	private double size;
	
	public Shoe() {
		this.size=0;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product code:" + getCode() +  System.lineSeparator()+ "Description:" + getDescription() + System.lineSeparator()+"Price:$" + getPrice() + System.lineSeparator()+"Size:" + size;
		
	}
	
	
}

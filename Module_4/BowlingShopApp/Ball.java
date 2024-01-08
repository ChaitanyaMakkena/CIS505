package com.module4;

/**
 * The Ball class is subclass for Product
 * @author Chaitanya
 *
 */
public class Ball extends Product {

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	private String color;
	
	public Ball() {
		this.color="";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product code:" + getCode() +  System.lineSeparator()+ "Description:" + getDescription() + System.lineSeparator()+"Price:$" + getPrice() + System.lineSeparator()+"Color:" + color;
		
	}

	
}

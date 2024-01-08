package com.module4;

/**
 * The Bag class is subclass for Product
 * @author Chaitanya
 *
 */
public class Bag extends Product{

	private String type;
	
	public Bag() {
		this.type="";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product code:" + getCode() +  System.lineSeparator()+ "Description:" + getDescription() + System.lineSeparator()+"Price:$" + getPrice() + System.lineSeparator()+"Type:" + type;
		
	}
	
}

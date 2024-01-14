
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Transaction class is used to represent expense transaction
 *
 * @author chaitanya
 *
 */
public class Transaction {

	private String date;
	
	private String description;
	
	private double amount;
	
	public Transaction() {
		
		this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		this.description="";
		this.amount=0;
	}

	public Transaction(String date, String description, double amount) {
		super();
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TranactionDate:" + date +  System.lineSeparator()+ "Description:" + description + System.lineSeparator()+"Amount" + amount;
		
	}
	
	
}

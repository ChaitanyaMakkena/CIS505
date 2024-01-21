
public class Composer {

	private int id;
	private String name;
	private String genre;
	
	public Composer() {
		
		this.id=0;
		this.name="";
		this.genre="";
	}

	public Composer(int id, String name, String genre) {
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
				
		return "Id:" + id +  System.lineSeparator()+ "Name:" + name + System.lineSeparator()+"Genre: " + genre;
	}
	
}

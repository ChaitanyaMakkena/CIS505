
/**
 * 
 * @author chaitanya
 *
 *Sports Team class to addplayers and getplayers
 */
public class Team {

	
	private String teamName;

	private String[] players;
	
	private int playerCount;
	
	/**
	 * No arg constructor
	 * 
	 * initializing with default values
	 */
	public Team() {
		this.players = new String[20];
		this.playerCount =0;
	}
	
	/**
	 * 
	 * @param teamName
	 */
	public Team(String teamName) {
		this.players = new String[20];
		this.playerCount =0;
		this.teamName = teamName;
	}
	
	/**
	 * 
	 * @param player
	 */
	public void addPlayer(String player) {
		players[playerCount] = player;
		playerCount++;
	}
	
	/**
	 * 
	 * @return players
	 * 
	 * 
	 */
	public String[] getPlayers() {
		return players;
	}
	
	/**
	 * 
	 * @return playerCount
	 */
	public int getPlayerCount() {
		return playerCount;
	}
	
	/**
	 * 
	 * @return teamName
	 */
	public String getTeamName() {
		return teamName;
	}
}

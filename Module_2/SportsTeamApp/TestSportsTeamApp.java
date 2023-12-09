import java.util.Arrays;
import java.util.Scanner;

public class TestSportsTeamApp {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);  
		String repeat ="y"; 
		while(repeat.equalsIgnoreCase("y")) {
	    System.out.println("Welcome to the Sports Team App");
	    System.out.println("Enter a team name: ");
	 // Read user input
	    String teamName = myObj.nextLine();
	    System.out.println("Enter the players names:");
	
	    // Read user input
	    String[] players = myObj.nextLine().split(",");  
	    
	    //create instance of Team class with input team name
	    Team team = new Team(teamName);
	    for(int i=0; i<players.length; i++) {
	    	team.addPlayer(players[i]);
	    }
	    
	    System.out.println("--Team Summary--");
	    System.out.println("Number of players in team: "+team.getPlayerCount());
	    //get all players 
	    String[] getPlayerNames = team.getPlayers();
	    
	    //removing null values from array
	    getPlayerNames = Arrays.stream(getPlayerNames)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);  
	   System.out.println("players on team: "+String.join(",",getPlayerNames));
	   
	   System.out.println("Continue? (y/n):");
	   repeat = myObj.nextLine();
		}
	  
		}
	
}

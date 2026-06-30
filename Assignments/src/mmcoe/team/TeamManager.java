package mmcoe.team;

import java.util.ArrayList;


public class TeamManager {

	private ArrayList<Team> teams;

	public TeamManager() {

		teams = new ArrayList<>();

	}

	public void addTeam(Team t) {

		teams.add(t);

	}

	public Team retrieveTeam(int id) throws TeamNotFoundException {

		for (Team t : teams)

			if (t.getTeamId() == id)

				return t;

		throw new TeamNotFoundException("Team Not Found");

	}

	public void displayTeams() {

		for (Team t : teams) {

			System.out.println(t);

			t.displayPlayers();

			Billing b = new Billing();

			b.displayBill(t.getPlayers());

		}

	}

	public int getTotalTeams() {

		return teams.size();

	}

	public Team searchTeam(int id) throws TeamNotFoundException {

		return teams.stream()

				.filter(t -> t.getTeamId() == id)

				.findFirst()

				.orElseThrow(() -> new TeamNotFoundException("Team Not Found"));

	}
	public void searchTeamByName(String name) {

	    teams.stream()

	            .filter(t -> t.getTeamName().equalsIgnoreCase(name))

	            .forEach(System.out::println);

	}

	public void searchPlayer(String name) {

	    boolean found = teams.stream()
	            .flatMap(team -> team.getPlayers().stream())
	            .filter(p -> p.getPlayerName().equalsIgnoreCase(name))
	            .peek(System.out::println)
	            .findAny()
	            .isPresent();

	    if(!found)
	        System.out.println("Player Not Found");
	}
	public void searchRole(String role) {

	    teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .filter(p -> p.getRole().equalsIgnoreCase(role))

	            .forEach(System.out::println);

	}
	public void searchCostRange(double min,double max) {

	    teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .filter(p -> p.getCost()>=min &&
	                         p.getCost()<=max)

	            .forEach(System.out::println);

	}
	public void searchAgeRange(int min,int max) {

	    teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .filter(p -> p.getAge()>=min &&
	                         p.getAge()<=max)

	            .forEach(System.out::println);

	}
	public void displaySortedPlayers() {

	    teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .sorted((a,b)->Double.compare(b.getCost(), a.getCost()))

	            .forEach(System.out::println);

	}
	public void highestCostPlayer() {

	    teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .max((a,b)->Double.compare(a.getCost(), b.getCost()))

	            .ifPresent(System.out::println);

	}
	public void averageCost() {

	    double avg = teams.stream()

	            .flatMap(team -> team.getPlayers().stream())

	            .mapToDouble(Player::getCost)

	            .average()

	            .orElse(0);

	    System.out.println(avg);

	}
	public void countBatsmen(){

	    long count = teams.stream()

	            .flatMap(team->team.getPlayers().stream())

	            .filter(p->p.getRole().equalsIgnoreCase("Batsman"))

	            .count();

	    System.out.println("Total Batsmen = "+count);

	}

	public ArrayList<Team> getTeams() {

		return teams;

	}

}
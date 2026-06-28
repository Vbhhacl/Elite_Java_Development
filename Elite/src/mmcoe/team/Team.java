package mmcoe.team;

import java.util.ArrayList;

public class Team {

    private int teamId;
    private String teamName;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void searchPlayer(String name) {

        for (Player p : players) {
            if (p.getPlayerName().equalsIgnoreCase(name)) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("Player Not Found");
    }

    public void displayPlayers() {
        System.out.println("\nTeam : " + teamName);

        for (Player p : players)
            System.out.println(p);
    }

    public int getTotalPlayers() {
        return players.size();
    }

    @Override
    public String toString() {
        return "Team ID : " + teamId + "\nTeam Name : " + teamName;
    }
}
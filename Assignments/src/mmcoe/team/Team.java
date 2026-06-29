package mmcoe.team;

import java.util.ArrayList;

public class Team {

    private int teamId;
    private String teamName;

    private ArrayList<Player> players;

    public Team(int teamId, String teamName) {

        this.teamId = teamId;
        this.teamName = teamName;

        players = new ArrayList<Player>();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player p) throws DuplicatePlayerException {

        for(Player temp : players) {

            if(temp.getPlayerId()==p.getPlayerId())
                throw new DuplicatePlayerException("Player already exists");

        }

        players.add(p);

    }

    public void removePlayer(int id) throws PlayerNotFoundException {

        Player p = null;

        for(Player temp : players)

            if(temp.getPlayerId()==id)
                p=temp;

        if(p==null)
            throw new PlayerNotFoundException("Player Not Found");

        players.remove(p);

    }

    public Player retrievePlayer(String name) throws PlayerNotFoundException {

        for(Player p:players)

            if(p.getPlayerName().equalsIgnoreCase(name))
                return p;

        throw new PlayerNotFoundException("Player Not Found");

    }

    public void searchPlayer(String name) {

        try {

            Player p=retrievePlayer(name);

            System.out.println(p);

        }

        catch(Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void displayPlayers() {

        if(players.isEmpty()) {

            System.out.println("No Players");

            return;

        }

        for(Player p:players)

            System.out.println(p);

    }

    public int getTotalPlayers() {

        return players.size();

    }

    public ArrayList<Player> getPlayers(){

        return players;

    }

    public double getBilling(){

        Billing b=new Billing();

        return b.calculateBill(players);

    }

    @Override

    public String toString() {

        return "\nTeam ID : "+teamId+
                "\nTeam Name : "+teamName+
                "\nTotal Players : "+getTotalPlayers()+
                "\nTotal Billing : ₹"+getBilling();

    }

}
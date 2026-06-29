package mmcoe.team;

import java.util.ArrayList;

public class TeamManager {

    private ArrayList<Team> teams;

    public TeamManager() {

        teams=new ArrayList<>();

    }

    public void addTeam(Team t) {

        teams.add(t);

    }

    public Team retrieveTeam(int id) throws TeamNotFoundException {

        for(Team t:teams)

            if(t.getTeamId()==id)

                return t;

        throw new TeamNotFoundException("Team Not Found");

    }

    public void displayTeams() {

        for(Team t:teams) {

            System.out.println(t);

            t.displayPlayers();

            Billing b=new Billing();

            b.displayBill(t.getPlayers());

        }

    }

    public int getTotalTeams() {

        return teams.size();

    }

    public ArrayList<Team> getTeams(){

        return teams;

    }

}
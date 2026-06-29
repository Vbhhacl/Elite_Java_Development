package mmcoe.team;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTeam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Team> teams = new ArrayList<>();

        while (true) {

            System.out.println("\n1.Create Team");
            System.out.println("2.Add Player");
            System.out.println("3.Search Player");
            System.out.println("4.Display Team");
            System.out.println("5.Total Players");
            System.out.println("6.Team Billing");
            System.out.println("7.Exit");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter Team ID : ");
                int tid = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Team Name : ");
                String tname = sc.nextLine();

                teams.add(new Team(tid, tname));

                break;

            case 2:

                if (teams.isEmpty()) {
                    System.out.println("Create Team First");
                    break;
                }

                Team t = teams.get(0);

                System.out.print("Player ID : ");
                int pid = sc.nextInt();

                sc.nextLine();

                System.out.print("Player Name : ");
                String pname = sc.nextLine();

                System.out.print("Age : ");
                int age = sc.nextInt();

                System.out.print("Runs : ");
                int runs = sc.nextInt();

                t.addPlayer(new Player(pid, pname, age, runs));

                break;

            case 3:

                System.out.print("Enter Player Name : ");
                sc.nextLine();
                String search = sc.nextLine();

                for (Team team : teams)
                    team.searchPlayer(search);

                break;

            case 4:

                for (Team team : teams) {
                    System.out.println(team);
                    team.displayPlayers();
                }

                break;

            case 5:

                for (Team team : teams)
                    System.out.println("Total Players = " + team.getTotalPlayers());

                break;
                
            case 6:

                if (teams.isEmpty()) {
                    System.out.println("No Team Available");
                    break;
                }

                for (Team team : teams) {

                    Billing b = new Billing(team);

                    System.out.println("--------------------------------");
                    System.out.println("Team : " + team.getTeamName());
                    System.out.println("Players : " + team.getTotalPlayers());
                    System.out.println("Bill : ₹" + b.calculateBill());
                }

                break; 

            case 7:

                System.exit(0);
            }
        }
    }
}
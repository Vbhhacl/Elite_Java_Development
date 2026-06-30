package mmcoe.team;

import java.util.Scanner;

public class TestTeam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TeamManager manager = new TeamManager();

        while (true) {

         
            System.out.println("1. Create Team");
            System.out.println("2. Add Player");
            System.out.println("3. Remove Player");
            System.out.println("4. Search Player");
            System.out.println("5. Retrieve Team Information");
            System.out.println("6. Display All Teams");
            System.out.println("7. Total Teams");
            System.out.println("8. Exit");
            System.out.println("9. Load Teams From CSV");
            System.out.println("10. Search Team Name");
            System.out.println("11. Search Player");
            System.out.println("12. Search Role");
            System.out.println("13. Search Cost Range");
            System.out.println("14. Search Age Range");
            System.out.println("15. Highest Cost Player");
            System.out.println("16. Display Sorted Players");
            System.out.println("17. Average Billing");
            System.out.print("Enter Choice : ");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter Team ID : ");
                int tid = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Team Name : ");
                String tname = sc.nextLine();

                manager.addTeam(new Team(tid, tname));

                System.out.println("Team Created Successfully.");

                break;

            case 2:

                try {

                    System.out.print("Enter Team ID : ");
                    tid = sc.nextInt();

                    Team team = manager.retrieveTeam(tid);

                    System.out.print("Player ID : ");
                    int pid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Player Name : ");
                    String pname = sc.nextLine();

                    System.out.print("Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Role : ");
                    String role = sc.nextLine();

                    System.out.print("Player Cost : ");
                    double cost = sc.nextDouble();

                    Player p = new Player(pid, pname, age, role, cost);

                    team.addPlayer(p);

                    System.out.println("Player Added Successfully.");

                }

                catch (Exception e) {

                    System.out.println(e.getMessage());

                }

                break;

            case 3:

                try {

                    System.out.print("Enter Team ID : ");
                    tid = sc.nextInt();

                    Team team = manager.retrieveTeam(tid);

                    System.out.print("Enter Player ID : ");
                    int pid = sc.nextInt();

                    team.removePlayer(pid);

                    System.out.println("Player Removed Successfully.");

                }

                catch (Exception e) {

                    System.out.println(e.getMessage());

                }

                break;

            case 4:

                try {

                    System.out.print("Enter Team ID : ");
                    tid = sc.nextInt();

                    Team team = manager.retrieveTeam(tid);

                    sc.nextLine();

                    System.out.print("Enter Player Name : ");
                    String search = sc.nextLine();

                    Player p = team.retrievePlayer(search);

                    System.out.println("\nPlayer Found");
                    System.out.println(p);

                }

                catch (Exception e) {

                    System.out.println(e.getMessage());

                }

                break;

            case 5:

                try {

                    System.out.print("Enter Team ID : ");
                    tid = sc.nextInt();

                    Team team = manager.retrieveTeam(tid);

                    System.out.println("\nTEAM DETAILS");
                    System.out.println(team);

                    System.out.println("\nPlayers");
                

                    team.displayPlayers();

                    Billing b = new Billing();

                    System.out.println();
                    b.displayBill(team.getPlayers());

                }

                catch (Exception e) {

                    System.out.println(e.getMessage());

                }

                break;

            case 6:

                manager.displayTeams();

                break;

            case 7:

                System.out.println("Total Teams : " + manager.getTotalTeams());

                break;

            case 8:

                System.out.println("Thank You");
                sc.close();
                System.exit(0);
                
            case 9:

            	manager = CSVLoader.load("src/mmcoe/team/teams.csv");

                System.out.println("Teams Loaded Successfully.");

                break;
                
            case 10:

                sc.nextLine();

                System.out.print("Enter Team Name : ");

                String teamName = sc.nextLine();

                manager.searchTeamByName(teamName);

                break;
                
            case 11:

                sc.nextLine();

                System.out.print("Enter Player Name : ");

                String pname = sc.nextLine();

                manager.searchPlayer(pname);

                break;
                
                
            case 12:

                sc.nextLine();

                System.out.print("Enter Role : ");

                String role = sc.nextLine();

                manager.searchRole(role);

                break;
                
            case 13:

                System.out.print("Minimum Cost : ");

                double min = sc.nextDouble();

                System.out.print("Maximum Cost : ");

                double max = sc.nextDouble();

                manager.searchCostRange(min,max);

                break;
                
            case 14:

                System.out.print("Minimum Age : ");

                int minAge = sc.nextInt();

                System.out.print("Maximum Age : ");

                int maxAge = sc.nextInt();

                manager.searchAgeRange(minAge,maxAge);

                break;
                
            case 15:

                manager.highestCostPlayer();

                break;
                
                
            case 16:

                manager.displaySortedPlayers();

                break;
                
            case 17:

                manager.averageCost();

                break;    

            default:

                System.out.println("Invalid Choice");

            }

        }

    }

}
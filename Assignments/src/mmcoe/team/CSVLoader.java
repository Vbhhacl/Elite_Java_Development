package mmcoe.team;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class CSVLoader {

    public static TeamManager load(String fileName) {

        TeamManager manager = new TeamManager();

        HashMap<Integer, Team> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            br.readLine(); // Skip Header

            String line;

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                int tid = Integer.parseInt(data[0]);
                String tname = data[1];

                int pid = Integer.parseInt(data[2]);
                String pname = data[3];
                int age = Integer.parseInt(data[4]);
                String role = data[5];
                double cost = Double.parseDouble(data[6]);

                Team team;

                if (map.containsKey(tid)) {
                    team = map.get(tid);
                } else {
                    team = new Team(tid, tname);
                    manager.addTeam(team);
                    map.put(tid, team);
                }

                team.addPlayer(new Player(pid, pname, age, role, cost));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return manager;

    }

}
package mmcoe.team;

import java.util.ArrayList;

public class Billing {

    public double calculateBill(ArrayList<Player> players) {

        double total = 0;

        for(Player p : players)
            total += p.getCost();

        return total;
    }

    public void displayBill(ArrayList<Player> players) {

        double total = 0;

        System.out.println("PLAYER BILL");

        for(Player p : players) {

            System.out.printf("%-20s ₹%.2f\n",
                    p.getPlayerName(),
                    p.getCost());

            total += p.getCost();
        }


        System.out.println("Total Billing : ₹" + total);
    }

}
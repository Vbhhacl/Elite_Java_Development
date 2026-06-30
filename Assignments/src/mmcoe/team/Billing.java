package mmcoe.team;

import java.util.ArrayList;

public class Billing {

    public double calculateBill(ArrayList<Player> players) {

        return players.stream()
                .mapToDouble(Player::getCost)
                .sum();
    }

    public void displayBill(ArrayList<Player> players) {

        System.out.println("PLAYER BILL");

        players.forEach(p ->
                System.out.printf("%-20s ₹%.2f%n",
                        p.getPlayerName(),
                        p.getCost()));

        double total = players.stream()
                .mapToDouble(Player::getCost)
                .sum();

        System.out.println("Total Billing : ₹" + total);
    }
}
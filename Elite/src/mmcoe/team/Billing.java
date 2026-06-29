package mmcoe.team;

public class Billing {

    private Team team;
    private final int PLAYER_FEE = 1000;

    public Billing(Team team) {
        this.team = team;
    }

    public double calculateBill() {
        return team.getTotalPlayers() * PLAYER_FEE;
    }
}
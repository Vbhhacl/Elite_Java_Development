package mmcoe.team;

public class Player {

    private int playerId;
    private String playerName;
    private int age;
    private String role;
    private double cost;

    public Player(int playerId, String playerName, int age, String role, double cost) {

        if(age < 15 || age > 60)
            throw new IllegalArgumentException("Invalid Age");

        if(cost < 0)
            throw new IllegalArgumentException("Invalid Cost");

        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.role = role;
        this.cost = cost;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {

        return "\nPlayer ID : " + playerId +
               "\nName      : " + playerName +
               "\nAge       : " + age +
               "\nRole      : " + role +
               "\nCost      : ₹" + cost;
    }

}
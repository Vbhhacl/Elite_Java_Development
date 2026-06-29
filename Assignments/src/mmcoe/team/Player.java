package mmcoe.team;

public class Player {
    private int playerId;
    private String playerName;
    private int age;
    private int runs;

    public Player(int playerId, String playerName, int age, int runs) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.runs = runs;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player ID : " + playerId +
               "\nName : " + playerName +
               "\nAge : " + age +
               "\nRuns : " + runs;
    }
}
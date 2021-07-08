package model;

public class Player {
    int id;
    String playerName;
    int prevRollValue;
    int  score;
    boolean isSkip;

    public Player(int id, String playerName) {
        this.id = id;
        this.playerName = playerName;
        this.isSkip = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPrevRollValue() {
        return prevRollValue;
    }

    public void setPrevRollValue(int prevRollValue) {
        this.prevRollValue = prevRollValue;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isSkip() {
        return isSkip;
    }

    public void setSkip(boolean skip) {
        isSkip = skip;
    }
}

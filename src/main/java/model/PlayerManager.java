package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerManager {
    private Map<String, Player> playerMap;
    List<Player> players;
    List<Player> targetCompletedPlayers;

    public PlayerManager() {
        this.playerMap = new HashMap<>();
        this.players = new ArrayList<>();
        this.targetCompletedPlayers = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        playerMap.put(player.getPlayerName(), player);
        players.add(player);
    }

    public Map<String, Player> getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getTargetCompletedPlayers() {
        return targetCompletedPlayers;
    }

    public void setTargetCompletedPlayers(List<Player> targetCompletedPlayers) {
        this.targetCompletedPlayers = targetCompletedPlayers;
    }
}

package model;

import java.util.Random;

public class Application {
    int numberOfPlayers;
    int winningTarget;
    private PlayerManager playerManager;
    private GameService gameService;


    public Application(int numberOfPlayers, int winningTarget) {
        this.numberOfPlayers = numberOfPlayers;
        this.winningTarget = winningTarget;
        this.playerManager = new PlayerManager();
        this.gameService = new GameService();
    }

    public void add_player(int id, String playerName) {
        Player player = new Player(id, playerName);
    }

    public void start_game(int playerCount, int target) {
        Random random = new Random();
        int startPlayer = random.nextInt(playerCount);
        gameService.startGame(playerManager, startPlayer, target);
    }
}

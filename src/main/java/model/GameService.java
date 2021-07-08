package model;

import java.util.Scanner;

public class GameService {
    private DiceService diceService;

    public GameService() {
        this.diceService = new DiceService();
    }
// core logic incomplete for successice 6s just wrote skeleton
    public void startGame(PlayerManager playerManager, int startPlayer, int target) {

        while(!playerManager.players.isEmpty()) {

            Player player = playerManager.getPlayers().get(startPlayer);
            if(player.isSkip == true) {
                System.out.println(player.getPlayerName() + "is skipped due to penalty");
                startPlayer = (startPlayer+1)%playerManager.getPlayers().size();
                continue;
            }

            System.out.println(player.getPlayerName() + "its your\n" +
                    "turn (press ‘r’ to roll the dice)");

            Scanner sc = new Scanner(System.in);
            String c = sc.nextLine();
            if(c == "r") {
                int rolledValue = diceService.throwDice();
                if(player.prevRollValue == 1 &&  rolledValue == 1) {
                    int value = player.getScore()+rolledValue;
                    player.setScore(value);
                    player.setSkip(true);

                }
            }
            else {
                System.out.println(" please enter correct character to roll a dice");
            }

            if(isWin(player, playerManager, target)) {
               startPlayer =  (startPlayer)%playerManager.getPlayers().size();
            }
            else {
                startPlayer = (startPlayer+1)%playerManager.getPlayers().size();

            }

        }

    }

    public boolean isWin(Player player, PlayerManager playerManager, int target) {
        if(player.getScore() >= target) {
            Player player1 = playerManager.getPlayers().get(player.id);
            playerManager.getPlayers().remove(player.id);
            playerManager.targetCompletedPlayers.add(player1);

        }

    }
}

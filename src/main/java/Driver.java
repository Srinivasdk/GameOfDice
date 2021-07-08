import model.Application;
import model.Player;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide number of players");
        int n = sc.nextInt();
        System.out.println("please provide target score");
        int m = sc.nextInt();
        Application application = new Application(m , n);

        for(int i = 0; i< n ; i++) {
            String playerName = "Player-" + i;
            application.add_player(i ,playerName);
        }

        application.start_game(m, n);
    }

}

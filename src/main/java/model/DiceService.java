package model;

import java.util.Random;

public class DiceService {
    public int throwDice() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}

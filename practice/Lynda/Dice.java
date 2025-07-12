package practice.Lynda;

import java.util.Random;

/**
 * Created by tr17548 on 10/09/2018.
 */
public class Dice {
    Random rand;

    public Dice() {
        this.rand = new Random();
    }

    public int roll() {
        int currentRoll = this.rand.nextInt(6) + 1;
        return currentRoll;
    }
}

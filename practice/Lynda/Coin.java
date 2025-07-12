package practice.Lynda;

import java.util.Random;

/**
 * Created by tr17548 on 10/09/2018.
 */
public class Coin {
    public final static int HEADS = 0;
    public final static int TAILS = 1;

    private int faceUp;

    public Coin(int start) {
        faceUp = start;
    }

    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS) {
            return "TAILS";
        } else {
            return "INVALID";
        }

    }
}

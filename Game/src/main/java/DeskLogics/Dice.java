package DeskLogics;

import java.util.Random;

public class Dice {

    private static final int size = 6;
    private static final Random random= new Random();

    public int roll(){
        System.out.println("After roll " + (2+ random.nextInt(size) + random.nextInt(size)));
        return (2 + random.nextInt(size) + random.nextInt(size));
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.roll();
    }
}

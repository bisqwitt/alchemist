package util;

import cards.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {

    private static final Random random = new Random();

    public static PowerType randomPower() {
        int r = random.nextInt(4);
        return switch (r) {
            case 0 -> PowerType.Fire;
            case 1 -> PowerType.Water;
            case 2 -> PowerType.Air;
            case 3 -> PowerType.Earth;
            default -> null;
        };
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    public static List<Card> createDeck() {
        return Arrays.asList(
                new Gold(),
                new Copper(),
                new Iron(),
                new Silver(),
                new Lead(),
                new Quicksilver(),
                new Tin()
        );
    }

}

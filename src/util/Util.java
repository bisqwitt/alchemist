package util;

import powers.*;

import java.util.Random;

public class Util {

    private static Random random = new Random();

    public static Power randomPower() {
        int r = random.nextInt(4);
        return switch (r) {
            case 0 -> new Fire();
            case 1 -> new Water();
            case 2 -> new Air();
            case 3 -> new Earth();
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

}

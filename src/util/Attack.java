package util;

public class Attack {

    private final String name;
    private final int dmgAmount;

    public Attack(String name, int dmgAmount) {
        this.name = name;
        this.dmgAmount = dmgAmount;
    }

    public String getName() {
        return name;
    }

    public int getDmgAmount() {
        return dmgAmount;
    }


}

package util;

import powers.Power;

import java.util.List;

public class Attack {

    private String name;
    private int dmgAmount;

    private List<Power> powerUsage;

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

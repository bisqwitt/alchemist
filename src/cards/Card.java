package cards;

import util.Ability;
import util.Attack;
import util.Pair;
import gameboard.UI;

import java.util.ArrayList;

public abstract class Card {

    private final PowerType powerType;
    private final Pair<Class<? extends Card>> strongAgainst;
    private final Pair<Class<? extends Card>> weakAgainst;

    private char symbol;
    private final int maxHp;
    private int currentHp;

    private final Attack attack;
    private final Ability ability;

    private int powerOrbAmount;

    protected Card(PowerType powerType,
                   Pair<Class<? extends Card>> strongAgainst,
                   Pair<Class<? extends Card>> weakAgainst,
                   char symbol, int maxHp, Attack attack, Ability ability) {
        this.powerType = powerType;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.ability = ability;
        powerOrbAmount = 0;
    }

    public void attack(Card target) {
        if(powerOrbAmount == 0) {
            UI.writeln("Fail: No power orb");
            return;
        }
        powerOrbAmount--;

        int trueDmg = attack.getDmgAmount();
        if(getRelations().contains(target.getClass())) {
            if(getRelations().indexOf(target.getClass()) >= 2) {
                trueDmg -= 20;
                UI.writeln(getName() + " is weaker against " + target.getName() + "! (-20)");
            } else {
                trueDmg += 20;
                UI.writeln(getName() + " is stronger against " + target.getName() + "! (+20)");
            }
        }

        UI.writeln(getName() + " " + currentHp + "hp" + " attacks " + target.getName() + " " + target.currentHp + "hp (-" + trueDmg + ")");
        target.takeHit(trueDmg);
    }

    private void takeHit(int attackDmg) {
        this.currentHp -= attackDmg;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public Attack getAttack() {
        return attack;
    }

    public Ability getAbility() {
        return ability;
    }

    public String getName() {
        return getClass().getSimpleName() + " " + symbol;
    }

    public void addPowerOrb() {
        powerOrbAmount++;
    }

    public int getPowerOrbAmount() {
        return powerOrbAmount;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public ArrayList<Class<? extends Card>> getRelations() {
        ArrayList<Class<? extends Card>> list = new ArrayList<>();
        strongAgainst.both().forEach(list::add);
        weakAgainst.both().forEach(list::add);
        return list;
    }
}

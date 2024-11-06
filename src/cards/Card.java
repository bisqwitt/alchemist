package cards;

import planets.PlanetType;
import powers.Power;
import planets.Planet;
import util.Ability;
import util.Attack;
import util.Pair;
import util.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Card {

    private Planet planet;

    private int maxHp;
    private int currentHp;

    private Attack attack;
    private Ability ability;

    private ArrayList<Power> powerOrbs;

    protected Card(Planet planet, int maxHp, Attack attack, Ability ability) {
        this.planet = planet;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.ability = ability;
        powerOrbs = new ArrayList<>();
    }

    public void attack(Card target) {
        if(powerOrbs.isEmpty()) {
            UI.writeln("Fail: No power orb");
            return;
        }
        powerOrbs.removeFirst();

        int trueDmg = attack.getDmgAmount();
        if(planet.getRelations().contains(target.getPlanet().getType())) {
            if(planet.getRelations().indexOf(target.getPlanet().getType()) >= 2) {
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

    public Planet getPlanet() {
        return planet;
    }

    public String getName() {
        return getClass().getSimpleName() + " " + getPlanet().getType().getSymbol();
    }

    public void addPowerOrb(Power powerOrb) {
        powerOrbs.add(powerOrb);
    }

    public ArrayList<Power> getPowerOrbs() {
        return powerOrbs;
    }

    public static List<Card> createDeck() {
        return Arrays.asList(
                new Apollo(),
                new Aphrodite(),
                new Ares(),
                new Artemis(),
                new Cronus(),
                new Hermes(),
                new Zeus()
        );
    }
}

package cards;

import planets.Planet;
import util.Ability;
import util.Attack;

import java.util.ArrayList;
import java.util.List;

public abstract class Card {

    private Planet planet;

    private int maxHp;
    private int currentHp = 0;

    private Attack attack;
    private Ability ability;

    protected Card(Planet planet, int maxHp, Attack attack, Ability ability) {
        this.planet = planet;
        this.maxHp = maxHp;
        this.attack = attack;
        this.ability = ability;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;
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

    public static ArrayList<Card> createDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Apollo());
        cards.add(new Aphrodite());
        cards.add(new Ares());
        cards.add(new Artemis());
        cards.add(new Cronus());
        cards.add(new Hermes());
        cards.add(new Zeus());
        return cards;
    }
}

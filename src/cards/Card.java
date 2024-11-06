package cards;

import element.Element;
import planets.Planet;
import util.Ability;
import util.Attack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Card {

    private Planet planet;

    private int maxHp;
    private int currentHp = 0;

    private Attack attack;
    private Ability ability;

    private ArrayList<Element> elements;

    protected Card(Planet planet, int maxHp, Attack attack, Ability ability) {
        this.planet = planet;
        this.maxHp = maxHp;
        this.attack = attack;
        this.ability = ability;
        elements = new ArrayList<>();
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

    public Planet getPlanet() {
        return planet;
    }

    public String getName() {
        return getClass().getSimpleName() + " " + getPlanet().getType().getSymbol();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public ArrayList<Element> getElements() {
        return elements;
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

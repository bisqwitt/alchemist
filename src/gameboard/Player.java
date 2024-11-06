package gameboard;

import cards.Card;
import powers.Power;
import util.Pair;
import util.Util;
import util.UI;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private String name;

    private int points;
    private ArrayList<Card> deck;

    private Card activeCard;
    private ArrayList<Card> table;
    private ArrayList<Card> hand;

    private Pair<Power> nextElements;

    public Player(String name) {
        this.name = name;
        init();
    }

    public void init() {
        points = 0;
        deck = new ArrayList<>(Card.createDeck());
        Collections.shuffle(deck);

        activeCard = null;
        table = new ArrayList<>();
        hand = new ArrayList<>();
    }

    public void drawCards(int amount) {
        if(deck.isEmpty()) {
            deck = new ArrayList<>(Card.createDeck());
        }
        for (int i = 0; i < amount; i++) {
            Card card = deck.removeFirst();
            hand.add(card);
            UI.writeln(name + " draws: " + card.getName() + " - " + card.getPlanet().getPowerType().getSymbol());
        }
    }

    public boolean placeCard() {
        if(hand.isEmpty() || table.size() == 3) {
            UI.writeln("Fail: No Cards");
            return false;
        }
        table.add(hand.remove(UI.selectCardFromList(hand)));
        return true;
    }

    public boolean switchActiveCard(int cardIndex) {
        Card card = activeCard;
        table.add(card);
        activeCard = table.remove(cardIndex);
        return true;
    }

    public boolean placeElement() {
        if(nextElements.first() == null) {
            UI.writeln("Fail: Already used");
            return false;
        }
        int response = UI.selectCardFromList(activeCard, table);
        Card target = response == 0 ? activeCard : table.get(response -1);

        if(!target.getPlanet().getPowerType().getSymbol().equals(nextElements.first().getSymbol())) {
            UI.writeln("Fail: Power type doesn't match " + target.getName() + " - " + target.getPlanet().getPowerType().getSymbol());
            return false;
        }

        target.addPowerOrb(nextElements.first());
        nextElements = new Pair<>(null, nextElements.second());
        return true;
    }

    public void cycleElements() {
        Power e1 = nextElements == null ? Util.randomPower() : nextElements.second();
        Power e2 = Util.randomPower();
        nextElements = new Pair<>(e1, e2);
    }

    public void activeDeath() {
        UI.writeln(getName() + "'s " + activeCard.getName() + " has died. - Replace with");
        activeCard = table.remove(UI.selectCardFromList(table));
    }

    public void setActiveCard(Card activeCard) {
        this.activeCard = activeCard;
    }

    public int getPoints() {
        return points;
    }

    public void gainPoint() {
        points++;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getTable() {
        return table;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getActiveCard() {
        return activeCard;
    }

    public Pair<Power> getNextElements() {
        return nextElements;
    }
}

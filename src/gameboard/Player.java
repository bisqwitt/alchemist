package gameboard;

import cards.Card;
import element.Element;
import util.Pair;
import util.Util;
import util.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {

    private String name;

    private int points;
    private ArrayList<Card> deck;

    private Card activeCard;
    private ArrayList<Card> table;
    private ArrayList<Card> hand;

    private Pair<Element> nextElements;

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
        for (int i = 0; i < amount; i++) {
            Card card = deck.removeFirst();
            hand.add(card);
            //UI.writeln(name + " drew " + card.getName() + "!");
        }
    }

    public void placeInitialCard() {
        UI.writeln(name + ": Select your First active Card.");
        //UI.visualizeHand(hand);
        activeCard = hand.remove(UI.selectCardFromList(hand));
    }

    public boolean placeCard() {
        if(hand.isEmpty() || table.size() == 3) {
            UI.writeln("Fail: No Cards");
            return false;
        }
        table.add(hand.remove(UI.selectCardFromList(hand)));
        return true;
    }

    public boolean placeElement() {
        if(nextElements.first() == null) {
            UI.writeln("Fail: Already used");
            return false;
        }
        int response = UI.selectCardFromList(activeCard, table);
        (response == 0 ? activeCard : table.get(response -1)).addElement(nextElements.first());
        nextElements = new Pair<>(null, nextElements.second());
        return true;
    }

    public void cycleElements() {
        Element e1 = nextElements == null ? Util.randomElement() : nextElements.second();
        Element e2 = Util.randomElement();
        nextElements = new Pair<>(e1, e2);
    }

    public int getPoints() {
        return points;
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

    public Pair<Element> getNextElements() {
        return nextElements;
    }
}

package gameboard;

import cards.Card;
import util.UI;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private int points;
    private ArrayList<Card> deck;

    private Card active;
    private ArrayList<Card> table;
    private ArrayList<Card> hand;

    public Player() {
        init();
    }

    public void init() {
        points = 0;
        deck = Card.createDeck();
        Collections.shuffle(deck);

        active = null;
        hand = new ArrayList<>();
        table = new ArrayList<>();
    }

    public void drawCards(int amount) {
        for (int i = 0; i < amount; i++) {
            hand.add(deck.removeFirst());
        }
    }

    public void placeFirstCard() {
        active = hand.remove(UI.pickCardByIndex(hand));
    }

    public int getPoints() {
        return points;
    }
}

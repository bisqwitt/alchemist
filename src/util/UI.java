package util;

import cards.Card;
import gameboard.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UI {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int selectCardFromList(List<Card> selection) {
        selection.forEach(card -> write(card.getName() + " (" + selection.indexOf(card) + ") "));
        write(": ");

        String input = readln();
        if(Util.isInteger(input) && Integer.parseInt(input) < selection.size() && Integer.parseInt(input) >= 0) { //TODO UGLY
            return Integer.parseInt(input);
        }
        writeln("Invalid input");
        return selectCardFromList(selection);
    }

    // 0 if Obj
    // else int -1 for index
    public static int selectCardFromList(Card selectionObj, List<Card> selectionList) {
        ArrayList<Card> selection = new ArrayList<>(Arrays.asList(selectionObj));
        selection.addAll(selectionList);
        return selectCardFromList(selection);
    }

    //0: end turn, 1: place card, 2: place element
    public static int selectTurnAction() {
        UI.write("Place element (2) | Place card (1) | End turn (0) : ");
        String input = readln();

        if(Util.isInteger(input) && Arrays.asList(0,1,2,4).contains(Integer.parseInt(input))) {
            return Integer.parseInt(input);
        }
        writeln("Invalid input");
        return selectTurnAction();
    }

    public static String selectPlayerName(String player) {
        writeln(player + ": Enter your name.");
        return readln();
    }

    public static void writeln(String text) {
        System.out.println(text);
    }

    public static void write(String text) {
        System.out.print(text);
    }

    public static void visualizeHand(Player player) {
        write("Hand: ");
        visualizeCards(player.getHand(), false);
        writeln("\t\t\t\t\tNext elements: " + (player.getNextElements().first() != null ? player.getNextElements().first().getName() : "_") + " / " + player.getNextElements().second().getName());
    }

    public static void visualizeBoard(Pair<Player> players) {
        writeln(" ");
        visualizeCards(players.first().getTable(), true);
        write("\t\t\t");
        visualizeCards(Arrays.asList(players.first().getActiveCard()), true);

        writeln("-- -- -- -- -- -- -- -- -- -- -- -- -- -- --");

        write("\t\t\t");
        visualizeCards(Arrays.asList(players.second().getActiveCard()), true);
        visualizeCards(players.second().getTable(), true);
        writeln(" ");
    }

    private static void visualizeCards(List<Card> cards, boolean showElements) {
        cards.forEach(card -> {
            write("[" + card.getName());
            if(showElements && !card.getElements().isEmpty()) {
                write(" | ");
                card.getElements().forEach(element -> write(element.getSymbol()));
            }
            write("]");
        });
        writeln("");
    }

    private static String readln() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

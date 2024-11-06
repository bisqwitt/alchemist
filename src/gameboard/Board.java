package gameboard;

import util.Pair;
import util.UI;

public class Board {

    Pair<Player> players;

    public void playGame() {
        //players = new Pair<>(new Player(UI.selectPlayerName("Player 1")), new Player(UI.selectPlayerName("Player 2")));
        players = new Pair<>(new Player("P1"), new Player("P2"));
        UI.writeln("GAME START");
        players.both().forEach(player -> player.drawCards(3));
        players.both().forEach(Player::placeInitialCard);
        while(!playerReachedThreePoints()) {
            players.both().forEach(this::playTurn);
            simulateTurn();
        }
    }

    private boolean playerReachedThreePoints() {
        return players.both().anyMatch(player -> player.getPoints() == 3);
    }

    private void playTurn(Player player) {
        UI.writeln(" ");
        UI.writeln(player.getName() + "'s TURN");
        player.cycleElements();

        UI.visualizeBoard(players);
        UI.visualizeHand(player);

        boolean endTurn = false;
        UI.writeln(" ");
        UI.writeln(player.getName() + "'s ACTIONS:");
        while(!endTurn) {
            int input = UI.selectTurnAction();
            if(input == 0) {
                endTurn = true;
            } else {
                if (input == 1 ? player.placeCard() : player.placeElement()) {
                    UI.visualizeBoard(players);
                    UI.visualizeHand(player);
                }
            }
        }
    }

    private void simulateTurn() {

    }



}

package gameboard;

import util.Pair;
import util.UI;
import util.Util;

public class Board {

    Pair<Player> players;

    public void playGame() {
        //players = new Pair<>(new Player(UI.selectPlayerName("Player 1")), new Player(UI.selectPlayerName("Player 2")));
        players = new Pair<>(new Player("P1"), new Player("P2"));
        UI.writeln(" ");
        UI.writeln("GAME START");

        players.both().forEach(player -> {
            UI.writeln(" ");
            player.drawCards(3);
        });

        players.both().forEach(player -> player.setActiveCard(player.getHand().removeFirst()));
        while(!playerReachedThreePoints()) {
            players.both().forEach(this::playTurn);
        }
    }

    private boolean playerReachedThreePoints() {
        return players.both().anyMatch(player -> player.getPoints() == 3);
    }

    private void playTurn(Player player) {
        UI.writeln(" ");
        UI.writeln(player.getName() + "'s TURN");

        player.cycleElements();
        player.drawCards(1);

        UI.visualizeBoard(players);
        UI.visualizeHand(player);

        UI.writeln(" ");
        UI.writeln(player.getName() + ":");

        Player enemy = player.equals(players.first()) ? players.second() : players.first();
        while (!player.getHand().isEmpty() || player.getNextElements().first() != null) {
            boolean tableChanged = false;

            switch (UI.selectTurnAction()) {
                case 0: return;
                case 1: tableChanged = player.placeCard(); break;
                case 2: tableChanged = player.placeElement(); break;
                case 3: player.getActiveCard().attack(enemy.getActiveCard()); return;
                case 4: tableChanged = player.switchActiveCard(UI.selectCardFromList(player.getTable())); break;
            }
            if (tableChanged) {
                UI.visualizeBoard(players);
                UI.visualizeHand(player);
            }
        }

        if(enemy.getActiveCard().getCurrentHp() <= 0) {
            enemy.activeDeath();
            player.gainPoint();
        }
    }



}

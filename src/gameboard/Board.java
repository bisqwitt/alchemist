package gameboard;

import util.Pair;

public class Board {

    Pair<Player> players;

    public void playGame() {
        players = new Pair<>(new Player(), new Player());
        players.both().forEach(player -> player.drawCards(3));
        players.both().forEach(Player::placeFirstCard);
        while(!playerReachedThreePoints()) {

        }
    }

    private boolean playerReachedThreePoints() {
        return players.both().anyMatch(player -> player.getPoints() == 3);
    }



}

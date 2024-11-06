package cards;

import planets.Mars;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Ares extends Card {

    protected Ares() {
        super(
                new Mars(),
                70,
                new Attack("Iron Fist", 35),
                new Ability(15, "double dmg")
        );
    }
}

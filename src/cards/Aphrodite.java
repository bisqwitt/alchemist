package cards;

import planets.Sun;
import planets.Venus;
import util.Ability;
import util.Attack;

public class Aphrodite extends Card {

    protected Aphrodite() {
        super(
                new Venus(),
                50,
                new Attack("Enthrall", 20),
                new Ability(75, "heal 10")
        );
    }
}

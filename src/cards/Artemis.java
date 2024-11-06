package cards;

import planets.Moon;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Artemis extends Card {

    protected Artemis() {
        super(
                new Moon(),
                50,
                new Attack("Lunar Pulse", 25),
                new Ability(30, "sleep")
        );
    }
}

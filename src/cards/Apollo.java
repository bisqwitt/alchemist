package cards;

import planets.Planet;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Apollo extends Card {

    protected Apollo() {
        super(
                new Sun(),
                60,
                new Attack("Solar Flare", 30),
                new Ability(40, "Burn")
        );
    }
}

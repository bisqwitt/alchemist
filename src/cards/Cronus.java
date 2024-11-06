package cards;

import planets.Saturn;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Cronus extends Card {

    protected Cronus() {
        super(
                new Saturn(),
                75,
                new Attack("Gravity Pull", 25),
                new Ability(80, "cant escape")
        );
    }
}

package cards;

import planets.Mercury;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Hermes extends Card {

    protected Hermes() {
        super(
                new Mercury(),
                55,
                new Attack("Alchemidal Blade", 30),
                new Ability(30, "dodge")
        );
    }
}

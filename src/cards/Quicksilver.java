package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Quicksilver extends Card {

    public Quicksilver() {
        super(
                PowerType.Water,
                new Pair<>(Lead.class, Tin.class),
                new Pair<>(Gold.class, Copper.class),
                '☿',
                55,
                new Attack("Alchemidal Blade", 30),
                new Ability(30, "dodge")
        );
    }
}

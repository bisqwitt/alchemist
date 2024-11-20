package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Lead extends Card {

    public Lead() {
        super(
                PowerType.Earth,
                new Pair<>(Tin.class, Quicksilver.class),
                new Pair<>(Gold.class, Copper.class),
                '♄',
                75,
                new Attack("Gravity Pull", 25),
                new Ability(80, "cant escape")
        );
    }
}

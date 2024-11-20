package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Iron extends Card {

    public Iron() {
        super(
                PowerType.Fire,
                new Pair<>(Copper.class, Tin.class),
                new Pair<>(Silver.class, Gold.class),
                '♂',
                70,
                new Attack("Iron Fist", 35),
                new Ability(15, "double dmg")
        );
    }
}

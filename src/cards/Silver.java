package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Silver extends Card {

    public Silver() {
        super(
                PowerType.Water,
                new Pair<>(Iron.class, Copper.class),
                new Pair<>(Gold.class, Tin.class),
                '☽',
                50,
                new Attack("Lunar Pulse", 25),
                new Ability(30, "sleep")
        );
    }
}

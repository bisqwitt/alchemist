package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Gold extends Card {

    public Gold() {
        super(
                PowerType.Fire,
                new Pair<>(Lead.class, Iron.class),
                new Pair<>(Quicksilver.class, Silver.class),
                '☉',
                60,
                new Attack("Solar Flare", 30),
                new Ability(40, "Burn")
        );
    }
}

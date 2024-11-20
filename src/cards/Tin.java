package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Tin extends Card {

    public Tin() {
        super(
                PowerType.Air,
                new Pair<>(Gold.class, Silver.class),
                new Pair<>(Quicksilver.class, Lead.class),
                '♃',
                60,
                new Attack("Thunder Strike", 30),
                new Ability(50, "prevent enemy ability")
        );
    }
}

package cards;

import util.Ability;
import util.Attack;
import util.Pair;

public class Copper extends Card {

    public Copper() {
        super(
                PowerType.Air,
                new Pair<>(Quicksilver.class, Lead.class),
                new Pair<>(Iron.class, Silver.class),
                '♀',
                50,
                new Attack("Enthrall", 20),
                new Ability(75, "heal 10")
        );
    }
}

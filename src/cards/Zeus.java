package cards;

import planets.Jupiter;
import planets.Sun;
import util.Ability;
import util.Attack;

public class Zeus extends Card {

    protected Zeus() {
        super(
                new Jupiter(),
                60,
                new Attack("Thunder Strike", 30),
                new Ability(50, "prevent enemy ability")
        );
    }
}

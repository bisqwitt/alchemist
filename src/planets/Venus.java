package planets;

import powers.Air;
import util.Pair;

public class Venus extends Planet {

    public Venus() {
        super(
                PlanetType.VENUS,
                new Air(),
                new Pair<>(PlanetType.MERCURY, PlanetType.SATURN),
                new Pair<>(PlanetType.MARS, PlanetType.MOON));
    }

    @Override
    public String getDescription() {
        return "Associated with beauty, harmony, and connection. It would be strong against aggression or harshness but weak against elements that are elusive or intangible.";
    }
}

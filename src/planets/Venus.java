package planets;

import util.Pair;

public class Venus extends Planet {

    private final String DESCRIPTION = "Associated with beauty, harmony, and connection. It would be strong against aggression or harshness but weak against elements that are elusive or intangible.";

    public Venus() {
        super(
                PlanetType.VENUS,
                new Pair<>(PlanetType.MERCURY, PlanetType.SATURN),
                new Pair<>(PlanetType.MARS, PlanetType.MOON));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

package planets;

import util.Pair;

public class Saturn extends Planet {

    private final String DESCRIPTION = "Represents endurance, restriction, and darkness. It would have strength over mutable elements but be weak to elements associated with illumination or growth.";

    public Saturn() {
        super(
                PlanetType.SATURN,
                new Pair<>(PlanetType.JUPITER, PlanetType.MERCURY),
                new Pair<>(PlanetType.SUN, PlanetType.VENUS));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

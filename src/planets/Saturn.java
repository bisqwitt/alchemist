package planets;

import powers.Earth;
import util.Pair;

public class Saturn extends Planet {

    public Saturn() {
        super(
                PlanetType.SATURN,
                new Earth(),
                new Pair<>(PlanetType.JUPITER, PlanetType.MERCURY),
                new Pair<>(PlanetType.SUN, PlanetType.VENUS));
    }

    @Override
    public String getDescription() {
        return "Represents endurance, restriction, and darkness. It would have strength over mutable elements but be weak to elements associated with illumination or growth.";
    }
}

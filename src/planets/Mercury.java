package planets;

import util.Pair;

public class Mercury extends Planet {

    private final String DESCRIPTION = "Known for transformation, speed, and intellect. It could overpower heavy elements but may be weak against grounded or structured forces.";

    public Mercury() {
        super(
                PlanetType.MERCURY,
                new Pair<>(PlanetType.SATURN, PlanetType.JUPITER),
                new Pair<>(PlanetType.SUN, PlanetType.VENUS));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

package planets;

import powers.Water;
import util.Pair;

public class Mercury extends Planet {

    public Mercury() {
        super(
                PlanetType.MERCURY,
                new Water(),
                new Pair<>(PlanetType.SATURN, PlanetType.JUPITER),
                new Pair<>(PlanetType.SUN, PlanetType.VENUS));
    }

    @Override
    public String getDescription() {
        return "Known for transformation, speed, and intellect. It could overpower heavy elements but may be weak against grounded or structured forces.";
    }
}

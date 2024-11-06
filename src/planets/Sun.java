package planets;

import util.Pair;

public class Sun extends Planet {

    private final String DESCRIPTION = "Represents power, vitality, and healing. It would be strong against elements associated with impurity or darkness but vulnerable to elements with transformative properties (changeable or volatile)";

    public Sun() {
        super(
                PlanetType.SUN,
                new Pair<>(PlanetType.SATURN, PlanetType.MARS),
                new Pair<>(PlanetType.MERCURY, PlanetType.MOON));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

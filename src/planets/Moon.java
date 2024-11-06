package planets;

import util.Pair;

public class Moon extends Planet {

    private final String DESCRIPTION = "Represents reflection, adaptability, and calmness. It could be strong against rigid or violent elements but weak against energies tied to intense heat or aggression.";

    public Moon() {
        super(
                PlanetType.MOON,
                new Pair<>(PlanetType.MARS, PlanetType.VENUS),
                new Pair<>(PlanetType.SUN, PlanetType.JUPITER));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

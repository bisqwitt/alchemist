package planets;

import util.Pair;

public class Jupiter extends Planet {

    private final String DESCRIPTION = "Signifies wisdom, expansion, and fortune. Jupiter could counter elements symbolizing restriction or fear but might be weaker against elements that absorb or constrain.";

    public Jupiter() {
        super(
                PlanetType.JUPITER,
                new Pair<>(PlanetType.SUN, PlanetType.MOON),
                new Pair<>(PlanetType.MERCURY, PlanetType.SATURN));
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

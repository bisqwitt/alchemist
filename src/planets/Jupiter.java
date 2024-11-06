package planets;

import powers.Air;
import util.Pair;

public class Jupiter extends Planet {

    public Jupiter() {
        super(
                PlanetType.JUPITER,
                new Air(),
                new Pair<>(PlanetType.SUN, PlanetType.MOON),
                new Pair<>(PlanetType.MERCURY, PlanetType.SATURN));
    }

    @Override
    public String getDescription() {
        return "Signifies wisdom, expansion, and fortune. Jupiter could counter elements symbolizing restriction or fear but might be weaker against elements that absorb or constrain.";
    }
}

package planets;

import powers.Water;
import util.Pair;

public class Moon extends Planet {

    public Moon() {
        super(
                PlanetType.MOON,
                new Water(),
                new Pair<>(PlanetType.MARS, PlanetType.VENUS),
                new Pair<>(PlanetType.SUN, PlanetType.JUPITER));
    }

    @Override
    public String getDescription() {
        return "Represents reflection, adaptability, and calmness. It could be strong against rigid or violent elements but weak against energies tied to intense heat or aggression.";
    }
}

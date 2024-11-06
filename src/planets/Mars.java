package planets;

import powers.Fire;
import util.Pair;

public class Mars extends Planet {

    public Mars() {
        super(
                PlanetType.MARS,
                new Fire(),
                new Pair<>(PlanetType.VENUS, PlanetType.JUPITER),
                new Pair<>(PlanetType.MOON, PlanetType.SUN));
    }

    @Override
    public String getDescription() {
        return "Represents strength, aggression, and conflict. It would naturally be strong against soft or harmonious elements but weak against powerful or purifying forces.";
    }
}

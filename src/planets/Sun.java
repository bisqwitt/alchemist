package planets;

import powers.Fire;
import util.Pair;

public class Sun extends Planet {

    public Sun() {
        super(
                PlanetType.SUN,
                new Fire(),
                new Pair<>(PlanetType.SATURN, PlanetType.MARS),
                new Pair<>(PlanetType.MERCURY, PlanetType.MOON));
    }

    @Override
    public String getDescription() {
        return "Represents power, vitality, and healing. It would be strong against elements associated with impurity or darkness but vulnerable to elements with transformative properties (changeable or volatile)";
    }
}

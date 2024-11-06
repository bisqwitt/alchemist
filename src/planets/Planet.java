package planets;

import util.Pair;

public abstract class Planet {

    private PlanetType type;

    private Pair<PlanetType> strongAgainst;
    private Pair<PlanetType> weakAgainst;

    public Planet(PlanetType type, Pair<PlanetType> strongAgainst, Pair<PlanetType> weakAgainst) {
        this.type = type;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
    }

    public String getName() {
        return getClass().getSimpleName() + " (" + this.getType().getSymbol() + ")";
    }

    public PlanetType getType() {
        return type;
    }

    public abstract String getDescription();

    public Pair<PlanetType> getStrongAgainst() {
        return strongAgainst;
    }

    public Pair<PlanetType> getWeakAgainst() {
        return weakAgainst;
    }
}

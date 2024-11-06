package planets;

import powers.Power;
import util.Pair;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Planet {

    private PlanetType type;
    private Power powerType;

    private Pair<PlanetType> strongAgainst;
    private Pair<PlanetType> weakAgainst;

    public Planet(PlanetType type, Power powerType, Pair<PlanetType> strongAgainst, Pair<PlanetType> weakAgainst) {
        this.type = type;
        this.powerType = powerType;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
    }

    public ArrayList<PlanetType> getRelations() {
        ArrayList<PlanetType> list = new ArrayList<>();
        strongAgainst.both().forEach(list::add);
        weakAgainst.both().forEach(list::add);
        return list;
    }

    public String getName() {
        return getClass().getSimpleName() + " (" + this.getType().getSymbol() + ")";
    }

    public PlanetType getType() {
        return type;
    }

    public Power getPowerType() {
        return powerType;
    }

    public abstract String getDescription();

    public Pair<PlanetType> getStrongAgainst() {
        return strongAgainst;
    }

    public Pair<PlanetType> getWeakAgainst() {
        return weakAgainst;
    }
}

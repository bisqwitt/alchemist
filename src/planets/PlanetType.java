package planets;

public enum PlanetType {
    SUN("☉"),
    MOON("☽"),
    MERCURY("☿"),
    VENUS("♀"),
    MARS("♂"),
    JUPITER("♃"),
    SATURN("♄");

    private String symbol;

    PlanetType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {return symbol;}
}

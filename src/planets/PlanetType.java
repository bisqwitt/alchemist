package planets;

public enum PlanetType {
    SUN("Gold"),
    MOON("Silver"),
    MERCURY("Quicksilver"),
    VENUS("Copper"),
    MARS("Iron"),
    JUPITER("Tin"),
    SATURN("Lead");

    private String element;

    PlanetType(String element) {
        this.element = element;
    }

    public String getElement() {return element;}
}

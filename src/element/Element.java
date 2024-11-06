package element;

public abstract class Element {

    private String symbol;

    public Element(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return getClass().getSimpleName() + " " + symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

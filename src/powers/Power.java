package powers;

public abstract class Power {

    private String symbol;

    public Power(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return getClass().getSimpleName() + " " + symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

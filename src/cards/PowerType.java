package cards;

public enum PowerType {

    Fire('△'),
    Water('▽'),
    Air('▲'),
    Earth('▼');

    private final char symbol;

    PowerType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name() + " " + symbol;
    }
}

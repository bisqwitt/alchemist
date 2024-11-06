package util;

public class Ability {

    private int percentage;
    private String description;

    public Ability(int percentage, String description) {
        this.percentage = percentage;
        this.description = description;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getDescription() {
        return description;
    }
}

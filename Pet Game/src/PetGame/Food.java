package PetGame;

public class Food {

    private String name;
    private double price;
    private double hungerGain;
    private double heal;
    private String description;

    /**
     *
     * @param name
     * @param price
     * @param hungerGain
     * @param heal
     * @param description
     */
    public Food(String name, double price, double hungerGain, double heal, String description) {
        this.name = name;
        this.price = price;
        this.hungerGain = hungerGain;
        this.heal = heal;
        this.description = description;
    }

    @Override
    public String toString() {
        return ("Food Name: " + this.name + "\nPrice of Food Item: " + this.price + "\nFills: " + this.hungerGain + "\nHeals: " + this.heal + "\nDescription: " + this.description);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public double getCost() {
        return price;
    }

    /**
     * @return the hungerGain
     */
    public double getHunger() {
        return hungerGain;
    }

    /**
     * @return the heal
     */
    public double getHeal() {
        return heal;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}

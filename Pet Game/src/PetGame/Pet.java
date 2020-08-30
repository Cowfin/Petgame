package PetGame;

public class Pet {

    private String name;
    private double hungerDecay;
    private double energyDecay;
    private double happinessDecay;
    private double age;

    private double hungerLevel;
    private double energyLevel;
    private double healthLevel;
    private double happinessLevel;

    private int tickCounter = 0;

    // New pet
    public Pet(String name) {
        this.name = name;
        this.hungerLevel = 100;
        this.energyLevel = 100;
        this.healthLevel = 100;
        this.happinessLevel = 100;
        this.age = 0;
        this.energyDecay = 1;
        this.happinessDecay = 2;
        this.hungerDecay = 3;
    }

    // Load pet
    public Pet(String name, double hungerDecay, double energyDecay, double happinessDecay, double age, double hungerLevel, double energyLevel, double healthLevel, double happinessLevel) {
        this.name = name;
        this.energyDecay = energyDecay;
        this.hungerDecay = hungerDecay;
        this.happinessDecay = happinessDecay;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.energyLevel = energyLevel;
        this.healthLevel = healthLevel;
        this.happinessLevel = happinessLevel;
    }

    //Feed the pet
    public void Feed(Food food) {
        this.healthLevel += food.getHeal();
        this.hungerLevel += food.getHunger();
        if (this.getHungerLevel() > 100) {
            this.hungerLevel = 100;
        }
        if (this.getHealthLevel() > 100) {
            this.healthLevel = 100;
        }
    }

    //Play with pet
    public void Play(Toys toy) {
        this.happinessLevel += toy.getHappinessGain();
        this.energyLevel -= toy.getEnergyConsumption();
    }

    public void Rest() {
        this.energyLevel += 60;
        this.happinessLevel += 10;
        this.healthLevel += 10;
        if (this.getEnergyLevel() > 100) {
            this.energyLevel = 100;
        }
        if (this.getHappinessLevel() > 100) {
            this.happinessLevel = 100;
        }
        if (this.getHealthLevel() > 100) {
            this.healthLevel = 100;
        }
    }

    public void gametick() {
        this.hungerLevel -= this.getHungerDecay();
        this.energyLevel -= this.getEnergyDecay();
        this.happinessLevel -= this.getHappinessDecay();
        if (this.tickCounter > 12) {
            this.age++;
            this.tickCounter = 0;
        }
        if (this.getHungerLevel() < 10) {
            this.healthLevel -= 5;
        }
        this.tickCounter++;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param hungerDecay the hungerDecay to set
     */
    public void setHungerDecay(double hungerDecay) {
        this.hungerDecay = hungerDecay;
    }

    /**
     * @param energyDecay the energyDecay to set
     */
    public void setEnergyDecay(double energyDecay) {
        this.energyDecay = energyDecay;
    }

    /**
     * @param happinessDecay the happinessDecay to set
     */
    public void setHappinessDecay(double happinessDecay) {
        this.happinessDecay = happinessDecay;
    }

    /**
     * @return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @return the hungerLevel
     */
    public double getHungerLevel() {
        return hungerLevel;
    }

    /**
     * @return the energyLevel
     */
    public double getEnergyLevel() {
        return energyLevel;
    }

    /**
     * @return the healthLevel
     */
    public double getHealthLevel() {
        return healthLevel;
    }

    /**
     * @return the happinessLevel
     */
    public double getHappinessLevel() {
        return happinessLevel;
    }

    /**
     * @return the hungerDecay
     */
    public double getHungerDecay() {
        return hungerDecay;
    }

    /**
     * @return the energyDecay
     */
    public double getEnergyDecay() {
        return energyDecay;
    }

    /**
     * @return the happinessDecay
     */
    public double getHappinessDecay() {
        return happinessDecay;
    }
}

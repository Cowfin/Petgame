package PetGame;

class Apple extends Food {

    public Apple() {
        super("Apple", 5, 10, 2, "Keeps the doctors away.");
    }
}

class Steak extends Food {

    public Steak() {
        super("Steak", 15, 15, 10, "A nice steak.");
    }
}

class Spinach extends Food {

    public Spinach() {
        super("Spinach", 5, 5, 7.5, "Popeye's favourite!");
    }
}

class Honey extends Food {

    public Honey() {
        super("Honey", 10, 2.5, 10, "From the bees!");
    }
}

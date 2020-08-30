package PetGame;

class Ball extends Toys {

    public Ball() {
        super("Ball", 5, 10, 10, "Round and bouncy!");
    }
}

class Doll extends Toys {

    public Doll() {
        super("Doll", 10, 15, 7.5, "Squeaks when you squeeze it");
    }
}

class Frisbee extends Toys {

    public Frisbee() {
        super("Frisbee", 10, 10, 20, "Identified flying saucer");
    }
}

class FeatherToy extends Toys {

    public FeatherToy() {
        super("Feather Toy", 15, 15, 15, "description");
    }
}

package PetGame;

public class RunApplication {

    public static void main(String[] args) {
        Game game = new Game();
        Thread runGame = new Thread(game);
        runGame.start();
    }

}

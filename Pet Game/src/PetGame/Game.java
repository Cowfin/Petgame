package PetGame;

import static java.lang.Thread.sleep;
import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner scan;
    private Boolean gameAlive;

    public Game() {
        scan = new Scanner(System.in);
        gameAlive = true;

        int userIn;
        Boolean checker = true;

        while (checker) {
            System.out.println("1. Start new game");
            System.out.println("2. Load game from file");
            System.out.println("3. Exit");
            userIn = scan.nextInt();
            switch (userIn) {
                case (1):
                    this.player = newplayer();
                    checker = false;
                    break;
                case (2):
                    System.out.println("Please enter file name (ie. 'save.txt')");
                    String fileName = scan.nextLine();
                    LoadFile lf = new LoadFile();
                    this.player = lf.load(fileName);
                    if (this.player != null) {
                        checker = false;
                    }
                    break;
                case (3):
                    checker = false;
                    break;
            }
        }

        runGame();
    }

    private void runGame() {
        while (gameAlive) {
            player.getPet().gametick();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e);
            }
        }
    }

    public Player newplayer() {
        scan = new Scanner(System.in);

        String name = "";
        Boolean confirm = true;
        while (confirm) {
            System.out.println("Enter player name: ");
            name = scan.nextLine();
            System.out.println("Player name: " + name + "\nConfirm? (Y/N)");
            char conf = scan.next().toUpperCase().charAt(0);
            if (conf == 'Y') {
                confirm = false;
            }
        }
        return new Player(name);
    }

    public void feedPet() {
        scan = new Scanner(System.in);
        int userIn;
        Boolean checker = true;

        System.out.println("Balance: " + player.getMoney());
        System.out.println("Pick food item: ");
        System.out.println("0. BACK");
        System.out.println("1. Apple");
        System.out.println("2. Steak");
        System.out.println("3. Spinach");
        System.out.println("4. Honey");
        while (checker) {
            userIn = scan.nextInt();
            if (userIn >= 0 && (userIn <= 4)) {
                switch (userIn) {
                    case (0):
                        checker = false;
                        break;
                    case (1): {
                        Food apple = new Apple();
                        if ((this.player.getMoney() - apple.getCost()) >= 0) {
                            player.feed(apple);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (2): {
                        Food steak = new Steak();
                        if ((this.player.getMoney() - steak.getCost()) >= 0) {
                            player.feed(steak);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (3): {
                        Food spinach = new Spinach();
                        if ((this.player.getMoney() - spinach.getCost()) >= 0) {
                            player.feed(spinach);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (4): {
                        Food honey = new Honey();
                        if ((this.player.getMoney() - honey.getCost()) >= 0) {
                            player.feed(honey);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        }
    }

    public void playPet() {
        scan = new Scanner(System.in);
        int userIn;
        Boolean checker = true;

        System.out.println("Balance: " + player.getMoney());
        System.out.println("Pick food item: ");
        System.out.println("0. BACK");
        System.out.println("1. Ball");
        System.out.println("2. Doll");
        System.out.println("3. Frisbee");
        System.out.println("4. Feather Toy");
        while (checker) {
            userIn = scan.nextInt();
            if (userIn >= 0 && (userIn <= 4)) {
                switch (userIn) {
                    case (0):
                        checker = false;
                        break;
                    case (1): {
                        Toys ball = new Ball();
                        if ((this.player.getMoney() - ball.getCost()) >= 0) {
                            player.play(ball);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (2): {
                        Toys doll = new Doll();
                        if ((this.player.getMoney() - doll.getCost()) >= 0) {
                            player.play(doll);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (3): {
                        Toys frisbee = new Frisbee();
                        if ((this.player.getMoney() - frisbee.getCost()) >= 0) {
                            player.play(frisbee);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                    case (4): {
                        Toys featherToy = new FeatherToy();
                        if ((this.player.getMoney() - featherToy.getCost()) >= 0) {
                            player.play(featherToy);
                            checker = false;
                        } else {
                            System.out.println("Not enough money :(");
                        }
                    }
                    break;
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        }
    }

}

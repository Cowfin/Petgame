package PetGame;

import java.util.Scanner;

public class Player {

    private String username;
    private double money;
    protected Pet pet;

    // New player
    public Player(String name) {
        this.username = name;
        this.money = 100;
        this.pet = newPet();
    }

    // Load player
    public Player(String name, double money, Pet pet) {
        this.username = name;
        this.money = money;
        this.pet = pet;
    }

    public static Pet newPet() {
        Scanner scan = new Scanner(System.in);

        String name = "";
        Boolean confirm = true;
        Boolean confirm2 = true;

        while (confirm) {
            System.out.println("Enter a pet name: ");
            scan.next();
            name = scan.nextLine();
            while (confirm2) {
                System.out.println("Pet name: " + name + "\nConfirm? (Y/N)");
                char conf = scan.next().toUpperCase().charAt(0);
                if (conf == 'Y') {
                    confirm = false;
                    confirm2 = false;
                } else if (conf == 'N') {
                    confirm2 = false;
                }
            }
            confirm2 = true;
        }
        Pet pet = new Pet(name);
        return pet;
    }

    public void gametick() {
        pet.gametick();
        this.money += 1;
    }

    public void feed(Food food) {
        this.pet.Feed(food);
        this.money -= food.getCost();
    }

    public void play(Toys toy) {
        this.pet.Play(toy);
        this.money -= toy.getCost();
    }

    /**
     * @return the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

}

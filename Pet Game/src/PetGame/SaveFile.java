package PetGame;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public SaveFile(Player player) {
        try {
            FileWriter file = new FileWriter("SaveFile.txt");
            file.write("Player " + player.getUsername());
            file.write("Money " + player.getMoney());
            file.write("Name " + player.pet.getName());
            file.write("Age " + player.pet.getAge());
            file.write("Health " + player.pet.getHealthLevel());
            file.write("Hunger " + player.pet.getHungerLevel());
            file.write("Happiness " + player.pet.getHappinessLevel());
            file.write("Energy " + player.pet.getEnergyLevel());
            file.write("HungerDecay " + player.pet.getHungerDecay());
            file.write("HappinessDecay " + player.pet.getHappinessDecay());
            file.write("EnergyDecay " + player.pet.getEnergyDecay());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

import java.util.ArrayList;
import java.util.Random;

public class iPhone {
    String modelName, color;
    int storage, price, availableStock, id;

    public static ArrayList<Integer> usedIDs = new ArrayList<Integer>();
    public static ArrayList<String> availablePhones = new ArrayList<String>();

    iPhone(int storage, String color, int availableStock) {
        this.storage = storage;
        this.color = color;
        this.availableStock = availableStock;

        Random rand = new Random();
        this.id = rand.nextInt(availableStock) + 1;
        while(usedIDs.contains(this.id)) {
            this.id = rand.nextInt(availableStock) + 1;
        }

        usedIDs.add(this.id);

        availablePhones.add("Model Name: " + this.modelName + " - Color: " + this.color
                + " - Storage: " + this.storage + " - Available Stock: " + this.availableStock);
    }

    public void displayAvailablePhones() {
        for (String phone: availablePhones) {
            System.out.println(phone);
        }

    }

    public void buyPhone(int storage, String color) {
        if (this.availableStock > 0)
            this.availableStock -= 1;
        else System.out.println("This model is currently unavailable.");
    }
}

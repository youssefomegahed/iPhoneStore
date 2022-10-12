import java.util.ArrayList;

public class MagSafe extends Accessories {

    String modelName;
    int stock, price;

    public static ArrayList<String[]> availableAccessories = new ArrayList<String[]>();

    String[] currentAccessory = new String[3];

    MagSafe(String modelName, int stock, int price) {
        this.modelName = modelName;
        this.stock = stock;
        this.price = price;

        currentAccessory[0] = this.modelName;
        currentAccessory[1] = Integer.toString(this.stock);
        currentAccessory[2] = Integer.toString(this.price);

        availableAccessories.add(currentAccessory);
    }

    @Override
    void displayAvailableAccessories() {
        for (String[] accessory: availableAccessories) {
            System.out.println("MagSafe for " + accessory[0] + " - Price: " + accessory[2]
                    + "$ - Available Stock: " + accessory[1]);

        }

    }

    @Override
    void buyMagSafeCharger(String modelName) {

        if (this.stock > 0) {
            this.stock -= 1;

            availableAccessories.remove(currentAccessory);
            currentAccessory[1] = Integer.toString(this.stock);
            availableAccessories.add(currentAccessory);

        }
        else System.out.println("This model is currently unavailable.");

    }

    @Override
    void buyCase(String modelName, String Color) {

    }

    @Override
    void buyAirpods(String modelName) {

    }

}

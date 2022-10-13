import java.util.ArrayList;

public class Airpods extends Accessories {

    String modelName = "iPhone 13";
    int stock, price;

    String accessoryName = "Airpods";

    String[] currentAccessory = new String[5];

    Airpods(int stock, int price) {
        this.stock = stock;
        this.price = price;

        currentAccessory[0] = this.modelName;
        currentAccessory[1] = Integer.toString(this.stock);
        currentAccessory[2] = Integer.toString(this.price);
        currentAccessory[3] = "NA"; // no color for Airpods
        currentAccessory[4] = "Airpods";
        availableAccessories.add(currentAccessory);
    }
    @Override
    void displayAvailableAccessories() {
        for (String[] accessory: availableAccessories) {
            if(!accessory[1].equals("0")) {
                System.out.println(accessory[4] + " for " + accessory[0] + " - Price: " + accessory[2]
                        + "$ - Available Stock: " + accessory[1] + " - Color: " + accessory[3]);
            }
        }
    }

    @Override
    void buyAirpods(String modelName) {
        if (this.stock > 0) {
            this.stock -= 1;

            availableAccessories.remove(currentAccessory);
            currentAccessory[1] = Integer.toString(this.stock);
            availableAccessories.add(currentAccessory);

        }
        else System.out.println("This accessory is currently unavailable.");
    }

    @Override
    void buyMagSafeCharger(String modelName) {

    }

    @Override
    void buyCase(String modelName, String Color) {

    }


}

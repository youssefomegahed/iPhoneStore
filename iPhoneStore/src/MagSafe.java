import java.util.ArrayList;

abstract class MagSafe extends Accessories {

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

    }

    @Override
    void displayAvailableAccessories() {

    }

    @Override
    void buyMagSafeCharger(String modelName) {

    }

}

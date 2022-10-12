public class Case extends Accessories {

    String modelName, color;
    int stock, price;


    String[] currentAccessory = new String[5];

    Case(String modelName, int stock, int price, String color) {
        this.modelName = modelName;
        this.color = color;
        this.stock = stock;
        this.price = price;

        currentAccessory[0] = this.modelName;
        currentAccessory[1] = Integer.toString(this.stock);
        currentAccessory[2] = Integer.toString(this.price);
        currentAccessory[3] = this.color;
        currentAccessory[4] = "Phone Case";
        availableAccessories.add(currentAccessory);
    }

    @Override
    void displayAvailableAccessories() {
        for (String[] accessory: availableAccessories) {
            System.out.println(accessory[4] +" for " + accessory[0] + " - Price: " + accessory[2]
                    + "$ - Available Stock: " + accessory[1] + " - Color: " + accessory[3]);

        }
    }
    @Override
    void buyCase(String modelName, String color) {
        if (this.stock > 0) {
            this.stock -= 1;

            availableAccessories.remove(currentAccessory);
            currentAccessory[1] = Integer.toString(this.stock);
            availableAccessories.add(currentAccessory);

        }
        else System.out.println("This accessory is currently unavailable.");

    }
    @Override
    void buyAirpods(String modelName) {

    }


    @Override
    void buyMagSafeCharger(String modelName) {

    }






}

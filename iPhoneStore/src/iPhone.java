import java.util.ArrayList;
import java.util.Random;

public class iPhone {
    String modelName, color;
    int storage, price, availableStock, id;

    ArrayList<Integer> IDs = new ArrayList<Integer>();
    public static ArrayList<String[]> availablePhones = new ArrayList<String[]>();

    String[] currentDevice = new String[5];





    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

        currentDevice[0] = this.modelName;
        currentDevice[1] = this.color;
        currentDevice[2] = Integer.toString(this.storage);
        currentDevice[3] = Integer.toString(this.price);
        currentDevice[4] = Integer.toString(this.availableStock);

        availablePhones.add(currentDevice);

    }

    iPhone(int storage, String color, int availableStock) {
        this.storage = storage;
        this.color = color;
        this.availableStock = availableStock;



        for (int i = 1; i <= this.availableStock; i++) {
            IDs.add(i);
        }


    }

    public void displayAvailablePhones() {
        for (String[] phone: availablePhones) {
            System.out.println("Model Name: " + phone[0] + " - Color: " + phone[1]
                    + " - Storage: " + phone[2] + "GB - Price: " + phone[3] + "$ - Available Stock: " + phone[4]);

        }

    }

    public void buyPhone(int storage, String color) {
        String[] tmp = new String[5];

        if (this.availableStock > 0) {
            this.availableStock -= 1;

            availablePhones.remove(currentDevice);
            currentDevice[4] = Integer.toString(this.availableStock);
            availablePhones.add(currentDevice);

        }
        else System.out.println("This model is currently unavailable.");
    }

}

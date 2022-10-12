import java.util.ArrayList;

abstract class Accessories
{
    int price, stock;
    String color;

    public static ArrayList<String[]> availableAccessories = new ArrayList<String[]>();

    abstract void displayAvailableAccessories();

    abstract void buyMagSafeCharger(String modelName);

    abstract void buyCase(String modelName, String Color);

    abstract void buyAirpods(String modelName);
}

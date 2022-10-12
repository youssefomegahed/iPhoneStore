public class iPhoneModel extends iPhone {

    int storage;
    String modelName, color;
    iPhoneModel(String modelName, int storage, String color, int availableStock, int price) {
        super(storage, color, availableStock);
        super.setModelName(modelName);
        super.setPrice(price);
        this.storage = storage;
        this.color = color;
        this.modelName = modelName;
    }

    public void buyIPhone() {
        super.buyPhone(this.storage, this.color);
    }

}

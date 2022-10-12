public class Main {
    public static void main(String[] args) {
        iPhoneModel iPhoneSE_White64 = new iPhoneModel("iPhone SE", 64, "White", 2, 300);
        iPhoneModel iPhoneSE_Black64 = new iPhoneModel("iPhone SE", 64, "Black", 3, 300);

        iPhoneModel iPhone12_White64 = new iPhoneModel("iPhone 12", 64, "White",1, 350);
        iPhoneModel iPhone12_Black64 = new iPhoneModel("iPhone 12", 64, "Black",4, 350);
        iPhoneModel iPhone12_Blue64 = new iPhoneModel("iPhone 12", 64, "Blue",2, 350);

        iPhoneModel iPhone12_White128 = new iPhoneModel("iPhone 12", 128, "White",2, 400);
        iPhoneModel iPhone12_Black128 = new iPhoneModel("iPhone 12", 128, "Black",3, 400);
        iPhoneModel iPhone12_Blue128 = new iPhoneModel("iPhone 12", 128, "Blue",4, 400);

        iPhoneModel iPhone13_White128 = new iPhoneModel("iPhone 13", 128, "White",2, 450);
        iPhoneModel iPhone13_Black128 = new iPhoneModel("iPhone 13", 128, "Black",3, 450);
        iPhoneModel iPhone13_Blue128 = new iPhoneModel("iPhone 13", 128, "Blue",1, 450);

        iPhoneModel iPhone13_White256 = new iPhoneModel("iPhone 13", 256, "White",2, 500);
        iPhoneModel iPhone13_Black256 = new iPhoneModel("iPhone 13", 256, "Black",3, 500);
        iPhoneModel iPhone13_Blue256 = new iPhoneModel("iPhone 13", 256, "Blue",4, 500);





        iPhoneSE_White64.displayAvailablePhones();

        iPhoneSE_White64.buyIPhone();
        System.out.println("----------------");
        iPhoneSE_White64.displayAvailablePhones();


        MagSafe magSafe_12 = new MagSafe("iPhone 12", 3, 100);
        MagSafe magSafe_13 = new MagSafe("iPhone 13", 2, 100);

        magSafe_12.displayAvailableAccessories();

        magSafe_12.buyMagSafeCharger("iPhone 12");

        magSafe_12.displayAvailableAccessories();

    }
}
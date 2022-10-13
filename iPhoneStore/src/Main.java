
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


        MagSafe magSafe_12 = new MagSafe("iPhone 12", 3, 100);
        MagSafe magSafe_13 = new MagSafe("iPhone 13", 2, 100);

        Airpods airpods = new Airpods(5, 150);

        Case Case_Red_SE = new Case("iPhone SE", 2, 30, "Red");
        Case Case_Black_SE = new Case("iPhone SE", 1, 30, "Black");

        Case Case_Blue_12 = new Case("iPhone 12", 3, 40, "Blue");
        Case Case_White_12 = new Case("iPhone 12", 4, 40, "White");


        Case Case_Yellow_13 = new Case("iPhone 13", 1, 50, "Yellow");
        Case Case_Green_13 = new Case("iPhone 13", 3, 50, "Green");



        iPhoneSE_White64.displayAvailablePhones();

        System.out.println("----------------");

        iPhoneSE_White64.buyIPhone();
        System.out.println("----------------");
        iPhoneSE_White64.displayAvailablePhones();


        magSafe_12.displayAvailableAccessories();

        magSafe_12.buyMagSafeCharger("iPhone 12");

        System.out.println("----------------");

        magSafe_12.displayAvailableAccessories();

        System.out.println("----------------");


        airpods.displayAvailableAccessories();

        System.out.println("----------------");

        airpods.buyAirpods("iPhone 13");

        airpods.displayAvailableAccessories();

        System.out.println("----------------");


        Case_Red_SE.displayAvailableAccessories();

        System.out.println("----------------");

        Case_Red_SE.buyCase("iPhone SE", "Red");

        System.out.println("----------------");

        Case_Red_SE.displayAvailableAccessories();
        Case_Red_SE.buyCase("iPhone SE", "Red");
        System.out.println("----------------");

        Case_Red_SE.displayAvailableAccessories();

        Case_Red_SE.buyCase("iPhone SE", "Red");
        System.out.println("----------------");

        Case_Red_SE.displayAvailableAccessories();

    }
}
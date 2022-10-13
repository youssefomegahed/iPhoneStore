import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static JFrame frame = new JFrame();
    public static JLabel cartLabel;

    public static String phoneCart = "";
    public static String accessoryCart = "";

    static iPhoneModel iPhoneSE_White64 = new iPhoneModel("iPhone SE", 64, "White", 2, 300);
    static iPhoneModel iPhoneSE_Black64 = new iPhoneModel("iPhone SE", 64, "Black", 3, 300);

    static iPhoneModel iPhone12_White64 = new iPhoneModel("iPhone 12", 64, "White",1, 350);
    static iPhoneModel iPhone12_Black64 = new iPhoneModel("iPhone 12", 64, "Black",4, 350);
    static iPhoneModel iPhone12_Blue64 = new iPhoneModel("iPhone 12", 64, "Blue",2, 350);

    static iPhoneModel iPhone12_White128 = new iPhoneModel("iPhone 12", 128, "White",2, 400);
    static iPhoneModel iPhone12_Black128 = new iPhoneModel("iPhone 12", 128, "Black",3, 400);
    static iPhoneModel iPhone12_Blue128 = new iPhoneModel("iPhone 12", 128, "Blue",4, 400);

    static iPhoneModel iPhone13_White128 = new iPhoneModel("iPhone 13", 128, "White",2, 450);
    static iPhoneModel iPhone13_Black128 = new iPhoneModel("iPhone 13", 128, "Black",3, 450);
    static iPhoneModel iPhone13_Blue128 = new iPhoneModel("iPhone 13", 128, "Blue",1, 450);

    static iPhoneModel iPhone13_White256 = new iPhoneModel("iPhone 13", 256, "White",2, 500);
    static iPhoneModel iPhone13_Black256 = new iPhoneModel("iPhone 13", 256, "Black",3, 500);
    static iPhoneModel iPhone13_Blue256 = new iPhoneModel("iPhone 13", 256, "Blue",4, 500);


    static MagSafe magSafe_12 = new MagSafe("iPhone 12", 3, 100);
    static MagSafe magSafe_13 = new MagSafe("iPhone 13", 2, 100);

    static Airpods airpods = new Airpods(5, 150);

    static Case Case_Red_SE = new Case("iPhone SE", 2, 30, "Red");
    static Case Case_Black_SE = new Case("iPhone SE", 1, 30, "Black");

    static Case Case_Blue_12 = new Case("iPhone 12", 3, 40, "Blue");
    static Case Case_White_12 = new Case("iPhone 12", 4, 40, "White");

    static Case Case_Yellow_13 = new Case("iPhone 13", 1, 50, "Yellow");
    static Case Case_Green_13 = new Case("iPhone 13", 3, 50, "Green");
    static void mainScreen() {



        JLabel welcomeMessage;
        welcomeMessage=new JLabel();
        welcomeMessage.setBounds(170,48, 600,60);
        welcomeMessage.setText("Welcome to iMax!");
        welcomeMessage.setFont(new Font("Serif", Font.BOLD, 40));

        frame.add(welcomeMessage);
        frame.setSize(720,720);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel cartMessage;
        cartMessage=new JLabel();
        cartMessage.setBounds(55,220, 600,60);
        cartMessage.setText("Your Cart:");
        cartMessage.setFont(new Font("Serif", Font.BOLD, 30));

        frame.add(cartMessage);
        frame.setSize(720,720);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton viewIPhoneButton = new JButton("Buy an iPhone");
        viewIPhoneButton.setBounds(170,150,150, 40);
        frame.add(viewIPhoneButton);

        JButton viewAccessoryButton = new JButton("Buy an Accessory");
        viewAccessoryButton.setBounds(350,150,150, 40);
        frame.add(viewAccessoryButton);

        JButton purchaseButton = new JButton("Complete Purchase");
        purchaseButton.setBounds(250,450,150, 40);
        frame.add(purchaseButton);

        cartLabel=new JLabel();
        cartLabel.setBounds(120,150, 600,400);
        cartLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(cartLabel);
        cartLabel.setVisible(false);


        viewIPhoneButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                ArrayList<String> phonesList = new ArrayList<String>();

                for (String[] phone : iPhoneSE_Black64.getAvailablePhones())
                {
                    if (!phone[4].equals("0")) {
                        phonesList.add(phone[0] + " - " + phone[1]
                                + " - " + phone[2] + "GB - Price: $" + phone[3]);
                    }
                }




                String getPhoneToBuy = (String) JOptionPane.showInputDialog(
                        null,
                        "Which phone would you like to buy?",
                        "Choose Model",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        phonesList.toArray(),
                        phonesList.get(0));

                phoneCart = getPhoneToBuy;

                if(phoneCart == null) {
                    phoneCart = "";
                }

                if(phoneCart != "") {
                    cartLabel.setText("<html><body>" + phoneCart + "<br><br>" + accessoryCart + "</body></html>");
                    cartLabel.setVisible(true);
                }

            }


        });

        viewAccessoryButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                ArrayList<String> accessoryList = new ArrayList<String>();


                for (String[] accessory : magSafe_12.getAvailableAccessories())
                {
                    if (!accessory[1].equals("0") && accessory[3].equals("NA")) {
                        accessoryList.add(accessory[4] + " for " + accessory[0] + " - $" + accessory[2]);
                    } else if (!accessory[1].equals("0")) {
                        accessoryList.add(accessory[4] + " for " + accessory[0] + " - $" + accessory[2]
                                + " - " + accessory[3]);
                    }

                }




                String getAccessoryToBuy = (String) JOptionPane.showInputDialog(
                        null,
                        "Which accessory would you like to buy?",
                        "Choose Accessory",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        accessoryList.toArray(),
                        accessoryList.get(0));

                accessoryCart = getAccessoryToBuy;
                if(accessoryCart == null) {
                    accessoryCart = "";
                }
                if((accessoryCart != "")) {
                    cartLabel.setText("<html><body>" + phoneCart + "<br><br>" + accessoryCart + "</body></html>");
                    cartLabel.setVisible(true);
                }



            }


        });

        purchaseButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {


                if(phoneCart != "") {
                    String[] phoneInfo = phoneCart.split(" - ");
                    if(phoneInfo[0].equals("iPhone SE")) {
                        if(phoneInfo[1].equals("White")) {
                            iPhoneSE_White64.buyPhone(64, "White");
                        } else if (phoneInfo[1].equals("Black")) {
                            iPhoneSE_Black64.buyPhone(64, "Black");
                        }
                    } else if(phoneInfo[0].equals("iPhone 12")) {
                        if(phoneInfo[2].equals("64GB")) {
                            if(phoneInfo[1].equals("Black"))
                                iPhone12_Black64.buyPhone(64, "Black");
                            else if(phoneInfo[1].equals("White"))
                                iPhone12_White64.buyPhone(64, "White");
                            else if(phoneInfo[1].equals("Blue"))
                                iPhone12_Blue64.buyPhone(64, "Blue");
                        } else if (phoneInfo[2].equals("128GB")) {
                            if(phoneInfo[1].equals("Black"))
                                iPhone12_Black128.buyPhone(128, "Black");
                            else if(phoneInfo[1].equals("White"))
                                iPhone12_White128.buyPhone(128, "White");
                            else if(phoneInfo[1].equals("Blue"))
                                iPhone12_Blue128.buyPhone(128, "Blue");
                        }
                    } else if(phoneInfo[0].equals("iPhone 13")) {
                        if(phoneInfo[2].equals("128GB")) {
                            if(phoneInfo[1].equals("Black"))
                                iPhone13_Black128.buyPhone(128, "Black");
                            else if(phoneInfo[1].equals("White"))
                                iPhone13_White128.buyPhone(128, "White");
                            else if(phoneInfo[1].equals("Blue"))
                                iPhone13_Blue128.buyPhone(128, "Blue");
                        } else if(phoneInfo[2].equals("256GB")) {
                            if(phoneInfo[1].equals("Black"))
                                iPhone13_Black256.buyPhone(256, "Black");
                            else if(phoneInfo[1].equals("White"))
                                iPhone13_White256.buyPhone(256, "White");
                            else if(phoneInfo[1].equals("Blue"))
                                iPhone13_Blue256.buyPhone(256, "Blue");
                        }
                    }

                }

                if(accessoryCart != "") {
                    String[] accessoryInfo = accessoryCart.split(" - ");

                    if(accessoryInfo[0].equals("MagSafe Charger for iPhone 12")) {
                        magSafe_12.buyMagSafeCharger("iPhone 12");
                    } else if (accessoryInfo[0].equals("MagSafe Charger for iPhone 13")) {
                        magSafe_13.buyMagSafeCharger("iPhone 13");
                    } else if (accessoryInfo[0].equals("Airpods for iPhone 13")) {
                        airpods.buyAirpods("iPhone 13");
                    } else if (accessoryInfo[0].equals("Phone Case for iPhone SE")) {
                        if (accessoryInfo[2].equals("Red")) {
                            Case_Red_SE.buyCase("iPhone SE", "Red");
                        } else if (accessoryInfo[2].equals("Black")) {
                            Case_Black_SE.buyCase("iPhone SE", "Black");
                        }
                    } else if (accessoryInfo[0].equals("Phone Case for iPhone 12")) {
                        if (accessoryInfo[2].equals("Blue")) {
                            Case_Blue_12.buyCase("iPhone 12", "Blue");
                        } else if (accessoryInfo[2].equals("White")) {
                            Case_White_12.buyCase("iPhone 12", "White");
                        }
                    } else if (accessoryInfo[0].equals("Phone Case for iPhone 13")) {
                        if (accessoryInfo[2].equals("Yellow")) {
                            Case_Yellow_13.buyCase("iPhone 13", "Yellow");
                        } else if (accessoryInfo[2].equals("Green")) {
                            Case_Green_13.buyCase("iPhone 13", "Green");
                        }
                    }
                }

                if ((phoneCart == "") && (accessoryCart == ""))
                    JOptionPane.showMessageDialog(null, "Your cart is empty, try again.");
                else
                    JOptionPane.showMessageDialog(null, "Thank you for your purchase!");




                phoneCart = "";
                accessoryCart = "";

                frame.getContentPane().removeAll();
                frame.repaint();

                mainScreen();








            }


        });




    }

    public static void main(String[] args) {


        mainScreen();

//        iPhoneSE_White64.displayAvailablePhones();
//        iPhoneSE_White64.buyIPhone();
//        System.out.println("----------------");
//
//        iPhoneSE_White64.displayAvailablePhones();
//
//        System.out.println("----------------");
//
//        Case_Red_SE.displayAvailableAccessories();
//
//        System.out.println("----------------");
//
//        Case_Red_SE.buyCase("iPhone SE", "Red");
//
//        Case_Red_SE.displayAvailableAccessories();

    }
}
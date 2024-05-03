package hus.oop.strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
public class App {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }
    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            selectProduct();
            selectPaymentMethod();
            processPayment();
        }
    }


    private static void selectProduct() throws IOException {
        String continueChoice;
        do {
            System.out.println("Please, select a product:");
            System.out.println("1 - Mother board");
            System.out.println("2 - CPU");
            System.out.println("3 - HDD");
            System.out.println("4 - Memory");
            int choice = Integer.parseInt(reader.readLine());
            int cost = priceOnProducts.get(choice);
            System.out.print("Count: ");
            int count = Integer.parseInt(reader.readLine());
            order.setTotalCost(cost * count);
            System.out.print("Do you wish to continue selecting products? Y/N: ");
            continueChoice = reader.readLine();
        } while (continueChoice.equalsIgnoreCase("Y"));
    }

    private static void selectPaymentMethod() throws IOException {
        if (strategy == null) {
            System.out.println("Please, select a payment method:");
            System.out.println("1 - PalPay");
            System.out.println("2 - Credit Card");
            String paymentMethod = reader.readLine();
            if (paymentMethod.equals("1")) {
                strategy = new PayByPaypal();
            } else {
                strategy = new PayByCreditCard();
            }
            order.processOrder(strategy);
        }
    }

    private static void processPayment() throws IOException {
        System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
        String proceed = reader.readLine();
        if (proceed.equalsIgnoreCase("P")) {
            if (strategy.pay(order.getTotalCost())) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("FAIL! Please, check your data.");
            }
            order.setClosed();
        }
    }
}

package hus.oop.strategy_pattern;

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
public class Order {

    private int totalCost = 0;

    private boolean isClosed = false;

    public void processOrder(PayStrategy payStrategy) {
        if (isClosed) {
            System.out.println("Order already closed");
        } else {
            payStrategy.collectPaymentDetails();
            boolean result = payStrategy.pay(totalCost);
            if (result) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("Payment was not successful.");
            }
        }
    }

    public void processOrderUsingPaypal(PayByPaypal paypal) {
        if (isClosed) {
            System.out.println("Order already closed");
        } else {
            paypal.collectPaymentDetails();
            boolean result = paypal.pay(totalCost);
            if (result) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("Payment was not successful.");
            }
        }
    }


    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        if (isClosed) {
            System.out.println("Order already closed");
        } else {
            creditCard.collectPaymentDetails();
            boolean result = creditCard.pay(totalCost);
            if (result) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("Payment was not successful.");
            }
        }
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}

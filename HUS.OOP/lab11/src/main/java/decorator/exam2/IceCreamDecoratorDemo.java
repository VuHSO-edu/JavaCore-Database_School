package decorator.exam2;

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
public class IceCreamDecoratorDemo {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        System.out.println(iceCream.getDescription());
        System.out.println();


        IceCream iceCream2 = new VanillaIceCream();
        System.out.println(iceCream2.getDescription());
        System.out.println();

        IceCream iceCream3 = new HoneyToppingDecorator(iceCream);
        System.out.println(iceCream3.getDescription());
        System.out.println();


        IceCream iceCream4 = new NutsToppingDecorator(iceCream2);
        System.out.println(iceCream4.getDescription());


    }
}

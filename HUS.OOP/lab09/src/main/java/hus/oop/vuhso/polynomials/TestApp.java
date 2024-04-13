package hus.oop.vuhso.polynomials;

import java.security.spec.RSAOtherPrimeInfo;

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
public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new Double[]{1.0, 3.0, 4.0, 8.0});

        System.out.println("ap= " + ap);
        System.out.println("lp= " + lp);

        if (ap.equals(lp) && lp.equals(ap)) {
            System.out.println("ap == lp");
        } else {
            System.out.println("ap != lp");
        }


        ap = ap.derivative();
        System.out.println("ap'= " + ap.toString());

        ap = ap.derivative();
        System.out.println("ap''= " + ap.toString());

        lp = lp.derivative();
        System.out.println("lp'= " + lp.toString());

        lp = lp.derivative();
        System.out.println("lp''= " + lp.toString());
    }
}

package hus.oop.vuhso.polynomials;

import java.util.List;

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
public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(Double[] coefficients) {
        this.coefficients = List.of(coefficients);
    }

    @Override
    public double[] coefficients() {
        return this.coefficients.stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients.get(degree);
    }

    @Override
    public int degree() {
        return this.coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        Double[] derivativeCoefficients = new Double[this.coefficients.size() - 1];
        for (int i = 1; i < this.coefficients.size(); i++) {
            derivativeCoefficients[i - 1] = i * this.coefficients.get(i);
        }
        return new ListPoly(derivativeCoefficients);
    }
}

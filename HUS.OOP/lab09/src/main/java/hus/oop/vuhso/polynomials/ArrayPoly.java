package hus.oop.vuhso.polynomials;

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
public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients[degree];
    }

    @Override
    public int degree() {
        return this.coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefficients = new double[this.coefficients.length - 1];
        for (int i = 1; i < this.coefficients.length; i++) {
            derivativeCoefficients[i - 1] = i * this.coefficients[i];
        }
        return new ArrayPoly(derivativeCoefficients);
    }
}

package hus.oop.vuhso.polynomials;

import java.util.Arrays;

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
public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    public double[] derive() {
        double[] derived = new double[this.degree()];

        for(int i = 0; i < this.degree(); ++i) {
            derived[i] = (double)(i + 1) * this.coefficient(i + 1);
        }

        return derived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Poly)) {
            return false;
        } else {
            Poly other = (Poly)o;
            if (this.degree() != other.degree()) {
                return false;
            } else {
                for(int i = 0; i <= this.degree(); ++i) {
                    if (this.coefficient(i) != other.coefficient(i)) {
                        return false;
                    }
                }

                return true;
            }
        }
    }

    @Override
    public int hashCode() {
       // return Object.hashCode(this.coefficients());
       return Arrays.hashCode(this.coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= degree(); i++) {
            double coef = coefficient(i);
            if (coef != 0) {
                if (coef > 0) {
                    sb.append(" + ");
                } else {
                    sb.append(" - ");
                }
                sb.append(Math.abs(coef));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }


}

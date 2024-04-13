package hus.oop.vuhso.library;

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
public class Library {

    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
      Rent longestRent = rents[0];
      long maxDuration = 0;

        for (Rent rent : rents) {
            long duration = rent.getEnd().getTime() - rent.getBegin().getTime();
            if (duration > maxDuration) {
            maxDuration = duration;
            longestRent = rent;
            }
        }

        return longestRent;
    }
}

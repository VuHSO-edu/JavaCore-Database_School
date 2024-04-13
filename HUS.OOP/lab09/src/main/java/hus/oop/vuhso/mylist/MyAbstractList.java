package hus.oop.vuhso.mylist;

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
public abstract class  MyAbstractList implements MyList {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }

    public void checkBoundaries(int index , int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}

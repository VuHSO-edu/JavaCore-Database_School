package hus.oop.singleton_pattern.pseudocode;

import javax.xml.crypto.Data;

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
public class Database {

    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            System.out.println("Creating unique instance of Database");
            Database.instance = new Database();
        }
        System.out.println("Returning instance of Database");
        return Database.instance;
    }

    public String query(String sql) {
        return "Execute: " + sql;
    }

    @Override
    public String toString() {
        return "Database instance";
    }
}

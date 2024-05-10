package decorator.exam3;

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
public class ApplicationConfigurator {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("salary.dat");
        boolean enabledEncryption = true;
        boolean enabledCompression = true;
        if (enabledEncryption) {
            source = new EncryptionDecorator(source);
            enabledEncryption = false;
        }

        if (enabledCompression) {
            source = new CompressionDecorator(source);
            enabledCompression = false;
        }

        SalaryManager logger = new SalaryManager(source);
        String salary = logger.load();

        System.out.println(salary);

    }
}

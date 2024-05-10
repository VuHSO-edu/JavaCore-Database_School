package interator.exam2;

import java.util.ArrayList;
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
public class Facebook implements SocialNetwork {

    private String facebookId;
    private String profileId;
    private String type;
    private Profile[] cache;
    private int currentPosition = 0;

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
       return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public Profile[] cocialGraphRequest(String profileId, String type) {
        List<Profile> profiles = fetchProfilesFromFacebook(profileId, type);


        return profiles.toArray(new Profile[0]);
    }

    private List<Profile> fetchProfilesFromFacebook(String profileId, String type) {
        List<Profile> profiles = new ArrayList<>();

        return profiles;
    }
}

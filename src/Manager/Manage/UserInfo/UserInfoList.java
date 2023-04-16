
package Manager.Manage.UserInfo;


import java.util.ArrayList;
import java.util.List;

public class UserInfoList {

    public static List<UserInfo> userInfoList;

    static {
        userInfoList = new ArrayList<>(List.of(
                new UserInfo("abcd", "1234", "조규성", "강남", 30),
                new UserInfo("qwer", "1234", "김민재", "서초", 28),
                new UserInfo("asdf", "1234", "손흥민", "대치", 32),
                new UserInfo("zxcv", "1234", "이강인", "역삼", 26)
        ));
    }

}



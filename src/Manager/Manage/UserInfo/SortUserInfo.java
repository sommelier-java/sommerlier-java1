<<<<<<< HEAD
=======
package Manager.Manage.UserInfo;


import java.util.Collections;
import java.util.Comparator;

//이름 오름차순으로 출력
public class SortUserInfo {
    public static void SortUserInfo() {
        Collections.sort(UserInfoList.userInfoList, new Comparator<UserInfo>() {
            @Override
            public int compare(UserInfo userInfo1, UserInfo userInfo2) {
                return userInfo1.getUserName().compareTo(userInfo2.getUserName());
            }
        });

        for (UserInfo userInfo : UserInfoList.userInfoList) {
            System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                    + "회원ID = " + userInfo.getUserId()+ " | "
                    + "회원PWD = " + userInfo.getUserPwd()+ " | "
                    + "회원주소 = " + userInfo.getUserAddr()+ " | "
                    + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
        }
    }
}












>>>>>>> 1a2ef8f4c89e9a9c92b02a0275569bd747071381

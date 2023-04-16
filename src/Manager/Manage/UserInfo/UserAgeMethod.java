package Manager.Manage.UserInfo;

import Wine_yejin.UserInfo;

public class UserAgeMethod {

    public static void twentyAgeUsers() {

        for (UserInfo userInfo : UserInfoList.userInfoList) {
            if (userInfo.getUserAge() >= 20 && userInfo.getUserAge() < 30) {
                System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                        + "회원ID = " + userInfo.getUserId()+ " | "
                        + "회원PWD = " + userInfo.getUserPwd()+ " | "
                        + "회원주소 = " + userInfo.getUserAddr()+ " | "
                        + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
            }
        }
    }


    public static void thirtyAgeUsers() {

        for (UserInfo userInfo : UserInfoList.userInfoList) {
            if (userInfo.getUserAge() >= 30 && userInfo.getUserAge() < 40) {
                System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                        + "회원ID = " + userInfo.getUserId()+ " | "
                        + "회원PWD = " + userInfo.getUserPwd()+ " | "
                        + "회원주소 = " + userInfo.getUserAddr()+ " | "
                        + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
            }
        }
    }

    public static void fortyAgeUsers() {

        for (UserInfo userInfo : UserInfoList.userInfoList) {
            if (userInfo.getUserAge() >= 40 && userInfo.getUserAge() < 50) {
                System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                        + "회원ID = " + userInfo.getUserId()+ " | "
                        + "회원PWD = " + userInfo.getUserPwd()+ " | "
                        + "회원주소 = " + userInfo.getUserAddr()+ " | "
                        + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
            }
        }
    }

    public static void overFiftyAgeUsers() {

        for (UserInfo userInfo : UserInfoList.userInfoList) {
            if (userInfo.getUserAge() >= 50 && userInfo.getUserAge() < 100) {
                System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                        + "회원ID = " + userInfo.getUserId()+ " | "
                        + "회원PWD = " + userInfo.getUserPwd()+ " | "
                        + "회원주소 = " + userInfo.getUserAddr()+ " | "
                        + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
            }
        }
    }

}

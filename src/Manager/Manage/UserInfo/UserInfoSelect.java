package Manager.Manage.UserInfo;

//회원전체조회
public class UserInfoSelect {

    public static void selectAllUsers() {
        for (UserInfo userInfo : UserInfoList.userInfoList) {
            System.out.println(" ⌈ 회원명 = "+ userInfo.getUserName() + " | "
                    + "회원ID = " + userInfo.getUserId()+ " | "
                    + "회원PWD = " + userInfo.getUserPwd()+ " | "
                    + "회원주소 = " + userInfo.getUserAddr()+ " | "
                    + "회원연령 = " + userInfo.getUserAge()+ " ⌋" );
        }

    }
}

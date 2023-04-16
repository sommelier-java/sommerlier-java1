
package Manager.Manage.UserInfo;

import static Wine_yejin.util.Utility.input;

public class UserManagementView {
    public static void UserManagementView() {
        while (true) {
            System.out.println("\n\n회원조회 페이지입니다.\n원하시는 메뉴 번호를 눌러 주세요");
            System.out.println("[ 1. 유저회원 전체 조회하기 | 2. 조건별 회원조회 | 9. 돌아가기 ] ");

            String UserManagementView = input(">>");

            switch (UserManagementView) {
                //전체회원조회
                case "1":
                    UserInfoSelect.selectAllUsers();

                    break;

                //조건조회해서 보기
                case "2":
                    UserSelect.userSelect();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;


            }
        }
    }
}

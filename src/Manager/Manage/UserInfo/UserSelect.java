<<<<<<< HEAD
=======
package Manager.Manage.UserInfo;


import static Wine_yejin.util.Utility.input;

public class UserSelect {
    //조건별로 회원조회하기
    //1. 이름 순으로 조회
    //2. 나이대로 조회, 20, 30, 40,50,60이상
    public static void userSelect() {
        System.out.println("\n\n회원조회 페이지입니다.\n원하시는 메뉴 번호를 눌러 주세요");
        System.out.println(" [ 1. 오름차순으로 회원명 조회 | 2. 연령대별 조회 | 9. 돌아가기]");
        String userSelect = input(">>");

        switch (userSelect) {
            case "1":
                SortUserInfo.SortUserInfo();
                break;

            case "2":
                UserByAge.ageGroup();
                break;

            case "9":
                //연령대별 조회
                return;
        }

    }
}


>>>>>>> 1a2ef8f4c89e9a9c92b02a0275569bd747071381

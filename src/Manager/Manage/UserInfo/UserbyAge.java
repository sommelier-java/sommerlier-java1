package Manager.Manage.UserInfo;

import static Wine_yejin.util.Utility.input;

public class UserByAge {

    public static void ageGroup() {
        while (true) {
            System.out.println("\n\n연령대별 조회페이지입니다\n원하시는 메뉴 번호를 눌러 주세요");
            System.out.println(" [ 1. 20대 회원 조회 | 2. 30대 회원 조회 | 3. 40대 회원 조회 | 4. 50대 회원 이상 조회 | 9. 돌아가기 ] ");
            String userSelect = input(">>");

            switch (userSelect) {

                case "1":
                    System.out.println("20대 고객 회원리스트입니다.");
                    UserAgeMethod.twentyAgeUsers();
                    break;

                case "2":
                    System.out.println("30대 고객 회원리스트입니다.");
                    UserAgeMethod.thirtyAgeUsers();
                    break;

                case "3":
                    System.out.println("40대 고객 회원리스트입니다.");
                    UserAgeMethod.fortyAgeUsers();
                    break;


                case "4":
                    System.out.println("50대 이상 고객 회원리스트입니다.");
                    UserAgeMethod.overFiftyAgeUsers();
                    break;


                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

            }
        }
    }
}
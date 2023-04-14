package employees.views;

import static Wine_yejin.util.Utility.input;
import static employees.views.EmpWineCategoryView.empShowWineList;

public class EmpIncenView {

    // 인센티브 확인 메서드
    public static void empCheckMyIncentive() {


        while (true) {
            System.out.println("\n\n인센티브 확인 페이지 입니다.");
            System.out.println("[ 1: 바로 구매하기 | 9: 전 페이지로 돌아가기 ]");
            System.out.println("---------------------------------------");
            String empIncenPage = input(">> ");
            switch (empIncenPage) {
                case "1": empShowWineList(); break;// 와인리스트 확인 함수

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");


            }

        }
    }

}

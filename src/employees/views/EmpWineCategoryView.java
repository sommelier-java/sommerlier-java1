package employees.views;

import static Wine_yejin.util.Utility.input;
import static employees.filters.WineSelectorByFilter.*;

public class EmpWineCategoryView {

    // 와인리스트 확인 메서드
    public static void empShowWineList() {

        while (true) {
        System.out.println("\n\n직원이 구매 할 수 있는 페이지 입니다.");
        System.out.println("옵션을 선택 해 주세요");
        System.out.println("[ 1: 국가별 | 2: 종류별 | 3: 가격별 | 9: 전 페이지로 돌아가기 ]");
        System.out.println("---------------------------------------");
        String filterNum = input(">> ");
            switch (filterNum) {
                case "1":
                    // 나라별
                    wineCountrySelect();
                    break;

                case "2":
                    // 타입별
                    wineTypeSelect();
                    break;

                case "3":
                    // 금액별
                    winePriceSelect();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");
                    break;

            }
        }
    }
}

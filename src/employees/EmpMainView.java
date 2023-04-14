package employees;

<<<<<<< HEAD

=======
>>>>>>> 39a85f627ca29bffa34dfdeb9de3616b4fd99944
import static Wine_yejin.util.Utility.input;
import static employees.views.EmpIncenView.empCheckMyIncentive;
import static employees.views.EmpWineCategoryView.empShowWineList;

public class EmpMainView {

    // 사원이 로그인 하면 바로 보이는 페이지
    public static void employeesMainPageView() {


        System.out.println("너무 귀한 우리 사원님 재방문을 환영합니다.");
        while (true) {
        System.out.println("원하시는 메뉴 번호를 눌러 주세요");
        System.out.println("[ 1: 인센티브 확인하기 | 2: 바로 구매하기 | 9: 전 페이지로 돌아가기 ]");
        System.out.println("---------------------------------------");
        String empMainSelect = input(">> ");
            switch (empMainSelect) {
                case "1":
                    // 인센티브 확인 함수
                    empCheckMyIncentive();
                    break;

                case "2":
                    // 와인리스트 확인 함수
                    empShowWineList();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");

            }
        }
    }
}

package employees;

import Wine_yejin.Employ;
import java.util.List;
import static Wine_yejin.TotalUserRepository.getEmp;
import static Wine_yejin.util.Utility.input;
import static employees.filters.WineSelectorByFilter.*;
import static employees.views.WineBuySelectView.useIncentive;

public class EmpMainView {

    public static List<Employ> employList;

    // 밖에 나가있는 메인 함수
    public static void empEmpview(String empId) {
        empMainpage(empId); // 로그인 된 아이디로 이름과 인센 가져오기
        employeesMainPageView();

    }

    // 사원이 로그인 하면 바로 보이는 페이지
    public static void employeesMainPageView() {

            System.out.print("\n▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n\n");
            System.out.println("\t\t\t🎉 " + logedInName + "님 환영합니다 🎉\t\t\n");
            System.out.print("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n\n");

        while (true) {

            System.out.println("옵션을 선택 해 주세요\n");
            System.out.println("[ 1. 인센티브 확인하기 | 2. 바로 구매하기 | 9. 전 페이지로 돌아가기 | 99. 종료하기 ]");
            String empMainSelect = input(">> ");

            switch (empMainSelect) {

                case "1": empCheckMyIncentive();  break; // 인센티브 확인 함수

                case "2": empShowWineList(); break; // 와인리스트 확인 함수

                case "9":
                    System.out.println("\n뒤로 돌아갑니다.\n");
                    return;

                case "99":
                    System.out.println("\n 프로그램을 종료합니다.");
                    System.exit(0);

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }
        }
    }

    // 인센티브 확인 메서드
    public static void empCheckMyIncentive() {

            System.out.print("\n▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");
            System.out.println(" 🌟 "+ logedEmpDept + "부에 " + logedInName + "님이 있어 우리 회사가 발전합니다 🌟");
            System.out.println("\t 현재 사용 가능한 인센티브는 " + logedEmpIncen + "천원 입니다");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

        while (true) {

            System.out.println("원하시는 메뉴 번호를 입력해 주세요\n");
            System.out.println("[ 1. 바로 구매하기 | 9. 전 페이지로 돌아가기 ]");
            String empIncenPage = input(">> ");

            switch (empIncenPage) {

                case "1": empShowWineList(); break;// 와인리스트 확인 함수

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n");
                    return;

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }

        }
    }


    // 들어온 직원을 확인하고 이름과 인센티브를 얻는 함수.
    static String logedInName = null;
    static double logedEmpIncen = 0;
    static String logedEmpDept = null;
    public static void empMainpage(String empId) {

        getEmp();

        for (Employ empInfo : employList) {
            if (empInfo.getEmpId().equals(empId)) {
                logedInName = empInfo.getEmpName();
                logedEmpIncen = empInfo.getIncentive();
                logedEmpDept = empInfo.getDept();
            }
        }

        useIncentive(logedEmpIncen);
    }


    public static void empShowWineList() {

        while (true) {

            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰");
            System.out.println("\t\t직원만 구매 할 수 있는 페이지 입니다");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

            System.out.println("원하시는 메뉴 번호를 입력해 주세요\n");
            System.out.println("[ 1. 국가별 | 2. 종류별 | 3. 가격별 | 9. 전 페이지로 돌아가기 ]");
            String filterNum = input(">> ");
            switch (filterNum) {

                case "1": wineCountrySelect(); break; // 나라별

                case "2": wineTypeSelect(); break; // 타입별

                case "3": winePriceSelect(); break; // 금액별

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n");
                    return;

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }
        }
}}

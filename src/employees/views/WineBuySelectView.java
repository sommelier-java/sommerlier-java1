package employees.views;


import WineRepository.Wine;

import java.util.List;

import static Wine_yejin.util.Utility.input;
import static employees.EmpMainView.employeesMainPageView;
import static employees.filters.EmpOneByOne.dottedPrint;
import static employees.filters.SelectedMethods.filteredWineList;

public class WineBuySelectView {
    // ----------- 구매 할 와인을 선택하는 메서드 시작  ** 3개의 필터에 동일 적용 ------------

    static int wineNumber;
    // 사용자가 와인을 고르면 고른 와인을 출력해주는 함수
    public static void wineSelectToBuy(List<Wine> filteredWineList) {

        System.out.println("\n\n[ 1 ~ 10 ] 원하는 와인을 골라주세요 [99 : 다시선택]");

        wineNumber = Integer.parseInt(input(">> "));
        switch (wineNumber) {

            // 일단 선택권은 10개를 주는걸로 함
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:

                printingSelectedWine(); break; // 정보출력 메서드

            case 99:
                System.out.println("뒤로 돌아갑니다.\n\n");
                return;

            default:
                System.out.println("리스트 안의 번호만 입렵해주세용");

        }
    }


    private static void printingSelectedWine() {

        System.out.println("\n\t\t🍷 선택된 와인입니다 🍷\n💲 와인 가격은 20% 할인 된 금액입니다 💲\n");

        Wine wine = filteredWineList.get(wineNumber - 1);

        double price = wine.getPrice();
        double empPrice = price - (price / 5.0);
        System.out.println("[ 와인 명 = " + wine.getName() + " ]");
        System.out.println("[ 원산지 = " + wine.getOrigin()+ " | 타입 = "
                            + wine.getWineType() + " | 가격 = " + empPrice + "천원 ]");


        System.out.println("\n구매 하시겠습니까? [ 1 : 예 | 2 : 이전으로 | 99 : 종료하기]");
        String inputBuying = input(">>> ");

        switch (inputBuying){
            case "1" :  selectPayment(); break;
            case "2" :
                System.out.println("\n이전 페이지로 돌아갑니다");
                return;
            case "99":
                System.out.println("\n프로그램을 종료합니다");
                System.exit(0);
                break;
            default:
                System.out.println("옵션에 있는 번호만 입력 부탁드립니다.");
        }


    }

// ---------------- 구매 할 와인을 선택하는 메서드 종료 -------------------------


// ---------------- 구매 할 방식을 선택하는 메서드 시작 -------------------------

    // 결제방식 선택메서드
    private static void selectPayment() {
        String pay;
        System.out.println("\n** 결제방식을 선택해주세요 **");
        System.out.println("1. 인센티브\n2. 일반결제\n3. 이전 페이지 \n99. 종료하기");
        String  paymentSelect = input(">>>");

        switch (paymentSelect) {
            case "1":  payWith(pay = "incen");  break;
            case "2":  payWith(pay = "normal");  break;
            case "3":
                System.out.println("이전페이지로 이동합니다"); return;
            case "99":
                System.out.println("\n프로그램을 종료합니다");
                System.exit(0);
                break;

            default:
                System.out.println("\n리스트 안의 번호만 입렵해주세용");

        }

    }


// ---------------- 구매 할 방식을 선택하는 메서드 종료 -------------------------




// ---------------- 결제방식 메서드 시작  -------------------------
    private static void payWith(String pay) {
        if(pay.equals("incen")){
            System.out.print("\n인센티브로 결제합니다");
        }else{
            System.out.println("\n카드로 결제합니다");
        }
        String n = "\n결제중  . . . ";
        try {
            dottedPrint(n);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n결제가 정상적으로 완료 되었습니다.");
        System.out.println("\n 마지막 페이지 입니다.");
        System.out.println("\n[ 1 : 메인 페이지로 돌아가기 | 99 : 종료하기]");
        String last = input("\n>>>");
        switch (last){
            case "1" : employeesMainPageView(); break;
            case "99" :
                System.out.println("종료합니다.");
                System.exit(0); break;
            default:
                System.out.println("다시 입력해 주세요");
        }



    }
// ---------------- 결제방식 메서드 종료 -------------------------
}

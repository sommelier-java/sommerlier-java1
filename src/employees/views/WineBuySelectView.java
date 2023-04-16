package employees.views;


import WineRepository.Wine;

import java.util.List;

import static Wine_yejin.TotalUserRepository.getEmp;
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
        Wine wine = filteredWineList.get(wineNumber - 1);

        switch (wineNumber) {

            // 일단 선택권은 10개를 주는걸로 함
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:

                printingSelectedWine(wine); // 와인 리스트 10개 랜덤으로 출력해줌
                wishToPayOrNot(wine);
                break; // 정보출력 메서드

            case 99:
                System.out.println("뒤로 돌아갑니다.\n");
                return;

            default:
                System.out.println("리스트 안의 번호만 입렵해주세용");

        }
    }

    private static void wishToPayOrNot(Wine wine) {
        System.out.println("\n구매 하시겠습니까? [ 1. 예 | 2. 이전으로 99. 종료하기]");
        String inputBuying = input(">> ");
        switch (inputBuying){
            case "1" :  selectPayment();
                wineSoldSuccessfully(wine);
                double restIncen = logedEmpIncen - empPrice;
                System.out.println(logedEmpIncen);
                System.out.println("남은 인센은 " + restIncen );
                lastPage();
                break;
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

    static double empPrice;
    private static void printingSelectedWine(Wine wine) {
        double price = wine.getPrice();
        empPrice = price - (price / 5.0);
        int targetSize=15;


        String name = wine.getName();
        if(name.length() >targetSize){
            name.substring(0,targetSize);
        }else {

        }
        System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");
        System.out.println("\t\t\t\t🍷 선택된 와인입니다 🍷\n\t\t💲와인 가격은 20% 할인 적용된 금액입니다💲\n");
        System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");
        System.out.println("🔸 와인 명 = " + name + "🔸 ");
        System.out.println("🔸 원산지 = " + wine.getOrigin() + " 🔸 타입 = "
                + wine.getWineType() + " 🔸 가격 = " + empPrice + "천원 🔸");




    }

// ---------------- 구매 할 와인을 선택하는 메서드 종료 -------------------------


// ---------------- 구매 할 방식을 선택하는 메서드 시작 -------------------------

    // 결제방식 선택메서드
    public static void selectPayment() {
        String pay;
        System.out.printf("\n▰▰▰▰▰▰▰▰▰▰▰💲결제방식을 선택해주세요💲▰▰▰▰▰▰▰▰▰▰\n\n");
        System.out.println("[ 1. 인센티브 | 2. 일반결제 | 3. 이전 페이지 | 99. 종료하기 ]\n");
        System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

        System.out.println("원하시는 메뉴 번호를 입력해 주세요");
        String  paymentSelect = input(">>");

        switch (paymentSelect) {
            case "1": payWith(pay = "incen");  break;
            case "2": payWith(pay = "normal");  break;
            case "3":
                System.out.println("\n이전페이지로 이동합니다"); return;
            case "99":
                System.out.println("\n프로그램을 종료합니다");
                System.exit(0);
                break;

            default:
                System.out.println("\n다시 입렵해주세요");

        }

    }

    private static void wineSoldSuccessfully(Wine wine) {
        filteredWineList.remove(wine);
        System.out.println("\n🍾결제가 정상적으로 완료 되었습니다.🍾\n");
    }
// ---------------- 구매 할 방식을 선택하는 메서드 종료 -------------------------

    // ---------------- 결제방식 메서드 시작  -------------------------
    private static void payWith(String pay) {
        if(pay.equals("incen")){
            System.out.print("\n인센티브로 결제합니다");
        }else{
            System.out.println("\n카드로 결제합니다");
        }

        String n = "\n결제중💱💱💱";

        try {
            dottedPrint(n);
            return;

        } catch (InterruptedException e) {
            e.printStackTrace();
            payWith(pay);
        }
    }

    private static void lastPage(){
        System.out.println("\n 마지막 페이지 입니다.");

        System.out.println("\n[ 1. 메인 페이지로 돌아가기 | 99. 종료하기]");
        String last = input("\n>> ");
        switch (last){
            case "1" : employeesMainPageView(); break;
            case "99" :
                System.out.println("종료합니다.");
                System.exit(0); break;
            default:
                System.out.println("다시 입력해 주세요");
        }
    }
    static double logedEmpIncen;
    public static void useIncentive(double logedEmpIncen) {
        getEmp();
        logedEmpIncen = logedEmpIncen;

    }


    // ---------------- 결제방식 메서드 종료 -------------------------



}



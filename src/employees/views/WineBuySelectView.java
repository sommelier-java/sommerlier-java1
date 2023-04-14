package employees.views;


import WineRepository.Wine;

import java.util.List;

import static Wine_yejin.util.Utility.input;


public class WineBuySelectView {

    // ----------- 구매 할 와인을 선택하는 메서드 시작  ** 3개의 필터에 동일 적용 ------------

    // 사용자가 와인을 고르면 고른 와인을 출력해주는 함수
    public static void wineSelectToBuy(List<Wine> filteredWineList) {

        System.out.println("\n\n[ 1 ~ 10 ] 원하는 와인을 골라주세요 [99 : 다시선택]");

        int wineNumber = Integer.parseInt(input(">> "));
        switch (wineNumber) {

            // 일단 선택권은 10개를 주는걸로 함
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("\n선택된 와인입니다.");
                System.out.println(filteredWineList.get(wineNumber - 1));
                String inputBuying = input("\n구매 하시겠습니까? [ 1: 예 | 2 : 아니오 | 99 : 종료하기]");
                
                switch (inputBuying){
                    case "1" :
                        System.out.println("\n구매페이지로 넘어갑니다");
                        selectPayment();
                        break;
                    case "2" :
                        System.out.println("\n이전 페이지로 넘어갑니다");
                        break;
                    case "99":
                        System.out.println("\n프로그램을 종료합니다");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("옵션에 있는 번호만 입력 부탁드립니다.");
                }
                break;

            case 99:
                System.out.println("뒤로 돌아갑니다.\n\n\n");
                return;

            default:
                System.out.println("리스트 안의 번호만 입렵해주세용");




        }
    }


// ---------------- 구매 할 와인을 선택하는 메서드 종료 -------------------------



// ---------------- 구매 할 방식을 선택하는 메서드 시작 -------------------------

    // 결제방식 선택메서드
    private static void selectPayment() {
        System.out.println("\n** 결제방식을 선택해주세요 **");
        System.out.println("1. 인센티브\n2. 일반결제\n99. 종료하기");
        String  paymentSelect = input(">>>");

        switch (paymentSelect) {
            case "1":
                // 인센티브로 결제하는 메서드
                payWithIncentive();
                break;

            case "2":
                // 일반 결제 메서드
                payWithCard();
                break;

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
    private static void payWithIncentive() {
        System.out.println("\n본인의 인센티브로 결제합니다.");
        System.exit(0);
    }
    private static void payWithCard() {
        System.out.println("\n일반결제를 합니다.");
        System.exit(0);
    }
// ---------------- 결제방식 메서드 종료 -------------------------
}

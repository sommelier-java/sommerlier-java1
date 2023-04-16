package UserReal;

import WineRepository.Wine;
import java.util.ArrayList;
import java.util.List;
import static Wine_yejin.util.Utility.input;

public class UserWineView {
/*    public static void main(String[] args) {
    new UserWineView().view();
}*/
    WineFilteringRepository wineRepository = new WineFilteringRepository();

    public void view(){
        while (true){
            System.out.println("원하시는 메뉴 번호를 입력해 주세요");
            System.out.println("[ 1. 와인 구매 | 2. 장바구니 | 3. 구매 내역 확인 | 9. 뒤로가기 | 99. 로그아웃 ]");
            String num= input(">> ");

            switch (num){
                case "1":
                    wineFiltering(); break;
                case "2":
                    //장바구니에 담긴 와인이 없으면 없다고 출력
                    List<Wine> cartWine=wineRepository.cartList();
                    if(cartWine==null) System.out.println("장바구니에 담긴 와인이 없습니다\n\n");
                    else {
                        System.out.println("장바구니에 담긴 와인 목록입니다.");
                        cartWine.stream().forEach(System.out::println);  //장바구니 리스트 출력
                        System.out.println("\n");

                        while (true){
                            System.out.println("구매를 원하시면 와인 이름을 입력해주세요. 9. 뒤로가기");
                            String wineWantToBuy= input(">> ");
                            if(wineWantToBuy.equals("9")) {
                                System.out.println("\n\n");
                                break;
                            }
                            
                            //입력한 이름이 장바구니 리스트에 있는지
                            Wine wineInCart=wineRepository.isCartEnteredWine(wineWantToBuy);
                            if(wineInCart!=null){//장바구니 리스트에 있다면
                                buyFromCart(wineInCart); //장바구니에서 구매하기
                                break;
                            }
                            else{
                                System.out.println("찾으시는 와인이 없습니다. 다시 입력해주세요.");
                            }
                        }
                    }break;

                case "3":
                    //구매내역이 없다면 없다고 출력
                    List<Wine> purchaseWine=wineRepository.purchaseList();
                    if(purchaseWine==null) System.out.println("구매내역이 없습니다.\n\n");
                    else {
                        System.out.println("구매하신 와인 목록입니다.");
                        purchaseWine.stream().forEach(System.out::println); //구매한 와인 목록
                        System.out.println("\n");
                    }break;
                case "9":
                    return;
                case "99":
                    System.out.println("프로그램이 종료되었습니다.");
                    System.exit(0);
                default:
                    numberWarning();
            }
        }
    }
    
    public void wineFiltering(){
        System.out.println("\n\n원하시는 메뉴 번호를 입력해 주세요");
        System.out.println("[ 1. 와인 타입 | 2. 국가 | 3. 가격 | 9. 뒤로가기 ]");
        String num= input(">> ");

        List<Wine> filteredWineList = new ArrayList<Wine>();

        switch (num){
            case "1":
                String wineType=null;
                WHILE : while(true){
                        System.out.println("\n\n필터링하실 번호를 입력해 주세요");
                        System.out.println("[ 1. 레드 | 2. 화이트 | 3. 스파클링 | 4. 고도주 | 5. 주정강화 | 9. 뒤로가기 ]");
                        String number= input(">> ");
                        switch (number) {
                            case "1":
                                wineType = "레드"; break WHILE;
                            case "2":
                                wineType = "화이트";  break WHILE;
                            case "3":
                                wineType = "스파클링"; break WHILE;
                            case "4":
                                wineType = "고도주"; break WHILE;
                            case "5":
                                wineType = "주정강화"; break WHILE;
                            case "9":
                                wineFiltering(); break WHILE;
                            default:
                                numberWarning();
                        }
            }
                filteredWineList=wineRepository.findWineByWineType(wineType); //타입으로 와인 필터링
                printWineList(filteredWineList,1); //필터링된 와인 출력
                chooseWine();//필터링 된 와인에서 구매or장바구니 할 와인 선택
                break;

            case "2":
                String wineOrigin=null;
                WHILE : while(true){
                        System.out.println("\n\n필터링하실 번호를 입력해 주세요");
                        System.out.println("[ 1. 이탈리아 | 2. 프랑스 | 3. 미국 | 4. 포르투갈 | 5. 스페인 | 9. 뒤로가기 ]");
                        String number= input(">> ");
                        switch (number) {
                            case "1":
                                wineOrigin = "이탈리아"; break WHILE;
                            case "2":
                                wineOrigin = "프랑스"; break WHILE;
                            case "3":
                                wineOrigin = "미국"; break WHILE;
                            case "4":
                                wineOrigin = "포르투갈"; break WHILE;
                            case "5":
                                wineOrigin = "스페인"; break WHILE;
                            case "9":
                                wineFiltering(); break WHILE;
                            default:
                                numberWarning();
                        }
                    }
                filteredWineList=wineRepository.findWineByWineOrigin(wineOrigin); //나라로 와인 필터링
                printWineList(filteredWineList,2);//필터링 된 와인 출력
                chooseWine();//필터링 된 와인에서 구매or장바구니 할 와인 선택
                break;

            case "3":
                double min=0,max=0;
                WHILE : while(true){
                    System.out.println("\n\n필터링하실 번호를 입력해 주세요");
                    System.out.println("[ 1. 5만원 미만 | 2. 5만원 이상 ~ 10만원 미만 | 3. 10만원 이상 ~ 15만원 미만 | 4. 고가와인 | 9. 뒤로가기 ]");
                    String number= input(">> ");
                    switch (number) {
                        case "1":
                            min =0; max=5.0; break WHILE;
                        case "2":
                            min =5.0; max=10.0; break WHILE;
                        case "3":
                            min =10.0; max=15.0; break WHILE;
                        case "4":
                            min =15.0; max=1000.0; break WHILE;
                        case "9":
                            wineFiltering(); break WHILE;
                        default:
                            numberWarning();
                    }
                }
                filteredWineList=wineRepository.findWineByWinePrice(min,max); //가격으로 와인 필터링
                printWineList(filteredWineList,3);//필터링 된 와인 출력
                chooseWine();//필터링 된 와인에서 구매or장바구니 할 와인 선택
                break;

            case "9":{
                System.out.println("\n");
                return;
            }
            default:
                numberWarning();
        }
    }

    //필터링 된 와인 출력
    public void printWineList(List<Wine> filteredWineList,int number){
        if(filteredWineList==null) System.out.println("찾으시는 와인이 없습니다.");
        //필터링 된 와인 출력 (10개씩 보여주기 / 선택한 필터링은 안보여주기)
        else{
            switch (number){
                case 1: //type
                      filteredWineList.stream() .limit(10)
                            .forEach(d -> {
                                    String s = "[ 와인 가격 = " + d.getPrice()+ " | 원산지 = " + d.getOrigin()+ " | 이름 = " + d.getName() + " ]";
                                System.out.println( s ); }); break;
                case 2://origin
                    filteredWineList.stream() .limit(10)
                            .forEach(d -> {
                                String s = "[ 와인 가격 = " + d.getPrice()+ " | 와인 타입 = " + d.getWineType()+ " | 이름 = " + d.getName()+ " ]";
                                System.out.println( s );}); break;
                case 3://price
                    filteredWineList.stream() .limit(10)
                            .forEach(d -> {
                                String s =  "[ 와인타입 = " + d.getWineType()+ " | 원산지 = " + d.getOrigin()+ " | 이름 = " + d.getName()+ " ]";
                                System.out.println( s );}); break;
            }
        }
    }

    //필터링 된 와인에서 구매 or 장바구니 할 와인 선택 + 구매 or 장바구니 선택
    private void chooseWine(){
        System.out.println("\n\n원하는 와인의 이름을 작성해주세요 [9 : 다시선택]"); //++
        String wineName=input(">> ");
        if(wineName.equals("9")) {
            System.out.println("\n");
            view();
        }

        Wine choosingWine =wineRepository.chooseWine(wineName); //선택한 와인 객체
        if(choosingWine !=null){
            askCartOrBuy(choosingWine); //구매인지 장바구니인지 물어봄
        }
        //작성한 와인이 없으면
        else if(choosingWine ==null){
            System.out.println("찾으시는 와인이 없습니다. 다시 입력해주세요.");
            chooseWine();
        }
    }

    //구매인지 장바구니인지 물어보고 리스트에 담음
    private void askCartOrBuy(Wine choosingWine){
        WHILE:while(true){
            System.out.println("\n");
            System.out.println("[ 1. 바로 구매하기 | 2. 장바구니에 담기 | 9. 뒤로가기]");
            String number= input(">> ");
            switch (number){
                case "1":
                    paymentMethod(); //결제 진행 방식
                    addPurchase(choosingWine); //구매한 리스트에 담기
                    wineRepository.popTotalWineList(choosingWine);//전체와인 리스트에서 삭제
                    break WHILE;
                case "2":
                    addCart(choosingWine);
                    break WHILE;
                case "9" :
                    return;
                default:
                    numberWarning();
            }
        }
    }
    //장바구니에서 구매하기
    public void buyFromCart(Wine wineWantToBuy){
        paymentMethod(); //결제진행하고
        addPurchase(wineWantToBuy); //구매한 와인 리스트에 넣고
        wineRepository.popCartWine(wineWantToBuy); //장바구니 리스트에서는 삭제
        wineRepository.popTotalWineList(wineWantToBuy);//전체와인 리스트에서 삭제
        System.out.println("장바구니에서 구매 완료\n\n");
    };

    //결제 방식 선택
    private void paymentMethod(){
        System.out.println("결제를 진행하겠습니다.");
        System.out.println("\n\n원하시는 결제 방식 번호를 입력해 주세요");
        System.out.println("[1. 일반결제 | 2. CocoaPay | 3. NiPay ]");
        input(">> ");
        dottedPrint();
        System.out.println("결제가 정상적으로 완료되었습니다."); //++
    }

    //구매 리스트에 선택한 와인 호출
    private void addPurchase(Wine choosingWine) {
        wineRepository.purchaseList(choosingWine);
    }

    //장바구니 리스트에 선택한 와인 호출
    private void addCart(Wine choosingWing) {
        System.out.println("와인이 정상적으로 장바구니에 담겼습니다.\n\n");
        wineRepository.cartList(choosingWing);
    }

    //번호 잘못 입력했을 때
    public void numberWarning(){
        System.out.println("\n\n번호를 다시 입력해주세요.");
    }
    
    //결제중 . . . 시간차 출력

    public static void dottedPrint(){
        String s="결제중 . . . ";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}

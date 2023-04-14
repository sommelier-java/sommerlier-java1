package employees.filters;

import static Wine_yejin.util.Utility.input;
import static employees.filters.SelectedMethods.*;

public class WineSelectorByFilter {


    // 사용자가 국가별 카테고리를 선택하면 나오는 화면
    public static void wineCountrySelect() {
        String countrySelected;

        while (true) {
        System.out.println("\n\n==== 국가를 선택하세요 ====");
        System.out.println("1. 스페인");
        System.out.println("2. 이탈리아");
        System.out.println("3. 프랑스");
        System.out.println("4. 미국");
        System.out.println("5. 포르투갈");
        System.out.println("9. 뒤로가기");
        System.out.println("------------------------");
        String countryNum = input(">>> ");
            switch (countryNum) {
                // 이 부분은 country num 값에따라 나라도 mapping 하고 싶다.
                // 선택하면 스페인을 변수에 담아 밑에 나라별 필터의 매개변수에 담는다.
                case "1": filteredByCountryName(countrySelected = "스페인");break;

                case "2": filteredByCountryName(countrySelected = "이탈리아");break;

                case "3": filteredByCountryName(countrySelected = "프랑스");break;

                case "4": filteredByCountryName(countrySelected = "미국");break;

                case "5": filteredByCountryName(countrySelected = "포르투갈"); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");

            }

        }
    }


    // 사용자가 금액별 카테고리를 선택하면 나오는 화면
    public static void winePriceSelect() {
        int price;

        while (true) {
        System.out.println("\n\n==== 가격대를 선택하세요 ====");
        System.out.println("1. 3만원  ↓");
        System.out.println("2. 6만원  ↓");
        System.out.println("3. 10만원 ↓");
        System.out.println("4. 14만원 ↓");
        System.out.println("5. 고가와인 ");
        System.out.println("9. 뒤로가기");
        System.out.println("------------------------");
        String priceNum = input(">>> ");
            switch (priceNum) {
                case "1": filteredByPrice(price  = 3); break;

                case "2": filteredByPrice(price = 6); break;

                case "3": filteredByPrice(price = 10); break;

                case "4": filteredByPrice(price = 14); break;

                case "5": filteredByPrice(price = 15); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");

            }
        }
    }


    // 사용자가 타입별 카테고리를 선택하면 나오는 화면
    public static void wineTypeSelect() {
        String typeSelected;

        while (true) {
//            System.out.println("⌈⌉⌋⌊⋯⋰⋱⋮");

            System.out.println("⋰ ⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯ ⋱");
            System.out.println("⋮   ==== 타입을 선택하세요 ====   ⋮");
            System.out.println("⋮        1.  화  이  트         ⋮");
            System.out.println("⋮        2.    로  제           ⋮");
            System.out.println("⋮        3.    레  드           ⋮");
            System.out.println("⋮        4.  스 파 클 링         ⋮");
            System.out.println("⋮        5.  주 정 강 화         ⋮");
            System.out.println("⋮        9.  뒤 로 가 기         ⋮");
            System.out.println("⋱ ⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯ ⋰\n");
        String typeNum = input(">>> ");
            switch (typeNum) {
                case "1": filteredByType(typeSelected = "화이트"); break;

                case "2": filteredByType(typeSelected = "로제"); break;

                case "3": filteredByType(typeSelected = "레드"); break;

                case "4": filteredByType(typeSelected = "스파클링"); break;

                case "5": filteredByType(typeSelected = "주정강화"); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

                default:
                    System.out.println("번호를 제대로 입력해주세요");

            }

        }
    }


}

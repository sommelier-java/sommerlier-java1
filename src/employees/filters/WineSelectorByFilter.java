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
                case "1":
                    countrySelected = "스페인";
                    // 선택하면 스페인을 변수에 담아 밑에 나라별 필터의 매개변수에 담는다.
                    filteredByCountryName(countrySelected);
                    break;

                case "2":
                    countrySelected = "이탈리아";
                    filteredByCountryName(countrySelected);
                    break;

                case "3":
                    countrySelected = "프랑스";
                    filteredByCountryName(countrySelected);
                    break;

                case "4":
                    countrySelected = "미국";
                    filteredByCountryName(countrySelected);
                    break;

                case "5":
                    countrySelected = "포르투갈";
                    filteredByCountryName(countrySelected);
                    break;

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
        System.out.println("\n\n==== 가격대를 선택하세요 ====\n====   20% 할인 추후 적용   ====");
        System.out.println("1. 3만원  ↓");
        System.out.println("2. 6만원  ↓");
        System.out.println("3. 10만원 ↓");
        System.out.println("4. 14만원 ↓");
        System.out.println("5. 고가와인 ");
        System.out.println("9. 뒤로가기");
        System.out.println("------------------------");
        String priceNum = input(">>> ");
            switch (priceNum) {
                case "1":
                    price = 3;
                    filteredByPrice(price);
                    break;

                case "2":
                    price = 6;
                    filteredByPrice(price);
                    break;

                case "3":
                    price = 10;
                    filteredByPrice(price);
                    break;

                case "4":
                    price = 14;
                    filteredByPrice(price);
                    break;

                case "5":
                    price = 15;
                    filteredByPrice(price);
                    break;

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
        System.out.println("\n\n==== 타입을 선택하세요 ====");
        System.out.println("1. 화이트");
        System.out.println("2. 로제");
        System.out.println("3. 레드");
        System.out.println("4. 스파클링");
        System.out.println("5. 주정강화");
        System.out.println("9. 뒤로가기");
        System.out.println("------------------------");
        String typeNum = input(">>> ");
            switch (typeNum) {
                case "1":
                    typeSelected = "화이트";
                    filteredByType(typeSelected);
                    break;

                case "2":
                    typeSelected = "로제";
                    filteredByType(typeSelected);
                    break;

                case "3":
                    typeSelected = "레드";
                    filteredByType(typeSelected);
                    break;

                case "4":
                    typeSelected = "스파클링";
                    filteredByType(typeSelected);
                    break;


                case "5":
                    typeSelected = "주정강화";
                    filteredByType(typeSelected);
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

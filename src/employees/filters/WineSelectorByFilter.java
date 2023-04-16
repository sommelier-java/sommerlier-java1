package employees.filters;

import static Wine_yejin.util.Utility.input;
import static employees.filters.SelectedMethods.*;

public class WineSelectorByFilter {




    // 사용자가 국가별 카테고리를 선택하면 나오는 화면
    public static void wineCountrySelect( ) {

        String countrySelected;

        while (true) {
            System.out.println("\n▰▰▰▰▰▰▰  국가를 선택하세요  ▰▰▰▰▰▰▰");
            System.out.println("\t\t\t1 . 스  페  인");
            System.out.println("\t\t\t2 . 이 탈 리 아");
            System.out.println("\t\t\t3 . 프  랑  스");
            System.out.println("\t\t\t4 . 미      국");
            System.out.println("\t\t\t5 . 포 르 투 갈");
            System.out.println("\t\t\t9 . 뒤 로 가 기");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

            System.out.println("원하시는 메뉴 번호를 입력해 주세요");
            String countryNum = input(">> ");

            switch (countryNum) {
                // 이 부분은 country num 값에따라 나라도 mapping 하고 싶다.
                // 선택하면 스페인을 변수에 담아 밑에 나라별 필터의 매개변수에 담는다.
                case "1": filteredByCountryName(countrySelected = "스페인");break;

                case "2": filteredByCountryName(countrySelected = "이탈리아");break;

                case "3": filteredByCountryName(countrySelected = "프랑스");break;

                case "4": filteredByCountryName(countrySelected = "미국");break;

                case "5": filteredByCountryName(countrySelected = "포르투갈"); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n");
                    return;

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }

        }
    }


    // 사용자가 금액별 카테고리를 선택하면 나오는 화면
    public static void winePriceSelect() {
        int price;

        while (true) {
            System.out.println("\n▰▰▰▰▰▰▰  가격을 선택하세요  ▰▰▰▰▰▰▰");
            System.out.println("\t\t\t1 .  3    만   원");
            System.out.println("\t\t\t2 .  6    만   원");
            System.out.println("\t\t\t3 .  10   만   원");
            System.out.println("\t\t\t4 .  14   만   원");
            System.out.println("\t\t\t5 . 고  가  와  인");
            System.out.println("\t\t\t9 . 뒤  로  가  기");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

            System.out.println("원하시는 메뉴 번호를 입력해 주세요");
            String priceNum = input(">> ");

            switch (priceNum) {
                case "1": filteredByPrice(price  = 3); break;

                case "2": filteredByPrice(price = 6); break;

                case "3": filteredByPrice(price = 10); break;

                case "4": filteredByPrice(price = 14); break;

                case "5": filteredByPrice(price = 15); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n");
                    return;

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }
        }
    }


    // 사용자가 타입별 카테고리를 선택하면 나오는 화면
    public static void wineTypeSelect() {
        String typeSelected;

        while (true) {
            System.out.println("\n▰▰▰▰▰▰▰  타입을 선택하세요  ▰▰▰▰▰▰▰");
            System.out.println("\t\t\t1 . 화  이  트");
            System.out.println("\t\t\t2 . 로      제");
            System.out.println("\t\t\t3 . 레      드");
            System.out.println("\t\t\t4 . 스 파 클 링");
            System.out.println("\t\t\t5 . 주 정 강 화");
            System.out.println("\t\t\t9 . 뒤 로 가 기");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");

            System.out.println("원하시는 메뉴 번호를 입력해 주세요\n");

            String typeNum = input(">> ");

            switch (typeNum) {
                case "1": filteredByType(typeSelected = "화이트"); break;

                case "2": filteredByType(typeSelected = "로제"); break;

                case "3": filteredByType(typeSelected = "레드"); break;

                case "4": filteredByType(typeSelected = "스파클링"); break;

                case "5": filteredByType(typeSelected = "주정강화"); break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n");
                    return;

                default:
                    System.out.println("\n번호를 제대로 입력해주세요");

            }

        }
    }


}

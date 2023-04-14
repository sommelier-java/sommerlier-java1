package employees.filters;


import WineRepository.Wine;

import java.util.List;

import static WineRepository.TotalWine.valueList;
import static employees.views.WineBuySelectView.wineSelectToBuy;
import static java.util.stream.Collectors.toList;

public class SelectedMethods {


    public static List<Wine> filteredWineList;

// -------------------- 나라 별 와인 출력 메서드 시작 -------------------------------


    // 1. 넘어 온 파라미터에 따라 각 나라의 와인 리스트가 출력된다.
    protected static void filteredByCountryName(String countrySelected) {
        System.out.printf("\n\n== %s 와인 ==\n\n", countrySelected);
        filteredWineList = valueList.stream()
                .filter(wine -> wine.getOrigin().equals(countrySelected))
                .limit(10)
                .collect(toList());
//        filteredWineList.forEach(System.out.println());


        filteredWineList.forEach(w ->
                {
                    try {
                    String x = "[ 와인 가격 = " + w.getPrice()
                            + " | 와인 타입 = " + w.getWineType()
                            + " | 이름 = " + w.getName().substring(0, 6) + " ]";

                        System.out.println(x);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
        );


        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);
    }

// -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------


// -------------------- 타입 별 와인 출력 메서드 시작 -------------------------------

    protected static void filteredByType(String typeSelected) {
        System.out.printf("\n\n== %s 와인 ==\n\n", typeSelected);

        filteredWineList = valueList.stream()
                .filter(wine -> wine.getWineType().equals(typeSelected))
                .limit(10)
                .collect(toList());
        filteredWineList.forEach(w ->
                {
                    System.out.printf("[ 와인 가격 : %7.2f | 원산지 : %5s | 이름 : %5s ]\n", w.getPrice(), w.getOrigin(), w.getName());
                }
        );


        wineSelectToBuy(filteredWineList);
    }

// -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------

    // -------------------- 금액 별 와인 출력 메서드 시작 -------------------------------
    protected static void filteredByPrice(int price) {
        // 금액이 15만원 미만이면
        if (price < 15) {
            System.out.printf("\n\n==== %d 만원 ↓  ====\n\n", price);

            filteredWineList = valueList.stream()
                    .filter(wine -> wine.getPrice() < Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());

        } else {
            System.out.printf("\n\n==== 고가와인 ====\n\n", price);

            filteredWineList = valueList.stream()
                    .filter(wine -> wine.getPrice() > Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());
        }

        filteredWineList.forEach(w ->
                {
                    String x = " [ 와인타입 = " + w.getWineType()
                            + " | 원산지 = " + w.getOrigin()
                            + " | 이름 = " + w.getName().substring(0, 6) + " ]";
                    System.out.println( x );
                }
        );
        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);

    }
// -------------------- 금액 별 와인 출력 메서드 종료 -------------------------------


}

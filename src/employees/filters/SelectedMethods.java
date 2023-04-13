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
        System.out.printf("\n\n== %s 와인 ==\n", countrySelected);
        filteredWineList  = valueList.stream()
                .filter(wine -> wine.getOrigin().equals(countrySelected))
                .limit(10)
                .collect(toList());
        filteredWineList.forEach(System.out::println);



        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);
    }

// -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------


// -------------------- 타입 별 와인 출력 메서드 시작 -------------------------------

    protected static void filteredByType(String typeSelected) {
        System.out.printf("\n\n== %s 와인 ==\n", typeSelected);

        filteredWineList  = valueList.stream()
                .filter(wine -> wine.getWineType().equals(typeSelected))
                .limit(10)
                .collect(toList());
        filteredWineList.forEach(System.out::println);



        wineSelectToBuy(filteredWineList);
    }

// -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------

// -------------------- 금액 별 와인 출력 메서드 시작 -------------------------------
    protected static void filteredByPrice(int price) {
        // 금액이 15만원 미만이면
        if (price < 15) {
            System.out.printf("\n\n==== %d 만원 ↓  ====\n", price);

            filteredWineList = valueList.stream()
                    .filter(wine -> wine.getPrice() < Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());

        } else {
            System.out.printf("\n\n==== 고가와인 ====\n", price);

            filteredWineList = valueList.stream()
                    .filter(wine -> wine.getPrice() > Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());
        }

        filteredWineList.forEach(System.out::println);
        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);

    }
// -------------------- 금액 별 와인 출력 메서드 종료 -------------------------------







}

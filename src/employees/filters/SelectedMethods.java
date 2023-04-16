package employees.filters;


import WineRepository.Wine;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static WineRepository.TotalWine.valueList;
import static employees.views.WineBuySelectView.wineSelectToBuy;
import static java.util.stream.Collectors.toList;

public class SelectedMethods {


    public static List<Wine> filteredWineList;

// -------------------- 나라 별 와인 출력 메서드 시작 -------------------------------

    // 1. 넘어 온 파라미터에 따라 각 나라의 와인 리스트가 출력된다.
    protected static void filteredByCountryName(String countrySelected) {
        int targetLength = 10;
        System.out.printf("\n▰▰▰▰▰▰▰▰▰▰▰▰▰  %s 와인  ▰▰▰▰▰▰▰▰▰▰▰▰▰\n", countrySelected);

        List<Wine> countryList = valueList.stream()
                .filter(wine -> wine.getOrigin().equals(countrySelected))
                .limit(10)
                .collect(toList());
        Collections.shuffle(filteredWineList = countryList);

        AtomicInteger i = new AtomicInteger(1);
        filteredWineList.forEach(w -> {
            System.out.printf("[ "+ i + " 이름 = %10s | 와인 가격 = %3.2f | 타입 = %3s ]\n"
                    , w.getName(), w.getPrice(), w.getWineType());

            i.addAndGet(1);
        });

        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);
    }

// -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------


// -------------------- 타입 별 와인 출력 메서드 시작 -------------------------------

    protected static void filteredByType(String typeSelected) {

        System.out.printf("\n▰▰▰▰▰▰▰▰▰▰▰▰▰  %s 와인  ▰▰▰▰▰▰▰▰▰▰▰▰▰\n", typeSelected);


        List<Wine> typeList = valueList.stream()
                .filter(wine -> wine.getWineType().equals(typeSelected))
                .limit(10)
                .collect(toList());
        Collections.shuffle(filteredWineList = typeList);

        AtomicInteger i = new AtomicInteger(1);
        filteredWineList.forEach(w -> {
            System.out.printf("[ "+ i + " 이름 = %10s | 와인 가격 = %3.2f | 원산지 = %5s ]\n"
                    , w.getName(), w.getPrice(), w.getOrigin());

            i.addAndGet(1);
        });


        wineSelectToBuy(filteredWineList);
    }

    // -------------------- 나라 별 와인 출력 메서드 종료 -------------------------------

    // -------------------- 금액 별 와인 출력 메서드 시작 -------------------------------
    protected static void filteredByPrice(int price) {
        // 금액이 15만원 미만이면
        if (price < 15) {

            System.out.printf("\n▰▰▰▰▰▰▰▰▰▰▰▰▰  %d 만원 ↓  ▰▰▰▰▰▰▰▰▰▰▰▰▰\n", price);

            System.out.printf("\n==== %d 만원 ↓  ====\n", price);

            List<Wine> cheapList = valueList.stream()
                    .filter(wine -> wine.getPrice() < Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());
            Collections.shuffle(filteredWineList = cheapList);


        } else {
            System.out.printf("\n▰▰▰▰▰▰▰▰▰▰▰▰▰  %d 만원 ↓  ▰▰▰▰▰▰▰▰▰▰▰▰▰\n", price);

            List<Wine> expensiveList = valueList.stream()
                    .filter(wine -> wine.getPrice() > Double.parseDouble(String.valueOf(price)) * 10)
                    .limit(10)
                    .collect(toList());
            Collections.shuffle(filteredWineList = expensiveList);


        }

        AtomicInteger i = new AtomicInteger(1);
        filteredWineList.forEach(w -> {
            System.out.printf("[ "+ i + " 이름 = %10s | 타입 = % | 원산지 = %5s ]\n"
                    , w.getName(), w.getPrice(), w.getOrigin());

            i.addAndGet(1);
        });
        //   와인리스트를 본 후 사고싶은 와인 고르는 함수
        //   여기도 출력된 국가의 리스트에 따라 구매 할 와인을 선택하는 함수를 호출한다
        wineSelectToBuy(filteredWineList);

    }
// -------------------- 금액 별 와인 출력 메서드 종료 -------------------------------


}

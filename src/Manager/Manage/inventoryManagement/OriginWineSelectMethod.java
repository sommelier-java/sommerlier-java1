package Manager.Manage.inventoryManagement;

import WineRepository.Wine;

import java.util.List;
import java.util.stream.Collectors;

import static WineRepository.TotalWine.valueList;

public class OriginWineSelectMethod {

    private static void isFiltered(String nation) {
        System.out.println("와인 총 개수 : " + nation);
        valueList.stream()
                .filter(w -> w.getOrigin().equals(nation))
                .forEach(System.out::println);
//        long count = valueList.stream()
//                .filter(w -> w.getOrigin().equals(nation))
//                .count();
//
//        return count.forEach(System.out::println);
    }

    public static void spainWine() {

        List<Wine> SpainWine = valueList.stream()
                .filter(w -> w.getOrigin() == "스페인")
                .collect(Collectors.toList());
        SpainWine.forEach(w ->
                { String a = "[ 와인 이름 = " + w.getName()
                + " | 와인 타입 = " + w.getWineType()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

        System.out.println(a);
                });

        long spainWineCount = valueList.stream()
                .filter(w -> w.getOrigin().equals("스페인"))
                .count();
        System.out.println("\n스페인 와인 개수: " + spainWineCount);
    }

    public static void italyWine() {

        List<Wine> ItalyWine = valueList.stream()
                .filter(w -> w.getOrigin() == "이탈리아")
                .collect(Collectors.toList());
        ItalyWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 와인 타입 = " + w.getWineType()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long italyWineCount = valueList.stream()
                .filter(w -> w.getOrigin().equals("이탈리아"))
                .count();
        System.out.println("\n이탈리아 와인 개수: " + italyWineCount);
    }

    public static void franceWine() {

        List<Wine> franceWine = valueList.stream()
                .filter(w -> w.getOrigin() == "프랑스")
                .collect(Collectors.toList());
        franceWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 와인 타입 = " + w.getWineType()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long franceWineCount = valueList.stream()
                .filter(w -> w.getOrigin().equals("프랑스"))
                .count();
        System.out.println("\n프랑스 와인 개수: " + franceWineCount);
    }

    public static void usaWine() {

        List<Wine> usaWine = valueList.stream()
                .filter(w -> w.getOrigin() == "미국")
                .collect(Collectors.toList());
        usaWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 와인 타입 = " + w.getWineType()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long usaWineCount = valueList.stream()
                .filter(w -> w.getOrigin().equals("미국"))
                .count();
        System.out.println("\n미국 와인 개수: " + usaWineCount);

    }

    public static void portugalWine() {

        List<Wine> PortugalWine = valueList.stream()
                .filter(w -> w.getOrigin() == "포르투갈")
                .collect(Collectors.toList());
        PortugalWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 와인 타입 = " + w.getWineType()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long portugalWineCount = valueList.stream()
                .filter(w -> w.getOrigin().equals("포르투갈"))
                .count();
        System.out.println("\n포르투갈 와인 개수: " + portugalWineCount);

    }
}
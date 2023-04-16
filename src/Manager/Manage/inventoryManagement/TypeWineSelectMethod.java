package Manager.Manage.inventoryManagement;

import WineRepository.Wine;

import java.util.List;
import java.util.stream.Collectors;

import static WineRepository.TotalWine.valueList;

public class TypeWineSelectMethod {

    public static void redWine() {

        List<Wine> RedWine = valueList.stream()
                .filter((w -> w.getWineType() == "레드"))
                .collect(Collectors.toList());
        RedWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 원산지 = " + w.getOrigin()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+ " ]";

            System.out.println(a);
        });

        long redWineCount = valueList.stream()
                .filter(w -> w.getWineType().equals("레드"))
                .count();
        System.out.println("\n레드와인 개수: " + redWineCount);
    }

    public static void whiteWine(){

        List<Wine> WhiteWine = valueList.stream()
                .filter((w -> w.getWineType() == "화이트"))
                .collect(Collectors.toList());
        WhiteWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 원산지 = " + w.getOrigin()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });


        long whiteWineCount = valueList.stream()
                .filter(w -> w.getWineType().equals("화이트"))
                .count();
        System.out.println("\n화이트와인 개수: " + whiteWineCount);
    }

    public static void sparklingWine(){

        List<Wine> SparklingWine = valueList.stream()
                .filter((w -> w.getWineType() == "스파클링"))
                .collect(Collectors.toList());
        SparklingWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 원산지 = " + w.getOrigin()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long sparklingWineCount = valueList.stream()
                .filter(w -> w.getWineType().equals("스파클링"))
                .count();
        System.out.println("\n스파클링와인 개수: " + sparklingWineCount);
    }

    public static void roseWine(){

        List<Wine> RoseWine = valueList.stream()
                .filter((w -> w.getWineType() == "로제"))
                .collect(Collectors.toList());
        RoseWine.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 원산지 = " + w.getOrigin()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long roseWineCount = valueList.stream()
                .filter(w -> w.getWineType().equals("로제"))
                .count();
        System.out.println("\n로제와인 개수: " + roseWineCount);
    }

    public static void extraWine(){

        List<Wine> extraAlcohol = valueList.stream()
                .filter((w -> w.getWineType() == "주정강화"))
                .collect(Collectors.toList());
        extraAlcohol.forEach(w ->
        { String a = "[ 와인 이름 = " + w.getName()
                + " | 원산지 = " + w.getOrigin()
                + " | 가격 = " + w.getPrice()
                + " | 알콜 = " + w.getAlcohol()+" ]";

            System.out.println(a);
        });

        long extraWineWineCount = valueList.stream()
                .filter(w -> w.getWineType().equals("주정강화"))
                .count();
        System.out.println("\n주정강화와인 개수: " + extraWineWineCount);
    }



}

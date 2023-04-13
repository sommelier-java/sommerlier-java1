package employees.filters;


import WineRepository.Wine;

import java.lang.reflect.Type;

public class WinePrice {

    public WinePrice(Wine wine){
        this.price = wine.getPrice();
        this.name = wine.getName();
        this.type = wine.getWineType().getClass();
    }

    private final String name;
    private final Double price;
    private Type type;

    public WinePrice(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "와인 이름 : " + name + "|" +
                "타입" + type + "\n";
    }
}

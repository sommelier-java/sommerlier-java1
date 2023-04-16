//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package WineRepository;

import java.io.Serializable;

public class Wine implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String origin;
    private String wineType;
    private double price;
    private double alcohol;

    public Wine() {
    }

    public Wine(String name, String origin, String wineType, double price, double alcohol) {
        this.name = name;
        this.origin = origin;
        this.wineType = wineType;
        this.price = price;
        this.alcohol = alcohol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWineType() {
        return this.wineType;
    }

    public void setWineType(String wineType) {
        this.wineType = wineType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAlcohol() {
        return this.alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public String toString() {
        return "[ 이름= " + this.name + " | 국가= " + this.origin + " | 와인타입= " + this.wineType + " | 가격= " + this.price + " | 도수= " + this.alcohol + " ]";
    }
}


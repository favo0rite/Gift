import java.util.ArrayList;
import java.util.List;

public class Chocolate extends Candy  {

    private String name;
    private double weight;
    private double price;
    String uniqueParameter;


    public Chocolate(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    @Override
    public String toString() {
        return "Шоколад{" +
                "Имя='" + name + '\'' +
                ", Вес=" + weight +
                ", Цена=" + price +
                ", Уникальное Значение='" + uniqueParameter + '\'' +
                '}';
    }


}

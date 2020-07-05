public class Sweet extends Candy {
    private String name;
    private double weight;
    private double price;
    String uniqueParameter;

    public Sweet(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getUniqueParameter() {
        return uniqueParameter;
    }

    @Override
    public String toString() {
        return "Конфета{" +
                "Имя='" + name + '\'' +
                ", Вес=" + weight +
                ", Цена=" + price +
                ", Уникальное Значение='" + uniqueParameter + '\'' +
                '}';
    }
}

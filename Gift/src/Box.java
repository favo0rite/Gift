import java.util.ArrayList;
import java.util.List;

public class Box implements MethodsForBox {
    private List<Candy> candies = new ArrayList<>();



    @Override
    public List<Candy> addCandy(Candy candy){
        candies.add(candy);
        return candies;
    }

    @Override
    public void deleteCandy(int i){
        candies.remove(i);
    }

    @Override
    public void deleteLastCandy(){
        candies.remove(candies.size()-1);
    }

    @Override
    public double calculateWeight() {
        double weight = 0;
        for(int i=0; i < candies.size(); i++){
            weight = weight + candies.get(i).getWeight();
        }
        return weight;
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        for(int i = 0; i < candies.size(); i++){
            price = price + candies.get(i).getPrice();
        }
        return price;
    }

    @Override
    public void printWeightAndPrice() {
        System.out.println("Вес коробочки = " + calculateWeight() + " грамм");
        System.out.println("Цена коробочки = " + calculatePrice() + " рублей");
    }


    @Override
    public void printAllInformation(){
        System.out.println("Вся информация о конфетах:");
        for(int i=0; i < candies.size(); i++){
            System.out.println(candies.get(i).toString());
        }
    }


}

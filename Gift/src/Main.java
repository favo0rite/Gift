public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        Chocolate alenka = new Chocolate("Аленка", 50, 30, "Много молока");
        Chocolate twix = new Chocolate("Твикс", 50, 35, "Две палочки");
        Sweet raffaello = new Sweet("Рафаэлло", 100, 70, "Кокос");
        Cracker cracker = new Cracker("Крекер",37.5, 86.3, "Орехи" );

        box.addCandy(alenka);
        box.addCandy(twix);
        box.addCandy(raffaello);
        box.addCandy(cracker);
        box.deleteCandy(0);
        box.deleteLastCandy();
        box.calculatePrice();
        box.calculateWeight();
        box.printWeightAndPrice();
        box.printAllInformation();


    }
}

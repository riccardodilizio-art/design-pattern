package bar;

public class Demo {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getPrice());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getPrice());
    }
}

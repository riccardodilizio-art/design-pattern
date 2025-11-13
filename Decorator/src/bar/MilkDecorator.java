package bar;

public class MilkDecorator extends BeverageDecorator{

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", con latte";
    }
    @Override
    public double getPrice() {
        return beverage.getPrice() + 0.50;
    }
}

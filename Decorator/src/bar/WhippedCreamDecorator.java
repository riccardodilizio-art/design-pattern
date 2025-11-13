package bar;

public class WhippedCreamDecorator extends BeverageDecorator {
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", con panna montata";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 1.0;
    }
}

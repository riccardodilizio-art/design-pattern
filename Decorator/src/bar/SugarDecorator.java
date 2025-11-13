package bar;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Con zucchero ";
    }
    @Override
    public double  getPrice() {
        return super.getPrice() + 0.10;
    }
}

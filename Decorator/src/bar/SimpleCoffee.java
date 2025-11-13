package bar;

public class SimpleCoffee implements  Beverage {

    @Override
    public String getDescription() {
        return "Caffe' semplice";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}

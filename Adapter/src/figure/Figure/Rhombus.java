package figure.Figure;

public class Rhombus implements GeometricShape{
    private double diagonal1 ;
    private double diagonal2 ;
    public  Rhombus(double diagonal1, double diagonal2){
        super();
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }
    public Rhombus(){}


    @Override
    public double perimeter() {
        return 2 * Math.sqrt(Math.pow(diagonal1,2) + Math.pow(diagonal2,2)) ;
    }

    @Override
    public double area() {
        return 0.5 * diagonal1 * diagonal2;
    }
}

package figure.Figure;

public class Rectangle implements GeometricShape {
    public double  width;
    public double height;

    public Rectangle(){}
    public Rectangle(double width,double height){
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

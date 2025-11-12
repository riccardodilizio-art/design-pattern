package figure.adapters;

import figure.Figure.GeometricShape;
import figure.Figure.Shape;

public class GeometricShapeObjectAdapter implements Shape {
    private GeometricShape adaptee;
    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public double perimeter() {
        return adaptee.perimeter();
    }
    @Override
    public double area() {
        return adaptee.area();
    }
}

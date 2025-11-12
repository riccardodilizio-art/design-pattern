package figure;

import figure.Figure.Rectangle;
import figure.Figure.Shape;
import figure.Figure.Square;
import figure.Figure.Triangle;
import figure.adapters.GeometricShapeObjectAdapter;
import figure.adapters.RhombusAdapter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    List<Shape> shapes = new ArrayList<>();
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void areas(){
        shapes.forEach(shape -> System.out.println(shape.getClass().getSimpleName() + " area: " + shape.area()));
    }
    public void perimeters(){
        shapes.forEach(shape -> System.out.println(shape.getClass().getSimpleName() + " perimeter: " + shape.perimeter()));
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.addShape(new Triangle());
        demo.addShape(new Square());

        demo.addShape(new GeometricShapeObjectAdapter(new Rectangle()));

        demo.addShape(new RhombusAdapter());

        demo.areas();
        demo.perimeters();
    }
}

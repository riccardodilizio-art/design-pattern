package shape.shapes;

public class Rectangle extends  Shape {
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        if (rectangle != null){
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }
    @Override
    public Shape clone() {
        return  new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle rectangle) || super.equals(obj)){
            return false;
        }
        return  rectangle.width == this.width && rectangle.height == this.height;
    }
}

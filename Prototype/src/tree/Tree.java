package tree;

public abstract class Tree {
    private String position;
    private double height;
    private double width;

    public Tree(String position,  double height, double width) {
        this.position = position;
        this.height = height;
        this.width = width;
    }
    public Tree(){}

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public abstract Tree clone();
}

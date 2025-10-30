package tree;

public class PineTree extends  Tree {

    public PineTree(String position,double height,double width) {
        super(position,height,width);
    }
    public PineTree(){}

    @Override
    public Tree clone() {
        return new PineTree(this.getPosition(), this.getHeight(), this.getWidth());
    }
}

package tree;

public class PlasticTree extends  Tree {


    public PlasticTree(String position ,double height, double width) {
        super(position, height,width);
    }

    public PlasticTree(){}


    @Override
    public Tree clone() {
        return new PlasticTree(this.getPosition(), this.getHeight(), this.getWidth());
    }
}

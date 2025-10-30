package tree;

public class Application {
        public static void main(String[] args) {
            PlasticTree t1 = new PlasticTree("nord", 10, 20);
            PlasticTree t2 = (PlasticTree) t1.clone();
            t2.setPosition("sud");
            t2.setHeight(50);

            System.out.println("Original: " + t1.getPosition() + ", " + t1.getHeight());
            System.out.println("Clone: " + t2.getPosition() + ", " + t2.getHeight());
        }
    }


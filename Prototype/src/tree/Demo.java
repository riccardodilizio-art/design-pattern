package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Demo {
    @Test
    public void testTree() {
        PlasticTree plasticTree = new PlasticTree();
        plasticTree.setHeight(10);
        plasticTree.setWidth(20);
        plasticTree.setPosition("nord");

        //Cloniamo l'albero
        PlasticTree plasticTree2 = (PlasticTree) plasticTree.clone();

        //modifico il clone
        plasticTree2.setHeight(100);
        plasticTree2.setWidth(10);
        plasticTree2.setPosition("nord-est");

        //Il clone deve essere diverso dall'originale
        assertNotEquals(plasticTree.getPosition(), plasticTree2.getPosition());
        assertNotEquals(plasticTree.getHeight(), plasticTree2.getHeight());

        //Il clone deve essere indipendente
        plasticTree.setHeight(1000);
        assertNotEquals(plasticTree.getHeight(), plasticTree2.getHeight());

        //verifichiamo clonazione in lista
        PlasticTree plasticTree3 = new PlasticTree();
        plasticTree3.setHeight(100);
        plasticTree3.setWidth(10);
        plasticTree3.setPosition("nord-est oppure nord-ovest");

        PineTree pineTree = new PineTree();
        pineTree.setHeight(10);
        pineTree.setWidth(20);
        pineTree.setPosition("nord");


        List<Tree> trees = Arrays.asList(plasticTree3, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::clone).toList();

        assertEquals(trees.size(), treeClones.size());
        assertNotSame(trees.getFirst(), treeClones.getFirst());
        assertEquals(trees.getFirst().getHeight(), treeClones.getFirst().getHeight());
        assertEquals(trees.getFirst().getPosition(), treeClones.getFirst().getPosition());
    }
}

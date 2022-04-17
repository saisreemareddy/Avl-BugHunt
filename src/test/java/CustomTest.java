
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomTest {

    public static boolean debug = false;

    //testing method for find
    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CustomTest.test1");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree.Node node11 = aVLTree0.find((-1));
        AVLTree.Node node12 = aVLTree0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(100);

    }


}

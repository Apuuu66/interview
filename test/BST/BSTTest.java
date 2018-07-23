package BST;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/26
 */
public class BSTTest {

    @Test
    public void testBSTTest() {
        BST<Integer> bst = new BST<>();
        int nums[] = {5, 3, 6, 8, 9, 2, 1};
        for (int num : nums) {
            bst.add(num);
        }
        bst.preOrder();
        bst.levelOrder();
//    System.out.println(bst);
        bst.proOrderNR();
    }
}
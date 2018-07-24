import oo.A;
import org.junit.Test;
import sword2offer.*;

/**
 * @author matolr.
 * @date 2018/2/25.
 */
public class CoderTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void t_Code_2() {
        Code_2 code_2 = new Code_2();
        StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
        String s = code_2.replaceSpace(stringBuffer);
        System.out.println(s);
    }

    @Test
    public void t_Code_4() {
        Code_4 code_4 = new Code_4();
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};
        TreeNode treeNode = code_4.reConstructBinaryTree(pre, in);
        printTree(treeNode);
    }

    public void printTree(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }

    @Test
    public void t_Code_7() {
        Code_7 code_7 = new Code_7();
        System.out.println(code_7.Fibonacci(4));
    }

    @Test
    public void t_Code_8() {
        Code_8 code_8 = new Code_8();
        System.out.println(code_8.JumpFloor(4));
    }

    @Test
    public void t_Code_9() {
        Code_9 code_9 = new Code_9();
        System.out.println(code_9.JumpFloorII(1));
        System.out.println(code_9.JumpFloorII(2));
        System.out.println(code_9.JumpFloorII(3));
        System.out.println(code_9.JumpFloorII(4));
        System.out.println(code_9.JumpFloorII(5));
        System.out.println(code_9.JumpFloorII(6));
        System.out.println(code_9.JumpFloorII(7));
        System.out.println(code_9.JumpFloorII(8));
    }

    @Test
    public void testCoderTest() {
        String string = new String("abc");
        String str = "abc";
        String str1 = "abc";
        System.out.println(string == str);
        System.out.println(str == str1);
    }
    @Test
    public void test1(){
        A wang = new A("wang", 1);
        A wang1 = new A("wang", 1);
        System.out.println(wang.hashCode());
        System.out.println(wang1.hashCode());
        System.out.println(wang==wang1);
    }
}

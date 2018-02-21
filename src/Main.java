import org.junit.Test;
import sword2offer.Code_2;
import sword2offer.Code_4;
import sword2offer.TreeNode;

public class Main {

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
    public void t_Code_4(){
        Code_4 code_4 = new Code_4();
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};
        TreeNode treeNode = code_4.reConstructBinaryTree(pre, in);
        printTree(treeNode);
    }

    public void printTree(TreeNode node) {
        if (node != null) {
            System.out.print(node.val+" ");
            printTree(node.left);
            printTree(node.right);
        }
    }

}

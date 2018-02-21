package sword2offer;

/**
 * Created by Matol on 2018/2/20.
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6} 重建二叉树并返回。
 */
public class Code_4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(pre[preStart]);

        if (preStart != preEnd) {
            int point = inStart;
            while (point <= inEnd && in[point] != root.val) point++;
            int pos = point - inStart;
            root.left = reConstructBinaryTree(pre, preStart + 1, preStart + pos, in, inStart, inStart + pos - 1);
            root.right = reConstructBinaryTree(pre, preStart + pos + 1, preEnd, in, inStart + pos + 1, inEnd);
        }
        return root;
    }
}


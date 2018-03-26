package tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by porker on 2018/3/23.
 * 数的层次遍历 利用队列
 */
public class LevelTraversal {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        //保存当前的节点
        TreeNode currentNode = root;
        while (currentNode != null) {
            //把当前节点的值放进遍历集合中
            list.add(currentNode.val);
            //若当前节点的左右子节点不为空，加入队列
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }

            //弹出一个队列，当弹出一个null时循环结束
            currentNode = queue.poll();
        }
        return list;
    }
}

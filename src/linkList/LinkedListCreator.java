package linkList;

import java.util.List;

/**
 * Created by porker on 2018/3/26.
 * 递归创建链表
 */
public class LinkedListCreator {
   public Node createLinkList(List<Integer> data) {
        if (data.isEmpty()) {
            return null;
        }
        Node firstNode = new Node(data.get(0));
        Node secondNode = createLinkList(data.subList(1, data.size()));
        firstNode.setNext(secondNode);
        return firstNode;
    }
}

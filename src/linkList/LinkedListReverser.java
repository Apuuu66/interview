package linkList;

/**
 * Created by porker on 2018/3/26.
 * 递归实现链表反转
 */
public class LinkedListReverser {
    public static Node reverseLinkedList(Node head) {
        //如果head.getNext()是null，表示只有一个节点。
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node newHead = reverseLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }
}

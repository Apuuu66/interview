package digui;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/25
 */
public class RemoveElement {
    public ListNode removeElement(ListNode head, int val) {
        if (head == null) return null;
        ListNode res = removeElement(head.next, val);
        if (head.val == val) return res;
        else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        removeElement.removeElement(listNode1, 2);
    }
}

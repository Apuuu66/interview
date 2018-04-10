package leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/10
 */
public class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

}

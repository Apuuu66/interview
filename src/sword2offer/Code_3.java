package sword2offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Matol on 2018/2/20.
 */
public class Code_3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}

		ArrayList<Integer> list = new ArrayList<>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}


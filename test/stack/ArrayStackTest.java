package stack;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public class ArrayStackTest {
    @Test
    public void testArrayStackTest() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.toString());
        }
        stack.pop();
        System.out.println(stack.toString());
        LinkedList<Integer> integers = new LinkedList<>();
    }
}
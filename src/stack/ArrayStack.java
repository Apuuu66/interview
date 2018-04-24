package stack;

import array.Array;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>(10);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i = 0, len = array.getSize(); i < len; i++) {
            res.append(array.get(i));
            if (i != len - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}

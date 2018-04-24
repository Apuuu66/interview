package quene;

import array.Array;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public class ArrayQuene<E> implements Quene<E> {
    private Array<E> array;

    public ArrayQuene(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayQuene() {
        this.array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enquene(E e) {
        array.addLast(e);
    }

    @Override
    public E dequene() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}

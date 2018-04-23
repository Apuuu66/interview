package array;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/23
 */
public class Array<E> {
    private E[] data;
    private int size;//数组中已存放元素的个数

    public Array(int capacity) {
        this.size = capacity;
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }


    //获取数组中元素的个数
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //向数组末尾添加元素
    public void add(E element) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Array is full");
        }
        data[size] = element;
        size++;
    }

    //向指定位置添加元素
    public void add(E element, int index) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed! Require index > 0 && index < size");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size= %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return String.valueOf(res);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }

    public void set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal");
        }
        data[index] = element;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return true;
            }
        }

        return false;
    }

    public int find(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除并返回该元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        return ret;
    }

    public void removeElement(E element) {
        int index = find(element);
        if (index != -1) {
            remove(index);
        }
    }
}

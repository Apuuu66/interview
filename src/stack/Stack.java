package stack;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}

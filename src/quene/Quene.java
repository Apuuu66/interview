package quene;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public interface Quene<E> {
    int getSize();

    boolean isEmpty();

    void enquene(E e);

    E dequene();

    E getFront();
}

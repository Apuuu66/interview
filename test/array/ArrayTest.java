package array;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/23
 */
public class ArrayTest {

    @Test
    public void testArray() {
        Array array = new Array(5);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.add(100,2);
        array.remove(2);
        array.removeElement(9);
        ArrayList<Integer> objects = new ArrayList<>();
        System.out.println(array);
    }

}
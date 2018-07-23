package quene;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/24
 */
public class ArrayQueneTest {
    @Test
    public void testArrayQueneTest() {
        ArrayQuene<Integer> quene = new ArrayQuene<>();
        for (int i = 0; i < 10; i++) {
            quene.enquene(i);
            System.out.println(quene.toString());
            if (i % 3 == 2) {
                quene.dequene();
                System.out.println(quene.toString());
            }
        }
    }
}
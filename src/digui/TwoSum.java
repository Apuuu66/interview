package digui;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/25
 */
public class TwoSum {
    public static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(sum(ints, 0));
    }
}
